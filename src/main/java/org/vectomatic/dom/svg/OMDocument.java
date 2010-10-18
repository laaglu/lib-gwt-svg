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

import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Document;

/**
 * Wrapper class for DOM Document
 * @author laaglu
 */
public class OMDocument extends OMNode {
	/**
	 * Constructor
	 * @param document The wrapped document
	 */
	protected OMDocument(Document document) {
		super(document);
	}

	// Implementation of the dom::Document W3C IDL interface
	/**
	 * Creates a new {@link OMText} node and initializes it
	 * with the specified data. The node is not attached to the
	 * DOM tree.
	 * @param data The string to initialize the text node
	 * @return The newly created {@link OMText} node
	 */
	public final OMText createTextNode(String data) {
	  return new OMText(((SVGDocument)ot).createTextNode(data));
	}
    /**
     * Returns a <code>OMNodeList</code> of all the <code>OMElements</code> in 
     * document order with a given tag name and are contained in the 
     * document.
     * @param tagname  The name of the tag to match on. The special value "*" 
     *   matches all tags. For XML, the <code>tagname</code> parameter is 
     *   case-sensitive, otherwise it depends on the case-sensitivity of the 
     *   markup language in use. 
     * @return A new <code>OMNodeList</code> object containing all the matched 
     *   <code>Elements</code>.
     */
	public final <T extends OMElement> OMNodeList<T> getElementsByTagName(String tagname) {
	    return new OMNodeList<T>(((SVGDocument)ot).getElementsByTagName(tagname));
	}
    /**
     * Returns a <code>OMNodeList</code> of all the <code>OMElements</code> with a 
     * given local name and namespace URI in document order.
     * @param namespaceURI The namespace URI of the elements to match on. The 
     *   special value <code>"*"</code> matches all namespaces.
     * @param localName The local name of the elements to match on. The 
     *   special value "*" matches all local names.
     * @return A new <code>OMNodeList</code> object containing all the matched 
     *   <code>Elements</code>.
     */
	public final <T extends OMElement> OMNodeList<T> getElementsByTagNameNS(String namespaceURI, String localName) {
	    return new OMNodeList<T>(DOMHelper.getElementsByTagNameNS(((SVGDocument)ot), namespaceURI, localName));
	}
    /**
     * Returns the <code>OMElement</code> that has an ID attribute with the 
     * given value. If no such element exists, this returns <code>null</code>
     * . If more than one element has an ID attribute with that value, what 
     * is returned is undefined. 
     * <br> The DOM implementation is expected to use the attribute 
     * <code>Attr.isId</code> to determine if an attribute is of type ID. 
     * <p ><b>Note:</b> Attributes with the name "ID" or "id" are not of type 
     * ID unless so defined.
     * @param elementId The unique <code>id</code> value for an element.
     * @return The matching element or <code>null</code> if there is none.
     */
	public final <T extends OMElement> T getElementById(String elementId) {
		return OMNode.<T>convert(((SVGDocument)ot).getElementById(elementId));
	}
	
    /**
     * This is a convenience attribute that allows direct access to the child 
     * node that is the document element of the document.
     */
	public final OMElement getDocumentElement() {
		return OMNode.convert(((SVGDocument)ot).getDocumentElement());
	}

}
