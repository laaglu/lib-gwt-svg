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
package org.vectomatic.dom.svg.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.vectomatic.dom.svg.OMElement;
import org.vectomatic.dom.svg.OMNode;
import org.vectomatic.dom.svg.OMSVGElement;
import org.vectomatic.dom.svg.OMSVGPaint;
import org.vectomatic.dom.svg.impl.Attr;
import org.vectomatic.dom.svg.impl.DOMHelperImpl;
import org.vectomatic.dom.svg.impl.NamedNodeMap;
import org.vectomatic.dom.svg.impl.SVGPaintParser;
import org.w3c.dom.DOMException;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Text;
import com.google.gwt.event.dom.client.LoseCaptureHandler;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * Class to group miscellaneous DOM level 2 methods. These
 * methods are missing from the GWT DOM overlay types (such as 
 * {@link com.google.gwt.dom.client.Element} or {@link com.google.gwt.dom.client.Node})
 * but exist in almost all browsers and are sometimes required
 * to develop an SVG application.
 * @author laaglu
 */
public class DOMHelper {
	private static final DOMHelperImpl impl = GWT.create(DOMHelperImpl.class);
	
    /**
     * Creates an element of the given qualified name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * namespaceURI parameter for methods if they wish to have no namespace.
     * @param document The document in which the element is to be created.
     * @param namespaceURI The namespace URI of the element to create.
     * @param qualifiedName The qualified name of the element type to 
     *   instantiate.
     * @return A new <code>Element</code> object with the following 
     *   attributes:
     * <table border='1' cellpadding='3'>
     * <tr>
     * <th>Attribute</th>
     * <th>Value</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.nodeName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>qualifiedName</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.namespaceURI</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>namespaceURI</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.prefix</code></td>
     * <td valign='top' rowspan='1' colspan='1'>prefix, extracted 
     *   from <code>qualifiedName</code>, or <code>null</code> if there is 
     *   no prefix</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.localName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>local name, extracted from 
     *   <code>qualifiedName</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Element.tagName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>qualifiedName</code></td>
     * </tr>
     * </table>
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified 
     *   <code>qualifiedName</code> is not an XML name according to the XML 
     *   version in use specified in the <code>Document.xmlVersion</code> 
     *   attribute.
     *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is a 
     *   malformed qualified name, if the <code>qualifiedName</code> has a 
     *   prefix and the <code>namespaceURI</code> is <code>null</code>, or 
     *   if the <code>qualifiedName</code> has a prefix that is "xml" and 
     *   the <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
     *   http://www.w3.org/XML/1998/namespace</a>" [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     *   , or if the <code>qualifiedName</code> or its prefix is "xmlns" and 
     *   the <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>", or if the <code>namespaceURI</code> is "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>" and neither the <code>qualifiedName</code> nor its prefix is "xmlns".
     *   <br>NOT_SUPPORTED_ERR: Always thrown if the current document does not 
     *   support the <code>"XML"</code> feature, since namespaces were 
     *   defined by XML.
     */
	public static final native Element createElementNS(Document document, String namespaceURI, String qualifiedName) throws JavaScriptException /*-{
	  return document.createElementNS(namespaceURI, qualifiedName);
	}-*/;
	
	/**
	 * Creates a new empty SVG document
	 * @return
	 * a new empty SVG document
	 */
	public static final native Document createDocument(String uri, String qname) /*-{
    	return $doc.implementation.createDocument(uri, qname, null);
	}-*/;

