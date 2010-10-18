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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;

import com.google.gwt.dom.client.NativeEvent;

/**
 * Overlay type for the SVGZoomEvent W3C IDL interface
 * @author laaglu
 */
public class NativeSVGZoomEvent extends NativeEvent {
	/**
	 * Constructor
	 */
	protected NativeSVGZoomEvent() {
	}

	// Implementation of the svg::SVGZoomEvent W3C IDL interface
	/**
	 * Returns the specified zoom rectangle in screen units.
	 * @return the specified zoom rectangle in screen units.
	 */
	public final native OMSVGRect getZoomRectScreen() /*-{
	  return this.zoomRectScreen;
	}-*/;
	/**
	 * Returns the scale factor from previous zoom operations that was in place before the zoom operation occurred. 
	 * @return the scale factor from previous zoom operations
	 */
	public final native float getPreviousScale() /*-{
	  return this.previousScale;
	}-*/;
	/**
	 * Returns the translation values from previous zoom operations that
	 * were in place before the zoom operation occurred. The {@link org.vectomatic.dom.svg.OMSVGPoint} 
	 * object is read only.
	 * @return the translation values from previous zoom operations
	 */
	public final native OMSVGPoint getPreviousTranslate() /*-{
	  return this.previousTranslate;
	}-*/;
	/**
	 * Returns the scale factor that will be in place after the zoom operation has been processed. 
	 * @return the scale factor that will be in place after the zoom operation has been processed
	 */
	public final native float getNewScale() /*-{
	  return this.newScale;
	}-*/;
	/**
	 * Returns the translation values that will be in place after the zoom operation 
	 * has been processed. The {@link org.vectomatic.dom.svg.OMSVGPoint} 
	 * object is read only.
	 * @return the translation values that will be in place after the zoom operation has been processed.
	 */
	public final native OMSVGPoint getNewTranslate() /*-{
	  return this.newTranslate;
	}-*/;
}
