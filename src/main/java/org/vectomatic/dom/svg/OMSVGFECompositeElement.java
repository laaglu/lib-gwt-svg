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

import org.vectomatic.dom.svg.impl.SVGFECompositeElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

public class OMSVGFECompositeElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_FECOMPOSITE_OPERATOR_UNKNOWN = 0;
  public static final short SVG_FECOMPOSITE_OPERATOR_OVER = 1;
  public static final short SVG_FECOMPOSITE_OPERATOR_IN = 2;
  public static final short SVG_FECOMPOSITE_OPERATOR_OUT = 3;
  public static final short SVG_FECOMPOSITE_OPERATOR_ATOP = 4;
  public static final short SVG_FECOMPOSITE_OPERATOR_XOR = 5;
  public static final short SVG_FECOMPOSITE_OPERATOR_ARITHMETIC = 6;
  protected OMSVGFECompositeElement(SVGFECompositeElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFECompositeElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFECompositeElement)ot).getIn1();
  }
  public final OMSVGAnimatedString getIn2() {
    return ((SVGFECompositeElement)ot).getIn2();
  }
  public final OMSVGAnimatedEnumeration getOperator() {
    return ((SVGFECompositeElement)ot).getOperator();
  }
  public final OMSVGAnimatedNumber getK1() {
    return ((SVGFECompositeElement)ot).getK1();
  }
  public final OMSVGAnimatedNumber getK2() {
    return ((SVGFECompositeElement)ot).getK2();
  }
  public final OMSVGAnimatedNumber getK3() {
    return ((SVGFECompositeElement)ot).getK3();
  }
  public final OMSVGAnimatedNumber getK4() {
    return ((SVGFECompositeElement)ot).getK4();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFECompositeElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFECompositeElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFECompositeElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFECompositeElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFECompositeElement)ot).getResult();
  }

}
