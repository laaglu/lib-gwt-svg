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

import org.vectomatic.dom.svg.impl.SVGRadialGradientElement;

import com.google.gwt.dom.client.TagName;

@TagName("radialGradient")
public class OMSVGRadialGradientElement extends OMSVGGradientElement {
  protected OMSVGRadialGradientElement(SVGRadialGradientElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGRadialGradientElement W3C IDL interface
  public final OMSVGAnimatedLength getCx() {
    return ((SVGRadialGradientElement)ot).getCx();
  }
  public final OMSVGAnimatedLength getCy() {
    return ((SVGRadialGradientElement)ot).getCy();
  }
  public final OMSVGAnimatedLength getR() {
    return ((SVGRadialGradientElement)ot).getR();
  }
  public final OMSVGAnimatedLength getFx() {
    return ((SVGRadialGradientElement)ot).getFx();
  }
  public final OMSVGAnimatedLength getFy() {
    return ((SVGRadialGradientElement)ot).getFy();
  }

}
