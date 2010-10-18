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
 * <p>Many of SVG's graphics operations utilize 2x3 matrices of the form:</p>
 * <pre>
 * [a c e]
 * [b d f]</pre> <p>which, when expanded into a 3x3 matrix for the purposes
 * of matrix arithmetic, become:</p> <pre>
 * [a c e]
 * [b d f]
 * [0 0 1]</pre>
 */
public class OMSVGMatrix extends JavaScriptObject {
  protected OMSVGMatrix() {
  }

  // Implementation of the svg::SVGMatrix W3C IDL interface
  /**
   * The <var>a</var> component of the matrix.
   */
  public final native float getA() /*-{
    return this.a;
  }-*/;
  /**
   * The <var>a</var> component of the matrix.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setA(float value) throws JavaScriptException /*-{
    this.a = value;
  }-*/;
  /**
   * The <var>b</var> component of the matrix.
   */
  public final native float getB() /*-{
    return this.b;
  }-*/;
  /**
   * The <var>b</var> component of the matrix.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setB(float value) throws JavaScriptException /*-{
    this.b = value;
  }-*/;
  /**
   * The <var>c</var> component of the matrix.
   */
  public final native float getC() /*-{
    return this.c;
  }-*/;
  /**
   * The <var>c</var> component of the matrix.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setC(float value) throws JavaScriptException /*-{
    this.c = value;
  }-*/;
  /**
   * The <var>d</var> component of the matrix.
   */
  public final native float getD() /*-{
    return this.d;
  }-*/;
  /**
   * The <var>d</var> component of the matrix.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setD(float value) throws JavaScriptException /*-{
    this.d = value;
  }-*/;
  /**
   * The <var>e</var> component of the matrix.
   */
  public final native float getE() /*-{
    return this.e;
  }-*/;
  /**
   * The <var>e</var> component of the matrix.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setE(float value) throws JavaScriptException /*-{
    this.e = value;
  }-*/;
  /**
   * The <var>f</var> component of the matrix.
   */
  public final native float getF() /*-{
    return this.f;
  }-*/;
  /**
   * The <var>f</var> component of the matrix.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setF(float value) throws JavaScriptException /*-{
    this.f = value;
  }-*/;
  /**
   * Performs matrix multiplication. This matrix is post-multiplied by another
   * matrix, returning the resulting new matrix.
   * @param secondMatrix The matrix which is post-multiplied to this matrix.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix multiply(OMSVGMatrix secondMatrix) /*-{
    return this.multiply(secondMatrix);
  }-*/;
  /**
   * Returns the inverse matrix.
   * @return The inverse matrix.
   * @throws SVGException(SVG_MATRIX_NOT_INVERTABLE) Raised if this matrix is
   * not invertable.
   */
  public final native OMSVGMatrix inverse() throws JavaScriptException /*-{
    return this.inverse();
  }-*/;
  /**
   * Post-multiplies a translation transformation on the current matrix and
   * returns the resulting matrix.
   * @param x The distance to translate along the x-axis.
   * @param y The distance to translate along the y-axis.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix translate(float x, float y) /*-{
    return this.translate(x, y);
  }-*/;
  /**
   * Post-multiplies a uniform scale transformation on the current matrix and
   * returns the resulting matrix.
   * @param scaleFactor Scale factor in both X and Y.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix scale(float scaleFactor) /*-{
    return this.scale(scaleFactor);
  }-*/;
  /**
   * Post-multiplies a non-uniform scale transformation on the current matrix
   * and returns the resulting matrix.
   * @param scaleFactorX Scale factor in X.
   * @param scaleFactorY Scale factor in Y.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY) /*-{
    return this.scaleNonUniform(scaleFactorX, scaleFactorY);
  }-*/;
  /**
   * Post-multiplies a rotation transformation on the current matrix and returns
   * the resulting matrix.
   * @param angle Rotation angle.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix rotate(float angle) /*-{
    return this.rotate(angle);
  }-*/;
  /**
   * Post-multiplies a rotation transformation on the current matrix and returns
   * the resulting matrix. The rotation angle is determined by taking (+/-)
   * atan(y/x). The direction of the vector (x, y) determines whether the positive
   * or negative angle value is used.
   * @param x The X coordinate of the vector (x,y). Must not be zero.
   * @param y The Y coordinate of the vector (x,y). Must not be zero.
   * @return The resulting matrix.
   * @throws SVGException(SVG_INVALID_VALUE_ERR) Raised if one of the   parameters
   * has an invalid value.
   */
  public final native OMSVGMatrix rotateFromVector(float x, float y) throws JavaScriptException /*-{
    return this.rotateFromVector(x, y);
  }-*/;
  /**
   * Post-multiplies the transformation [-1 0 0 1 0 0] and returns the resulting
   * matrix.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix flipX() /*-{
    return this.flipX();
  }-*/;
  /**
   * Post-multiplies the transformation [1 0 0 -1 0 0] and returns the resulting
   * matrix.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix flipY() /*-{
    return this.flipY();
  }-*/;
  /**
   * Post-multiplies a skewX transformation on the current matrix and returns
   * the resulting matrix.
   * @param angle Skew angle.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix skewX(float angle) /*-{
    return this.skewX(angle);
  }-*/;
  /**
   * Post-multiplies a skewY transformation on the current matrix and returns
   * the resulting matrix.
   * @param angle Skew angle.
   * @return The resulting matrix.
   */
  public final native OMSVGMatrix skewY(float angle) /*-{
    return this.skewY(angle);
  }-*/;

  // Helper methods
  /**
   * Returns a textual description of the matrix for debugging purposes.
   * @return a textual description of the matrix.
   */
  public final String getDescription() {
	  StringBuilder builder = new StringBuilder("[");
	  builder.append(getA());
	  builder.append(" ");
	  builder.append(getB());
	  builder.append(" ");
	  builder.append(getC());
	  builder.append(" ");
	  builder.append(getD());
	  builder.append(" ");
	  builder.append(getE());
	  builder.append(" ");
	  builder.append(getF());
	  builder.append("]");
	  return builder.toString();
  }
}
