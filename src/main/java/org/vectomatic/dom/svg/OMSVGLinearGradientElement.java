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

package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.SVGLinearGradientElement;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGLinearGradientElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
 * title='linearGradient element specification'>linearGradient</a> element.
 */
@TagName("linearGradient")
public class OMSVGLinearGradientElement extends OMSVGGradientElement {
  protected OMSVGLinearGradientElement(SVGLinearGradientElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGLinearGradientElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGLinearGradientElement#getX1()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final OMSVGAnimatedLength getX1() {
    return ((SVGLinearGradientElement)ot).getX1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGLinearGradientElement#getY1()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final OMSVGAnimatedLength getY1() {
    return ((SVGLinearGradientElement)ot).getY1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGLinearGradientElement#getX2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final OMSVGAnimatedLength getX2() {
    return ((SVGLinearGradientElement)ot).getX2();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGLinearGradientElement#getY2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#LinearGradientElement'
   * title='linearGradient element specification'>linearGradient</a> element.
   */
  public final OMSVGAnimatedLength getY2() {
    return ((SVGLinearGradientElement)ot).getY2();
  }

}
