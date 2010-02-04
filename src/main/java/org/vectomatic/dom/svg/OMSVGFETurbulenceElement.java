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

import org.vectomatic.dom.svg.impl.SVGFETurbulenceElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

public class OMSVGFETurbulenceElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_TURBULENCE_TYPE_UNKNOWN = 0;
  public static final short SVG_TURBULENCE_TYPE_FRACTALNOISE = 1;
  public static final short SVG_TURBULENCE_TYPE_TURBULENCE = 2;
  public static final short SVG_STITCHTYPE_UNKNOWN = 0;
  public static final short SVG_STITCHTYPE_STITCH = 1;
  public static final short SVG_STITCHTYPE_NOSTITCH = 2;
  protected OMSVGFETurbulenceElement(SVGFETurbulenceElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFETurbulenceElement W3C IDL interface
  public final OMSVGAnimatedNumber getBaseFrequencyX() {
    return ((SVGFETurbulenceElement)ot).getBaseFrequencyX();
  }
  public final OMSVGAnimatedNumber getBaseFrequencyY() {
    return ((SVGFETurbulenceElement)ot).getBaseFrequencyY();
  }
  public final OMSVGAnimatedInteger getNumOctaves() {
    return ((SVGFETurbulenceElement)ot).getNumOctaves();
  }
  public final OMSVGAnimatedNumber getSeed() {
    return ((SVGFETurbulenceElement)ot).getSeed();
  }
  public final OMSVGAnimatedEnumeration getStitchTiles() {
    return ((SVGFETurbulenceElement)ot).getStitchTiles();
  }
  public final OMSVGAnimatedEnumeration getType() {
    return ((SVGFETurbulenceElement)ot).getType();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFETurbulenceElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFETurbulenceElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFETurbulenceElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFETurbulenceElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFETurbulenceElement)ot).getResult();
  }

}