    /**
     * Imports a node from another document to this document, without altering 
     * or removing the source node from the original document; this method 
     * creates a new copy of the source node. The returned node has no 
     * parent; (<code>parentNode</code> is <code>null</code>).
     * <br>For all nodes, importing a node creates a node object owned by the 
     * importing document, with attribute values identical to the source 
     * node's <code>nodeName</code> and <code>nodeType</code>, plus the 
     * attributes related to namespaces (<code>prefix</code>, 
     * <code>localName</code>, and <code>namespaceURI</code>). As in the 
     * <code>cloneNode</code> operation, the source node is not altered. 
     * User data associated to the imported node is not carried over. 
     * However, if any <code>UserDataHandlers</code> has been specified 
     * along with the associated data these handlers will be called with the 
     * appropriate parameters before this method returns.
     * <br>Additional information is copied as appropriate to the 
     * <code>nodeType</code>, attempting to mirror the behavior expected if 
     * a fragment of XML or HTML source was copied from one document to 
     * another, recognizing that the two documents may have different DTDs 
     * in the XML case. The following list describes the specifics for each 
     * type of node. 
     * <dl>
     * <dt>ATTRIBUTE_NODE</dt>
     * <dd>The <code>ownerElement</code> attribute 
     * is set to <code>null</code> and the <code>specified</code> flag is 
     * set to <code>true</code> on the generated <code>Attr</code>. The 
     * descendants of the source <code>Attr</code> are recursively imported 
     * and the resulting nodes reassembled to form the corresponding subtree.
     * Note that the <code>deep</code> parameter has no effect on 
     * <code>Attr</code> nodes; they always carry their children with them 
     * when imported.</dd>
     * <dt>DOCUMENT_FRAGMENT_NODE</dt>
     * <dd>If the <code>deep</code> option 
     * was set to <code>true</code>, the descendants of the source 
     * <code>DocumentFragment</code> are recursively imported and the 
     * resulting nodes reassembled under the imported 
     * <code>DocumentFragment</code> to form the corresponding subtree. 
     * Otherwise, this simply generates an empty 
     * <code>DocumentFragment</code>.</dd>
     * <dt>DOCUMENT_NODE</dt>
     * <dd><code>Document</code> 
     * nodes cannot be imported.</dd>
     * <dt>DOCUMENT_TYPE_NODE</dt>
     * <dd><code>DocumentType</code> 
     * nodes cannot be imported.</dd>
     * <dt>ELEMENT_NODE</dt>
     * <dd><em>Specified</em> attribute nodes of the source element are imported, and the generated 
     * <code>Attr</code> nodes are attached to the generated 
     * <code>Element</code>. Default attributes are <em>not</em> copied, though if the document being imported into defines default 
     * attributes for this element name, those are assigned. If the 
     * <code>importNode</code> <code>deep</code> parameter was set to 
     * <code>true</code>, the descendants of the source element are 
     * recursively imported and the resulting nodes reassembled to form the 
     * corresponding subtree.</dd>
     * <dt>ENTITY_NODE</dt>
     * <dd><code>Entity</code> nodes can be 
     * imported, however in the current release of the DOM the 
     * <code>DocumentType</code> is readonly. Ability to add these imported 
     * nodes to a <code>DocumentType</code> will be considered for addition 
     * to a future release of the DOM.On import, the <code>publicId</code>, 
     * <code>systemId</code>, and <code>notationName</code> attributes are 
     * copied. If a <code>deep</code> import is requested, the descendants 
     * of the the source <code>Entity</code> are recursively imported and 
     * the resulting nodes reassembled to form the corresponding subtree.</dd>
     * <dt>
     * ENTITY_REFERENCE_NODE</dt>
     * <dd>Only the <code>EntityReference</code> itself is 
     * copied, even if a <code>deep</code> import is requested, since the 
     * source and destination documents might have defined the entity 
     * differently. If the document being imported into provides a 
     * definition for this entity name, its value is assigned.</dd>
     * <dt>NOTATION_NODE</dt>
     * <dd>
     * <code>Notation</code> nodes can be imported, however in the current 
     * release of the DOM the <code>DocumentType</code> is readonly. Ability 
     * to add these imported nodes to a <code>DocumentType</code> will be 
     * considered for addition to a future release of the DOM.On import, the 
     * <code>publicId</code> and <code>systemId</code> attributes are copied.
     * Note that the <code>deep</code> parameter has no effect on this type 
     * of nodes since they cannot have any children.</dd>
     * <dt>
     * PROCESSING_INSTRUCTION_NODE</dt>
     * <dd>The imported node copies its 
     * <code>target</code> and <code>data</code> values from those of the 
     * source node.Note that the <code>deep</code> parameter has no effect 
     * on this type of nodes since they cannot have any children.</dd>
     * <dt>TEXT_NODE, 
     * CDATA_SECTION_NODE, COMMENT_NODE</dt>
     * <dd>These three types of nodes inheriting 
     * from <code>CharacterData</code> copy their <code>data</code> and 
     * <code>length</code> attributes from those of the source node.Note 
     * that the <code>deep</code> parameter has no effect on these types of 
     * nodes since they cannot have any children.</dd>
     * </dl> 
     * @param document The document in which to import the node.
     * @param importedNode The node to import.
     * @param deep If <code>true</code>, recursively import the subtree under 
     *   the specified node; if <code>false</code>, import only the node 
     *   itself, as explained above. This has no effect on nodes that cannot 
     *   have any children, and on <code>Attr</code>, and 
     *   <code>EntityReference</code> nodes.
     * @return The imported node that belongs to this <code>Document</code>.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the type of node being imported is not 
     *   supported.
     *   <br>INVALID_CHARACTER_ERR: Raised if one of the imported names is not 
     *   an XML name according to the XML version in use specified in the 
     *   <code>Document.xmlVersion</code> attribute. This may happen when 
     *   importing an XML 1.1 [<a href='http://www.w3.org/TR/2004/REC-xml11-20040204/'>XML 1.1</a>] element 
     *   into an XML 1.0 document, for instance.
     */
	public static final native Node importNode(Document document, Node importedNode, boolean deep) /*-{
		return document.importNode(importedNode, deep);
	}-*/;
	
