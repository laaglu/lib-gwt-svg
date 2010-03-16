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

}
