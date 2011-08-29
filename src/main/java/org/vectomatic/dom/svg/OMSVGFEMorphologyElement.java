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

import org.vectomatic.dom.svg.impl.SVGFEMorphologyElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEMorphologyElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#feMorphologyElement'
 * title='feMorphology element specification'>feMorphology</a> element.
 */
@TagName("feMorphology")
public class OMSVGFEMorphologyElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_MORPHOLOGY_OPERATOR_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'erode'</span>.
   */
  public static final short SVG_MORPHOLOGY_OPERATOR_ERODE = 1;
  /**
   * Corresponds to value <span class="attr-value">'dilate'</span>.
   */
  public static final short SVG_MORPHOLOGY_OPERATOR_DILATE = 2;
  public OMSVGFEMorphologyElement() {
    this((SVGFEMorphologyElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_MORPHOLOGY_TAG).cast());
  }

  protected OMSVGFEMorphologyElement(SVGFEMorphologyElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEMorphologyElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feMorphologyElement'
   * title='feMorphology element specification'>feMorphology</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEMorphologyElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEMorphologyElement#getOperator()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feMorphologyElement'
   * title='feMorphology element specification'>feMorphology</a> element.  Takes
   * one of the SVG_MORPHOLOGY_OPERATOR_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getOperator() {
    return ((SVGFEMorphologyElement)ot).getOperator();
  }
  /**
   * Corresponds to attribute <code>radius</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feMorphologyElement'
   * title='feMorphology element specification'>feMorphology</a> element.
   */
  public final OMSVGAnimatedNumber getRadiusX() {
    return ((SVGFEMorphologyElement)ot).getRadiusX();
  }
  /**
   * Corresponds to attribute <code>radius</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feMorphologyElement'
   * title='feMorphology element specification'>feMorphology</a> element.
   */
  public final OMSVGAnimatedNumber getRadiusY() {
    return ((SVGFEMorphologyElement)ot).getRadiusY();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEMorphologyElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEMorphologyElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEMorphologyElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEMorphologyElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEMorphologyElement)ot).getResult();
  }

}
