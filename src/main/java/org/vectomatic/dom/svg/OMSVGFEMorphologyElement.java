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

import org.vectomatic.dom.svg.impl.SVGFEMorphologyElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feMorphology")
public class OMSVGFEMorphologyElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_MORPHOLOGY_OPERATOR_UNKNOWN = 0;
  public static final short SVG_MORPHOLOGY_OPERATOR_ERODE = 1;
  public static final short SVG_MORPHOLOGY_OPERATOR_DILATE = 2;
  protected OMSVGFEMorphologyElement(SVGFEMorphologyElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEMorphologyElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEMorphologyElement)ot).getIn1();
  }
  public final OMSVGAnimatedEnumeration getOperator() {
    return ((SVGFEMorphologyElement)ot).getOperator();
  }
  public final OMSVGAnimatedLength getRadiusX() {
    return ((SVGFEMorphologyElement)ot).getRadiusX();
  }
  public final OMSVGAnimatedLength getRadiusY() {
    return ((SVGFEMorphologyElement)ot).getRadiusY();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEMorphologyElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEMorphologyElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEMorphologyElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEMorphologyElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEMorphologyElement)ot).getResult();
  }

}
