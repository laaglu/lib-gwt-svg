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
import com.google.gwt.dom.client.Document;

/**
 * Wrapper class for DOM Document
 * @author laaglu
 */
@Deprecated
public class OMDocument extends OMNode {
	/**
	 * Constructor
	 * @param document The wrapped document
	 */
	protected OMDocument(Document document) {
		super(document);
	}
	
	/**
	 * Returns the wrapped {@link com.google.gwt.dom.client.Document}
	 * @return the wrapped {@link com.google.gwt.dom.client.Document}
	 */
	public Document getDocument() {
		return ot.cast();
	}

	// Implementation of the dom::Document W3C IDL interface
	
    /**
     * Creates an {@link OMElement} of the given qualified name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the 
     * namespaceURI parameter for methods if they wish to have no namespace.
     * @param namespaceURI The namespace URI of the element to create.
     * @param qualifiedName The qualified name of the element type to 
     *   instantiate.
     * @return A new {@link OMElement} object with the following 
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
	public final OMElement createElementNS(String namespaceURI, String qualifiedName) throws JavaScriptException {
	  return OMNode.convert(DOMHelper.createElementNS(((Document)ot), namespaceURI, qualifiedName));
	}
	/**
	 * Creates a new {@link OMText} node and initializes it
	 * with the specified data. The node is not attached to the
	 * DOM tree.
	 * @param data The string to initialize the text node
	 * @return The newly created {@link OMText} node
	 */
	public final OMText createTextNode(String data) {
	  return OMNode.convert(((Document)ot).createTextNode(data));
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
	    return OMNode.convertList(((Document)ot).getElementsByTagName(tagname));
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
	    return OMNode.convertList(DOMHelper.getElementsByTagNameNS(((Document)ot), namespaceURI, localName));
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
		return OMNode.<T>convert(((Document)ot).getElementById(elementId));
	}
	
    /**
     * This is a convenience attribute that allows direct access to the child 
     * node that is the document element of the document.
     */
	public final OMElement getDocumentElement() {
		return OMNode.convert(((Document)ot).getDocumentElement());
	}

	
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
     * set to <code>true</code> on the generated {@link OMAttr}. The 
     * descendants of the source {@link OMAttr} are recursively imported 
     * and the resulting nodes reassembled to form the corresponding subtree.
     * Note that the <code>deep</code> parameter has no effect on 
     * {@link OMAttr} nodes; they always carry their children with them 
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
     * {@link OMAttr} nodes are attached to the generated 
     * {@link OMElement}. Default attributes are <em>not</em> copied, though if the document being imported into defines default 
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
     * @param importedNode The node to import.
     * @param deep If <code>true</code>, recursively import the subtree under 
     *   the specified node; if <code>false</code>, import only the node 
     *   itself, as explained above. This has no effect on nodes that cannot 
     *   have any children, and on {@link OMAttr}, and 
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
	public final OMNode importNode(OMNode importedNode, boolean deep) {
		return OMNode.convert(DOMHelper.importNode(((Document)ot), importedNode.getNode(), deep));
	}
}
