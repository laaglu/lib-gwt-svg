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

import org.vectomatic.dom.svg.impl.SVGFETileElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feTile")
public class OMSVGFETileElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFETileElement(SVGFETileElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFETileElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFETileElement)ot).getIn1();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFETileElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFETileElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFETileElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFETileElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFETileElement)ot).getResult();
  }

}
