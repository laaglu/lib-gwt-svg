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

public class SVGFESpotLightElement extends SVGElement {
  protected SVGFESpotLightElement() {
  }

  // Implementation of the svg::SVGFESpotLightElement W3C IDL interface
  public final native OMSVGAnimatedNumber getX() /*-{
    return this.x;
  }-*/;
  public final native OMSVGAnimatedNumber getY() /*-{
    return this.y;
  }-*/;
  public final native OMSVGAnimatedNumber getZ() /*-{
    return this.z;
  }-*/;
  public final native OMSVGAnimatedNumber getPointsAtX() /*-{
    return this.pointsAtX;
  }-*/;
  public final native OMSVGAnimatedNumber getPointsAtY() /*-{
    return this.pointsAtY;
  }-*/;
  public final native OMSVGAnimatedNumber getPointsAtZ() /*-{
    return this.pointsAtZ;
  }-*/;
  public final native OMSVGAnimatedNumber getSpecularExponent() /*-{
    return this.specularExponent;
  }-*/;
  public final native OMSVGAnimatedNumber getLimitingConeAngle() /*-{
    return this.limitingConeAngle;
  }-*/;

}
