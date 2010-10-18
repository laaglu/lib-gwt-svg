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
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedLength;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGLinearGradientElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
 * title='linearGradient element specification'>linearGradient</a> element.
 */
public class SVGLinearGradientElement extends SVGGradientElement {
  protected SVGLinearGradientElement() {
  }

  // Implementation of the svg::SVGLinearGradientElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGLinearGradientElement#getX1()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final native OMSVGAnimatedLength getX1() /*-{
    return this.x1;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGLinearGradientElement#getY1()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final native OMSVGAnimatedLength getY1() /*-{
    return this.y1;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGLinearGradientElement#getX2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final native OMSVGAnimatedLength getX2() /*-{
    return this.x2;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGLinearGradientElement#getY2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final native OMSVGAnimatedLength getY2() /*-{
    return this.y2;
  }-*/;

}
