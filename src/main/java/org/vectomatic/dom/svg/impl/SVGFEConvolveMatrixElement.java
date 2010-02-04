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

import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedInteger;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedNumberList;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGFEConvolveMatrixElement extends SVGElement {
  protected SVGFEConvolveMatrixElement() {
  }

  // Implementation of the svg::SVGFEConvolveMatrixElement W3C IDL interface
  public final native OMSVGAnimatedInteger getOrderX() /*-{
    return this.orderX;
  }-*/;
  public final native OMSVGAnimatedInteger getOrderY() /*-{
    return this.orderY;
  }-*/;
  public final native OMSVGAnimatedNumberList getKernelMatrix() /*-{
    return this.kernelMatrix;
  }-*/;
  public final native OMSVGAnimatedNumber getDivisor() /*-{
    return this.divisor;
  }-*/;
  public final native OMSVGAnimatedNumber getBias() /*-{
    return this.bias;
  }-*/;
  public final native OMSVGAnimatedInteger getTargetX() /*-{
    return this.targetX;
  }-*/;
  public final native OMSVGAnimatedInteger getTargetY() /*-{
    return this.targetY;
  }-*/;
  public final native OMSVGAnimatedEnumeration getEdgeMode() /*-{
    return this.edgeMode;
  }-*/;
  public final native OMSVGAnimatedLength getKernelUnitLengthX() /*-{
    return this.kernelUnitLengthX;
  }-*/;
  public final native OMSVGAnimatedLength getKernelUnitLengthY() /*-{
    return this.kernelUnitLengthY;
  }-*/;
  public final native OMSVGAnimatedBoolean getPreserveAlpha() /*-{
    return this.preserveAlpha;
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
