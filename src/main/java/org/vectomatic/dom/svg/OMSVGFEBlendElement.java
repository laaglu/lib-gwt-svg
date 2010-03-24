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

import org.vectomatic.dom.svg.impl.SVGFEBlendElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feBlend")
public class OMSVGFEBlendElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_FEBLEND_MODE_UNKNOWN = 0;
  public static final short SVG_FEBLEND_MODE_NORMAL = 1;
  public static final short SVG_FEBLEND_MODE_MULTIPLY = 2;
  public static final short SVG_FEBLEND_MODE_SCREEN = 3;
  public static final short SVG_FEBLEND_MODE_DARKEN = 4;
  public static final short SVG_FEBLEND_MODE_LIGHTEN = 5;
  protected OMSVGFEBlendElement(SVGFEBlendElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEBlendElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEBlendElement)ot).getIn1();
  }
  public final OMSVGAnimatedString getIn2() {
    return ((SVGFEBlendElement)ot).getIn2();
  }
  public final OMSVGAnimatedEnumeration getMode() {
    return ((SVGFEBlendElement)ot).getMode();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEBlendElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEBlendElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEBlendElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEBlendElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEBlendElement)ot).getResult();
  }

}