    /**
     *  Puts all <code>Text</code> nodes in the full depth of the sub-tree 
     * underneath this <code>Node</code>, including attribute nodes, into a 
     * "normal" form where only structure (e.g., elements, comments, 
     * processing instructions, CDATA sections, and entity references) 
     * separates <code>Text</code> nodes, i.e., there are neither adjacent 
     * <code>Text</code> nodes nor empty <code>Text</code> nodes. This can 
     * be used to ensure that the DOM view of a document is the same as if 
     * it were saved and re-loaded, and is useful when operations (such as 
     * XPointer [<a href='http://www.w3.org/TR/2003/REC-xptr-framework-20030325/'>XPointer</a>]
     *  lookups) that depend on a particular document tree structure are to 
     * be used. If the parameter "normalize-characters" of the 
     * <code>DOMConfiguration</code> object attached to the 
     * <code>Node.ownerDocument</code> is <code>true</code>, this method 
     * will also fully normalize the characters of the <code>Text</code> 
     * nodes. 
     * <p ><b>Note:</b> In cases where the document contains 
     * <code>CDATASections</code>, the normalize operation alone may not be 
     * sufficient, since XPointers do not differentiate between 
     * <code>Text</code> nodes and <code>CDATASection</code> nodes.
     * @param node the node to normalize
     */
	public static final native void normalize(Node node) /*-{
		return node.normalize();
	}-*/;

    /**
     * Extracts a range of data from the node.
     * @param text the text node
     * @param offset Start offset of substring to extract.
     * @param count The number of 16-bit units to extract.
     * @return The specified substring. If the sum of <code>offset</code> and 
     *   <code>count</code> exceeds the <code>length</code>, then all 16-bit 
     *   units to the end of the data are returned.
     * @exception DOMException
     *   INDEX_SIZE_ERR: Raised if the specified <code>offset</code> is 
     *   negative or greater than the number of 16-bit units in 
     *   <code>data</code>, or if the specified <code>count</code> is 
     *   negative.
     *   <br>DOMSTRING_SIZE_ERR: Raised if the specified range of text does 
     *   not fit into a <code>String</code>.
     */
	public static final native String substringData(Text text, int offset, int count) throws JavaScriptException /*-{
	  return text.substringData(offset, count);
	}-*/;

    /**
     * Append the string to the end of the character data of the node. Upon 
     * success, <code>data</code> provides access to the concatenation of 
     * <code>data</code> and the <code>String</code> specified.
     * @param text the text node
     * @param arg The <code>String</code> to append.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     */
	public static final native void appendData(Text text, String arg) throws JavaScriptException /*-{
	  text.appendData(offset, arg);
	}-*/;
	
    /**
     * Retrieves an attribute value by local name and namespace URI on
     * the specified element.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * <code>namespaceURI</code> parameter for methods if they wish to have 
     * no namespace.
     * @param elem the element
     * @param namespaceURI The namespace URI of the attribute to retrieve.
     * @param localName The local name of the attribute to retrieve.
     * @return The <code>Attr</code> value as a string, or the empty string 
     *   if that attribute does not have a specified or default value.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not 
     *   support the feature <code>"XML"</code> and the language exposed 
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]). 
     * @since DOM Level 2
     */
	public static final native String getAttributeNS(Element elem, String namespaceURI, String localName) throws JavaScriptException /*-{
	  return elem.getAttributeNS(namespaceURI, localName);
	}-*/;
	
