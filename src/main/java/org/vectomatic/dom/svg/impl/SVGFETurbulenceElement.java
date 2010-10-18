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
import org.vectomatic.dom.svg.OMSVGAnimatedInteger;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGFETurbulenceElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
 * title='feTurbulence element specification'>feTurbulence</a> element.
 */
public class SVGFETurbulenceElement extends SVGElement {
  protected SVGFETurbulenceElement() {
  }

  // Implementation of the svg::SVGFETurbulenceElement W3C IDL interface
  /**
   * Corresponds to attribute <code>baseFrequency</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Contains
   * the X component of the <code>baseFrequency</code> attribute.
   */
  public final native OMSVGAnimatedNumber getBaseFrequencyX() /*-{
    return this.baseFrequencyX;
  }-*/;
  /**
   * Corresponds to attribute <code>baseFrequency</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Contains
   * the Y component of the (possibly computed automatically) <code>baseFrequency</code>
   * attribute.
   */
  public final native OMSVGAnimatedNumber getBaseFrequencyY() /*-{
    return this.baseFrequencyY;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFETurbulenceElement#getNumOctaves()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.
   */
  public final native OMSVGAnimatedInteger getNumOctaves() /*-{
    return this.numOctaves;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFETurbulenceElement#getSeed()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.
   */
  public final native OMSVGAnimatedNumber getSeed() /*-{
    return this.seed;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFETurbulenceElement#getStitchTiles()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Takes
   * one of the SVG_STITCHTYPE_ constants defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getStitchTiles() /*-{
    return this.stitchTiles;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFETurbulenceElement#getType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Takes
   * one of the SVG_TURBULENCE_TYPE_ constants defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getType() /*-{
    return this.type;
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
