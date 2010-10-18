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
 * <p>Many of the SVG DOM interfaces refer to objects of class {@link org.vectomatic.dom.svg.OMSVGPoint}.
 * An {@link org.vectomatic.dom.svg.OMSVGPoint} is an (x, y) coordinate pair.
 * When used in matrix operations, an {@link org.vectomatic.dom.svg.OMSVGPoint}
 * is treated as a vector of the form:</p> <pre>
 * [x]
 * [y]
 * [1]</pre> <p>If an {@link org.vectomatic.dom.svg.OMSVGRect} object is designated
 * as <em>read only</em>, then attempting to assign to one of its attributes
 * will result in an exception being thrown.</p>
 */
public class OMSVGPoint extends JavaScriptObject {
  protected OMSVGPoint() {
  }

  // Implementation of the svg::SVGPoint W3C IDL interface
  /**
   * The x coordinate.
   */
  public final native float getX() /*-{
    return this.x;
  }-*/;
  /**
   * The x coordinate.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised if the   {@link
   * org.vectomatic.dom.svg.OMSVGPoint} object is read only, or corresponds
   * to a DOM   attribute that is read only.
   */
  public final native void setX(float value) throws JavaScriptException /*-{
    this.x = value;
  }-*/;
  /**
   * The y coordinate.
   */
  public final native float getY() /*-{
    return this.y;
  }-*/;
  /**
   * The y coordinate.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised if the   {@link
   * org.vectomatic.dom.svg.OMSVGPoint} object is read only, or corresponds
   * to a DOM   attribute that is read only.
   */
  public final native void setY(float value) throws JavaScriptException /*-{
    this.y = value;
  }-*/;
  /**
   * <p>Applies a 2x3 matrix transformation on this {@link org.vectomatic.dom.svg.OMSVGPoint}
   * object and returns a new, transformed {@link org.vectomatic.dom.svg.OMSVGPoint}
   * object:</p> <pre>newpoint = matrix thispoint</pre>
   * @param matrix The matrix which is to be applied to this {@link org.vectomatic.dom.svg.OMSVGPoint}
   * object.
   * @return A new {@link org.vectomatic.dom.svg.OMSVGPoint} object.
   */
  public final native OMSVGPoint matrixTransform(OMSVGMatrix matrix) /*-{
    return this.matrixTransform(matrix);
  }-*/;

  // Helper methods
  /**
   * Returns a textual description of the point for debugging purposes.
   * @return a textual description of the point.
   */
  public final String getDescription() {
	  StringBuilder builder = new StringBuilder("[");
	  builder.append(getX());
	  builder.append(" ");
	  builder.append(getY());
	  builder.append("]");
	  return builder.toString();
  }

  /**
   * Adds the specified point to this point. The points
   * are treated by this method as 2D vectors.
   * @param p the point to add. 
   * @return this point.
   */
  public final OMSVGPoint add(OMSVGPoint p) {
	return add(p, this);
  }
  /**
   * Adds the specified point to this point and puts the
   * result is the specified destination point. The points
   * are treated by this method as 2D vectors.
   * @param p the point to add. 
   * @param destination the destination point.
   * @return the destination point.
   */
  public final native OMSVGPoint add(OMSVGPoint p, OMSVGPoint destination) /*-{
    destination.x = this.x + p.x;
    destination.y = this.y + p.y;
	return destination;
  }-*/;
  /**
   * Substracts the specified point from this point. The points
   * are treated by this method as 2D vectors.
   * @param p the point to substract. 
   * @return this point.
   */
  public final OMSVGPoint substract(OMSVGPoint p) {
	return substract(p, this);
  }
  /**
   * Substracts the specified point to this point and puts the
   * result is the specified destination point. The points
   * are treated by this method as 2D vectors.
   * @param p the point to substract. 
   * @param destination the destination point.
   * @return the destination point.
   */
  public final native OMSVGPoint substract(OMSVGPoint p, OMSVGPoint destination) /*-{
    destination.x = this.x - p.x;
    destination.y = this.y - p.y;
	return destination;
  }-*/;
  /**
   * Scales this point by the specified factor. The point
   * is treated by this method as a 2D vector.
   * @param f scale factor. 
   * @return this point.
   */
  public final OMSVGPoint scale(float f) {
	return scale(f, this);
  }
  /**
   * Scales this point by the specified factor and puts the
   * result is the specified destination point. The points
   * are treated by this method as 2D vectors.
   * @param f scale factor. 
   * @param destination the destination point.
   * @return the destination point.
   */
  public final native OMSVGPoint scale(float f, OMSVGPoint destination) /*-{
    destination.x = this.x * f;
    destination.y = this.y * f;
	return destination;
  }-*/;
  /**
   * Copies this point to the specified destination point.
   * @param destination the destination point.
   * @return the destination point.
   */
  public final native OMSVGPoint assignTo(OMSVGPoint destination) /*-{
    destination.x = this.x;
    destination.y = this.y;
	return destination;
  }-*/;
  
