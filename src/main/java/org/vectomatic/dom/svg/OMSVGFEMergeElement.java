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

import org.vectomatic.dom.svg.impl.SVGFEMergeElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feMerge")
public class OMSVGFEMergeElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFEMergeElement(SVGFEMergeElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEMergeElement W3C IDL interface

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEMergeElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEMergeElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEMergeElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEMergeElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEMergeElement)ot).getResult();
  }

}
