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

import org.vectomatic.dom.svg.OMSVGAnimatedNumber;

public class SVGFEDistantLightElement extends SVGElement {
  protected SVGFEDistantLightElement() {
  }

  // Implementation of the svg::SVGFEDistantLightElement W3C IDL interface
  public final native OMSVGAnimatedNumber getAzimuth() /*-{
    return this.azimuth;
  }-*/;
  public final native OMSVGAnimatedNumber getElevation() /*-{
    return this.elevation;
  }-*/;

}
