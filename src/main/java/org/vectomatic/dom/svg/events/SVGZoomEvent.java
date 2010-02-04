/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of libgwtsvg.
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
package org.vectomatic.dom.svg.events;

import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;
import org.vectomatic.dom.svg.impl.NativeSVGZoomEvent;

import com.google.gwt.event.dom.client.DomEvent;

public class SVGZoomEvent extends DomEvent<SVGZoomHandler> {
	private static final Type<SVGZoomHandler> TYPE = new Type<SVGZoomHandler>(
			"SVGZoom", new SVGZoomEvent());

	/**
	 * Protected constructor, use
	 * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
	 * to fire mouse out events.
	 */
	protected SVGZoomEvent() {
	}

	/**
	 * @return the handler type
	 */
	public Type<SVGZoomHandler> getAssociatedType() {
		return TYPE;
	}

	/**
	 * @return the handler type
	 */
	public static Type<SVGZoomHandler> getType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SVGZoomHandler handler) {
		handler.onZoom(this);
	}

	// Implementation of the svg::SVGZoomEvent W3C IDL interface
	public final OMSVGRect getZoomRectScreen() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getZoomRectScreen();
	}

	public final float getPreviousScale() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getPreviousScale();
	};

	public final OMSVGPoint getPreviousTranslate() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getPreviousTranslate();
	};

	public final float getNewScale() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getNewScale();
	};

	public final OMSVGPoint getNewTranslate() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getNewTranslate();
	};

}
