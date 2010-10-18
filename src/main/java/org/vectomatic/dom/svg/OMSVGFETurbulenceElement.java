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

import org.vectomatic.dom.svg.impl.SVGFETurbulenceElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFETurbulenceElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
 * title='feTurbulence element specification'>feTurbulence</a> element.
 */
@TagName("feTurbulence")
public class OMSVGFETurbulenceElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_TURBULENCE_TYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'fractalNoise'</span>.
   */
  public static final short SVG_TURBULENCE_TYPE_FRACTALNOISE = 1;
  /**
   * Corresponds to value <span class="attr-value">'turbulence'</span>.
   */
  public static final short SVG_TURBULENCE_TYPE_TURBULENCE = 2;
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_STITCHTYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'stitch'</span>.
   */
  public static final short SVG_STITCHTYPE_STITCH = 1;
  /**
   * Corresponds to value <span class="attr-value">'noStitch'</span>.
   */
  public static final short SVG_STITCHTYPE_NOSTITCH = 2;
  protected OMSVGFETurbulenceElement(SVGFETurbulenceElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFETurbulenceElement W3C IDL interface
  /**
   * Corresponds to attribute <code>baseFrequency</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Contains
   * the X component of the <code>baseFrequency</code> attribute.
   */
  public final OMSVGAnimatedNumber getBaseFrequencyX() {
    return ((SVGFETurbulenceElement)ot).getBaseFrequencyX();
  }
  /**
   * Corresponds to attribute <code>baseFrequency</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Contains
   * the Y component of the (possibly computed automatically) <code>baseFrequency</code>
   * attribute.
   */
  public final OMSVGAnimatedNumber getBaseFrequencyY() {
    return ((SVGFETurbulenceElement)ot).getBaseFrequencyY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFETurbulenceElement#getNumOctaves()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.
   */
  public final OMSVGAnimatedInteger getNumOctaves() {
    return ((SVGFETurbulenceElement)ot).getNumOctaves();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFETurbulenceElement#getSeed()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.
   */
  public final OMSVGAnimatedNumber getSeed() {
    return ((SVGFETurbulenceElement)ot).getSeed();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFETurbulenceElement#getStitchTiles()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Takes
   * one of the SVG_STITCHTYPE_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getStitchTiles() {
    return ((SVGFETurbulenceElement)ot).getStitchTiles();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFETurbulenceElement#getType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feTurbulenceElement'
   * title='feTurbulence element specification'>feTurbulence</a> element.  Takes
   * one of the SVG_TURBULENCE_TYPE_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getType() {
    return ((SVGFETurbulenceElement)ot).getType();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFETurbulenceElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFETurbulenceElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFETurbulenceElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFETurbulenceElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFETurbulenceElement)ot).getResult();
  }

}
