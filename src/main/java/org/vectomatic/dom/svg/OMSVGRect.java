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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Represents rectangular geometry.  Rectangles are defined as consisting
 * of a (x,y) coordinate pair identifying a minimum X value, a minimum Y value,
 * and a width and height, which are usually constrained to be non-negative.</p>
 * <p id="ReadOnlyRect">An {@link org.vectomatic.dom.svg.OMSVGRect} object
 * can be designated as <em>read only</em>, which means that attempts to modify
 * the object will result in an exception being thrown, as described below.</p>
 */
public class OMSVGRect extends JavaScriptObject {
  protected OMSVGRect() {
  }

  // Implementation of the svg::SVGRect W3C IDL interface
  /**
   * The <var>x</var> coordinate of the rectangle, in user units.
   */
  public final native float getX() /*-{
    return this.x;
  }-*/;
  /**
   * The <var>x</var> coordinate of the rectangle, in user units.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the rectangle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyRect">read only</a>.
   */
  public final native void setX(float value) throws JavaScriptException /*-{
    this.x = value;
  }-*/;
  /**
   * The <var>y</var> coordinate of the rectangle, in user units.
   */
  public final native float getY() /*-{
    return this.y;
  }-*/;
  /**
   * The <var>y</var> coordinate of the rectangle, in user units.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the rectangle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyRect">read only</a>.
   */
  public final native void setY(float value) throws JavaScriptException /*-{
    this.y = value;
  }-*/;
  /**
   * The <var>width</var> coordinate of the rectangle, in user units.
   */
  public final native float getWidth() /*-{
    return this.width;
  }-*/;
  /**
   * The <var>width</var> coordinate of the rectangle, in user units.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the rectangle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyRect">read only</a>.
   */
  public final native void setWidth(float value) throws JavaScriptException /*-{
    this.width = value;
  }-*/;
  /**
   * The <var>height</var> coordinate of the rectangle, in user units.
   */
  public final native float getHeight() /*-{
    return this.height;
  }-*/;
  /**
   * The <var>height</var> coordinate of the rectangle, in user units.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the rectangle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyRect">read only</a>.
   */
  public final native void setHeight(float value) throws JavaScriptException /*-{
    this.height = value;
  }-*/;