    /**
     * Returns a <code>NodeList</code> of all the descendant 
     * <code>Elements</code> of the specified element
     * with a given local name and namespace URI in 
     * document order.
     * @param elem The element
     * @param namespaceURI The namespace URI of the elements to match on. The 
     *   special value "*" matches all namespaces.
     * @param localName The local name of the elements to match on. The 
     *   special value "*" matches all local names.
     * @return A new <code>NodeList</code> object containing all the matched 
     *   <code>Elements</code>.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: May be raised if the implementation does not 
     *   support the feature <code>"XML"</code> and the language exposed 
     *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]). 
     * @since DOM Level 2
     */
	public static final native NodeList<? extends Node> getElementsByTagNameNS(Element elem, String namespaceURI, String localName) throws JavaScriptException /*-{
	  return elem.getElementsByTagNameNS(namespaceURI, localName);
	}-*/;
	
    /**
     * Returns a <code>NodeList</code> of all the <code>Elements</code> 
     * in the specified document with a 
     * given local name and namespace URI in document order.
     * @param doc The document
     * @param namespaceURI The namespace URI of the elements to match on. The 
     *   special value <code>"*"</code> matches all namespaces.
     * @param localName The local name of the elements to match on. The 
     *   special value "*" matches all local names.
     * @return A new <code>NodeList</code> object containing all the matched 
     *   <code>Elements</code>.
     * @since DOM Level 2
     */
	public static final native NodeList<? extends Node> getElementsByTagNameNS(Document doc, String namespaceURI, String localName) throws JavaScriptException /*-{
	  return doc.getElementsByTagNameNS(namespaceURI, localName);
	}-*/;

	/**
	 * Returns the current document
	 * @return the current document
	 */
	public static final native Document getCurrentDocument() /*-{
	  return $doc;
	}-*/;
	
    /**
     * Returns a <code>NamedNodeMap</code> containing the attributes of the
     * specified element.
     * @param elem The element
     * @return a <code>NamedNodeMap</code> containing the attributes of the
     * specified element
     */
	public static final native NamedNodeMap<Attr> getAttributes(Element elem) /*-{
	  return elem.attributes;
	}-*/;
	
    /**
     * Retrieves an attribute node by name on the specified element.
     * <br>To retrieve an attribute node by qualified name and namespace URI, 
     * use the <code>getAttributeNodeNS</code> method.
     * @param elt The element
     * @param attrName The name (<code>nodeName</code>) of the attribute to 
     *   retrieve.
     * @return The <code>Attr</code> node with the specified name (
     *   <code>nodeName</code>) or <code>null</code> if there is no such 
     *   attribute.
     */
	public static final native Attr getAttributeNode(Element elt, String attrName) /*-{
	  return elt.getAttributeNode(attrName);
	}-*/;
	
    /**
     * Adds a new attribute node to the specified element. If an attribute with that name (
     * <code>nodeName</code>) is already present in the element, it is 
     * replaced by the new one. Replacing an attribute node by itself has no 
     * effect.
     * <br>To add a new attribute node with a qualified name and namespace 
     * URI, use the <code>setAttributeNodeNS</code> method.
     * @param elt The element
     * @param attr The <code>Attr</code> node to add to the attribute list.
     * @return If the <code>attr</code> attribute replaces an existing 
     *   attribute, the replaced <code>Attr</code> node is returned, 
     *   otherwise <code>null</code> is returned.
     * @exception DOMException
     *   WRONG_DOCUMENT_ERR: Raised if <code>attr</code> was created from a 
     *   different document than the one that created the element.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>INUSE_ATTRIBUTE_ERR: Raised if <code>attr</code> is already an 
     *   attribute of another <code>Element</code> object. The DOM user must 
     *   explicitly clone <code>Attr</code> nodes to re-use them in other 
     *   elements.
     */
	public static final native Attr setAttributeNode(Element elt, Attr attr) throws JavaScriptException /*-{
	  return elt.setAttributeNode(attr);
	}-*/;

