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

import org.vectomatic.dom.svg.impl.SVGFEDiffuseLightingElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

public class OMSVGFEDiffuseLightingElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFEDiffuseLightingElement(SVGFEDiffuseLightingElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEDiffuseLightingElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEDiffuseLightingElement)ot).getIn1();
  }
  public final OMSVGAnimatedNumber getSurfaceScale() {
    return ((SVGFEDiffuseLightingElement)ot).getSurfaceScale();
  }
  public final OMSVGAnimatedNumber getDiffuseConstant() {
    return ((SVGFEDiffuseLightingElement)ot).getDiffuseConstant();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEDiffuseLightingElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEDiffuseLightingElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEDiffuseLightingElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEDiffuseLightingElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEDiffuseLightingElement)ot).getResult();
  }

}
