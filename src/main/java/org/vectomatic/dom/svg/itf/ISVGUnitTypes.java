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

package org.vectomatic.dom.svg.itf;


  /**
   * The {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes} interface defines
   * a commonly used set of constants and is a base interface used by {@link
   * org.vectomatic.dom.svg.OMSVGGradientElement}, {@link org.vectomatic.dom.svg.OMSVGPatternElement},
   * {@link org.vectomatic.dom.svg.OMSVGClipPathElement}, {@link org.vectomatic.dom.svg.OMSVGMaskElement}
   * and {@link org.vectomatic.dom.svg.OMSVGFilterElement}.
   */
public interface ISVGUnitTypes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_UNIT_TYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class='attr-value'>'userSpaceOnUse'</span>.
   */
  public static final short SVG_UNIT_TYPE_USERSPACEONUSE = 1;
  /**
   * Corresponds to value <span class='attr-value'>'objectBoundingBox'</span>.
   */
  public static final short SVG_UNIT_TYPE_OBJECTBOUNDINGBOX = 2;
}
