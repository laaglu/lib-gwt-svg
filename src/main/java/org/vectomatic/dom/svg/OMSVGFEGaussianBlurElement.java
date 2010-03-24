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

import org.vectomatic.dom.svg.impl.SVGFEGaussianBlurElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

@TagName("feGaussianBlur")
public class OMSVGFEGaussianBlurElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFEGaussianBlurElement(SVGFEGaussianBlurElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEGaussianBlurElement W3C IDL interface
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEGaussianBlurElement)ot).getIn1();
  }
  public final OMSVGAnimatedNumber getStdDeviationX() {
    return ((SVGFEGaussianBlurElement)ot).getStdDeviationX();
  }
  public final OMSVGAnimatedNumber getStdDeviationY() {
    return ((SVGFEGaussianBlurElement)ot).getStdDeviationY();
  }
  public final void setStdDeviation(float stdDeviationX, float stdDeviationY) {
    ((SVGFEGaussianBlurElement)ot).setStdDeviation(stdDeviationX, stdDeviationY);
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEGaussianBlurElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEGaussianBlurElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEGaussianBlurElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEGaussianBlurElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEGaussianBlurElement)ot).getResult();
  }

}
