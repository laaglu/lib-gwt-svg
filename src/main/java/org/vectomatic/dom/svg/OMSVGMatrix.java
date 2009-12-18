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
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGMatrix extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGMatrix() {
  }

  // Implementation of the nsIDOMSVGMatrix XPCOM interface
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
  public final native org.vectomatic.dom.svg.OMSVGMatrix multiply(org.vectomatic.dom.svg.OMSVGMatrix secondMatrix) /*-{
    return this.multiply(secondMatrix);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix inverse() /*-{
    return this.inverse();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix translate(float x, float y) /*-{
    return this.translate(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix scale(float scaleFactor) /*-{
    return this.scale(scaleFactor);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix scaleNonUniform(float scaleFactorX, float scaleFactorY) /*-{
    return this.scaleNonUniform(scaleFactorX, scaleFactorY);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix rotate(float angle) /*-{
    return this.rotate(angle);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix rotateFromVector(float x, float y) /*-{
    return this.rotateFromVector(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix flipX() /*-{
    return this.flipX();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix flipY() /*-{
    return this.flipY();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix skewX(float angle) /*-{
    return this.skewX(angle);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix skewY(float angle) /*-{
    return this.skewY(angle);
  }-*/;

}
