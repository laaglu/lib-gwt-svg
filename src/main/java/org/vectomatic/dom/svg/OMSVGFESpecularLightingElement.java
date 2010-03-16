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

import org.vectomatic.dom.svg.impl.SVGFESpecularLightingElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

public class OMSVGFESpecularLightingElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFESpecularLightingElement(SVGFESpecularLightingElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFESpecularLightingElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFESpecularLightingElement)ot).getIn1();
  }
  public final OMSVGAnimatedNumber getSurfaceScale() {
    return ((SVGFESpecularLightingElement)ot).getSurfaceScale();
  }
  public final OMSVGAnimatedNumber getSpecularConstant() {
    return ((SVGFESpecularLightingElement)ot).getSpecularConstant();
  }
  public final OMSVGAnimatedNumber getSpecularExponent() {
    return ((SVGFESpecularLightingElement)ot).getSpecularExponent();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFESpecularLightingElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFESpecularLightingElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFESpecularLightingElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFESpecularLightingElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFESpecularLightingElement)ot).getResult();
  }

}
