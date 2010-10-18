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

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGPreserveAspectRatio} interface corresponds
 * to the <code>preserveAspectRatio</code> attribute, which is available for
 * some of SVG's elements. <p id="ReadOnlyPreserveAspectRatio">An {@link org.vectomatic.dom.svg.OMSVGPreserveAspectRatio}
 * object can be designated as <em>read only</em>, which means that attempts
 * to modify the object will result in an exception being thrown, as described
 * below.</p>
 */
public class OMSVGPreserveAspectRatio extends JavaScriptObject {
/**
 * The enumeration was set to a value that is not one of predefined types.
 * It is invalid to attempt to define a new value of this type or to attempt
 * to switch an existing value to this type.
 */
  public static final short SVG_PRESERVEASPECTRATIO_UNKNOWN = 0;
/**
 * Corresponds to value <span class='attr-value'>'none'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_NONE = 1;
/**
 * Corresponds to value <span class='attr-value'>'xMinYMin'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMINYMIN = 2;
/**
 * Corresponds to value <span class='attr-value'>'xMidYMin'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3;
/**
 * Corresponds to value <span class='attr-value'>'xMaxYMin'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4;
/**
 * Corresponds to value <span class='attr-value'>'XMinYMid'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMINYMID = 5;
/**
 * Corresponds to value <span class='attr-value'>'xMidYMid'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMIDYMID = 6;
/**
 * Corresponds to value <span class='attr-value'>'xMaxYMid'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMAXYMID = 7;
/**
 * Corresponds to value <span class='attr-value'>'xMinYMax'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMINYMAX = 8;
/**
 * Corresponds to value <span class='attr-value'>'xMidYMax'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9;
/**
 * Corresponds to value <span class='attr-value'>'xMaxYMax'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10;
/**
 * The enumeration was set to a value that is not one of predefined types.
 * It is invalid to attempt to define a new value of this type or to attempt
 * to switch an existing value to this type.
 */
  public static final short SVG_MEETORSLICE_UNKNOWN = 0;
/**
 * Corresponds to value <span class='attr-value'>'meet'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_MEETORSLICE_MEET = 1;
/**
 * Corresponds to value <span class='attr-value'>'slice'</span> for attribute
 * <code>preserveAspectRatio</code>.
 */
  public static final short SVG_MEETORSLICE_SLICE = 2;
  protected OMSVGPreserveAspectRatio() {
  }

  // Implementation of the svg::SVGPreserveAspectRatio W3C IDL interface
  /**
   * The type of the alignment value as specified by one of the SVG_PRESERVEASPECTRATIO_
   * constants defined on this interface.
   */
  public final native short getAlign() /*-{
    return this.align;
  }-*/;
  /**
   * The type of the alignment value as specified by one of the SVG_PRESERVEASPECTRATIO_
   * constants defined on this interface.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the object
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyPreserveAspectRatio">read
   * only</a>.
   */
  public final native void setAlign(short value) throws JavaScriptException /*-{
    this.align = value;
  }-*/;
  /**
   * The type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_
   * constants defined on this interface.
   */
  public final native short getMeetOrSlice() /*-{
    return this.meetOrSlice;
  }-*/;
  /**
   * The type of the meet-or-slice value as specified by one of the SVG_MEETORSLICE_
   * constants defined on this interface.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the object
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyPreserveAspectRatio">read
   * only</a>.
   */
  public final native void setMeetOrSlice(short value) throws JavaScriptException /*-{
    this.meetOrSlice = value;
  }-*/;

}
