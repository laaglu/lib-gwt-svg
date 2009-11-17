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
public class OMSVGPathSegArcAbs extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGPathSegArcAbs() {
  }

  // Implementation of the nsIDOMSVGPathSegArcAbs XPCOM interface
  public final native float getX() /*-{
    return this.x;
  }-*/;
  public final native void setX(float value) /*-{
    this.x = value;
  }-*/;
  public final native float getY() /*-{
    return this.y;
  }-*/;
  public final native void setY(float value) /*-{
    this.y = value;
  }-*/;
  public final native float getR1() /*-{
    return this.r1;
  }-*/;
  public final native void setR1(float value) /*-{
    this.r1 = value;
  }-*/;
  public final native float getR2() /*-{
    return this.r2;
  }-*/;
  public final native void setR2(float value) /*-{
    this.r2 = value;
  }-*/;
  public final native float getAngle() /*-{
    return this.angle;
  }-*/;
  public final native void setAngle(float value) /*-{
    this.angle = value;
  }-*/;
  public final native boolean getLargeArcFlag() /*-{
    return this.largeArcFlag;
  }-*/;
  public final native void setLargeArcFlag(boolean value) /*-{
    this.largeArcFlag = value;
  }-*/;
  public final native boolean getSweepFlag() /*-{
    return this.sweepFlag;
  }-*/;
  public final native void setSweepFlag(boolean value) /*-{
    this.sweepFlag = value;
  }-*/;

  // Implementation of the nsIDOMSVGPathSeg XPCOM interface
  public final native short getPathSegType() /*-{
    return this.pathSegType;
  }-*/;
  public final native java.lang.String getPathSegTypeAsLetter() /*-{
    return this.pathSegTypeAsLetter;
  }-*/;

}
