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
 * along with libgwtsvg.  If not, see <http://www.gnu.org/licenses/>
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGComponentTransferFunctionElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGComponentTransferFunctionElement() {
  }

  // Implementation of the nsIDOMSVGComponentTransferFunctionElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getType() /*-{
    return this.type;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumberList getTableValues() /*-{
    return this.tableValues;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getSlope() /*-{
    return this.slope;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getIntercept() /*-{
    return this.intercept;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getAmplitude() /*-{
    return this.amplitude;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getExponent() /*-{
    return this.exponent;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getOffset() /*-{
    return this.offset;
  }-*/;

}
