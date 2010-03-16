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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedString;

public class SVGColorProfileElement extends SVGElement {
  protected SVGColorProfileElement() {
  }

  // Implementation of the svg::SVGColorProfileElement W3C IDL interface
  public final native String getLocal() /*-{
    return this.local;
  }-*/;
  public final native void setLocal(String value) /*-{
    this.local = value;
  }-*/;
  public final native String getName() /*-{
    return this.name;
  }-*/;
  public final native void setName(String value) /*-{
    this.name = value;
  }-*/;
  public final native short getRenderingIntent() /*-{
    return this.renderingIntent;
  }-*/;
  public final native void setRenderingIntent(short value) /*-{
    this.renderingIntent = value;
  }-*/;

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
  }-*/;

  // Implementation of the svg::SVGRenderingIntent W3C IDL interface

}
