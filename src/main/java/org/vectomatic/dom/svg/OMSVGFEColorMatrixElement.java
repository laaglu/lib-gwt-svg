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

import org.vectomatic.dom.svg.impl.SVGFEColorMatrixElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEColorMatrixElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feColorMatrixElement'
 * title='feColorMatrix element specification'>feColorMatrix</a> element.
 */
@TagName("feColorMatrix")
public class OMSVGFEColorMatrixElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_FECOLORMATRIX_TYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'matrix'</span>.
   */
  public static final short SVG_FECOLORMATRIX_TYPE_MATRIX = 1;
  /**
   * Corresponds to value <span class="attr-value">'saturate'</span>.
   */
  public static final short SVG_FECOLORMATRIX_TYPE_SATURATE = 2;
  /**
   * Corresponds to value <span class="attr-value">'hueRotate'</span>.
   */
  public static final short SVG_FECOLORMATRIX_TYPE_HUEROTATE = 3;
  /**
   * Corresponds to value <span class="attr-value">'luminanceToAlpha'</span>.
   */
  public static final short SVG_FECOLORMATRIX_TYPE_LUMINANCETOALPHA = 4;
  public OMSVGFEColorMatrixElement() {
    this((SVGFEColorMatrixElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_COLOR_MATRIX_TAG).cast());
  }

  protected OMSVGFEColorMatrixElement(SVGFEColorMatrixElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEColorMatrixElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feColorMatrixElement'
   * title='feColorMatrix element specification'>feColorMatrix</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEColorMatrixElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEColorMatrixElement#getType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feColorMatrixElement'
   * title='feColorMatrix element specification'>feColorMatrix</a> element.
   * Takes one of the SVG_FECOLORMATRIX_TYPE_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getType() {
    return ((SVGFEColorMatrixElement)ot).getType();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEColorMatrixElement#getValues()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feColorMatrixElement'
   * title='feColorMatrix element specification'>feColorMatrix</a> element.
   */
  public final OMSVGAnimatedNumberList getValues() {
    return ((SVGFEColorMatrixElement)ot).getValues();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEColorMatrixElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEColorMatrixElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEColorMatrixElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEColorMatrixElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEColorMatrixElement)ot).getResult();
  }

}
