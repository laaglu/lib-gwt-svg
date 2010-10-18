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

import com.google.gwt.core.client.JavaScriptException;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothAbs} interface
 * corresponds to an "absolute smooth cubic curveto" (S) path data command.
 */
public class OMSVGPathSegCurvetoCubicSmoothAbs extends OMSVGPathSeg {
  protected OMSVGPathSegCurvetoCubicSmoothAbs() {
  }

  // Implementation of the svg::SVGPathSegCurvetoCubicSmoothAbs W3C IDL interface
  /**
   * The absolute X coordinate for the end point of this path segment.
   */
  public final native float getX() /*-{
    return this.x;
  }-*/;
  /**
   * The absolute X coordinate for the end point of this path segment.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setX(float value) throws JavaScriptException /*-{
    this.x = value;
  }-*/;
  /**
   * The absolute Y coordinate for the end point of this path segment.
   */
  public final native float getY() /*-{
    return this.y;
  }-*/;
  /**
   * The absolute Y coordinate for the end point of this path segment.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setY(float value) throws JavaScriptException /*-{
    this.y = value;
  }-*/;
  /**
   * The absolute X coordinate for the second control point.
   */
  public final native float getX2() /*-{
    return this.x2;
  }-*/;
  /**
   * The absolute X coordinate for the second control point.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setX2(float value) throws JavaScriptException /*-{
    this.x2 = value;
  }-*/;
  /**
   * The absolute Y coordinate for the second control point.
   */
  public final native float getY2() /*-{
    return this.y2;
  }-*/;
  /**
   * The absolute Y coordinate for the second control point.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setY2(float value) throws JavaScriptException /*-{
    this.y2 = value;
  }-*/;

}
