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

import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedInteger;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGFETurbulenceElement extends SVGElement {
  protected SVGFETurbulenceElement() {
  }

  // Implementation of the svg::SVGFETurbulenceElement W3C IDL interface
  public final native OMSVGAnimatedNumber getBaseFrequencyX() /*-{
    return this.baseFrequencyX;
  }-*/;
  public final native OMSVGAnimatedNumber getBaseFrequencyY() /*-{
    return this.baseFrequencyY;
  }-*/;
  public final native OMSVGAnimatedInteger getNumOctaves() /*-{
    return this.numOctaves;
  }-*/;
  public final native OMSVGAnimatedNumber getSeed() /*-{
    return this.seed;
  }-*/;
  public final native OMSVGAnimatedEnumeration getStitchTiles() /*-{
    return this.stitchTiles;
  }-*/;
  public final native OMSVGAnimatedEnumeration getType() /*-{
    return this.type;
  }-*/;

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  public final native OMSVGAnimatedString getResult() /*-{
    return this.result;
  }-*/;

}
