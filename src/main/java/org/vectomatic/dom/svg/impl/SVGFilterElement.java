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
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedInteger;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGFilterElement extends SVGElement {
  protected SVGFilterElement() {
  }

  // Implementation of the svg::SVGFilterElement W3C IDL interface
  public final native OMSVGAnimatedEnumeration getFilterUnits() /*-{
    return this.filterUnits;
  }-*/;
  public final native OMSVGAnimatedEnumeration getPrimitiveUnits() /*-{
    return this.primitiveUnits;
  }-*/;
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  public final native OMSVGAnimatedInteger getFilterResX() /*-{
    return this.filterResX;
  }-*/;
  public final native OMSVGAnimatedInteger getFilterResY() /*-{
    return this.filterResY;
  }-*/;
  public final native void setFilterRes(int filterResX, int filterResY) /*-{
    this.setFilterRes(filterResX, filterResY);
  }-*/;

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
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

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

}