    /**
     * Returns <code>true</code> when an attribute with a given local name and 
     * namespace URI is specified on the specified element or has a default value, 
     * <code>false</code> otherwise.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * <code>namespaceURI</code> parameter for methods if they wish to have 
     * no namespace.
     * @param elem The element
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
	public static final native boolean hasAttributeNS(Element elem, String namespaceURI, String localName) throws JavaScriptException /*-{
	  return elem.hasAttributeNS(namespaceURI, localName);
	}-*/;
	
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
     * an <code>Attr</code> node plus any <code>Text</code> and 
     * <code>EntityReference</code> nodes, build the appropriate subtree, 
     * and use <code>setAttributeNodeNS</code> or 
     * <code>setAttributeNode</code> to assign it as the value of an 
     * attribute.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * <code>namespaceURI</code> parameter for methods if they wish to have 
     * no namespace.
     * @param elem The element
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
	public static final native void setAttributeNS(Element elem, String namespaceURI, String localName, String value) throws JavaScriptException /*-{
	  elem.setAttributeNS(namespaceURI, localName, value);
	}-*/;
	
    /**
     * The namespace URI of the specified node, or <code>null</code> if it is 
     * unspecified (see ).
     * <br>This is not a computed value that is the result of a namespace 
     * lookup based on an examination of the namespace declarations in 
     * scope. It is merely the namespace URI given at creation time.
     * <br>For nodes of any type other than <code>ELEMENT_NODE</code> and 
     * <code>ATTRIBUTE_NODE</code> and nodes created with a DOM Level 1 
     * method, such as <code>Document.createElement()</code>, this is always 
     * <code>null</code>.
     * <p ><b>Note:</b> Per the <em>Namespaces in XML</em> Specification [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     *  an attribute does not inherit its namespace from the element it is 
     * attached to. If an attribute is not explicitly given a namespace, it 
     * simply has no namespace.
     * @param node a DOM node
     * @return The namespace URI of this node
     */
	public static native String getNamespaceURI(Node node) /*-{
	  return node.namespaceURI;
	}-*/;

    /**
     * Returns the local part of the qualified name of this node.
     * <br>For nodes of any type other than <code>ELEMENT_NODE</code> and 
     * <code>ATTRIBUTE_NODE</code> and nodes created with a DOM Level 1 
     * method, such as <code>Document.createElement()</code>, this is always 
     * <code>null</code>.
     * @param node a DOM node
     * @return The local part of the qualified name of this node
     */
	public static native String getLocalName(Node node) /*-{
	  return node.localName;
	}-*/;

	/**
	 * Makes a node sink the events emitted by the specified element
	 * @param source The node processing the events
	 * @param elem The element emitting the events
	 * @param eventName The event name
	 */
	public static void bindEventListener(OMNode source, Element elem, String eventName) {
		impl.bindEventListener(source, elem, eventName);
	}
	
	/**
	 * Returns the element which currently captures all the
	 * events after a call to {@link org.vectomatic.dom.svg.utils.DOMHelper#setCaptureElement(OMSVGElement, LoseCaptureHandler)}
	 * or null if element is set to capture events
	 * @return The event capturing element
	 */
	public static OMSVGElement getCaptureElement() {
		return impl.getCaptureElement();
	}
	
	/**
	 * Makes the specified element capture all the events, until
	 * a call to {@link org.vectomatic.dom.svg.utils.DOMHelper#releaseCaptureElement()}
	 * terminates the capture
	 * @param element The capturing element
	 * @param loseCaptureHandler A handler which will be invoked
	 * if the element loses capture
	 * @return  {@link HandlerRegistration} used to remove this handler
	 */
	public static HandlerRegistration setCaptureElement(OMSVGElement element, LoseCaptureHandler loseCaptureHandler) {
		return impl.setCaptureElement(element, loseCaptureHandler);
	}
	
	/**
	 * Stops the forwarding of all events to the capturing element
	 * specified by {@link org.vectomatic.dom.svg.utils.DOMHelper#setCaptureElement(OMSVGElement, LoseCaptureHandler)}
	 */
	public static void releaseCaptureElement() {
		impl.releaseCaptureElement();
	}
	
