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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

public class OMSVGFEConvolveMatrixElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_EDGEMODE_UNKNOWN = 0;
  public static final short SVG_EDGEMODE_DUPLICATE = 1;
  public static final short SVG_EDGEMODE_WRAP = 2;
  public static final short SVG_EDGEMODE_NONE = 3;
  protected OMSVGFEConvolveMatrixElement(SVGFEConvolveMatrixElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEConvolveMatrixElement W3C IDL interface
  public final OMSVGAnimatedInteger getOrderX() {
    return ((SVGFEConvolveMatrixElement)ot).getOrderX();
  }
  public final OMSVGAnimatedInteger getOrderY() {
    return ((SVGFEConvolveMatrixElement)ot).getOrderY();
  }
  public final OMSVGAnimatedNumberList getKernelMatrix() {
    return ((SVGFEConvolveMatrixElement)ot).getKernelMatrix();
  }
  public final OMSVGAnimatedNumber getDivisor() {
    return ((SVGFEConvolveMatrixElement)ot).getDivisor();
  }
  public final OMSVGAnimatedNumber getBias() {
    return ((SVGFEConvolveMatrixElement)ot).getBias();
  }
  public final OMSVGAnimatedInteger getTargetX() {
    return ((SVGFEConvolveMatrixElement)ot).getTargetX();
  }
  public final OMSVGAnimatedInteger getTargetY() {
    return ((SVGFEConvolveMatrixElement)ot).getTargetY();
  }
  public final OMSVGAnimatedEnumeration getEdgeMode() {
    return ((SVGFEConvolveMatrixElement)ot).getEdgeMode();
  }
  public final OMSVGAnimatedLength getKernelUnitLengthX() {
    return ((SVGFEConvolveMatrixElement)ot).getKernelUnitLengthX();
  }
  public final OMSVGAnimatedLength getKernelUnitLengthY() {
    return ((SVGFEConvolveMatrixElement)ot).getKernelUnitLengthY();
  }
  public final OMSVGAnimatedBoolean getPreserveAlpha() {
    return ((SVGFEConvolveMatrixElement)ot).getPreserveAlpha();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEConvolveMatrixElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEConvolveMatrixElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEConvolveMatrixElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEConvolveMatrixElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEConvolveMatrixElement)ot).getResult();
  }

}
