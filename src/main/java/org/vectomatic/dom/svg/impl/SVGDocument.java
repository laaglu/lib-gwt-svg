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

import com.google.gwt.dom.client.Document;

/**
 * <p>When an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
 * title='svg element specification'>svg</a> element is embedded inline as
 * a component of a document from another namespace, such as when an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
 * title='svg element specification'>svg</a> element is embedded inline within
 * an XHTML document [<a href="refs.html#ref-XHTML">XHTML</a>], then an {@link
 * org.vectomatic.dom.svg.impl.SVGDocument} object will not exist; instead,
 * the root object in the document object hierarchy will be a Document object
 * of a different type, such as an HTMLDocument object.</p> <p>However, an
 * {@link org.vectomatic.dom.svg.impl.SVGDocument} object will indeed exist
 * when the root element of the XML document hierarchy is an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
 * title='svg element specification'>svg</a> element, such as when viewing
 * a stand-alone SVG file (i.e., a file with MIME type "image/svg+xml"). In
 * this case, the {@link org.vectomatic.dom.svg.impl.SVGDocument} object will
 * be the root object of the document object model hierarchy.</p> <p>In the
 * case where an SVG document is embedded by reference, such as when an XHTML
 * document has an <span class="element-name">'object'</span> element whose
 * <span class="attr-name">'href'</span> attribute references an SVG document
 * (i.e., a document whose MIME type is "image/svg+xml" and whose root element
 * is thus an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
 * title='svg element specification'>svg</a> element), there will exist two
 * distinct DOM hierarchies. The first DOM hierarchy will be for the referencing
 * document (e.g., an XHTML document). The second DOM hierarchy will be for
 * the referenced SVG document.  In this second DOM hierarchy, the root object
 * of the document object model hierarchy is an {@link org.vectomatic.dom.svg.impl.SVGDocument}
 * object.</p> <p>The {@link org.vectomatic.dom.svg.impl.SVGDocument} interface
 * contains a similar list of attributes and methods to the HTMLDocument interface
 * described in the <a href="http://www.w3.org/TR/REC-DOM-Level-1/level-one-html.html">Document
 * Object Model (HTML) Level 1</a> chapter of the [<a href="refs.html#ref-DOM1">DOM1</a>]
 * specification.</p>
 */
public class SVGDocument extends Document {
  protected SVGDocument() {
  }

  // Implementation of the svg::SVGDocument W3C IDL interface
  /**
   * The root <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> in the document hierarchy.
   */
  public final native SVGSVGElement getRootElement() /*-{
    return this.rootElement;
  }-*/;

}
