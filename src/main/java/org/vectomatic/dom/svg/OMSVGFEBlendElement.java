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

import org.vectomatic.dom.svg.impl.SVGFEBlendElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEBlendElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#feBlendElement'
 * title='feBlend element specification'>feBlend</a> element.
 */
@TagName("feBlend")
public class OMSVGFEBlendElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_FEBLEND_MODE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'normal'</span>.
   */
  public static final short SVG_FEBLEND_MODE_NORMAL = 1;
  /**
   * Corresponds to value <span class="attr-value">'multiply'</span>.
   */
  public static final short SVG_FEBLEND_MODE_MULTIPLY = 2;
  /**
   * Corresponds to value <span class="attr-value">'screen'</span>.
   */
  public static final short SVG_FEBLEND_MODE_SCREEN = 3;
  /**
   * Corresponds to value <span class="attr-value">'darken'</span>.
   */
  public static final short SVG_FEBLEND_MODE_DARKEN = 4;
  /**
   * Corresponds to value <span class="attr-value">'lighten'</span>.
   */
  public static final short SVG_FEBLEND_MODE_LIGHTEN = 5;
  protected OMSVGFEBlendElement(SVGFEBlendElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEBlendElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feBlendElement'
   * title='feBlend element specification'>feBlend</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEBlendElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEBlendElement#getIn2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feBlendElement'
   * title='feBlend element specification'>feBlend</a> element.
   */
  public final OMSVGAnimatedString getIn2() {
    return ((SVGFEBlendElement)ot).getIn2();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEBlendElement#getMode()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feBlendElement'
   * title='feBlend element specification'>feBlend</a> element.  Takes one of
   * the SVG_FEBLEND_MODE_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getMode() {
    return ((SVGFEBlendElement)ot).getMode();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEBlendElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEBlendElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEBlendElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEBlendElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEBlendElement)ot).getResult();
  }

}
