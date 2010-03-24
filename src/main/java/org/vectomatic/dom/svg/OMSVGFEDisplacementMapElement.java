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

import org.vectomatic.dom.svg.impl.SVGFEDisplacementMapElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feDisplacementMap")
public class OMSVGFEDisplacementMapElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public static final short SVG_CHANNEL_UNKNOWN = 0;
  public static final short SVG_CHANNEL_R = 1;
  public static final short SVG_CHANNEL_G = 2;
  public static final short SVG_CHANNEL_B = 3;
  public static final short SVG_CHANNEL_A = 4;
  protected OMSVGFEDisplacementMapElement(SVGFEDisplacementMapElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEDisplacementMapElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEDisplacementMapElement)ot).getIn1();
  }
  public final OMSVGAnimatedString getIn2() {
    return ((SVGFEDisplacementMapElement)ot).getIn2();
  }
  public final OMSVGAnimatedNumber getScale() {
    return ((SVGFEDisplacementMapElement)ot).getScale();
  }
  public final OMSVGAnimatedEnumeration getXChannelSelector() {
    return ((SVGFEDisplacementMapElement)ot).getXChannelSelector();
  }
  public final OMSVGAnimatedEnumeration getYChannelSelector() {
    return ((SVGFEDisplacementMapElement)ot).getYChannelSelector();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEDisplacementMapElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEDisplacementMapElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEDisplacementMapElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEDisplacementMapElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEDisplacementMapElement)ot).getResult();
  }

}
