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

import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedNumberList;

public class SVGComponentTransferFunctionElement extends SVGElement {
  protected SVGComponentTransferFunctionElement() {
  }

  // Implementation of the svg::SVGComponentTransferFunctionElement W3C IDL interface
  public final native OMSVGAnimatedEnumeration getType() /*-{
    return this.type;
  }-*/;
  public final native OMSVGAnimatedNumberList getTableValues() /*-{
    return this.tableValues;
  }-*/;
  public final native OMSVGAnimatedNumber getSlope() /*-{
    return this.slope;
  }-*/;
  public final native OMSVGAnimatedNumber getIntercept() /*-{
    return this.intercept;
  }-*/;
  public final native OMSVGAnimatedNumber getAmplitude() /*-{
    return this.amplitude;
  }-*/;
  public final native OMSVGAnimatedNumber getExponent() /*-{
    return this.exponent;
  }-*/;
  public final native OMSVGAnimatedNumber getOffset() /*-{
    return this.offset;
  }-*/;

}
