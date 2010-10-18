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

import org.vectomatic.dom.svg.utils.DOMHelper;
import org.w3c.dom.DOMException;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.Element;

/**
 * Wrapper class for DOM Element
 * @author laaglu
 */
public class OMElement extends OMNode {
	/**
	 * Constructor
	 * @param element The wrapped element
	 */

	protected OMElement(Element element) {
		super(element);
	}
	
	/**
	 * Returns the wrapped Element
	 * @return the wrapped Element
	 */
	public Element getElement() {
		return ot.cast();
	}

	// Implementation of the dom::Element W3C IDL interface
    /**
     * Returns a <code>OMNodeList</code> of all descendant <code>OMElements</code> 
     * with a given tag name, in document order.
     * @param name The name of the tag to match on. The special value "*" 
     *   matches all tags.
     * @return A list of matching <code>OMElement</code> nodes.
     */
	public final <T extends OMElement> OMNodeList<T> getElementsByTagName(String name) {
		return new OMNodeList<T>(((Element) ot).getElementsByTagName(name));
	}

    /**
     * Returns a <code>OMNodeList</code> of all the descendant 
     * <code>OMElements</code> with a given local name and namespace URI in 
     * document order.
     * @param namespaceURI The namespace URI of the elements to match on. The 
     *   special value "*" matches all namespaces.
     * @param localName The local name of the elements to match on. The 
     *   special value "*" matches all local names.
     * @return A new <code>OMNodeList</code> object containing all the matched 
     *   <code>OMElements</code>.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not 
     *   support the feature <code>"XML"</code> and the language exposed 
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]). 
     */
	public final <T extends OMElement> OMNodeList<T> getElementsByTagNameNS(String namespaceURI, String localName) throws JavaScriptException {
		return new OMNodeList<T>(DOMHelper.getElementsByTagNameNS(((Element) ot), namespaceURI, localName));
	}

	/**
	 * Returns the element id
	 * @return the element id
	 */
	public final String getId() {
		return ((Element) ot).getId();
	}

    /**
     * The name of the element. If <code>Node.localName</code> is different 
     * from <code>null</code>, this attribute is a qualified name. For 
     * example, in: 
     * <pre> &lt;elementExample id="demo"&gt; ... 
     * &lt;/elementExample&gt; , </pre>
     *  <code>tagName</code> has the value 
     * <code>"elementExample"</code>. Note that this is case-preserving in 
     * XML, as are all of the operations of the DOM. The HTML DOM returns 
     * the <code>tagName</code> of an HTML element in the canonical 
     * uppercase form, regardless of the case in the source HTML document.
     * @return the name of the element
     */
	public final String getTagName() {
		return ((Element) ot).getTagName();
	}
	
    /**
     * Retrieves an attribute value by name.
     * @param name The name of the attribute to retrieve.
     * @return The <code>OMAttr</code> value as a string, or the empty string 
     *   if that attribute does not have a specified or default value.
     */
	public final String getAttribute(String name) {
		return ((Element) ot).getAttribute(name);
	}
    /**
     * Retrieves an attribute value by local name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * <code>namespaceURI</code> parameter for methods if they wish to have 
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to retrieve.
     * @param localName The local name of the attribute to retrieve.
     * @return The <code>OMAttr</code> value as a string, or the empty string 
     *   if that attribute does not have a specified or default value.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not 
     *   support the feature <code>"XML"</code> and the language exposed 
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]). 
     */
	public final String getAttributeNS(String namespaceURI, String localName) throws JavaScriptException {
		return DOMHelper.getAttributeNS((Element) ot, namespaceURI, localName);
	}
    /**
     * Adds a new attribute. If an attribute with that name is already present 
     * in the element, its value is changed to be that of the value 
     * parameter. This value is a simple string; it is not parsed as it is 
     * being set. So any markup (such as syntax to be recognized as an 
     * entity reference) is treated as literal text, and needs to be 
     * appropriately escaped by the implementation when it is written out. 
     * <br>To set an attribute with a qualified name and namespace URI, use 
     * the <code>setAttributeNS</code> method.
     * @param name The name of the attribute to create or alter.
     * @param value Value to set in string form.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified name is not an XML 
     *   name according to the XML version in use specified in the 
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
	public final void setAttribute(String name, String value) throws JavaScriptException {
		((Element) ot).setAttribute(name, value);
	}
    /**
     * Removes an attribute by name. If a default value for the removed 
     * attribute is defined in the DTD, a new attribute immediately appears 
     * with the default value as well as the corresponding namespace URI, 
     * local name, and prefix when applicable. The implementation may handle 
     * default values from other schemas similarly but applications should 
     * use <code>OMDocument.normalizeDocument()</code> to guarantee this 
     * information is up-to-date.
     * <br>If no attribute with this name is found, this method has no effect.
     * <br>To remove an attribute by local name and namespace URI, use the 
     * <code>removeAttributeNS</code> method.
     * @param name The name of the attribute to remove.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
	public final void removeAttribute(String name) throws JavaScriptException {
		((Element) ot).removeAttribute(name);
	}

}
