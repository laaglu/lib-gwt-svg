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

import org.w3c.dom.DOMException;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;

/**
 * Overlay class for DOM Attr
 * @author laaglu
 */
public class Attr extends Node {
	/**
	 * Constructor
	 */
	protected Attr() {
	}
    /**
     * Returns the name of this attribute. If <code>OMNode.localName</code> is 
     * different from <code>null</code>, this attribute is a qualified name.
     * @return the attribute name
     */
	public final native String getName() /*-{
	   return this.name;
	 }-*/;

    /**
     * On retrieval, the value of the attribute is returned as a string. 
     * Character and general entity references are replaced with their 
     * values. See also the method <code>getAttribute</code> on the 
     * <code>Element</code> interface.
     * <br>On setting, this creates a <code>Text</code> node with the unparsed 
     * contents of the string, i.e. any characters that an XML processor 
     * would recognize as markup are instead treated as literal text. See 
     * also the method <code>Element.setAttribute()</code>.
     * <br> Some specialized implementations, such as some [<a href='http://www.w3.org/TR/2003/REC-SVG11-20030114/'>SVG 1.1</a>] 
     * implementations, may do normalization automatically, even after 
     * mutation; in such case, the value on retrieval may differ from the 
     * value on setting.
     * @return the attribute value
     */
	public final native String getValue() /*-{
	   return this.value;
	 }-*/;

    /**
     * On retrieval, the value of the attribute is returned as a string. 
     * Character and general entity references are replaced with their 
     * values. See also the method <code>getAttribute</code> on the 
     * <code>Element</code> interface.
     * <br>On setting, this creates a <code>Text</code> node with the unparsed 
     * contents of the string, i.e. any characters that an XML processor 
     * would recognize as markup are instead treated as literal text. See 
     * also the method <code>Element.setAttribute()</code>.
     * <br> Some specialized implementations, such as some [<a href='http://www.w3.org/TR/2003/REC-SVG11-20030114/'>SVG 1.1</a>] 
     * implementations, may do normalization automatically, even after 
     * mutation; in such case, the value on retrieval may differ from the 
     * value on setting. 
     * @param value the attribute value
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly.
     */
	public final native void setValue(String value) throws JavaScriptException /*-{
	   this.value = value;
	 }-*/;

    /**
     *  Returns whether this attribute is known to be of type ID (i.e. to 
     * contain an identifier for its owner element) or not. When it is and 
     * its value is unique, the <code>ownerElement</code> of this attribute 
     * can be retrieved using the method <code>Document.getElementById</code>
     * . The implementation could use several ways to determine if an 
     * attribute node is known to contain an identifier: 
     * <ul>
     * <li> If validation 
     * occurred using an XML Schema [<a href='http://www.w3.org/TR/2001/REC-xmlschema-1-20010502/'>XML Schema Part 1</a>]
     *  while loading the document or while invoking 
     * <code>Document.normalizeDocument()</code>, the post-schema-validation 
     * infoset contributions (PSVI contributions) values are used to 
     * determine if this attribute is a schema-determined ID attribute using 
     * the <a href='http://www.w3.org/TR/2003/REC-xptr-framework-20030325/#term-sdi'>
     * schema-determined ID</a> definition in [<a href='http://www.w3.org/TR/2003/REC-xptr-framework-20030325/'>XPointer</a>]
     * . 
     * </li>
     * <li> If validation occurred using a DTD while loading the document or 
     * while invoking <code>Document.normalizeDocument()</code>, the infoset <b>[type definition]</b> value is used to determine if this attribute is a DTD-determined ID 
     * attribute using the <a href='http://www.w3.org/TR/2003/REC-xptr-framework-20030325/#term-ddi'>
     * DTD-determined ID</a> definition in [<a href='http://www.w3.org/TR/2003/REC-xptr-framework-20030325/'>XPointer</a>]
     * . 
     * </li>
     * <li> from the use of the methods <code>Element.setIdAttribute()</code>, 
     * <code>Element.setIdAttributeNS()</code>, or 
     * <code>Element.setIdAttributeNode()</code>, i.e. it is an 
     * user-determined ID attribute; 
     * <p ><b>Note:</b>  XPointer framework (see section 3.2 in [<a href='http://www.w3.org/TR/2003/REC-xptr-framework-20030325/'>XPointer</a>]
     * ) consider the DOM user-determined ID attribute as being part of the 
     * XPointer externally-determined ID definition. 
     * </li>
     * <li> using mechanisms that 
     * are outside the scope of this specification, it is then an 
     * externally-determined ID attribute. This includes using schema 
     * languages different from XML schema and DTD. 
     * </li>
     * </ul>
     * <br> If validation occurred while invoking 
     * <code>Document.normalizeDocument()</code>, all user-determined ID 
     * attributes are reset and all attribute nodes ID information are then 
     * reevaluated in accordance to the schema used. As a consequence, if 
     * the <code>Attr.schemaTypeInfo</code> attribute contains an ID type, 
     * <code>isId</code> will always return true. 
     * @since DOM Level 3
     */
	public final native boolean isId() /*-{
	 return this.isId;
	}-*/;
	
    /**
     * The <code>Element</code> node this attribute is attached to or 
     * <code>null</code> if this attribute is not in use.
     */
	public final native Element getOwnerElement() /*-{
	 return this.ownerElement;
	}-*/;

}
