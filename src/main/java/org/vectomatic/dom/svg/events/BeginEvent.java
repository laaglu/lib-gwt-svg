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
 * This event is raised when the element local timeline begins to play.
 * It will be raised each time the element begins the active duration 
 * (i.e. when it restarts, but not when it repeats). It may be raised both 
 * in the course of normal (i.e. scheduled or interactive) timeline play, 
 * as well as in the case that the element was begun with the 
 * beginElement or beginElementAt methods. Note that if an element is 
 * restarted while it is currently playing, the element will raise an end 
 * event and another begin event, as the element restarts. 
 */
public class BeginEvent extends TimeEvent<BeginHandler> {

	/**
	 * Event type for mouse out events. Represents the meta-data associated with
	 * this event.
	 */
	private static final Type<BeginHandler> TYPE = new Type<BeginHandler>(
			"begin", new BeginEvent());

	/**
	 * Protected constructor, use
	 * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	 * to fire mouse out events.
	 */
	protected BeginEvent() {
	}

	/**
	 * @return the handler type
	 */
	public Type<BeginHandler> getAssociatedType() {
		return TYPE;
	}
	
	/**
	 * @return the handler type
	 */
	public static Type<BeginHandler> getType() {
		return TYPE;
	}


	@Override
	protected void dispatch(BeginHandler handler) {
		handler.onBegin(this);
	}

}
