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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.SVGFEColorMatrixElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

public class OMSVGFEColorMatrixElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_FECOLORMATRIX_TYPE_UNKNOWN = 0;
  public static final short SVG_FECOLORMATRIX_TYPE_MATRIX = 1;
  public static final short SVG_FECOLORMATRIX_TYPE_SATURATE = 2;
  public static final short SVG_FECOLORMATRIX_TYPE_HUEROTATE = 3;
  public static final short SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA = 4;
  protected OMSVGFEColorMatrixElement(SVGFEColorMatrixElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEColorMatrixElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEColorMatrixElement)ot).getIn1();
  }
  public final OMSVGAnimatedEnumeration getType() {
    return ((SVGFEColorMatrixElement)ot).getType();
  }
  public final OMSVGAnimatedNumberList getValues() {
    return ((SVGFEColorMatrixElement)ot).getValues();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEColorMatrixElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEColorMatrixElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEColorMatrixElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEColorMatrixElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEColorMatrixElement)ot).getResult();
  }

}
