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

import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedNumberList;

/**
 * This interface defines a base interface used by the component transfer
 * function interfaces.
 */
public class SVGComponentTransferFunctionElement extends SVGElement {
  protected SVGComponentTransferFunctionElement() {
  }

  // Implementation of the svg::SVGComponentTransferFunctionElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getType()}
   * on the given element.  Takes one of the SVG_FECOMPONENTTRANSFER_TYPE_ constants
   * defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getType() /*-{
    return this.type;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getTableValues()}
   * on the given element.
   */
  public final native OMSVGAnimatedNumberList getTableValues() /*-{
    return this.tableValues;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getSlope()}
   * on the given element.
   */
  public final native OMSVGAnimatedNumber getSlope() /*-{
    return this.slope;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getIntercept()}
   * on the given element.
   */
  public final native OMSVGAnimatedNumber getIntercept() /*-{
    return this.intercept;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getAmplitude()}
   * on the given element.
   */
  public final native OMSVGAnimatedNumber getAmplitude() /*-{
    return this.amplitude;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getExponent()}
   * on the given element.
   */
  public final native OMSVGAnimatedNumber getExponent() /*-{
    return this.exponent;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement#getOffset()}
   * on the given element.
   */
  public final native OMSVGAnimatedNumber getOffset() /*-{
    return this.offset;
  }-*/;

}
