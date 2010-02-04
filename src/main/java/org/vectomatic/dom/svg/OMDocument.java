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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Node;

public class OMDocument extends OMNode {

	protected OMDocument(Node ot) {
		super(ot);
	}

	// Implementation of the dom::Document W3C IDL interface
	public final OMText createTextNode(String data) {
	  return new OMText(((SVGDocument)ot).createTextNode(data));
	}
	public final OMNodeList getElementsByTagName(String name) {
	    return new OMNodeList(((SVGDocument)ot).getElementsByTagName(name));
	}
	public final OMNodeList getElementsByTagNameNS(String namespaceURI, String localName) {
	    return new OMNodeList(DOMHelper.getElementsByTagNameNS(((SVGDocument)ot), namespaceURI, localName));
	}
	public final OMElement getElementById(java.lang.String elementId) {
		return (OMElement)new Conversion(((SVGDocument)ot).getElementById(elementId)).result;
	}
	public final OMElement getDocumentElement() {
		return (OMElement)new Conversion(((SVGDocument)ot).getDocumentElement()).result;
	}

}
