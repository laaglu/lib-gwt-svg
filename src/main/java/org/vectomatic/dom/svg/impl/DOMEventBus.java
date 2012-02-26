/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of lib-gwt-svg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
/*
 * Copyright 2011 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vectomatic.dom.svg.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.vectomatic.dom.svg.OMElement;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.web.bindery.event.shared.Event;
import com.google.web.bindery.event.shared.UmbrellaException;

/**
 * Implementation of {@link EventBus} which invokes
 * {@link org.vectomatic.dom.svg.utils.DOMHelper#unbindEventListener(Element, String)}
 * on DOM element sources when they no longer have any event registered handlers
 * for the corresponding event type.
 */
public class DOMEventBus extends EventBus {
	private interface Command {
		void execute();
	}

	private int firingDepth = 0;

	/**
	 * Add and remove operations received during dispatch.
	 */
	private List<Command> deferredDeltas;

	/**
	 * Map of event type to map of event source to list of their handlers.
	 */
	private final Map<Event.Type<?>, Map<Object, List<?>>> map = new HashMap<Event.Type<?>, Map<Object, List<?>>>();

	@Override
	public <H extends EventHandler> HandlerRegistration addHandler(Type<H> type, H handler) {
	    return doAdd(type, null, handler);
	}

	@Override
	public <H extends EventHandler> HandlerRegistration addHandlerToSource(Type<H> type, Object source, H handler) {
		if (source == null) {
			throw new NullPointerException("Cannot add a handler with a null source");
		}
		return doAdd(type, source, handler);
	}

	@Override
	public void fireEvent(GwtEvent<?> event) {
	    doFire(event, null);
	}

	@Override
	public void fireEventFromSource(GwtEvent<?> event, Object source) {
		if (source == null) {
			throw new NullPointerException("Cannot fire from a null source");
		}
		doFire(event, source);
	}
	

	@Override
	public <H> HandlerRegistration addHandlerToSource(final Event.Type<H> type,
			final Object source, final H handler) {
		if (source == null) {
			throw new NullPointerException("Cannot add a handler with a null source");
		}
		return doAdd(type, source, handler);
	}

	protected <H> void doRemove(Event.Type<H> type, Object source, H handler) {
		if (firingDepth > 0) {
			enqueueRemove(type, source, handler);
		} else {
			doRemoveNow(type, source, handler);
		}
	}

	protected <H> H getHandler(Event.Type<H> type, int index) {
		assert index < getHandlerCount(type) : "handlers for "
				+ type.getClass() + " have size: " + getHandlerCount(type)
				+ " so do not have a handler at index: " + index;

		List<H> l = getHandlerList(type, null);
		return l.get(index);
	}

	protected int getHandlerCount(Event.Type<?> eventKey) {
		return getHandlerList(eventKey, null).size();
	}

	protected boolean isEventHandled(Event.Type<?> eventKey) {
		return map.containsKey(eventKey);
	}

	private void defer(Command command) {
		if (deferredDeltas == null) {
			deferredDeltas = new ArrayList<Command>();
		}
		deferredDeltas.add(command);
	}

	private <H> HandlerRegistration doAdd(final Event.Type<H> type,
			final Object source, final H handler) {
		if (type == null) {
			throw new NullPointerException(
					"Cannot add a handler with a null type");
		}
		if (handler == null) {
			throw new NullPointerException("Cannot add a null handler");
		}

		if (firingDepth > 0) {
			enqueueAdd(type, source, handler);
		} else {
			doAddNow(type, source, handler);
		}

		return new HandlerRegistration() {
			public void removeHandler() {
				doRemove(type, source, handler);
			}
		};
	}

	private <H> void doAddNow(Event.Type<H> type, Object source, H handler) {
		List<H> l = ensureHandlerList(type, source);
		l.add(handler);
	}

	private <H> void doFire(Event<H> event, Object source) {
		if (event == null) {
			throw new NullPointerException("Cannot fire null event");
		}
		try {
			firingDepth++;

			if (source != null) {
				setSourceOfEvent(event, source);
			}

			List<H> handlers = getDispatchList(event.getAssociatedType(), source);
			Set<Throwable> causes = null;

			ListIterator<H> it = handlers.listIterator();
			while (it.hasNext()) {
				H handler = it.next();

				try {
					dispatchEvent(event, handler);
				} catch (Throwable e) {
					if (causes == null) {
						causes = new HashSet<Throwable>();
					}
					causes.add(e);
				}
			}

			if (causes != null) {
				throw new UmbrellaException(causes);
			}
		} finally {
			firingDepth--;
			if (firingDepth == 0) {
				handleQueuedAddsAndRemoves();
			}
		}
	}

	private <H> void doRemoveNow(Event.Type<H> type, Object source, H handler) {
		List<H> l = getHandlerList(type, source);

		boolean removed = l.remove(handler);
		assert removed : "redundant remove call";
		if (removed && l.isEmpty()) {
			if (type instanceof DomEvent.Type && source instanceof OMElement) {
				Element elem = ((OMElement)source).getElement();
				String eventName = ((DomEvent.Type)type).getName();
				DOMHelper.unbindEventListener(elem, eventName);
			}
			prune(type, source);
		}
	}

	private <H> void enqueueAdd(final Event.Type<H> type, final Object source, final H handler) {
		defer(new Command() {
			public void execute() {
				doAddNow(type, source, handler);
			}
		});
	}

	private <H> void enqueueRemove(final Event.Type<H> type, final Object source, final H handler) {
		defer(new Command() {
			public void execute() {
				doRemoveNow(type, source, handler);
			}
		});
	}

	private <H> List<H> ensureHandlerList(Event.Type<H> type, Object source) {
		Map<Object, List<?>> sourceMap = map.get(type);
		if (sourceMap == null) {
			sourceMap = new HashMap<Object, List<?>>();
			map.put(type, sourceMap);
		}

		// safe, we control the puts.
		@SuppressWarnings("unchecked")
		List<H> handlers = (List<H>) sourceMap.get(source);
		if (handlers == null) {
			handlers = new ArrayList<H>();
			sourceMap.put(source, handlers);
		}

		return handlers;
	}

	private <H> List<H> getDispatchList(Event.Type<H> type, Object source) {
		List<H> directHandlers = getHandlerList(type, source);
		if (source == null) {
			return directHandlers;
		}

		List<H> globalHandlers = getHandlerList(type, null);

		List<H> rtn = new ArrayList<H>(directHandlers);
		rtn.addAll(globalHandlers);
		return rtn;
	}

	private <H> List<H> getHandlerList(Event.Type<H> type, Object source) {
		Map<Object, List<?>> sourceMap = map.get(type);
		if (sourceMap == null) {
			return Collections.emptyList();
		}

		// safe, we control the puts.
		@SuppressWarnings("unchecked")
		List<H> handlers = (List<H>) sourceMap.get(source);
		if (handlers == null) {
			return Collections.emptyList();
		}

		return handlers;
	}

	private void handleQueuedAddsAndRemoves() {
		if (deferredDeltas != null) {
			try {
				for (Command c : deferredDeltas) {
					c.execute();
				}
			} finally {
				deferredDeltas = null;
			}
		}
	}

	private void prune(Event.Type<?> type, Object source) {
		Map<Object, List<?>> sourceMap = map.get(type);

		List<?> pruned = sourceMap.remove(source);

		assert pruned != null : "Can't prune what wasn't there";
		assert pruned.isEmpty() : "Pruned unempty list!";

		if (sourceMap.isEmpty()) {
			map.remove(type);
		}
	}

}