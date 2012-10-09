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
	 * Determines whether an element has an attribute with a given name.
	 * <p>
	 * Note that IE, prior to version 8, will return false-positives for names
	 * that collide with element properties (e.g., style, width, and so forth).
	 * </p>
	 * 
	 * @param name
	 * the name of the attribute
	 * @return <code>true</code> if this element has the specified attribute
	 */
	public final boolean hasAttribute(String name) {
		return ((Element) ot).hasAttribute(name);
	}
	
    /**
     * Returns <code>true</code> when an attribute with a given local name and 
     * namespace URI is specified on the specified element or has a default value, 
     * <code>false</code> otherwise.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * <code>namespaceURI</code> parameter for methods if they wish to have 
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to look for.
     * @param localName The local name of the attribute to look for.
     * @return <code>true</code> if an attribute with the given local name 
     *   and namespace URI is specified or has a default value on this 
     *   element, <code>false</code> otherwise.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not 
     *   support the feature <code>"XML"</code> and the language exposed 
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]). 
     */
	public final boolean hasAttributeNS(String namespaceURI, String localName) throws JavaScriptException {
	  return DOMHelper.hasAttributeNS((Element) ot, namespaceURI, localName);
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
     * Retrieves an attribute node by name on the specified element.
     * <br>To retrieve an attribute node by qualified name and namespace URI, 
     * use the <code>getAttributeNodeNS</code> method.
     * @param attrName The name (<code>nodeName</code>) of the attribute to 
     *   retrieve.
     * @return The {@link OMAttr} node with the specified name (
     *   <code>nodeName</code>) or <code>null</code> if there is no such 
     *   attribute.
     */
	public final OMAttr getAttributeNode(String attrName) {
		return OMNode.convert(DOMHelper.getAttributeNode((Element) ot, attrName));
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
     * Returns a {@link OMNamedNodeMap} containing the attributes of the
     * specified element.
     * @return a {@link OMNamedNodeMap} containing the attributes of the
     * specified element
     */
	public final OMNamedNodeMap<OMAttr> getAttributes() {
		return new OMNamedNodeMap<OMAttr>(DOMHelper.getAttributes((Element) ot));
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
     * Adds a new attribute to the specified element. If an attribute with the same local name and 
     * namespace URI is already present on the element, its prefix is 
     * changed to be the prefix part of the <code>qualifiedName</code>, and 
     * its value is changed to be the <code>value</code> parameter. This 
     * value is a simple string; it is not parsed as it is being set. So any 
     * markup (such as syntax to be recognized as an entity reference) is 
     * treated as literal text, and needs to be appropriately escaped by the 
     * implementation when it is written out. In order to assign an 
     * attribute value that contains entity references, the user must create 
     * an {@link OMAttr} node plus any {@link OMText} and 
     * <code>EntityReference</code> nodes, build the appropriate subtree, 
     * and use <code>setAttributeNodeNS</code> or 
     * <code>setAttributeNode</code> to assign it as the value of an 
     * attribute.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * <code>namespaceURI</code> parameter for methods if they wish to have 
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to create or 
     *   alter.
     * @param localName The local name of the attribute to create or 
     *   alter.
     * @param value The value to set in string form.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified qualified name is not 
     *   an XML name according to the XML version in use specified in the 
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is 
     *   malformed per the Namespaces in XML specification, if the 
     *   <code>qualifiedName</code> has a prefix and the 
     *   <code>namespaceURI</code> is <code>null</code>, if the 
     *   <code>qualifiedName</code> has a prefix that is "xml" and the 
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
     *   http://www.w3.org/XML/1998/namespace</a>", if the <code>qualifiedName</code> or its prefix is "xmlns" and the 
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>", or if the <code>namespaceURI</code> is "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>" and neither the <code>qualifiedName</code> nor its prefix is "xmlns".
     *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not 
     *   support the feature <code>"XML"</code> and the language exposed 
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]). 
     */
	public final void setAttributeNS(String namespaceURI, String localName, String value) throws JavaScriptException {
		DOMHelper.setAttributeNS((Element) ot, namespaceURI, localName, value);
	}

	/**
     * Adds a new attribute node to the specified element. If an attribute with that name (
     * <code>nodeName</code>) is already present in the element, it is 
     * replaced by the new one. Replacing an attribute node by itself has no 
     * effect.
     * <br>To add a new attribute node with a qualified name and namespace 
     * URI, use the <code>setAttributeNodeNS</code> method.
     * @param attr The {@link OMAttr} node to add to the attribute list.
     * @return If the <code>attr</code> attribute replaces an existing 
     *   attribute, the replaced {@link OMAttr} node is returned, 
     *   otherwise <code>null</code> is returned.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: Raised if <code>attr</code> was created from a 
     *   different document than the one that created the element.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>INUSE_ATTRIBUTE_ERR: Raised if <code>attr</code> is already an 
     *   attribute of another <code>Element</code> object. The DOM user must 
     *   explicitly clone {@link OMAttr} nodes to re-use them in other 
     *   elements.
     */
	public final OMAttr setAttributeNode(OMAttr attr) throws JavaScriptException {
		return OMNode.convert(DOMHelper.setAttributeNode((Element) ot, attr.getAttr()));
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
