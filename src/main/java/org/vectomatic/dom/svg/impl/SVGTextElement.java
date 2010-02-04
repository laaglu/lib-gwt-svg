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

import org.vectomatic.dom.svg.OMSVGAnimatedTransformList;
import org.vectomatic.dom.svg.OMSVGMatrix;
import org.vectomatic.dom.svg.OMSVGRect;

public class SVGTextElement extends SVGTextPositioningElement {
  protected SVGTextElement() {
  }

  // Implementation of the svg::SVGTextElement W3C IDL interface

  // Implementation of the svg::SVGTransformable W3C IDL interface
  public final native OMSVGAnimatedTransformList getTransform() /*-{
    return this.transform;
  }-*/;

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final native SVGElement getNearestViewportElement() /*-{
    return this.nearestViewportElement;
  }-*/;
  public final native SVGElement getFarthestViewportElement() /*-{
    return this.farthestViewportElement;
  }-*/;
  public final native OMSVGRect getBBox() /*-{
    return this.getBBox();
  }-*/;
  public final native OMSVGMatrix getCTM() /*-{
    return this.getCTM();
  }-*/;
  public final native OMSVGMatrix getScreenCTM() /*-{
    return this.getScreenCTM();
  }-*/;
  public final native OMSVGMatrix getTransformToElement(SVGElement element) /*-{
    return this.getTransformToElement(element);
  }-*/;

}
