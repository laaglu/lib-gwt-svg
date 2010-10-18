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

import org.vectomatic.dom.svg.OMSVGAnimatedNumber;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
 * title='feSpotLight element specification'>feSpotLight</a> element.
 */
public class SVGFESpotLightElement extends SVGElement {
  protected SVGFESpotLightElement() {
  }

  // Implementation of the svg::SVGFESpotLightElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getZ()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getZ() /*-{
    return this.z;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getPointsAtX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getPointsAtX() /*-{
    return this.pointsAtX;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getPointsAtY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getPointsAtY() /*-{
    return this.pointsAtY;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getPointsAtZ()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getPointsAtZ() /*-{
    return this.pointsAtZ;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getSpecularExponent()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getSpecularExponent() /*-{
    return this.specularExponent;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFESpotLightElement#getLimitingConeAngle()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feSpotLightElement'
   * title='feSpotLight element specification'>feSpotLight</a> element.
   */
  public final native OMSVGAnimatedNumber getLimitingConeAngle() /*-{
    return this.limitingConeAngle;
  }-*/;

}
