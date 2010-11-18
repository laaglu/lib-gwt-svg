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

import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * {@link org.vectomatic.dom.svg.OMSVGTransform} is the interface for one
 * of the component transformations within an {@link org.vectomatic.dom.svg.OMSVGTransformList};
 * thus, an {@link org.vectomatic.dom.svg.OMSVGTransform} object corresponds
 * to a single component (e.g., <span class='attr-value'>'scale(…)'</span>
 * or <span class='attr-value'>'matrix(…)'</span>) within a <code>transform</code>
 * attribute specification.
 */
public class OMSVGTransform extends JavaScriptObject {
/**
 * The unit type is not one of predefined types. It is invalid to attempt
 * to define a new value of this type or to attempt to switch an existing
 * value to this type.
 */
  public static final short SVG_TRANSFORM_UNKNOWN = 0;
/**
 * A <span class='attr-value'>'matrix(…)'</span> transformation.
 */
  public static final short SVG_TRANSFORM_MATRIX = 1;
/**
 * A <span class='attr-value'>'translate(…)'</span> transformation.
 */
  public static final short SVG_TRANSFORM_TRANSLATE = 2;
/**
 * A <span class='attr-value'>'scale(…)'</span> transformation.
 */
  public static final short SVG_TRANSFORM_SCALE = 3;
/**
 * A <span class='attr-value'>'rotate(…)'</span> transformation.
 */
  public static final short SVG_TRANSFORM_ROTATE = 4;
/**
 * A <span class='attr-value'>'skewX(…)'</span> transformation.
 */
  public static final short SVG_TRANSFORM_SKEWX = 5;
/**
 * A <span class='attr-value'>'skewY(…)'</span> transformation.
 */
  public static final short SVG_TRANSFORM_SKEWY = 6;
  protected OMSVGTransform() {
  }

  // Implementation of the svg::SVGTransform W3C IDL interface
  /**
   * The type of the value as specified by one of the SVG_TRANSFORM_ constants
   * defined on this interface.
   */
  public final native short getType() /*-{
    return this.type;
  }-*/;
  /**
   * <p>The matrix that represents this transformation.  The matrix object is
   * live, meaning that any changes made to the SVGTransform object are immediately
   * reflected in the matrix object and vice versa.  In case the matrix object
   * is changed directly (i.e., without using the methods on the SVGTransform
   * interface itself) then the type of the SVGTransform changes to SVG_TRANSFORM_MATRIX.
   * </p> <ul>   <li>For SVG_TRANSFORM_MATRIX, the matrix contains the   {@link
   * org.vectomatic.dom.svg.OMSVGMatrix#getA()}, {@link org.vectomatic.dom.svg.OMSVGMatrix#getB()},
   * {@link org.vectomatic.dom.svg.OMSVGMatrix#getC()}, {@link org.vectomatic.dom.svg.OMSVGMatrix#getD()},
   * {@link org.vectomatic.dom.svg.OMSVGMatrix#getE()},   {@link org.vectomatic.dom.svg.OMSVGMatrix#getF()}
   * values supplied by the user.</li>   <li>For SVG_TRANSFORM_TRANSLATE, {@link
   * org.vectomatic.dom.svg.OMSVGMatrix#getE()} and {@link org.vectomatic.dom.svg.OMSVGMatrix#getF()}
   * represent the translation amounts ({@link org.vectomatic.dom.svg.OMSVGMatrix#getA()}=1,
   * {@link org.vectomatic.dom.svg.OMSVGMatrix#getB()}=0,   {@link org.vectomatic.dom.svg.OMSVGMatrix#getC()}=0
   * and {@link org.vectomatic.dom.svg.OMSVGMatrix#getD()}=1).</li>   <li>For
   * SVG_TRANSFORM_SCALE, {@link org.vectomatic.dom.svg.OMSVGMatrix#getA()}
   * and {@link org.vectomatic.dom.svg.OMSVGMatrix#getD()}   represent the translation
   * amounts ({@link org.vectomatic.dom.svg.OMSVGMatrix#getB()}=0, {@link org.vectomatic.dom.svg.OMSVGMatrix#getC()}=0,
   * {@link org.vectomatic.dom.svg.OMSVGMatrix#getE()}=0 and {@link org.vectomatic.dom.svg.OMSVGMatrix#getF()}=0).</li>
   * <li>For SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX and   SVG_TRANSFORM_SKEWY,
   * {@link org.vectomatic.dom.svg.OMSVGMatrix#getA()}, {@link org.vectomatic.dom.svg.OMSVGMatrix#getB()},
   * {@link org.vectomatic.dom.svg.OMSVGMatrix#getC()} and {@link org.vectomatic.dom.svg.OMSVGMatrix#getD()}
   * represent the matrix which will result in the given transformation   ({@link
   * org.vectomatic.dom.svg.OMSVGMatrix#getE()}=0 and {@link org.vectomatic.dom.svg.OMSVGMatrix#getF()}=0).</li>
   * </ul>
   */
  public final native OMSVGMatrix getMatrix() /*-{
    return this.matrix;
  }-*/;
  /**
   * <p>A convenience attribute for SVG_TRANSFORM_ROTATE, SVG_TRANSFORM_SKEWX
   * and SVG_TRANSFORM_SKEWY.  It holds the angle that was specified.</p> <p>For
   * SVG_TRANSFORM_MATRIX, SVG_TRANSFORM_TRANSLATE and SVG_TRANSFORM_SCALE,
   * {@link org.vectomatic.dom.svg.OMSVGTransform#getAngle()} will be zero.</p>
   */
  public final native float getAngle() /*-{
    return this.angle;
  }-*/;
  /**
   * <p xmlns:edit="http://xmlns.grorg.org/SVGT12NG/"> Sets the transform type
   * to SVG_TRANSFORM_MATRIX, with parameter <var>matrix</var> defining the
   * new transformation.  The values from the parameter <var>matrix</var> are
   * copied, the <var>matrix</var> parameter does not replace <a edit:format="expanded">SVGTransform::matrix</a>.
   * </p>
   * @param matrix The new matrix for the transformation.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setMatrix(OMSVGMatrix matrix) throws JavaScriptException /*-{
    this.setMatrix(matrix);
  }-*/;
  /**
   * Sets the transform type to SVG_TRANSFORM_TRANSLATE, with parameters <var>tx</var>
   * and <var>ty</var> defining the translation amounts.
   * @param tx The translation amount in X.
   * @param ty The translation amount in Y.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setTranslate(float tx, float ty) throws JavaScriptException /*-{
    this.setTranslate(tx, ty);
  }-*/;
  /**
   * Sets the transform type to SVG_TRANSFORM_SCALE, with parameters <var>sx</var>
   * and <var>sy</var> defining the scale amounts.
   * @param sx The scale amount in X.
   * @param sy The scale amount in Y.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setScale(float sx, float sy) throws JavaScriptException /*-{
    this.setScale(sx, sy);
  }-*/;
  /**
   * Sets the transform type to SVG_TRANSFORM_ROTATE, with parameter <var>angle</var>
   * defining the rotation angle and parameters <var>cx</var> and <var>cy</var>
   * defining the optional center of rotation.
   * @param angle The rotation angle.
   * @param cx The x coordinate of center of rotation.
   * @param cy The y coordinate of center of rotation.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setRotate(float angle, float cx, float cy) throws JavaScriptException /*-{
    this.setRotate(angle, cx, cy);
  }-*/;
  /**
   * Sets the transform type to SVG_TRANSFORM_SKEWX, with parameter <var>angle</var>
   * defining the amount of skew.
   * @param angle The skew angle.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setSkewX(float angle) throws JavaScriptException /*-{
    this.setSkewX(angle);
  }-*/;
  /**
   * Sets the transform type to SVG_TRANSFORM_SKEWY, with parameter <var>angle</var>
   * defining the amount of skew.
   * @param angle The skew angle.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setSkewY(float angle) throws JavaScriptException /*-{
    this.setSkewY(angle);
  }-*/;

