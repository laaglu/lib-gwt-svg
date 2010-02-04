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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGFECompositeElement extends SVGElement {
  protected SVGFECompositeElement() {
  }

  // Implementation of the svg::SVGFECompositeElement W3C IDL interface
  public final native OMSVGAnimatedString getIn1() /*-{
    return this.in1;
  }-*/;
  public final native OMSVGAnimatedString getIn2() /*-{
    return this.in2;
  }-*/;
  public final native OMSVGAnimatedEnumeration getOperator() /*-{
    return this.operator;
  }-*/;
  public final native OMSVGAnimatedNumber getK1() /*-{
    return this.k1;
  }-*/;
  public final native OMSVGAnimatedNumber getK2() /*-{
    return this.k2;
  }-*/;
  public final native OMSVGAnimatedNumber getK3() /*-{
    return this.k3;
  }-*/;
  public final native OMSVGAnimatedNumber getK4() /*-{
    return this.k4;
  }-*/;

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
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
  public final native OMSVGAnimatedString getResult() /*-{
    return this.result;
  }-*/;

}
