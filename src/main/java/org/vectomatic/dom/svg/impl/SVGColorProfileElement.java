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

import org.vectomatic.dom.svg.OMSVGAnimatedString;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGColorProfileElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/color.html#ColorProfileElement'
 * title='color-profile element specification'>color-profile</a>  element.
 */
public class SVGColorProfileElement extends SVGElement {
  protected SVGColorProfileElement() {
  }

  // Implementation of the svg::SVGColorProfileElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGColorProfileElement#getLocal()}
   * on the given element.
   */
  public final native String getLocal() /*-{
    return this.local;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGColorProfileElement#getLocal()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setLocal(String value) /*-{
    this.local = value;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGColorProfileElement#getName()}
   * on the given element.
   */
  public final native String getName() /*-{
    return this.name;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGColorProfileElement#getName()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setName(String value) /*-{
    this.name = value;
  }-*/;
  /**
   * Corresponds to attribute <code>rendering-intent</code> on the given element.
   * The value of this attribute is the value of the the RENDERING_INTENT_ constant
   * defined on {@link org.vectomatic.dom.svg.itf.ISVGRenderingIntent} that
   * corresponds to the value of the <code>rendering-intent</code> attribute.
   */
  public final native short getRenderingIntent() /*-{
    return this.renderingIntent;
  }-*/;
  /**
   * Corresponds to attribute <code>rendering-intent</code> on the given element.
   * The value of this attribute is the value of the the RENDERING_INTENT_ constant
   * defined on {@link org.vectomatic.dom.svg.itf.ISVGRenderingIntent} that
   * corresponds to the value of the <code>rendering-intent</code> attribute.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setRenderingIntent(short value) /*-{
    this.renderingIntent = value;
  }-*/;

  // Implementation of the svg::SVGRenderingIntent W3C IDL interface

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
  }-*/;

}
