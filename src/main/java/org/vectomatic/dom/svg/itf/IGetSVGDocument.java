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

import org.vectomatic.dom.svg.OMSVGDocument;

  /**
   * <p>This interface provides access to an SVG document embedded by reference
   * in another DOM-based language. The expectation is that the interface is
   * implemented on DOM objects that allow such SVG document references, such
   * as the DOM {@link org.vectomatic.dom.svg.OMElement} object that corresponds
   * to an HTML <span class='element-name'>'object'</span> element. Such DOM
   * objects are often also required to implement the <code>EmbeddingElement</code>
   * defined in the Window specification [<a href="refs.html#ref-WINDOW">WINDOW</a>].</p>
   * <p>This interface is deprecated and may be dropped from future versions
   * of the SVG specification. Authors are suggested to use the <code>contentDocument</code>
   * attribute on the <code>EmbeddingElement</code> interface to obtain a referenced
   * SVG document, if that interface is available.</p>
   */
public interface IGetSVGDocument {
  /**
   * <p> This method must return the {@link org.vectomatic.dom.svg.OMDocument}
   * object embedded content in an embedding element, or null if there is no
   * document.</p> <p>Note that this is equivalent to fetching the value of
   * the <code>EmbeddingElement::contentDocument</code> attribute of the embedding
   * element, if the <code>EmbeddingElement</code> interface is also implemented.
   * The author is advised to check that the document element of the returned
   * {@link org.vectomatic.dom.svg.OMDocument} is indeed an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element instead of assuming that
   * that will always be the case.</p>
   * @return The {@link org.vectomatic.dom.svg.OMDocument} object for the referenced
   * document, or null   if there is no document.
   */
  public OMSVGDocument getSVGDocument();
}
