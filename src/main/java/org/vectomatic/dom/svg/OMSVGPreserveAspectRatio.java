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

public class OMSVGPreserveAspectRatio extends JavaScriptObject {
  public static final short SVG_PRESERVEASPECTRATIO_UNKNOWN = 0;
  public static final short SVG_PRESERVEASPECTRATIO_NONE = 1;
  public static final short SVG_PRESERVEASPECTRATIO_XMINYMIN = 2;
  public static final short SVG_PRESERVEASPECTRATIO_XMIDYMIN = 3;
  public static final short SVG_PRESERVEASPECTRATIO_XMAXYMIN = 4;
  public static final short SVG_PRESERVEASPECTRATIO_XMINYMID = 5;
  public static final short SVG_PRESERVEASPECTRATIO_XMIDYMID = 6;
  public static final short SVG_PRESERVEASPECTRATIO_XMAXYMID = 7;
  public static final short SVG_PRESERVEASPECTRATIO_XMINYMAX = 8;
  public static final short SVG_PRESERVEASPECTRATIO_XMIDYMAX = 9;
  public static final short SVG_PRESERVEASPECTRATIO_XMAXYMAX = 10;
  public static final short SVG_MEETORSLICE_UNKNOWN = 0;
  public static final short SVG_MEETORSLICE_MEET = 1;
  public static final short SVG_MEETORSLICE_SLICE = 2;
  protected OMSVGPreserveAspectRatio() {
  }

  // Implementation of the svg::SVGPreserveAspectRatio W3C IDL interface
  public final native short getAlign() /*-{
    return this.align;
  }-*/;
  public final native void setAlign(short value) /*-{
    this.align = value;
  }-*/;
  public final native short getMeetOrSlice() /*-{
    return this.meetOrSlice;
  }-*/;
  public final native void setMeetOrSlice(short value) /*-{
    this.meetOrSlice = value;
  }-*/;

}