  /**
   * Multiplies this point by the specified point. The points
   * are treated by this method as 2D vectors.
   * @param p the point to multiply by. 
   * @return this point.
   */
  public final OMSVGPoint product(OMSVGPoint p) {
	return product(p, this);
  }
  /**
   * Multiplies this point by the specified point and puts the
   * result is the specified destination point. The points
   * are treated by this method as 2D vectors.
   * @param p the point to multiply by. 
   * @param destination the destination point.
   * @return the destination point.
   */
  public final native OMSVGPoint product(OMSVGPoint p, OMSVGPoint destination) /*-{
    destination.x = this.x * p.x;
    destination.y = this.y * p.y;
	return destination;
  }-*/;
  /**
   * Returns the dot product of this point and the specified point. The points
   * are treated by this method as 2D vectors.
   * @param p the second factor of the dot product.
   * @return the dot product of this point and the specified point
   */
  public final native float dotProduct(OMSVGPoint p) /*-{
    return this.x * p.x + this.y * p.y;
  }-*/;
  /**
   * Returns the cross product of this point and the specified point. The points
   * are treated by this method as 2D vectors.
   * @param p the second factor of the cross product.
   * @return the cross product of this point and the specified point
   */
  public final native float crossProduct(OMSVGPoint p) /*-{
    return this.x * p.y - this.y * p.x;
  }-*/;
  /**
   * Applies the <code>Math.round()</code> to the coordinated of this point.
   * @return this point.
   */
  public final OMSVGPoint round() {
	return round(this);
  }
  /**
   * Applies the <code>Math.round()</code> to the coordinated of this 
   * point and puts the result is the specified destination point.
   * @param destination the destination point.
   * @return the destination point.
   */
  public final OMSVGPoint round(OMSVGPoint destination) {
    destination.setX(Math.round(getX()));
    destination.setY(Math.round(getY()));
	return destination;
  }
  /**
   * Applies the <code>Math.floor()</code> to the coordinated of this point.
   * @return this point.
   */
  public final OMSVGPoint floor() {
	return floor(this);
  }
  /**
   * Applies the <code>Math.floor()</code> to the coordinated of this 
   * point and puts the result is the specified destination point.
   * @param destination the destination point.
   * @return the destination point.
   */
  public final OMSVGPoint floor(OMSVGPoint destination) {
    destination.setX((float) Math.floor(getX()));
    destination.setY((float) Math.floor(getY()));
	return destination;
  }
  /**
   * Returns the length of this point, treating the point as a 2D vector.
   * @return the length of this point
   */
  public final native float length() /*-{
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }-*/;
  /**
   * Returns the squared length of this point, treating the point as a 2D vector.
   * @return the squared length of this point
   */
  public final native float length2() /*-{
    return this.x * this.x + this.y * this.y;
  }-*/;
  /**
   * Returns the euclidian distance from this point to specified point.
   * @param p the point used to measure the distance
   * @return the euclidian distance from this point to specified point
   */
  public final native float distance(OMSVGPoint p) /*-{
    return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
  }-*/;
  /**
   * Returns the squared euclidian distance from this point to specified point.
   * @param p the point used to measure the distance
   * @return the squared euclidian distance from this point to specified point
   */
  public final native float distance2(OMSVGPoint p) /*-{
    return (this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y);
  }-*/;
}