	/**
	 * Returns the JavaScript type of an object. 
	 * The function getType is borrowed from: 
	 * JavaScript: The Definitive Guide, 5th Edition
	 * By David Flanagan
	 */
	public static final native String getType(JavaScriptObject x) /*-{
	    // If x is null, return "null"
	    if (x == null) {
	        return "null";
	    }
	    // Next try the typeof operator
	    var t = typeof x;
	    // If the result is not vague, return it
	    if (t != "object")  {
	        return t;
	    }
	    // Otherwise, x is an object. Use the default toString( ) method to
	    // get the class value of the object.
	    var c = Object.prototype.toString.apply(x);  // Returns "[object class]"
	    c = c.substring(8, c.length-1);              // Strip off "[object" and "]"
	
	    // If the class is not a vague one, return it.
	    if (c != "Object") {
	        return c;
	    }
	    // If we get here, c is "Object".  Check to see if
	    // the value x is really just a generic object.
	    if (x.constructor == Object) {
	        return c;  // Okay the type really is "Object"
	    }
	    // For user-defined classes, look for a string-valued property named
	    // classname, that is inherited from the object's prototype
	    if ("classname" in x.constructor.prototype &&  // inherits classname
	        typeof x.constructor.prototype.classname == "string") // its a string
	        return x.constructor.prototype.classname;
	
	    // If we really can't figure it out, say so.
	    return "<unknown type>";
	}-*/;
	
	/**
	 * Creates a value of the formed expected by SVG
	 * href attribtues.
	 * @param s the identifier of the data pointed by the href.
	 * @return a value of the formed expected by SVG
	 * href attribtues.
	 */
	public static final String toUrl(String s) {
		return "url(#" + s + ")";
	}
	
	/**
	 * Tests if the underlying DOM implementation supports the specified feature
	 * @param featureName
	 * The name of the feature to test
	 * @return
	 * true if the feature is supported, false otherwise 
	 */
	public static native boolean hasFeature(String featureName) /*-{
		return $doc.implementation.hasFeature(featureName, 1.1);
	}-*/;

	/**
	 * Evaluates the specified XPath expression and returns
	 * a iterator for the selected {@link org.vectomatic.dom.svg.OMNode} node list.
	 * The expression must evaluate to a node list.
	 * @param root
	 * The element the expression is rooted at
	 * @param expr
	 * The XPath expression
	 * @param resolver
	 * A prefix resolver if the expression has prefix
	 * @return
	 * A node iterator for the selected nodes.
	 */
	public static <T extends OMNode> Iterator<T> evaluateXPath(OMElement root, String expr, XPathPrefixResolver resolver) {
		final JavaScriptObject result = evaluateNodeListXPath_(root.getElement(), expr, resolver);
		return new Iterator<T>() {
			boolean fetched;
			Node next;
			
			@Override
			public boolean hasNext() {
				if (!fetched) {
					next = iterateNext(result);
					fetched = true;
				}
				return next != null;
			}

			@Override
			public T next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				fetched = false;
				return OMNode.<T>convert(next);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
			private native Node iterateNext(JavaScriptObject result) /*-{
				return result.iterateNext();
			}-*/;			
		};

	}

	/**
	 * Evaluates the specified XPath expression and returns
	 * a iterator for the selected {@link com.google.gwt.dom.client.Node} node list.
	 * The expression must evaluate to a node list.
	 * @param root
	 * The element the expression is rooted at
	 * @param expr
	 * The XPath expression
	 * @param resolver
	 * A prefix resolver if the expression has prefix
	 * @return
	 * A node iterator for the selected nodes.
	 */
	public static <T extends Node> Iterator<T> evaluateNodeListXPath(Element root, String expr, XPathPrefixResolver resolver) {
		final JavaScriptObject result = evaluateNodeListXPath_(root, expr, resolver);
		return new Iterator<T>() {
			boolean fetched;
			T next;
			
			@Override
			public boolean hasNext() {
				if (!fetched) {
					next = iterateNext(result);
					fetched = true;
				}
				return next != null;
			}

			@Override
			public T next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				fetched = false;
				return next;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
			private native T iterateNext(JavaScriptObject result) /*-{
				return result.iterateNext();
			}-*/;			
		};
	}

