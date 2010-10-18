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

import org.vectomatic.dom.svg.OMSVGAnimatedLengthList;
import org.vectomatic.dom.svg.OMSVGAnimatedNumberList;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGTextPositioningElement} interface
 * is inherited by text-related interfaces: {@link org.vectomatic.dom.svg.impl.SVGTextElement},
 * {@link org.vectomatic.dom.svg.impl.SVGTSpanElement}, {@link org.vectomatic.dom.svg.impl.SVGTRefElement}
 * and {@link org.vectomatic.dom.svg.impl.SVGAltGlyphElement}.
 */
public class SVGTextPositioningElement extends SVGTextContentElement {
  protected SVGTextPositioningElement() {
  }

  // Implementation of the svg::SVGTextPositioningElement W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'x'</span> on the given
   * element.
   */
  public final native OMSVGAnimatedLengthList getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute <span class='attr-name'>'y'</span> on the given
   * element.
   */
  public final native OMSVGAnimatedLengthList getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute <span class='attr-name'>'dx'</span> on the given
   * element.
   */
  public final native OMSVGAnimatedLengthList getDx() /*-{
    return this.dx;
  }-*/;
  /**
   * Corresponds to attribute <span class='attr-name'>'dy'</span> on the given
   * element.
   */
  public final native OMSVGAnimatedLengthList getDy() /*-{
    return this.dy;
  }-*/;
  /**
   * Corresponds to attribute <span class='attr-name'>'rotate'</span> on the
   * given element.
   */
  public final native OMSVGAnimatedNumberList getRotate() /*-{
    return this.rotate;
  }-*/;

}
