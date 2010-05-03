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

import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio;
import org.vectomatic.dom.svg.OMSVGAnimatedRect;
import org.vectomatic.dom.svg.OMSVGStringList;

public class SVGViewElement extends SVGElement {
  protected SVGViewElement() {
  }

  // Implementation of the svg::SVGViewElement W3C IDL interface
  public final native OMSVGStringList getViewTarget() /*-{
    return this.viewTarget ? @org.vectomatic.dom.svg.OMSVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(this.viewTarget) : null;
  }-*/;

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  public final native OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  public final native OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

  // Implementation of the svg::SVGZoomAndPan W3C IDL interface
  public final native short getZoomAndPan() /*-{
    return this.zoomAndPan;
  }-*/;
  public final native void setZoomAndPan(short value) /*-{
    this.zoomAndPan = value;
  }-*/;

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

}
