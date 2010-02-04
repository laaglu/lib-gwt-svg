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
package org.vectomatic.dom.svg.utils;

import org.vectomatic.dom.svg.OMNode;
import org.vectomatic.dom.svg.impl.DOMHelperImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Text;

public class DOMHelper {
	private static final DOMHelperImpl impl = GWT.create(DOMHelperImpl.class);
	
	public static final native Element createElementNS(Document document, String namespaceURI, String qualifiedName) /*-{
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

	public static final native Document createElementNS(String uri, String qname) /*-{
		return $doc.createElementNS(uri, qname);
	}-*/;

	/**
	 * Patch GWT Document.importNode, which fails to return the imported nodes
	 */
	public static final native Node importNode(Document doc, Node node, boolean deep) /*-{
		return doc.importNode(node, deep);
	}-*/;
	
	public static final native void normalize(Node node) /*-{
		return node.normalize();
	}-*/;

	public static final native String substringData(Text text, int offset, int count) /*-{
	  return text.substringData(offset, count);
	}-*/;

	public static final native void appendData(Text text, String arg) /*-{
	  text.appendData(offset, arg);
	}-*/;
	
	public static final native NodeList<? extends Node> getElementsByTagNameNS(Element elem, String namespaceURI, String localName) /*-{
	  return elem.getElementsByTagNameNS(namespaceURI, localName);
	}-*/;
	
	public static final native NodeList<? extends Node> getElementsByTagNameNS(Document doc, String namespaceURI, String localName) /*-{
	  return doc.getElementsByTagNameNS(namespaceURI, localName);
	}-*/;

	public static final native Document getCurrentDocument() /*-{
	  return $doc;
	}-*/;

	public static void bindEventListener(OMNode source, Element elem, String eventName) {
		impl.bindEventListener(source, elem, eventName);
	}
	
	// Function getType is borrowed from: 
	// JavaScript: The Definitive Guide, 5th Edition
	// By David Flanagan
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

}
