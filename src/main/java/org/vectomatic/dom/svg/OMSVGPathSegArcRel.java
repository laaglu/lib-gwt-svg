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
 * The {@link org.vectomatic.dom.svg.OMSVGPathSegArcRel} interface corresponds
 * to a "relative arcto" (a) path data command.
 */
public class OMSVGPathSegArcRel extends OMSVGPathSeg {
  protected OMSVGPathSegArcRel() {
  }

  // Implementation of the svg::SVGPathSegArcRel W3C IDL interface
  /**
   * The relative X coordinate for the end point of this path segment.
   */
  public final native float getX() /*-{
    return this.x;
  }-*/;
  /**
   * The relative X coordinate for the end point of this path segment.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setX(float value) throws JavaScriptException /*-{
    this.x = value;
  }-*/;
  /**
   * The relative Y coordinate for the end point of this path segment.
   */
  public final native float getY() /*-{
    return this.y;
  }-*/;
  /**
   * The relative Y coordinate for the end point of this path segment.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setY(float value) throws JavaScriptException /*-{
    this.y = value;
  }-*/;
  /**
   * The x-axis radius for the ellipse (i.e., r1).
   */
  public final native float getR1() /*-{
    return this.r1;
  }-*/;
  /**
   * The x-axis radius for the ellipse (i.e., r1).
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setR1(float value) throws JavaScriptException /*-{
    this.r1 = value;
  }-*/;
  /**
   * The y-axis radius for the ellipse (i.e., r2).
   */
  public final native float getR2() /*-{
    return this.r2;
  }-*/;
  /**
   * The y-axis radius for the ellipse (i.e., r2).
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setR2(float value) throws JavaScriptException /*-{
    this.r2 = value;
  }-*/;
  /**
   * The rotation angle in degrees for the ellipse's x-axis relative to the
   * x-axis of the user coordinate system.
   */
  public final native float getAngle() /*-{
    return this.angle;
  }-*/;
  /**
   * The rotation angle in degrees for the ellipse's x-axis relative to the
   * x-axis of the user coordinate system.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setAngle(float value) throws JavaScriptException /*-{
    this.angle = value;
  }-*/;
  /**
   * The value of the large-arc-flag parameter.
   */
  public final native boolean getLargeArcFlag() /*-{
    return this.largeArcFlag;
  }-*/;
  /**
   * The value of the large-arc-flag parameter.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setLargeArcFlag(boolean value) throws JavaScriptException /*-{
    this.largeArcFlag = value;
  }-*/;
  /**
   * The value of the sweep-flag parameter.
   */
  public final native boolean getSweepFlag() /*-{
    return this.sweepFlag;
  }-*/;
  /**
   * The value of the sweep-flag parameter.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setSweepFlag(boolean value) throws JavaScriptException /*-{
    this.sweepFlag = value;
  }-*/;

}
