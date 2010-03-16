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

import org.vectomatic.dom.svg.impl.SVGFESpotLightElement;

public class OMSVGFESpotLightElement extends OMSVGElement {
  protected OMSVGFESpotLightElement(SVGFESpotLightElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFESpotLightElement W3C IDL interface
  public final OMSVGAnimatedNumber getX() {
    return ((SVGFESpotLightElement)ot).getX();
  }
  public final OMSVGAnimatedNumber getY() {
    return ((SVGFESpotLightElement)ot).getY();
  }
  public final OMSVGAnimatedNumber getZ() {
    return ((SVGFESpotLightElement)ot).getZ();
  }
  public final OMSVGAnimatedNumber getPointsAtX() {
    return ((SVGFESpotLightElement)ot).getPointsAtX();
  }
  public final OMSVGAnimatedNumber getPointsAtY() {
    return ((SVGFESpotLightElement)ot).getPointsAtY();
  }
  public final OMSVGAnimatedNumber getPointsAtZ() {
    return ((SVGFESpotLightElement)ot).getPointsAtZ();
  }
  public final OMSVGAnimatedNumber getSpecularExponent() {
    return ((SVGFESpotLightElement)ot).getSpecularExponent();
  }
  public final OMSVGAnimatedNumber getLimitingConeAngle() {
    return ((SVGFESpotLightElement)ot).getLimitingConeAngle();
  }

}
