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

import org.vectomatic.dom.svg.impl.SVGTextPositioningElement;

public abstract class OMSVGTextPositioningElement extends OMSVGTextContentElement {
  protected OMSVGTextPositioningElement(SVGTextPositioningElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextPositioningElement W3C IDL interface
  public final OMSVGAnimatedLengthList getX() {
    return ((SVGTextPositioningElement)ot).getX();
  }
  public final OMSVGAnimatedLengthList getY() {
    return ((SVGTextPositioningElement)ot).getY();
  }
  public final OMSVGAnimatedLengthList getDx() {
    return ((SVGTextPositioningElement)ot).getDx();
  }
  public final OMSVGAnimatedLengthList getDy() {
    return ((SVGTextPositioningElement)ot).getDy();
  }
  public final OMSVGAnimatedNumberList getRotate() {
    return ((SVGTextPositioningElement)ot).getRotate();
  }

}
