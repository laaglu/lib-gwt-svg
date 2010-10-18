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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGPathSeg} interface is a base interface
 * that corresponds to a single command within a path data specification.
 */
public class OMSVGPathSeg extends JavaScriptObject {
/**
 * The unit type is not one of predefined types. It is invalid to attempt
 * to define a new value of this type or to attempt to switch an existingvalue
 * to this type.
 */
  public static final short PATHSEG_UNKNOWN = 0;
/**
 * Corresponds to a "closepath" (z) path data command.
 */
  public static final short PATHSEG_CLOSEPATH = 1;
/**
 * Corresponds to a "absolute moveto" (M) path data command.
 */
  public static final short PATHSEG_MOVETO_ABS = 2;
/**
 * Corresponds to a "relative moveto" (m) path data command.
 */
  public static final short PATHSEG_MOVETO_REL = 3;
/**
 * Corresponds to a "absolute lineto" (L) path data command.
 */
  public static final short PATHSEG_LINETO_ABS = 4;
/**
 * Corresponds to a "relative lineto" (l) path data command.
 */
  public static final short PATHSEG_LINETO_REL = 5;
/**
 * Corresponds to a "absolute cubic Bézier curveto" (C) path data command.
 */
  public static final short PATHSEG_CURVETO_CUBIC_ABS = 6;
/**
 * Corresponds to a "relative cubic Bézier curveto" (c) path data command.
 */
  public static final short PATHSEG_CURVETO_CUBIC_REL = 7;
/**
 * Corresponds to a "absolute quadratic Bézier curveto" (Q) path data command.
 */
  public static final short PATHSEG_CURVETO_QUADRATIC_ABS = 8;
/**
 * Corresponds to a "relative quadratic Bézier curveto" (q) path data command.
 */
  public static final short PATHSEG_CURVETO_QUADRATIC_REL = 9;
/**
 * Corresponds to a "absolute arcto" (A) path data command.
 */
  public static final short PATHSEG_ARC_ABS = 10;
/**
 * Corresponds to a "relative arcto" (a) path data command.
 */
  public static final short PATHSEG_ARC_REL = 11;
/**
 * Corresponds to a "absolute horizontal lineto" (H) path data command.
 */
  public static final short PATHSEG_LINETO_HORIZONTAL_ABS = 12;
/**
 * Corresponds to a "relative horizontal lineto" (h) path data command.
 */
  public static final short PATHSEG_LINETO_HORIZONTAL_REL = 13;
/**
 * Corresponds to a "absolute vertical lineto" (V) path data command.
 */
  public static final short PATHSEG_LINETO_VERTICAL_ABS = 14;
/**
 * Corresponds to a "relative vertical lineto" (v) path data command.
 */
  public static final short PATHSEG_LINETO_VERTICAL_REL = 15;
/**
 * Corresponds to a "absolute smooth cubic curveto" (S) path data command.
 */
  public static final short PATHSEG_CURVETO_CUBIC_SMOOTH_ABS = 16;
/**
 * Corresponds to a "relative smooth cubic curveto" (s) path data command.
 */
  public static final short PATHSEG_CURVETO_CUBIC_SMOOTH_REL = 17;
/**
 * Corresponds to a "absolute smooth quadratic curveto" (T) path data command.
 */
  public static final short PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS = 18;
/**
 * Corresponds to a "relative smooth quadratic curveto" (t) path data command.
 */
  public static final short PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL = 19;
  protected OMSVGPathSeg() {
  }

  // Implementation of the svg::SVGPathSeg W3C IDL interface
  /**
   * The type of the path segment as specified by one of the constants defined
   * on this interface.
   */
  public final native short getPathSegType() /*-{
    return this.pathSegType;
  }-*/;
  /**
   * The type of the path segment, specified by the corresponding one character
   * command name.
   */
  public final native String getPathSegTypeAsLetter() /*-{
    return this.pathSegTypeAsLetter;
  }-*/;

}
