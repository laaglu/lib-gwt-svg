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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.SVGComponentTransferFunctionElement;

public abstract class OMSVGComponentTransferFunctionElement extends OMSVGElement {
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN = 0;
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY = 1;
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_TABLE = 2;
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE = 3;
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_LINEAR = 4;
  public static final short SVG_FECOMPONENTTRANSFER_TYPE_GAMMA = 5;
  protected OMSVGComponentTransferFunctionElement(SVGComponentTransferFunctionElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGComponentTransferFunctionElement W3C IDL interface
  public final OMSVGAnimatedEnumeration getType() {
    return ((SVGComponentTransferFunctionElement)ot).getType();
  }
  public final OMSVGAnimatedNumberList getTableValues() {
    return ((SVGComponentTransferFunctionElement)ot).getTableValues();
  }
  public final OMSVGAnimatedNumber getSlope() {
    return ((SVGComponentTransferFunctionElement)ot).getSlope();
  }
  public final OMSVGAnimatedNumber getIntercept() {
    return ((SVGComponentTransferFunctionElement)ot).getIntercept();
  }
  public final OMSVGAnimatedNumber getAmplitude() {
    return ((SVGComponentTransferFunctionElement)ot).getAmplitude();
  }
  public final OMSVGAnimatedNumber getExponent() {
    return ((SVGComponentTransferFunctionElement)ot).getExponent();
  }
  public final OMSVGAnimatedNumber getOffset() {
    return ((SVGComponentTransferFunctionElement)ot).getOffset();
  }

}
