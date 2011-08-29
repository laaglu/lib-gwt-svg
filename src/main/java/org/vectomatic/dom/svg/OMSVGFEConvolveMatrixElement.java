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

import org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
 * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
 */
@TagName("feConvolveMatrix")
public class OMSVGFEConvolveMatrixElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_EDGEMODE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'duplicate'</span>.
   */
  public static final short SVG_EDGEMODE_DUPLICATE = 1;
  /**
   * Corresponds to value <span class="attr-value">'wrap'</span>.
   */
  public static final short SVG_EDGEMODE_WRAP = 2;
  /**
   * Corresponds to value <span class="attr-value">'none'</span>.
   */
  public static final short SVG_EDGEMODE_NONE = 3;
  public OMSVGFEConvolveMatrixElement() {
    this((SVGFEConvolveMatrixElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_CONVOLVE_MATRIX_TAG).cast());
  }

  protected OMSVGFEConvolveMatrixElement(SVGFEConvolveMatrixElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEConvolveMatrixElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEConvolveMatrixElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute <code>order</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedInteger getOrderX() {
    return ((SVGFEConvolveMatrixElement)ot).getOrderX();
  }
  /**
   * Corresponds to attribute <code>order</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedInteger getOrderY() {
    return ((SVGFEConvolveMatrixElement)ot).getOrderY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getKernelMatrix()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedNumberList getKernelMatrix() {
    return ((SVGFEConvolveMatrixElement)ot).getKernelMatrix();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getDivisor()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedNumber getDivisor() {
    return ((SVGFEConvolveMatrixElement)ot).getDivisor();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getBias()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedNumber getBias() {
    return ((SVGFEConvolveMatrixElement)ot).getBias();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getTargetX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedInteger getTargetX() {
    return ((SVGFEConvolveMatrixElement)ot).getTargetX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getTargetY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedInteger getTargetY() {
    return ((SVGFEConvolveMatrixElement)ot).getTargetY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getEdgeMode()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   * Takes one of the SVG_EDGEMODE_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getEdgeMode() {
    return ((SVGFEConvolveMatrixElement)ot).getEdgeMode();
  }
  /**
   * Corresponds to attribute <code>kernelUnitLength</code> on the given <a
   * href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedNumber getKernelUnitLengthX() {
    return ((SVGFEConvolveMatrixElement)ot).getKernelUnitLengthX();
  }
  /**
   * Corresponds to attribute <code>kernelUnitLength</code> on the given <a
   * href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedNumber getKernelUnitLengthY() {
    return ((SVGFEConvolveMatrixElement)ot).getKernelUnitLengthY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement#getPreserveAlpha()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feConvolveMatrixElement'
   * title='feConvolveMatrix element specification'>feConvolveMatrix</a> element.
   */
  public final OMSVGAnimatedBoolean getPreserveAlpha() {
    return ((SVGFEConvolveMatrixElement)ot).getPreserveAlpha();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEConvolveMatrixElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEConvolveMatrixElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEConvolveMatrixElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEConvolveMatrixElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEConvolveMatrixElement)ot).getResult();
  }

}
