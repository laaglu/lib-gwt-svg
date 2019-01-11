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

import org.vectomatic.dom.svg.OMNode;
import org.vectomatic.dom.svg.OMSVGElement;
import org.vectomatic.dom.svg.utils.XPathPrefixResolver;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.event.dom.client.LoseCaptureHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Implementation class for low-level GWT integration
 * (mostly event dispatching)
 * Xpath support for IE, based on Cameron McCormack's library
 * (http://mcc.id.au/xpathjs)
 * SVGPathSeg support for Chromium 48+, based on Philip Rogers's polyfill
 * (https://github.com/progers/pathseg/blob/master/pathseg.js)
 * @author laaglu
 */
public class DOMHelperImpl {
	  protected static boolean eventsInitialized;
	  protected OMSVGElement captureElt;
	  
	  /**
	   * Initializes the event system. Positions event handlers
	   * on the window so that they can capture events early
	   * if necessary.
	   */
	  protected native void initEventSystem() /*-{
	    $wnd.__helperImpl = this;
        $wnd.__svgDispatch = function (evt) {
            var dispatch = $wnd.__helperImpl.@org.vectomatic.dom.svg.impl.DOMHelperImpl::dispatch(Lcom/google/gwt/dom/client/NativeEvent;Lorg/vectomatic/dom/svg/OMNode;Lcom/google/gwt/dom/client/Element;);
            $entry(dispatch).call($wnd.__helperImpl, evt, evt.currentTarget.__wrapper, evt.currentTarget);
        };

        $wnd.__svgCapture = function (evt) {
            var dispatchCapturedEvent = $wnd.__helperImpl.@org.vectomatic.dom.svg.impl.DOMHelperImpl::dispatchCapturedEvent(Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/dom/client/Element;);
            $entry(dispatchCapturedEvent).call($wnd.__helperImpl, evt, evt.currentTarget);
        };

	    $wnd.addEventListener('mousedown', $wnd.__svgCapture, true);
	    $wnd.addEventListener('mouseup', $wnd.__svgCapture, true);
	    $wnd.addEventListener('mousemove', $wnd.__svgCapture, true);
	    $wnd.addEventListener('mouseover', $wnd.__svgCapture, true);
	    $wnd.addEventListener('mouseout', $wnd.__svgCapture, true);
	    $wnd.addEventListener('mousewheel', $wnd.__svgCapture, true);
	    $wnd.addEventListener('click', $wnd.__svgCapture, true);
	    $wnd.addEventListener('focusin', $wnd.__svgCapture, true);
	    $wnd.addEventListener('focusout', $wnd.__svgCapture, true);
	    $wnd.addEventListener('activate', $wnd.__svgCapture, true);
	    $wnd.addEventListener('touchstart', $wnd.__svgCapture, true);
	    $wnd.addEventListener('touchend', $wnd.__svgCapture, true);
	    $wnd.addEventListener('touchmove', $wnd.__svgCapture, true);
	    $wnd.addEventListener('touchcancel', $wnd.__svgCapture, true);
	    $wnd.addEventListener('gesturestart', $wnd.__svgCapture, true);
	    $wnd.addEventListener('gesturechange', $wnd.__svgCapture, true);
	    $wnd.addEventListener('gestureend', $wnd.__svgCapture, true);
	    $wnd.addEventListener('dragstart', $wnd.__svgCapture, true);
	    $wnd.addEventListener('drag', $wnd.__svgCapture, true);
	    $wnd.addEventListener('dragenter', $wnd.__svgCapture, true);
	    $wnd.addEventListener('dragleave', $wnd.__svgCapture, true);
	    $wnd.addEventListener('dragover', $wnd.__svgCapture, true);
	    $wnd.addEventListener('drop', $wnd.__svgCapture, true);
	    $wnd.addEventListener('dragend', $wnd.__svgCapture, true);
	  }-*/;
	  
	
	protected void init() {
		if (!eventsInitialized) {
			eventsInitialized = true;
			initEventSystem();
		}
	}
	/**
	 * Makes a node sink the events emitted by the specified element
	 * @param elem The element emitting the events
	 * @param eventName The event name
	 */
	public void bindEventListener(Element elem, String eventName) {
		init();
		sinkEvents(elem, eventName);
	}

	/**
	 * Makes a node stop sinking the events emitted by the specified element
	 * @param elem The element emitting the events
	 * @param eventName The event name
	 */
	public void unbindEventListener(Element elem, String eventName) {
		init();
		unsinkEvents(elem, eventName);
	}

	/**
	 * Returns the element which currently captures all the
	 * events after a call to {@link org.vectomatic.dom.svg.impl.DOMHelperImpl#setCaptureElement(OMSVGElement, LoseCaptureHandler)}
	 * or null if element is set to capture events
	 * @return The event capturing element
	 */
	public OMSVGElement getCaptureElement() {
		init();
		return captureElt;
	}

	/**
	 * Makes the specified element capture all the events, until
	 * a call to {@link org.vectomatic.dom.svg.impl.DOMHelperImpl#releaseCaptureElement()}
	 * terminates the capture
	 * @param captureElt The capturing element
	 * @param loseCaptureHandler A handler which will be invoked
	 * if the element loses capture
	 * @return  {@link HandlerRegistration} used to remove this handler
	 */
	public HandlerRegistration setCaptureElement(OMSVGElement captureElt, LoseCaptureHandler loseCaptureHandler) {
		init();
		this.captureElt = captureElt;
		HandlerRegistration registration = null;
		if (loseCaptureHandler != null) {
			registration = captureElt.addHandler(loseCaptureHandler, LoseCaptureEvent.getType());
		}
		return registration;
	}

	/**
	 * Stops the forwarding of all events to the capturing element
	 * specified by {@link org.vectomatic.dom.svg.impl.DOMHelperImpl#setCaptureElement(OMSVGElement, LoseCaptureHandler)}
	 */
	public void releaseCaptureElement() {
		init();
		captureElt = null;
	}
	
	/**
	 * Activate the event listener for the specified
	 * event on an element
	 * @param elem The object which emits events
	 * @param eventName The event name
	 */
	protected native void sinkEvents(Element elem, String eventName) /*-{
		elem.addEventListener(eventName, $wnd.__svgDispatch, false);
	}-*/;

	/**
	 * Deactivate the event listener for the specified
	 * event on an element
	 * @param elem The object which emits events
	 * @param eventName The event name
	 */
	protected native void unsinkEvents(Element elem, String eventName) /*-{
		elem.removeEventListener(eventName, $wnd.__svgDispatch, false);
	}-*/;

	/**
	 * Central dispatching function for events emitted by DOM objects
	 * @param event The DOM event
	 * @param node The object processing the event
	 * @param elem The object emitting the event
	 */
	public void dispatch(NativeEvent event, OMNode node, Element elem) {
		//Window.alert("type=" + event.getType());
		String eventName = event.getType();
		if ("mouseover".equals(eventName) || "mouseout".equals(eventName)) {
			// Mouseover and mouseout deserve special treatment
			// to solve issues described in:
			// http://www.quirksmode.org/js/events_mouse.html
			// For SVG, it seems better to test against the tree rooted at
			// evt.currentTarget than againt the subtree rooted at evt.target
			if (isChildOf((Node)event.getCurrentEventTarget().cast(), (Node)event.getRelatedEventTarget().cast())) {
				return;
			}
		}
		node.dispatch(event);
	}

	/**
	 * Dispatching function for events which result from a call
	 * to {@link #setCaptureElement(OMSVGElement, LoseCaptureHandler)}
	 * @param event The DOM event
	 * @param elem The object emitting the event
	 */
	public void dispatchCapturedEvent(NativeEvent event, Element elem) {
		if (captureElt != null) {
			String eventName = event.getType();
			if ("loosecapture".equals(eventName)) {
				captureElt = null;
			}
			dispatch(event, captureElt, elem);
		    event.stopPropagation();
		}
	}
	
	/**
	 * Tests if a node is part of a DOM subtree.  
	 * @param root
	 * The subtree root
	 * @param node
	 * The node to be tested
	 * @return
	 * True if the node is part of the subtree, false otherwise
	 */
	protected native boolean isChildOf(Node root, Node node) /*-{
		while (node != null && node != root && node.nodeName != 'BODY') {
			node= node.parentNode
		}
		if (node === root) {
			return true;
		}
		return false;
	}-*/;
	
	///////////////////////////////////////////////////////////////
	// XPath support
	///////////////////////////////////////////////////////////////

	public native JavaScriptObject evaluateNodeListXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result, xpath;
		if (typeof Document.prototype.evaluate !== 'function') {
			xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
			$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
			result = xpath.evaluate(svgElement, XPathResult.ORDERED_NODE_ITERATOR_TYPE);
		} else {
			result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ORDERED_NODE_ITERATOR_TYPE , null);
		}
		return result;
	}-*/;
	
	public native Node evaluateNodeXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result, xpath;
		if (typeof Document.prototype.evaluate !== 'function') {
			xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
			$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
			result = xpath.evaluate(svgElement, XPathResult.ANY_UNORDERED_NODE_TYPE);
		} else {
			result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ANY_UNORDERED_NODE_TYPE , null);
		}
		return result.singleNodeValue;
	}-*/;

	public native String evaluateStringXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result, xpath;
		if (typeof Document.prototype.evaluate !== 'function') {
			xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
			$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
			result = xpath.evaluate(svgElement, XPathResult.STRING_TYPE);
		} else {
			result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.STRING_TYPE , null);
		}
		return result.stringValue;
	}-*/;

	public native float evaluateNumberXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result, xpath;
		if (typeof Document.prototype.evaluate !== 'function') {
			xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
			$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
			result = xpath.evaluate(svgElement, XPathResult.NUMBER_TYPE);
		} else {
			result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.NUMBER_TYPE , null);
		}
		return result.numberValue;
	}-*/;
	
	public native boolean evaluateBooleanXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result, xpath;
		if (typeof Document.prototype.evaluate !== 'function') {
			xpath = new XPathExpression(expr, $wnd.xpr, $wnd.xpp);
			$wnd.xpr.gwtresolver = resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null;
			result = xpath.evaluate(svgElement, XPathResult.BOOLEAN_TYPE);
		} else {
			result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.BOOLEAN_TYPE , null);
		}
		return result.booleanValue;
	}-*/;
	
	///////////////////////////////////////////////////////////////
	// XPath shim for IE support
	// Pathseg polyfill for Chomium 48+
	// getTransformToElement polyfill for Chomium 48+
	///////////////////////////////////////////////////////////////

	public interface Resource extends ClientBundle {
		static Resource INSTANCE = GWT.create(Resource.class);
		@Source("xpath.js")
		TextResource xpath();
		@Source("pathseg.js")
		TextResource pathseg();
		@Source("getTransformToElement.js")
		TextResource getTransformToElement();
	}
	
	public DOMHelperImpl() {
		if (!hasNativeXPath()) {
			// Inject the xpath.js script in the iframe document (not
			// in the main document, otherwise the added code will not be
			// seen by the GWT code which lives in the iframe document)
			Document doc = getIFrameDocument();
			ScriptElement scriptElem = doc.createScriptElement(Resource.INSTANCE.xpath().getText());
			doc.getBody().appendChild(scriptElem);
			initXPath();
		}
		if (!hasNativePathSeg()) {
			// Inject the pathseg.js script in the main document 
			// and the iframe document
			Document doc1 = Document.get();
			ScriptElement scriptElem1 = doc1.createScriptElement(Resource.INSTANCE.pathseg().getText());
			doc1.getBody().appendChild(scriptElem1);

			Document doc2 = getIFrameDocument();
			ScriptElement scriptElem2 = doc2.createScriptElement(Resource.INSTANCE.pathseg().getText());
			doc2.getBody().appendChild(scriptElem2);
		}
		if (!hasGetTransformToElement()) {
			// Inject the getTransformToElement.js script in the main document 
			// and the iframe document
			Document doc1 = Document.get();
			ScriptElement scriptElem1 = doc1.createScriptElement(Resource.INSTANCE.getTransformToElement().getText());
			doc1.getBody().appendChild(scriptElem1);

			Document doc2 = getIFrameDocument();
			ScriptElement scriptElem2 = doc2.createScriptElement(Resource.INSTANCE.getTransformToElement().getText());
			doc2.getBody().appendChild(scriptElem2);
		}
	}

	public static native boolean hasNativeXPath() /*-{
		return typeof Document.prototype.evaluate === 'function';
	}-*/;

	public static native boolean hasNativePathSeg() /*-{
		return typeof SVGPathSeg === 'function';
	}-*/;
	
	public static native boolean hasGetTransformToElement() /*-{
		return 'getTransformToElement' in SVGSVGElement.prototype;
	}-*/;

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

}
