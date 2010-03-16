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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;

import com.google.gwt.dom.client.NativeEvent;

public class NativeSVGZoomEvent extends NativeEvent {
	  protected NativeSVGZoomEvent() {
	  }

	  // Implementation of the svg::SVGZoomEvent W3C IDL interface
	  public final native OMSVGRect getZoomRectScreen() /*-{
	    return this.zoomRectScreen;
	  }-*/;
	  public final native float getPreviousScale() /*-{
	    return this.previousScale;
	  }-*/;
	  public final native OMSVGPoint getPreviousTranslate() /*-{
	    return this.previousTranslate;
	  }-*/;
	  public final native float getNewScale() /*-{
	    return this.newScale;
	  }-*/;
	  public final native OMSVGPoint getNewTranslate() /*-{
	    return this.newTranslate;
	  }-*/;

}
