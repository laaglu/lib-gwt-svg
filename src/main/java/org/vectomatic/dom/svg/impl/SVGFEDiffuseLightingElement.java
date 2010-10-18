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

import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGFEDiffuseLightingElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement'
 * title='feDiffuseLighting element specification'>feDiffuseLighting</a> element.
 */
public class SVGFEDiffuseLightingElement extends SVGElement {
  protected SVGFEDiffuseLightingElement() {
  }

  // Implementation of the svg::SVGFEDiffuseLightingElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement'
   * title='feDiffuseLighting element specification'>feDiffuseLighting</a> element.
   */
  public final native OMSVGAnimatedString getIn1() /*-{
    return this.in1;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEDiffuseLightingElement#getSurfaceScale()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement'
   * title='feDiffuseLighting element specification'>feDiffuseLighting</a> element.
   */
  public final native OMSVGAnimatedNumber getSurfaceScale() /*-{
    return this.surfaceScale;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFEDiffuseLightingElement#getDiffuseConstant()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement'
   * title='feDiffuseLighting element specification'>feDiffuseLighting</a> element.
   */
  public final native OMSVGAnimatedNumber getDiffuseConstant() /*-{
    return this.diffuseConstant;
  }-*/;
  /**
   * Corresponds to attribute <code>kernelUnitLength</code> on the given <a
   * href='http://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement'
   * title='feDiffuseLighting element specification'>feDiffuseLighting</a> element.
   */
  public final native OMSVGAnimatedNumber getKernelUnitLengthX() /*-{
    return this.kernelUnitLengthX;
  }-*/;
  /**
   * Corresponds to attribute <code>kernelUnitLength</code> on the given <a
   * href='http://www.w3.org/TR/SVG11/filters.html#feDiffuseLightingElement'
   * title='feDiffuseLighting element specification'>feDiffuseLighting</a> element.
   */
  public final native OMSVGAnimatedNumber getKernelUnitLengthY() /*-{
    return this.kernelUnitLengthY;
  }-*/;

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final native OMSVGAnimatedString getResult() /*-{
    return this.result;
  }-*/;

}
