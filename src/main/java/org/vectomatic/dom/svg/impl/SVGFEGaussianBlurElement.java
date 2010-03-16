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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGFEGaussianBlurElement extends SVGElement {
  protected SVGFEGaussianBlurElement() {
  }

  // Implementation of the svg::SVGFEGaussianBlurElement W3C IDL interface
  public final native OMSVGAnimatedString getIn1() /*-{
    return this.in1;
  }-*/;
  public final native OMSVGAnimatedNumber getStdDeviationX() /*-{
    return this.stdDeviationX;
  }-*/;
  public final native OMSVGAnimatedNumber getStdDeviationY() /*-{
    return this.stdDeviationY;
  }-*/;
  public final native void setStdDeviation(float stdDeviationX, float stdDeviationY) /*-{
    this.setStdDeviation(stdDeviationX, stdDeviationY);
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
