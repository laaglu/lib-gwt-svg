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

public class OMSVGPathSeg extends JavaScriptObject {
  public static final short PATHSEG_UNKNOWN = 0;
  public static final short PATHSEG_CLOSEPATH = 1;
  public static final short PATHSEG_MOVETO_ABS = 2;
  public static final short PATHSEG_MOVETO_REL = 3;
  public static final short PATHSEG_LINETO_ABS = 4;
  public static final short PATHSEG_LINETO_REL = 5;
  public static final short PATHSEG_CURVETO_CUBIC_ABS = 6;
  public static final short PATHSEG_CURVETO_CUBIC_REL = 7;
  public static final short PATHSEG_CURVETO_QUADRATIC_ABS = 8;
  public static final short PATHSEG_CURVETO_QUADRATIC_REL = 9;
  public static final short PATHSEG_ARC_ABS = 10;
  public static final short PATHSEG_ARC_REL = 11;
  public static final short PATHSEG_LINETO_HORIZONTAL_ABS = 12;
  public static final short PATHSEG_LINETO_HORIZONTAL_REL = 13;
  public static final short PATHSEG_LINETO_VERTICAL_ABS = 14;
  public static final short PATHSEG_LINETO_VERTICAL_REL = 15;
  public static final short PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = 16;
  public static final short PATHSEG_CURVETO_CUBIC_SMOOTH_REL = 17;
  public static final short PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = 18;
  public static final short PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = 19;
  protected OMSVGPathSeg() {
  }

  // Implementation of the svg::SVGPathSeg W3C IDL interface
  public final native short getPathSegType() /*-{
    return this.pathSegType;
  }-*/;
  public final native String getPathSegTypeAsLetter() /*-{
    return this.pathSegTypeAsLetter;
  }-*/;

}
