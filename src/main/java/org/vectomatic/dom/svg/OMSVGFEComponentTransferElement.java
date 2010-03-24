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

import org.vectomatic.dom.svg.impl.SVGFEComponentTransferElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feComponentTransfer")
public class OMSVGFEComponentTransferElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFEComponentTransferElement(SVGFEComponentTransferElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEComponentTransferElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEComponentTransferElement)ot).getIn1();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEComponentTransferElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEComponentTransferElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEComponentTransferElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEComponentTransferElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEComponentTransferElement)ot).getResult();
  }

}
