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

import org.vectomatic.dom.svg.impl.SVGFECompositeElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFECompositeElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
 * title='feComposite element specification'>feComposite</a> element.
 */
@TagName("feComposite")
public class OMSVGFECompositeElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'over'</span>.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_OVER = 1;
  /**
   * Corresponds to value <span class="attr-value">'in'</span>.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_IN = 2;
  /**
   * Corresponds to value <span class="attr-value">'out'</span>.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_OUT = 3;
  /**
   * Corresponds to value <span class="attr-value">'atop'</span>.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_ATOP = 4;
  /**
   * Corresponds to value <span class="attr-value">'xor'</span>.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_XOR = 5;
  /**
   * Corresponds to value <span class="attr-value">'arithmetic'</span>.
   */
  public static final short SVG_FECOMPOSITE_OPERATOR_ARITHMETIC = 6;
  protected OMSVGFECompositeElement(SVGFECompositeElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFECompositeElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFECompositeElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFECompositeElement#getIn2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.
   */
  public final OMSVGAnimatedString getIn2() {
    return ((SVGFECompositeElement)ot).getIn2();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFECompositeElement#getOperator()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.  Takes
   * one of the SVG_FECOMPOSITE_OPERATOR_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getOperator() {
    return ((SVGFECompositeElement)ot).getOperator();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFECompositeElement#getK1()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.
   */
  public final OMSVGAnimatedNumber getK1() {
    return ((SVGFECompositeElement)ot).getK1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFECompositeElement#getK2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.
   */
  public final OMSVGAnimatedNumber getK2() {
    return ((SVGFECompositeElement)ot).getK2();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFECompositeElement#getK3()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.
   */
  public final OMSVGAnimatedNumber getK3() {
    return ((SVGFECompositeElement)ot).getK3();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFECompositeElement#getK4()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feCompositeElement'
   * title='feComposite element specification'>feComposite</a> element.
   */
  public final OMSVGAnimatedNumber getK4() {
    return ((SVGFECompositeElement)ot).getK4();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFECompositeElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFECompositeElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFECompositeElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFECompositeElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFECompositeElement)ot).getResult();
  }

}
