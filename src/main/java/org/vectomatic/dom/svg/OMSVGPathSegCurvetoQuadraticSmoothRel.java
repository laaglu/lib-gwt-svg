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
public class OMSVGPathSegCurvetoQuadraticSmoothRel extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGPathSegCurvetoQuadraticSmoothRel() {
  }

  // Implementation of the nsIDOMSVGPathSegCurvetoQuadraticSmoothRel XPCOM interface
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

  // Implementation of the nsIDOMSVGPathSeg XPCOM interface
  public final native short getPathSegType() /*-{
    return this.pathSegType;
  }-*/;
  public final native java.lang.String getPathSegTypeAsLetter() /*-{
    return this.pathSegTypeAsLetter;
  }-*/;

}
