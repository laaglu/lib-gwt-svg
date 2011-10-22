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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.utils.XPathPrefixResolver;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


/**
 * Xpath support for IE, based on Cameron McCormack's library
 * (http://mcc.id.au/xpathjs)
 */
public class DOMHelperImplIE extends DOMHelperImpl {
	public interface Resource extends ClientBundle {
		static Resource INSTANCE = GWT.create(Resource.class);
		@Source("xpath.js")
		TextResource xpath();
	}
	
	public DOMHelperImplIE() {
		// Inject the xpath.js script in the iframe document (not
		// in the main document, otherwise the added code will not be
		// seen by the GWT code which lives in the iframe document)
		Document doc = getIFrameDocument();
		ScriptElement scriptElem = doc.createScriptElement(Resource.INSTANCE.xpath().getText());
		doc.getBody().appendChild(scriptElem);
		initXPath();
	}
	
	protected native void initXPath() /*-{
		$wnd.xpp = new XPathParser();
		
		// Create a custom namespace resolver
		SvgNamespaceResolver.prototype = new NamespaceResolver();
		SvgNamespaceResolver.prototype.constructor = SvgNamespaceResolver;
		SvgNamespaceResolver.superclass = NamespaceResolver.prototype;
		function SvgNamespaceResolver() {
			this.gwtresolver = null;
		}
		
		SvgNamespaceResolver.prototype.getNamespace = function(prefix, n) {
		  var ns = null;
		  if (this.gwtresolver != null) {
		    ns = this.gwtresolver(prefix);
		  }
		  if (ns == null) {
		  	ns = n.namespaceURI;
		  }
		  if (ns == null) {
		  	ns = SvgNamespaceResolver.superclass.getNamespace(prefix, n);
		  }
		  return ns;
		};
		$wnd.xpr = new SvgNamespaceResolver();
	}-*/;
	
	public static native Document getIFrameDocument() /*-{
		return document;
	}-*/;

	@Override
	public native JavaScriptObject evaluateNodeListXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
		$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
		var result = xpath.evaluate(svgElement, XPathResult.ORDERED_NODE_ITERATOR_TYPE);
		return result;
	}-*/;
	
	@Override
	public native Node evaluateNodeXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
		$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
		var result = xpath.evaluate(svgElement, XPathResult.ANY_UNORDERED_NODE_TYPE);
		return result.singleNodeValue;
	}-*/;
	
	@Override
	public native String evaluateStringXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
		$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
		var result = xpath.evaluate(svgElement, XPathResult.STRING_TYPE);
		return result.stringValue;
	}-*/;
	
	@Override
	public native float evaluateNumberXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
		$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
		var result = xpath.evaluate(svgElement, XPathResult.NUMBER_TYPE);
		return result.numberValue;
	}-*/;
	
	@Override
	public native boolean evaluateBooleanXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
		$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
		var result = xpath.evaluate(svgElement, XPathResult.BOOLEAN_TYPE);
		return result.booleanValue;
	}-*/;

}
