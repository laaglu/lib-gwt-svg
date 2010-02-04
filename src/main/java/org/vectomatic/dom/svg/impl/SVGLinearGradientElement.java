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

import org.vectomatic.dom.svg.OMSVGAnimatedLength;

public class SVGLinearGradientElement extends SVGGradientElement {
  protected SVGLinearGradientElement() {
  }

  // Implementation of the svg::SVGLinearGradientElement W3C IDL interface
  public final native OMSVGAnimatedLength getX1() /*-{
    return this.x1;
  }-*/;
  public final native OMSVGAnimatedLength getY1() /*-{
    return this.y1;
  }-*/;
  public final native OMSVGAnimatedLength getX2() /*-{
    return this.x2;
  }-*/;
  public final native OMSVGAnimatedLength getY2() /*-{
    return this.y2;
  }-*/;

}
