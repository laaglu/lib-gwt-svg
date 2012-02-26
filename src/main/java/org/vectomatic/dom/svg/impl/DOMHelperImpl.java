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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.event.dom.client.LoseCaptureHandler;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * Implementation class for low-level GWT integration
 * (mostly event dispatching)
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
	    $wnd.__svgDispatch = function(evt) {
	        $wnd.__helperImpl.@org.vectomatic.dom.svg.impl.DOMHelperImpl::dispatch(Lcom/google/gwt/dom/client/NativeEvent;Lorg/vectomatic/dom/svg/OMNode;Lcom/google/gwt/dom/client/Element;)(evt, evt.currentTarget.__wrapper, evt.currentTarget);
	    };
  
	    $wnd.__svgCapture = function(evt) {
	        $wnd.__helperImpl.@org.vectomatic.dom.svg.impl.DOMHelperImpl::dispatchCapturedEvent(Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/dom/client/Element;)(evt, evt.currentTarget);
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
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ORDERED_NODE_ITERATOR_TYPE , null);
		return result;
	}-*/;
	
	public native Node evaluateNodeXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.ANY_UNORDERED_NODE_TYPE , null);
		return result.singleNodeValue;
	}-*/;

	public native String evaluateStringXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.STRING_TYPE , null);
		return result.stringValue;
	}-*/;

	public native float evaluateNumberXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.NUMBER_TYPE , null);
		return result.numberValue;
	}-*/;
	
	public native boolean evaluateBooleanXPath_(Element svgElement, String expr, XPathPrefixResolver resolver) /*-{
		var result = svgElement.ownerDocument.evaluate(expr, svgElement, resolver ? function(prefix) { return resolver.@org.vectomatic.dom.svg.utils.XPathPrefixResolver::resolvePrefix(Ljava/lang/String;)(prefix); } : null, XPathResult.BOOLEAN_TYPE , null);
		return result.booleanValue;
	}-*/;
	
}
