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

import org.vectomatic.dom.svg.impl.SVGFEGaussianBlurElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEGaussianBlurElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feGaussianBlurElement'
 * title='feGaussianBlur element specification'>feGaussianBlur</a> element.
 */
@TagName("feGaussianBlur")
public class OMSVGFEGaussianBlurElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  public OMSVGFEGaussianBlurElement() {
    this((SVGFEGaussianBlurElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_GAUSSIAN_BLUR_TAG).cast());
  }

  protected OMSVGFEGaussianBlurElement(SVGFEGaussianBlurElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEGaussianBlurElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feGaussianBlurElement'
   * title='feGaussianBlur element specification'>feGaussianBlur</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEGaussianBlurElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute <code>stdDeviation</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feGaussianBlurElement'
   * title='feGaussianBlur element specification'>feGaussianBlur</a> element.
   * Contains the X component of attribute <code>stdDeviation</code>.
   */
  public final OMSVGAnimatedNumber getStdDeviationX() {
    return ((SVGFEGaussianBlurElement)ot).getStdDeviationX();
  }
  /**
   * Corresponds to attribute <code>stdDeviation</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feGaussianBlurElement'
   * title='feGaussianBlur element specification'>feGaussianBlur</a> element.
   * Contains the Y component (possibly computed automatically) of attribute
   * <code>stdDeviation</code>.
   */
  public final OMSVGAnimatedNumber getStdDeviationY() {
    return ((SVGFEGaussianBlurElement)ot).getStdDeviationY();
  }
  /**
   * Sets the values for attribute <code>stdDeviation</code>.
   * @param stdDeviationX The X component of attribute <code>stdDeviation</code>.
   * @param stdDeviationY The Y component of attribute <code>stdDeviation</code>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setStdDeviation(float stdDeviationX, float stdDeviationY) throws JavaScriptException {
    ((SVGFEGaussianBlurElement)ot).setStdDeviation(stdDeviationX, stdDeviationY);
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEGaussianBlurElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEGaussianBlurElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEGaussianBlurElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEGaussianBlurElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEGaussianBlurElement)ot).getResult();
  }

}
