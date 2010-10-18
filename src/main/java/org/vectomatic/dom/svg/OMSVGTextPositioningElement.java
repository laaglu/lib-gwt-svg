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

import org.vectomatic.dom.svg.impl.SVGTextPositioningElement;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGTextPositioningElement} interface
 * is inherited by text-related interfaces: {@link org.vectomatic.dom.svg.OMSVGTextElement},
 * {@link org.vectomatic.dom.svg.OMSVGTSpanElement}, {@link org.vectomatic.dom.svg.OMSVGTRefElement}
 * and {@link org.vectomatic.dom.svg.OMSVGAltGlyphElement}.
 */
public abstract class OMSVGTextPositioningElement extends OMSVGTextContentElement {
  protected OMSVGTextPositioningElement(SVGTextPositioningElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextPositioningElement W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'x'</span> on the given
   * element.
   */
  public final OMSVGAnimatedLengthList getX() {
    return ((SVGTextPositioningElement)ot).getX();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'y'</span> on the given
   * element.
   */
  public final OMSVGAnimatedLengthList getY() {
    return ((SVGTextPositioningElement)ot).getY();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'dx'</span> on the given
   * element.
   */
  public final OMSVGAnimatedLengthList getDx() {
    return ((SVGTextPositioningElement)ot).getDx();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'dy'</span> on the given
   * element.
   */
  public final OMSVGAnimatedLengthList getDy() {
    return ((SVGTextPositioningElement)ot).getDy();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'rotate'</span> on the
   * given element.
   */
  public final OMSVGAnimatedNumberList getRotate() {
    return ((SVGTextPositioningElement)ot).getRotate();
  }

}
