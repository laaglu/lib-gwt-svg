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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Used for attributes of type {@link org.vectomatic.dom.svg.OMSVGRect} which
 * can be animated.
 */
public class OMSVGAnimatedRect extends JavaScriptObject {
  protected OMSVGAnimatedRect() {
  }

  // Implementation of the svg::SVGAnimatedRect W3C IDL interface
  /**
   * The base value of the given attribute before applying any animations.
   */
  public final native OMSVGRect getBaseVal() /*-{
    return this.baseVal;
  }-*/;
  /**
   * A <a href="#ReadOnlyRect">read only</a> {@link org.vectomatic.dom.svg.OMSVGRect}
   * representing the current animated value of the given attribute.  If the
   * given attribute is not currently being animated, then the {@link org.vectomatic.dom.svg.OMSVGRect}
   * will have the same contents as {@link org.vectomatic.dom.svg.OMSVGAnimatedRect#getBaseVal()}.
   * The object referenced by {@link org.vectomatic.dom.svg.OMSVGAnimatedRect#getAnimVal()}
   * will always be distinct from the one referenced by {@link org.vectomatic.dom.svg.OMSVGAnimatedRect#getBaseVal()},
   * even when the attribute is not animated.
   */
  public final native OMSVGRect getAnimVal() /*-{
    return this.animVal;
  }-*/;

}
