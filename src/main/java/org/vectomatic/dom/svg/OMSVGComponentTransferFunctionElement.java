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

import org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement;

/**
 * This interface defines a base interface used by the component transfer
 * function interfaces.
 */
public abstract class OMSVGComponentTransferFunctionElement extends OMSVGElement {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'identity'</span>.
   */
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY = 1;
  /**
   * Corresponds to value <span class="attr-value">'table'</span>.
   */
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_TABLE = 2;
  /**
   * Corresponds to value <span class="attr-value">'discrete'</span>.
   */
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE = 3;
  /**
   * Corresponds to value <span class="attr-value">'linear'</span>.
   */
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_LINEAR = 4;
  /**
   * Corresponds to value <span class="attr-value">'gamma'</span>.
   */
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_GAMMA = 5;
  protected OMSVGComponentTransferFunctionElement(SVGComponentTransferFunctionElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGComponentTransferFunctionElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getType()}
   * on the given element.  Takes one of the SVG_FECOMPONENTTRANSFER_TYPE_ constants
   * defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getType() {
    return ((SVGComponentTransferFunctionElement)ot).getType();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getTableValues()}
   * on the given element.
   */
  public final OMSVGAnimatedNumberList getTableValues() {
    return ((SVGComponentTransferFunctionElement)ot).getTableValues();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getSlope()}
   * on the given element.
   */
  public final OMSVGAnimatedNumber getSlope() {
    return ((SVGComponentTransferFunctionElement)ot).getSlope();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getIntercept()}
   * on the given element.
   */
  public final OMSVGAnimatedNumber getIntercept() {
    return ((SVGComponentTransferFunctionElement)ot).getIntercept();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getAmplitude()}
   * on the given element.
   */
  public final OMSVGAnimatedNumber getAmplitude() {
    return ((SVGComponentTransferFunctionElement)ot).getAmplitude();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getExponent()}
   * on the given element.
   */
  public final OMSVGAnimatedNumber getExponent() {
    return ((SVGComponentTransferFunctionElement)ot).getExponent();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGComponentTransferFunctionElement#getOffset()}
   * on the given element.
   */
  public final OMSVGAnimatedNumber getOffset() {
    return ((SVGComponentTransferFunctionElement)ot).getOffset();
  }

}
