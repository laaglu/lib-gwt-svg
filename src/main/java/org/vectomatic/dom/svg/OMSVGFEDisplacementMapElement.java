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

import org.vectomatic.dom.svg.impl.SVGFEDisplacementMapElement;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEDisplacementMapElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement'
 * title='feDisplacementMap element specification'>feDisplacementMap</a> element.
 */
@TagName("feDisplacementMap")
public class OMSVGFEDisplacementMapElement extends OMSVGElement implements ISVGFilterPrimitiveStandardAttributes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_CHANNEL_UNKNOWN = 0;
  /**
   * Corresponds to value <span class="attr-value">'R'</span>.
   */
  public static final short SVG_CHANNEL_R = 1;
  /**
   * Corresponds to value <span class="attr-value">'G'</span>.
   */
  public static final short SVG_CHANNEL_G = 2;
  /**
   * Corresponds to value <span class="attr-value">'B'</span>.
   */
  public static final short SVG_CHANNEL_B = 3;
  /**
   * Corresponds to value <span class="attr-value">'A'</span>.
   */
  public static final short SVG_CHANNEL_A = 4;
  public OMSVGFEDisplacementMapElement() {
    this((SVGFEDisplacementMapElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_DISPLACEMENT_MAP_TAG).cast());
  }

  protected OMSVGFEDisplacementMapElement(SVGFEDisplacementMapElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEDisplacementMapElement W3C IDL interface
  /**
   * Corresponds to attribute <code>in</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement'
   * title='feDisplacementMap element specification'>feDisplacementMap</a> element.
   */
  public final OMSVGAnimatedString getIn1() {
    return ((SVGFEDisplacementMapElement)ot).getIn1();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEDisplacementMapElement#getIn2()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement'
   * title='feDisplacementMap element specification'>feDisplacementMap</a> element.
   */
  public final OMSVGAnimatedString getIn2() {
    return ((SVGFEDisplacementMapElement)ot).getIn2();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEDisplacementMapElement#getScale()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement'
   * title='feDisplacementMap element specification'>feDisplacementMap</a> element.
   */
  public final OMSVGAnimatedNumber getScale() {
    return ((SVGFEDisplacementMapElement)ot).getScale();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEDisplacementMapElement#getXChannelSelector()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement'
   * title='feDisplacementMap element specification'>feDisplacementMap</a> element.
   * Takes one of the SVG_CHANNEL_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getXChannelSelector() {
    return ((SVGFEDisplacementMapElement)ot).getXChannelSelector();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEDisplacementMapElement#getYChannelSelector()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDisplacementMapElement'
   * title='feDisplacementMap element specification'>feDisplacementMap</a> element.
   * Takes one of the SVG_CHANNEL_ constants defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getYChannelSelector() {
    return ((SVGFEDisplacementMapElement)ot).getYChannelSelector();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getX()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEDisplacementMapElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getY()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEDisplacementMapElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getWidth()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEDisplacementMapElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getHeight()}
   * on the given element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEDisplacementMapElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes#getResult()}
   * on the given element.
   */
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEDisplacementMapElement)ot).getResult();
  }

}
