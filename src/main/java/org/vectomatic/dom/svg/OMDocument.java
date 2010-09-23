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

import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Document;

public class OMDocument extends OMNode {

	protected OMDocument(Document ot) {
		super(ot);
	}

	// Implementation of the dom::Document W3C IDL interface
	public final OMText createTextNode(String data) {
	  return new OMText(((SVGDocument)ot).createTextNode(data));
	}
	public final <T extends OMElement> OMNodeList<T> getElementsByTagName(String name) {
	    return new OMNodeList<T>(((SVGDocument)ot).getElementsByTagName(name));
	}
	public final <T extends OMElement> OMNodeList<T> getElementsByTagNameNS(String namespaceURI, String localName) {
	    return new OMNodeList<T>(DOMHelper.getElementsByTagNameNS(((SVGDocument)ot), namespaceURI, localName));
	}
	public final <T extends OMElement> T getElementById(String elementId) {
		return OMNode.<T>convert(((SVGDocument)ot).getElementById(elementId));
	}
	public final OMElement getDocumentElement() {
		return OMNode.convert(((SVGDocument)ot).getDocumentElement());
	}

}
