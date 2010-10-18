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

import com.google.gwt.core.client.JavaScriptException;

  /**
   * The {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan} interface defines
   * attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * and associated constants.
   */
public interface ISVGZoomAndPan {
  /**
   * The enumeration was set to a value that is not one of predefined types.
   * It is invalid to attempt to define a new value of this type or to attempt
   * to switch an existing value to this type.
   */
  public static final short SVG_ZOOMANDPAN_UNKNOWN = 0;
  /**
   * Corresponds to value <span class='attr-value'>'disable'</span>.
   */
  public static final short SVG_ZOOMANDPAN_DISABLE = 1;
  /**
   * Corresponds to value <span class='attr-value'>'magnify'</span>.
   */
  public static final short SVG_ZOOMANDPAN_MAGNIFY = 2;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * on the given element. The value must be one of the SVG_ZOOMANDPAN_ constants
   * defined on this interface.
   */
  public short getZoomAndPan();
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * on the given element. The value must be one of the SVG_ZOOMANDPAN_ constants
   * defined on this interface.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public void setZoomAndPan(short value) throws JavaScriptException;
}
