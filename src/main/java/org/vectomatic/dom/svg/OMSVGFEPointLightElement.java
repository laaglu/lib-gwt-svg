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

import org.vectomatic.dom.svg.impl.SVGFEPointLightElement;

public class OMSVGFEPointLightElement extends OMSVGElement {
  protected OMSVGFEPointLightElement(SVGFEPointLightElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEPointLightElement W3C IDL interface
  public final OMSVGAnimatedNumber getX() {
    return ((SVGFEPointLightElement)ot).getX();
  }
  public final OMSVGAnimatedNumber getY() {
    return ((SVGFEPointLightElement)ot).getY();
  }
  public final OMSVGAnimatedNumber getZ() {
    return ((SVGFEPointLightElement)ot).getZ();
  }

}
