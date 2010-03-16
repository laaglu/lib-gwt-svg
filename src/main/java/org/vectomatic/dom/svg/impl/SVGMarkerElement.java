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

import org.vectomatic.dom.svg.OMSVGAngle;
import org.vectomatic.dom.svg.OMSVGAnimatedAngle;
import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio;
import org.vectomatic.dom.svg.OMSVGAnimatedRect;

public class SVGMarkerElement extends SVGElement {
  protected SVGMarkerElement() {
  }

  // Implementation of the svg::SVGMarkerElement W3C IDL interface
  public final native OMSVGAnimatedLength getRefX() /*-{
    return this.refX;
  }-*/;
  public final native OMSVGAnimatedLength getRefY() /*-{
    return this.refY;
  }-*/;
  public final native OMSVGAnimatedEnumeration getMarkerUnits() /*-{
    return this.markerUnits;
  }-*/;
  public final native OMSVGAnimatedLength getMarkerWidth() /*-{
    return this.markerWidth;
  }-*/;
  public final native OMSVGAnimatedLength getMarkerHeight() /*-{
    return this.markerHeight;
  }-*/;
  public final native OMSVGAnimatedEnumeration getOrientType() /*-{
    return this.orientType;
  }-*/;
  public final native OMSVGAnimatedAngle getOrientAngle() /*-{
    return this.orientAngle;
  }-*/;
  public final native void setOrientToAuto() /*-{
    this.setOrientToAuto();
  }-*/;
  public final native void setOrientToAngle(OMSVGAngle angle) /*-{
    this.setOrientToAngle(angle);
  }-*/;

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  public final native OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  public final native OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final native String getXmllang() /*-{
    return this.xmllang;
  }-*/;
  public final native void setXmllang(String value) /*-{
    this.xmllang = value;
  }-*/;
  public final native String getXmlspace() /*-{
    return this.xmlspace;
  }-*/;
  public final native void setXmlspace(String value) /*-{
    this.xmlspace = value;
  }-*/;

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

}
