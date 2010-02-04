/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of libgwtsvg.
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

public class OMSVGMatrix extends JavaScriptObject {
  protected OMSVGMatrix() {
  }

  // Implementation of the svg::SVGMatrix W3C IDL interface
  public final native float getA() /*-{
    return this.a;
  }-*/;
  public final native void setA(float value) /*-{
    this.a = value;
  }-*/;
  public final native float getB() /*-{
    return this.b;
  }-*/;
  public final native void setB(float value) /*-{
    this.b = value;
  }-*/;
  public final native float getC() /*-{
    return this.c;
  }-*/;
  public final native void setC(float value) /*-{
    this.c = value;
  }-*/;
  public final native float getD() /*-{
    return this.d;
  }-*/;
  public final native void setD(float value) /*-{
    this.d = value;
  }-*/;
  public final native float getE() /*-{
    return this.e;
  }-*/;
  public final native void setE(float value) /*-{
    this.e = value;
  }-*/;
  public final native float getF() /*-{
    return this.f;
  }-*/;
  public final native void setF(float value) /*-{
    this.f = value;
  }-*/;
  public final native OMSVGMatrix multiply(OMSVGMatrix secondMatrix) /*-{
    return this.multiply(secondMatrix);
  }-*/;
  public final native OMSVGMatrix inverse() /*-{
    return this.inverse();
  }-*/;
  public final native OMSVGMatrix translate(float x, float y) /*-{
    return this.translate(x, y);
  }-*/;
  public final native OMSVGMatrix scale(float scaleFactor) /*-{
    return this.scale(scaleFactor);
  }-*/;
  public final native OMSVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY) /*-{
    return this.scaleNonUniform(scaleFactorX, scaleFactorY);
  }-*/;
  public final native OMSVGMatrix rotate(float angle) /*-{
    return this.rotate(angle);
  }-*/;
  public final native OMSVGMatrix rotateFromVector(float x, float y) /*-{
    return this.rotateFromVector(x, y);
  }-*/;
  public final native OMSVGMatrix flipX() /*-{
    return this.flipX();
  }-*/;
  public final native OMSVGMatrix flipY() /*-{
    return this.flipY();
  }-*/;
  public final native OMSVGMatrix skewX(float angle) /*-{
    return this.skewX(angle);
  }-*/;
  public final native OMSVGMatrix skewY(float angle) /*-{
    return this.skewY(angle);
  }-*/;
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
