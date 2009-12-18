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
public class OMSVGFECompositeElement extends org.vectomatic.dom.svg.OMSVGFilterPrimitiveStandardAttributes {
  protected OMSVGFECompositeElement() {
  }

  // Implementation of the nsIDOMSVGFECompositeElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getIn1() /*-{
    return this.in1;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getIn2() /*-{
    return this.in2;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getK1() /*-{
    return this.k1;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getK2() /*-{
    return this.k2;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getK3() /*-{
    return this.k3;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getK4() /*-{
    return this.k4;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getOperator() /*-{
    return this.operator;
  }-*/;
  public final native void setK(float k1, float k2, float k3, float k4) /*-{
    this.setK(k1, k2, k3, k4);
  }-*/;

}
