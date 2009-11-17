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
public class OMSVGFEConvolveMatrixElement extends org.vectomatic.dom.svg.OMSVGFilterPrimitiveStandardAttributes {
  protected OMSVGFEConvolveMatrixElement() {
  }

  // Implementation of the nsIDOMSVGFEConvolveMatrixElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getIn1() /*-{
    return this.in1;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getOrderX() /*-{
    return this.orderX;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getOrderY() /*-{
    return this.orderY;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumberList getKernelMatrix() /*-{
    return this.kernelMatrix;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getDivisor() /*-{
    return this.divisor;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getBias() /*-{
    return this.bias;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getTargetX() /*-{
    return this.targetX;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getTargetY() /*-{
    return this.targetY;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getEdgeMode() /*-{
    return this.edgeMode;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getKernelUnitLengthX() /*-{
    return this.kernelUnitLengthX;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getKernelUnitLengthY() /*-{
    return this.kernelUnitLengthY;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedBoolean getPreserveAlpha() /*-{
    return this.preserveAlpha;
  }-*/;

}
