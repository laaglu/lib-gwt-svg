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

public class OMSVGPoint extends JavaScriptObject {
  protected OMSVGPoint() {
  }

  // Implementation of the svg::SVGPoint W3C IDL interface
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
  public final native OMSVGPoint matrixTransform(OMSVGMatrix matrix) /*-{
    return this.matrixTransform(matrix);
  }-*/;
  public final String getDescription() {
	  StringBuilder builder = new StringBuilder("[");
	  builder.append(getX());
	  builder.append(" ");
	  builder.append(getY());
	  builder.append("]");
	  return builder.toString();
  }

}
