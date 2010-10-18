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
   * The {@link org.vectomatic.dom.svg.itf.ISVGRenderingIntent} interface defines
   * the enumerated list of possible values for <code>color-profile/rendering-intent</code>
   * attributes or descriptors.
   */
public interface ISVGRenderingIntent {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short RENDERING_INTENT_UNKNOWN = 0;
  /**
   * Corresponds to a value of <span class ='attr-value'>'auto'</span>.
   */
  public static final short RENDERING_INTENT_AUTO = 1;
  /**
   * Corresponds to a value of <span class ='attr-value'>'perceptual'</span>.
   */
  public static final short RENDERING_INTENT_PERCEPTUAL = 2;
  /**
   * Corresponds to a value of <span class ='attr-value'>'relative-colorimetric'</span>.
   */
  public static final short RENDERING_INTENT_RELATIVE_COLORIMETRIC = 3;
  /**
   * Corresponds to a value of <span class ='attr-value'>'saturation'</span>.
   */
  public static final short RENDERING_INTENT_SATURATION = 4;
  /**
   * Corresponds to a value of <span class='attr-value'>'absolute-colorimetric'</span>.
   */
  public static final short RENDERING_INTENT_ABSOLUTE_COLORIMETRIC = 5;
}
