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

import org.vectomatic.dom.svg.impl.SVGFESpotLightElement;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
 * title='feSpotLight element specification'>feSpotLight</a> element.
 */
@TagName("feSpotLight")
public class OMSVGFESpotLightElement extends OMSVGElement {
  protected OMSVGFESpotLightElement(SVGFESpotLightElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFESpotLightElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getX() {
    return ((SVGFESpotLightElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getY() {
    return ((SVGFESpotLightElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getZ()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getZ() {
    return ((SVGFESpotLightElement)ot).getZ();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getPointsAtX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getPointsAtX() {
    return ((SVGFESpotLightElement)ot).getPointsAtX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getPointsAtY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getPointsAtY() {
    return ((SVGFESpotLightElement)ot).getPointsAtY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getPointsAtZ()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getPointsAtZ() {
    return ((SVGFESpotLightElement)ot).getPointsAtZ();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getSpecularExponent()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getSpecularExponent() {
    return ((SVGFESpotLightElement)ot).getSpecularExponent();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFESpotLightElement#getLimitingConeAngle()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final OMSVGAnimatedNumber getLimitingConeAngle() {
    return ((SVGFESpotLightElement)ot).getLimitingConeAngle();
  }

}
