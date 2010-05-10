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
package org.vectomatic.dom.svg;

import com.google.gwt.core.client.JavaScriptObject;

public class OMSVGTransform extends JavaScriptObject {
  public static final short SVG_TRANSFORM_UNKNOWN = 0;
  public static final short SVG_TRANSFORM_MATRIX = 1;
  public static final short SVG_TRANSFORM_TRANSLATE = 2;
  public static final short SVG_TRANSFORM_SCALE = 3;
  public static final short SVG_TRANSFORM_ROTATE = 4;
  public static final short SVG_TRANSFORM_SKEWX = 5;
  public static final short SVG_TRANSFORM_SKEWY = 6;
  protected OMSVGTransform() {
  }

  // Implementation of the svg::SVGTransform W3C IDL interface
  public final native short getType() /*-{
    return this.type;
  }-*/;
  public final native OMSVGMatrix getMatrix() /*-{
    return this.matrix;
  }-*/;
  public final native float getAngle() /*-{
    return this.angle;
  }-*/;
  public final native void setMatrix(OMSVGMatrix matrix) /*-{
    this.setMatrix(matrix);
  }-*/;
  public final native void setTranslate(float tx, float ty) /*-{
    this.setTranslate(tx, ty);
  }-*/;
  public final native void setScale(float sx, float sy) /*-{
    this.setScale(sx, sy);
  }-*/;
  public final native void setRotate(float angle, float cx, float cy) /*-{
    this.setRotate(angle, cx, cy);
  }-*/;
  public final native void setSkewX(float angle) /*-{
    this.setSkewX(angle);
  }-*/;
  public final native void setSkewY(float angle) /*-{
    this.setSkewY(angle);
  }-*/;
  public final String getDescription() {
	StringBuilder builder = new StringBuilder("{");
	switch(getType()) {
		case SVG_TRANSFORM_MATRIX:
			builder.append(getMatrix().getDescription());
			break;
		case SVG_TRANSFORM_TRANSLATE:
			builder.append("T(");
			builder.append(getMatrix().getE());
			builder.append(",");
			builder.append(getMatrix().getF());
			builder.append(")");
			break;
		case SVG_TRANSFORM_SCALE:
			builder.append("S(");
			builder.append(getMatrix().getA());
			builder.append(",");
			builder.append(getMatrix().getD());
			builder.append(")");
			break;
		case SVG_TRANSFORM_ROTATE:
			builder.append("R(");
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
			builder.append("Kx(");
			builder.append(getAngle());
			builder.append(")");
			break;
		case SVG_TRANSFORM_SKEWY:
			builder.append("Ky(");
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
