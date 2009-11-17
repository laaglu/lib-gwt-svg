/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see <http://www.gnu.org/licenses/>
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGTransform extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGTransform() {
  }

  // Implementation of the nsIDOMSVGTransform XPCOM interface
  public final native short getType() /*-{
    return this.type;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getMatrix() /*-{
    return this.matrix;
  }-*/;
  public final native float getAngle() /*-{
    return this.angle;
  }-*/;
  public final native void setMatrix(org.vectomatic.dom.svg.OMSVGMatrix matrix) /*-{
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
