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
package org.vectomatic.dom.svg.utils;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.vectomatic.dom.svg.OMElement;
import org.vectomatic.dom.svg.OMNode;
import org.vectomatic.dom.svg.OMSVGElement;
import org.vectomatic.dom.svg.impl.DOMHelperImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Text;
import com.google.gwt.event.dom.client.LoseCaptureHandler;
import com.google.gwt.event.shared.HandlerRegistration;

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
	
	public static final native String getAttributeNS(Element elem, String namespaceURI, String localName) /*-{
	  return elem.getAttributeNS(namespaceURI, localName);
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
	
	public static OMSVGElement getCaptureElement() {
		return impl.getCaptureElement();
	}
	public static HandlerRegistration setCaptureElement(OMSVGElement element, LoseCaptureHandler loseCaptureHandler) {
		return impl.setCaptureElement(element, loseCaptureHandler);
	}
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
	 * Evaluates the specified XPath expression
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
		final JavaScriptObject result = evaluateXPath_(root.getElement(), expr, resolver);
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

	private static native JavaScriptObject evaluateXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ORDERED_NODE_ITERATOR_TYPE , null);
		return result;
	}-*/;


}
