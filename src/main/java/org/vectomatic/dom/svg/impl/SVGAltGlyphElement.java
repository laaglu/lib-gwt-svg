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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGAltGlyphElement extends SVGTextPositioningElement {
  protected SVGAltGlyphElement() {
  }

  // Implementation of the svg::SVGAltGlyphElement W3C IDL interface
  public final native String getGlyphRef() /*-{
    return this.glyphRef;
  }-*/;
  public final native void setGlyphRef(String value) /*-{
    this.glyphRef = value;
  }-*/;
  public final native String getFormat() /*-{
    return this.format;
  }-*/;
  public final native void setFormat(String value) /*-{
    this.format = value;
  }-*/;

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
  }-*/;

}
