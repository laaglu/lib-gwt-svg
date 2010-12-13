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

package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedString;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.Element;

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the
 * SVG language (such as the {@link org.vectomatic.dom.svg.impl.SVGPathElement}
 * interface for the <a href='http://www.w3.org/TR/SVG11/paths.html#PathElement'
 * title='path element specification'>path</a> element) derive from the {@link
 * org.vectomatic.dom.svg.impl.SVGElement} interface.
 */
public class SVGElement extends Element {
  protected SVGElement() {
  }

  // Implementation of the svg::SVGElement W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:base</code> on the given element.
   */
  public final native String getXmlbase() /*-{
    return this.xmlbase;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:base</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setXmlbase(String value) throws JavaScriptException /*-{
    this.xmlbase = value;
  }-*/;
  /**
   * The nearest ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element. Null if the given element
   * is the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native SVGSVGElement getOwnerSVGElement() /*-{
    return this.ownerSVGElement;
  }-*/;
  /**
   * The element which established the current viewport. Often, the nearest
   * ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element. Null if the given element is the
   * outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element.
   */
  public final native SVGElement getViewportElement() /*-{
    return this.viewportElement;
  }-*/;

  // Partial implementation of the svg::Stylable W3C IDL interface
  // (the rest is inherited from Element)
  public final native OMSVGAnimatedString getClassName_() /*-{
    return this.className;
  }-*/;
  
  public final native String getMarkup() /*-{
	return new XMLSerializer().serializeToString(this);
  }-*/;
}