  // Helper methods
  /**
   * Returns the X coordinate of the center of this rectangle.
   * @return the X coordinate of the center of this rectangle.
   */
  public final float getCenterX() {
	return getX() + 0.5f * getWidth();
  }
  /**
   * Returns the Y coordinate of the center of this rectangle.
   * @return the Y coordinate of the center of this rectangle.
   */
  public final float getCenterY() {
	return getY() + 0.5f * getHeight();
  }
  /**
   * Returns the X coordinate of the right corners of this rectangle.
   * @return the X coordinate of the right corners of this rectangle.
   */
  public final float getMaxX() {
	return getX() + getWidth();
  }
  /**
   * Returns the X coordinate of the bottom corners of this rectangle.
   * @return the X coordinate of the bottom corners of this rectangle.
   */
  public final float getMaxY() {
	return getY() + getHeight();
  }
  /**
   * Computes the intersection of this rectangle with the
   * specified rectangle and puts the result in this rectangle.
   * The method returns null if the two rectangles have no intersection.
   * @param r the rectangle to intersect
   * @return the rectangle resulting from the intersection of
   * this rectangle with the specified rectangle or 
   * null if the two rectangles have no intersection.
   */
  public final OMSVGRect intersection(OMSVGRect r) {
	  return intersection(r, this);
  }
  /**
   * Computes the intersection of this rectangle with the
   * specified rectangle and puts the result in the destination rectangle.
   * The method returns null if the two rectangles have no intersection.
   * @param r the rectangle to intersect
   * @param destination a rectangle to store the intersection
   * @return the rectangle resulting from the intersection of
   * this rectangle with the specified rectangle or 
   * null if the two rectangles have no intersection.
   */
  public final OMSVGRect intersection(OMSVGRect r, OMSVGRect destination) {
	if (r.getX() <= getX() && r.getX() <= getMaxX()) {
		if (r.getY() <= getY() && r.getY() <= getMaxY()) {
			destination.setWidth(getMaxX() - r.getX());
			destination.setX(r.getX());
			destination.setHeight(getMaxY() - r.getY());
			destination.setY(r.getY());
			return destination;
		} else if (getY() <= r.getY() && getY() <= r.getMaxY()) {
			destination.setWidth(getMaxX() - r.getX());
			destination.setX(r.getX());
			destination.setHeight(r.getMaxY() - getY());
			destination.setY(getY());
			return destination;
		}
	} else if (getX() <= r.getX() && getX() <= r.getMaxX()) {
		if (r.getY() <= getY() && r.getY() <= getMaxY()) {
			destination.setWidth(r.getMaxX() - getX());
			destination.setX(getX());
			destination.setHeight(getMaxY() - r.getY());
			destination.setY(r.getY());
			return destination;
		} else if (getY() <= r.getY() && getY() <= r.getMaxY()) {
			destination.setWidth(r.getMaxX() - getX());
			destination.setX(getX());
			destination.setHeight(r.getMaxY() - getY());
			destination.setY(getY());
			return destination;
		}
	}
	return null;
  }
  /**
   * Computes the union of this rectangle with the
   * specified rectangle and puts the result in this rectangle.
   * @param r the rectangle with which to compute the union
   * @return the rectangle resulting from the union of
   * this rectangle with the specified rectangle.
   */
  public final OMSVGRect union(OMSVGRect r) {
	  return union(r, this);
  }
  /**
   * Computes the union of this rectangle with the
   * specified rectangle and puts the result in the destination rectangle.
   * @param r the rectangle with which to compute the union
   * @param destination a rectangle to store the union
   * @return the rectangle resulting from the union of
   * this rectangle with the specified rectangle.
   */
  public final OMSVGRect union(OMSVGRect r, OMSVGRect destination) {
	  destination.setX(Math.min(getX(), r.getX()));
	  destination.setY(Math.min(getY(), r.getY()));
	  destination.setWidth(Math.max(getMaxX(), r.getMaxX()) - destination.getX());
	  destination.setHeight(Math.max(getMaxY(), r.getMaxY()) - destination.getY());
	  return destination;
  }
  /**
   * Returns true if the specified point is inside this rectangle,
   * false otherwise.
   * @param p The point to test
   * @return true if the specified point is inside this rectangle,
   * false otherwise.
   */
  public final boolean contains(OMSVGPoint p) {
	  return p.getX() >= getX() && p.getY() >= getY() && p.getX() <= getMaxX() && p.getY() <= getMaxY();
  }
  /**
   * Copies this rectangle to the specified destination rectangle.
   * @param destination the destination rectangle.
   * @return the destination rectangle.
   */
  public final native OMSVGRect assignTo(OMSVGRect destination) /*-{
	  destination.x = this.x;
	  destination.y = this.y;
	  destination.width = this.width;
	  destination.height = this.height;
	  return destination;
  }-*/;
  /**
   * Returns a textual description of the rectangle for debugging purposes.
   * @return a textual description of the rectangle.
   */
  public final String getDescription() {
	  StringBuilder builder = new StringBuilder("{");
	  builder.append(getX());
	  builder.append(" ");
	  builder.append(getY());
	  builder.append(" ");
	  builder.append(getWidth());
	  builder.append(" ");
	  builder.append(getHeight());
	  builder.append("}");
	  return builder.toString();
  } 
  /**
   * Modifies the position and size of this rectangle by adding
   * the specified margin to it.
   * @param x the horizontal margin
   * @param y the vertical margin
   * @return this rectangle
   */
  public OMSVGRect inset(float x, float y) {
	  return inset(this, x, y);
  }
  /**
   * Modifies the position and size of this rectangle by adding
   * the specified margin to it and puts the result in the destination 
   * rectangle.
   * @param destination the destination rectangle.
   * @param x the horizontal margin
   * @param y the vertical margin
   * @return the destination rectangle.
   */
  public OMSVGRect inset(OMSVGRect dest, float x, float y) {
	  dest.setX(getX() + x);
	  dest.setY(getY() + y);
	  dest.setWidth(getWidth() - x * 2);
	  dest.setHeight(getHeight() - y * 2);
	  return dest;
  }
}
