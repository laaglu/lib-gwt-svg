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

import com.google.gwt.dom.client.Element;

public class SVGElement extends Element {
  protected SVGElement() {
  }

  // Implementation of the svg::SVGElement W3C IDL interface
  public final native String getXmlbase() /*-{
    return this.xmlbase;
  }-*/;
  public final native void setXmlbase(String value) /*-{
    this.xmlbase = value;
  }-*/;
  public final native SVGSVGElement getOwnerSVGElement() /*-{
    return this.ownerSVGElement;
  }-*/;
  public final native SVGElement getViewportElement() /*-{
    return this.viewportElement;
  }-*/;
  
  // Partial implementation of the svg::Stylable W3C IDL interface
  // (the rest is inherited from Element)
  public final native OMSVGAnimatedString getClassName_() /*-{
    return this.className;
  }-*/;
}
