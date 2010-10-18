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

import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;
import org.vectomatic.dom.svg.impl.NativeSVGZoomEvent;

import com.google.gwt.event.dom.client.DomEvent;

/**
 * The zoom event occurs when the user initiates an action which causes 
 * the current view of the SVG document fragment to be rescaled. 
 * Event handlers are only recognized on <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
 * title='svg element specification'>svg</a> elements.
 */
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
	/**
	 * Returns the specified zoom rectangle in screen units.
	 * @return the specified zoom rectangle in screen units.
	 */
	public final OMSVGRect getZoomRectScreen() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getZoomRectScreen();
	}

	/**
	 * Returns the scale factor from previous zoom operations that was in place before the zoom operation occurred. 
	 * @return the scale factor from previous zoom operations
	 */
	public final float getPreviousScale() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getPreviousScale();
	};

	/**
	 * Returns the translation values from previous zoom operations that
	 * were in place before the zoom operation occurred. The {@link org.vectomatic.dom.svg.OMSVGPoint} 
	 * object is read only.
	 * @return the translation values from previous zoom operations
	 */
	public final OMSVGPoint getPreviousTranslate() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getPreviousTranslate();
	};

	/**
	 * Returns the scale factor that will be in place after the zoom operation has been processed. 
	 * @return the scale factor that will be in place after the zoom operation has been processed
	 */
	public final float getNewScale() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getNewScale();
	};

	/**
	 * Returns the translation values that will be in place after the zoom operation 
	 * has been processed. The {@link org.vectomatic.dom.svg.OMSVGPoint} 
	 * object is read only.
	 * @return the translation values that will be in place after the zoom operation has been processed.
	 */
	public final OMSVGPoint getNewTranslate() {
		return ((NativeSVGZoomEvent)getNativeEvent().cast()).getNewTranslate();
	};

}
