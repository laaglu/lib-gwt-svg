/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGMarkerElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGMarkerElement() {
  }

  // Implementation of the nsIDOMSVGMarkerElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getRefX() /*-{
    return this.refX;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getRefY() /*-{
    return this.refY;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getMarkerUnits() /*-{
    return this.markerUnits;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getMarkerWidth() /*-{
    return this.markerWidth;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getMarkerHeight() /*-{
    return this.markerHeight;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getOrientType() /*-{
    return this.orientType;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedAngle getOrientAngle() /*-{
    return this.orientAngle;
  }-*/;
  public final native void setOrientToAuto() /*-{
    this.setOrientToAuto();
  }-*/;
  public final native void setOrientToAngle(org.vectomatic.dom.svg.OMSVGAngle angle) /*-{
    this.setOrientToAngle(angle);
  }-*/;

  // Implementation of the nsIDOMSVGStylable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getClassName() /*-{
    return this.className;
  }-*/;
  public final native org.vectomatic.dom.css.OMStyleDeclaration getStyle() /*-{
    return this.style;
  }-*/;
  public final native org.vectomatic.dom.css.OMValue getPresentationAttribute(java.lang.String name) /*-{
    return this.getPresentationAttribute(name);
  }-*/;

  // Implementation of the nsIDOMSVGFitToViewBox XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

}