  // Helper methods
  /**
   * Returns a textual description of the transform for debugging purposes.
   * @return a textual description of the transform.
   */
  public final String getDescription() {
	StringBuilder builder = new StringBuilder("{");
	switch(getType()) {
		case SVG_TRANSFORM_MATRIX:
			builder.append(SVGConstants.TRANSFORM_MATRIX + "(");
			builder.append(getMatrix().getDescription());
			builder.append(")");
			break;
		case SVG_TRANSFORM_TRANSLATE:
			builder.append(SVGConstants.TRANSFORM_TRANSLATE + "(");
			builder.append(getMatrix().getE());
			builder.append(",");
			builder.append(getMatrix().getF());
			builder.append(")");
			break;
		case SVG_TRANSFORM_SCALE:
			builder.append(SVGConstants.TRANSFORM_SCALE + "(");
			builder.append(getMatrix().getA());
			builder.append(",");
			builder.append(getMatrix().getD());
			builder.append(")");
			break;
		case SVG_TRANSFORM_ROTATE:
			builder.append(SVGConstants.TRANSFORM_ROTATE + "(");
			builder.append(getAngle());
			if (getMatrix().getE() != 0f || getMatrix().getF() != 0f) {
				if (getAngle() == 0f) {
					builder.append(",");
					builder.append(getMatrix().getE());
					builder.append(",");
					builder.append(getMatrix().getF());
				} else {
					float a = (float)(1 - Math.cos(getAngle() * 2  * Math.PI / 360));
					float b = (float)Math.sin(getAngle() * 2  * Math.PI / 360);
					float c = -b;
					float d = a;
					float det = a * d - b * c;
					float x = (getMatrix().getE() * d - b * getMatrix().getF()) / det;
					float y = (a * getMatrix().getF() - getMatrix().getE() * c) / det;
					builder.append(",");
					builder.append(x);
					builder.append(",");
					builder.append(y);
				}
			}
			builder.append(")");
			break;
		case SVG_TRANSFORM_SKEWX:
			builder.append(SVGConstants.TRANSFORM_SKEWX + "(");
			builder.append(getAngle());
			builder.append(")");
			break;
		case SVG_TRANSFORM_SKEWY:
			builder.append(SVGConstants.TRANSFORM_SKEWY + "(");
			builder.append(getAngle());
			builder.append(")");
			break;
		case SVG_TRANSFORM_UNKNOWN:
		default:
			builder.append(toString());
			break;
	}
	builder.append("}");
	return builder.toString();
  }
}
