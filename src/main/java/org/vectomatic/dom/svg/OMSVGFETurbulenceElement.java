/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see <http://www.gnu.org/licenses/>
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGFETurbulenceElement extends org.vectomatic.dom.svg.OMSVGFilterPrimitiveStandardAttributes {
  protected OMSVGFETurbulenceElement() {
  }

  // Implementation of the nsIDOMSVGFETurbulenceElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getBaseFrequencyX() /*-{
    return this.baseFrequencyX;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getBaseFrequencyY() /*-{
    return this.baseFrequencyY;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getNumOctaves() /*-{
    return this.numOctaves;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getSeed() /*-{
    return this.seed;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getStitchTiles() /*-{
    return this.stitchTiles;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getType() /*-{
    return this.type;
  }-*/;

}
