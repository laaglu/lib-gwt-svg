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

/**
 * This event is raised when an element local timeline repeats. 
 * It will be raised each time the element repeats, after the first iteration.
 * The event provides a numerical indication of which repeat iteration 
 * is beginning. The value is a 0-based integer, but the repeat event is 
 * not raised for the first iteration and so the observed values of the
 * detail attribute will be &gt;= 1. 
 * @author laaglu
 *
 */
public class RepeatEvent extends TimeEvent<RepeatHandler> {
	private static final Type<RepeatHandler> TYPE = new Type<RepeatHandler>(
			"repeat", new RepeatEvent());
	/**
	 * Necessary hack. DomEvent.fireNativeEvent uses NativeEvent.getType
	 * to retrieve the type flyweight. However, for SMIL events, the
	 * event type name is not the same as the event attribute name
	 * (onrepeat/repeatEvent vs onmousdown/mousedown for example !)
	 */
	private static final Type<RepeatHandler> TYPE_ = new Type<RepeatHandler>(
			"repeatEvent", new RepeatEvent());

	/**
	 * Protected constructor, use
	 * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	 * to fire mouse out events.
	 */
	protected RepeatEvent() {
	}

	/**
	 * @return the handler type
	 */
	public Type<RepeatHandler> getAssociatedType() {
		return TYPE;
	}

	/**
	 * @return the handler type
	 */
	public static Type<RepeatHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(RepeatHandler handler) {
		handler.onRepeat(this);
	}

}