	/**
	 * Evaluates the specified XPath expression and returns
	 * the matching {@link com.google.gwt.dom.client.Node} node.
	 * The expression must evaluate to a single node.
	 * @param root
	 * The element the expression is rooted at
	 * @param expr
	 * The XPath expression
	 * @param resolver
	 * A prefix resolver if the expression has prefix
	 * @return
	 * The selected node, or null if no such node exists.
	 */
	public static <T extends Node> T evaluateNodeXPath(Element root, String expr, XPathPrefixResolver resolver) {
		return (T)evaluateNodeXPath_(root, expr, resolver);
	}
	
	/**
	 * Evaluates the specified XPath expression and returns
	 * the matching {@link java.lang.String}.
	 * The expression must evaluate to a string.
	 * @param root
	 * The element the expression is rooted at
	 * @param expr
	 * The XPath expression
	 * @param resolver
	 * A prefix resolver if the expression has prefix
	 * @return
	 * The matching string, or null if no such string exists.
	 */
	public static String evaluateStringXPath(Element root, String expr, XPathPrefixResolver resolver) {
		return evaluateStringXPath_(root, expr, resolver);
	}

	/**
	 * Evaluates the specified XPath expression and returns
	 * the matching float.
	 * The expression must evaluate to a number.
	 * @param root
	 * The element the expression is rooted at
	 * @param expr
	 * The XPath expression
	 * @param resolver
	 * A prefix resolver if the expression has prefix
	 * @return
	 * The matching float, or NaN if no such number exists.
	 */
	public static float evaluateNumberXPath(Element root, String expr, XPathPrefixResolver resolver) {
		return evaluateNumberXPath_(root, expr, resolver);
	}

	/**
	 * Evaluates the specified XPath expression and returns
	 * the matching boolean.
	 * The expression must evaluate to a boolean.
	 * @param root
	 * The element the expression is rooted at
	 * @param expr
	 * The XPath expression
	 * @param resolver
	 * A prefix resolver if the expression has prefix
	 * @return
	 * The matching boolean.
	 */
	public static boolean evaluateBooleanXPath(Element root, String expr, XPathPrefixResolver resolver) {
		return evaluateBooleanXPath_(root, expr, resolver);
	}

	/**
	 * Returns an XPath expression which enables reaching the specified node
	 * from the root node
	 * @param node
	 * The node to reach
	 * @param root
	 * The root node, or null to specify the document root
	 * @return
	 * An XPath expression which enables reaching the specified node
	 * from the root node
	 */
	public static String getXPath(Node node, Node root) {
		StringBuilder builder = new StringBuilder();
		Node parentNode;
		while ((node != root) && (parentNode = node.getParentNode()) != null) {
			NodeList<Node> siblings = parentNode.getChildNodes();
			int index = 0;
			for (int i = 0, length = siblings.getLength(); i < length; i++) {
				Node sibling = siblings.getItem(i);
				if (sibling.getNodeType() == Node.ELEMENT_NODE) {
					index++;
					if (node == sibling) {
						builder.insert(0, "/*[" + index + "]");
						break;
					}
				}
			}
			node = parentNode;
		}
		return builder.toString();
	}

	private static native JavaScriptObject evaluateNodeListXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ORDERED_NODE_ITERATOR_TYPE , null);
		return result;
	}-*/;
	
	private static native Node evaluateNodeXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ANY_UNORDERED_NODE_TYPE , null);
		return result.singleNodeValue;
	}-*/;

	private static native String evaluateStringXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.STRING_TYPE , null);
		return result.stringValue;
	}-*/;

	private static native float evaluateNumberXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.NUMBER_TYPE , null);
		return result.numberValue;
	}-*/;
	
	private static native boolean evaluateBooleanXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.BOOLEAN_TYPE , null);
		return result.booleanValue;
	}-*/;
	
	/**
	 * Parses an SVG paint value. SVG paint value are
	 * used for the 'fill' and the 'stroke' SVG attributes.
	 * @param cssText
	 * The value to parse
	 * @return
	 * The resulting paint object
	 * @throws JavaScriptException
	 * If the string to parse is not a valid paint value
	 */
	public static OMSVGPaint parse(String cssText) throws JavaScriptException {
		return SVGPaintParser.INSTANCE.parse(cssText);
	}
}
