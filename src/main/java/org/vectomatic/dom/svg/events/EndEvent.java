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
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */
package org.vectomatic.dom.svg.events;

import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * This event is raised at the active end of the element. 
 * Note that this event is not raised at the simple end of each repeat. 
 * This event may be raised both in the course of normal (i.e. scheduled 
 * or interactive) timeline play, as well as in the case that the element 
 * was ended with the endElement or endElementAt  methods. 
 * Note that if an element is restarted while it is currently playing, 
 * the element will raise an end event and another begin event, as the 
 * element restarts. 
 */
public class EndEvent extends TimeEvent<EndHandler> {
	private static final Type<EndHandler> TYPE = new Type<EndHandler>(
			"end", new EndEvent());
	/**
	 * Necessary hack. DomEvent.fireNativeEvent uses NativeEvent.getType
	 * to retrieve the type flyweight. However, for SMIL events, the
	 * event type name is not the same as the event attribute name
	 * (onend/endEvent vs onmousedown/mousedown for example !)
	 */
	private static final Type<EndHandler> TYPE_ = new Type<EndHandler>(
			"endEvent", new EndEvent());

	/**
	 * Protected constructor, use
	 * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	 * to fire mouse out events.
	 */
	protected EndEvent() {
	}

	/**
	 * @return the handler type
	 */
	public Type<EndHandler> getAssociatedType() {
		return TYPE;
	}
	/**
	 * @return the handler type
	 */
	public static Type<EndHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(EndHandler handler) {
		handler.onEnd(this);
	}

}
