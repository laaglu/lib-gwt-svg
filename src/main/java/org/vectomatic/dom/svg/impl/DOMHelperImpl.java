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
	  protected static final int EVT_FOCUSIN = 0x00001;
	  protected static final int EVT_FOCUSOUT = 0x00002;
	  protected static final int EVT_MOUSEDOWN = 0x00004;
	  protected static final int EVT_MOUSEUP = 0x00008;
	  protected static final int EVT_MOUSEOVER = 0x00010;
	  protected static final int EVT_MOUSEOUT = 0x00020;
	  protected static final int EVT_MOUSEMOVE = 0x00040;
	  protected static final int EVT_ACTIVATE = 0x00080;
	  protected static final int EVT_CLICK = 0x00100;
	  protected static final int EVT_LOAD = 0x00200;
	  protected static final int EVT_BEGIN = 0x00400;
	  protected static final int EVT_END = 0x00800;
	  protected static final int EVT_REPEAT = 0x01000;
	  protected static final int EVT_UNLOAD = 0x02000;
	  protected static final int EVT_ABORT = 0x04000;
	  protected static final int EVT_ERROR = 0x08000;
	  protected static final int EVT_RESIZE = 0x10000;
	  protected static final int EVT_SCROLL = 0x20000;
	  protected static final int EVT_ZOOM = 0x40000;
	  protected static final int EVT_LOOSECAPTURE = 0x80000;
	  protected static final int EVT_TOUCHSTART = 0x100000;
	  protected static final int EVT_TOUCHEND = 0x200000;
	  protected static final int EVT_TOUCHMOVE = 0x400000;
	  protected static final int EVT_TOUCHCANCEL = 0x800000;
	  
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

	  }-*/;
	  
	  /**
	   * Returns the bit mask which corresponds to
	   * the specified event type
	   * @param eventType The event type
	   * @return The bit mask associated to this event type
	   */
	  public native int eventGetTypeInt(String eventType) /*-{
	    switch (eventType) {
		    case "focusin": return 0x00001;
		    case "focusinout": return 0x00002;
		    case "mousedown": return 0x00004;
		    case "mouseup": return 0x00008;
		    case "mouseover": return 0x00010;
		    case "mouseout": return 0x00020;
		    case "mousemove": return 0x00040;
		    case "activate": return 0x00080;
		    case "click": return 0x00100;
		    case "load": return 0x00200;
		    case "begin": return 0x00400;
		    case "end": return 0x00800;
		    case "repeat": return 0x01000;
		    case "unload": return 0x02000;
		    case "abort": return 0x04000;
		    case "error": return 0x08000;
		    case "resize": return 0x10000;
		    case "scroll": return 0x20000;
		    case "zoom": return 0x40000;
		    case "losecapture": return 0x80000;
		    case "touchstart": return 0x100000;
		    case "touchend": return 0x200000;
		    case "touchmove": return 0x400000;
		    case "touchcancel": return 0x800000;
		    default: return 0;
	    }
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
		sinkEvents(elem, eventGetTypeInt(eventName) | getEventsSunk(elem));
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
	 * Returns the event mask for the specified element
	 * @param elem The element
	 * @return The event mask for the specified element
	 */
	public native int getEventsSunk(Element elem) /*-{
	    return elem.__eventMask || 0;
	}-*/;

	/**
	 * Changes the event mask and activates the handler
	 * for the specified element
	 * @param elem The object which emits events
	 * @param bits The event mask
	 */
	protected native void sinkEvents(Element elem, int bits) /*-{
	    var chMask = (elem.__eventMask || 0) ^ bits;
	    elem.__eventMask = bits;
	    if (!chMask) return;
	    if (chMask & 0x00001) elem.onfocusin = (bits & 0x00001) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00002) elem.onfocusout = (bits & 0x00002) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00004) elem.onmousedown = (bits & 0x00004) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00008) elem.onmouseup = (bits & 0x00008) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00010) elem.onmouseover = (bits & 0x00010) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00020) elem.onmouseout = (bits & 0x00020) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00040) elem.onmousemove = (bits & 0x00040) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00080) elem.onactivate = (bits & 0x00080) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00100) elem.onclick = (bits & 0x00100) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00200) elem.onload = (bits & 0x00200) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x00400) {
	      if (bits & 0x00400) {
	       //elem.addEventListener('begin', $wnd.__svgDispatch, false);
	       elem.setAttribute('onbegin', 'window.__svgDispatch(evt);');
	      } else {
	       //elem.removeEventListener('begin', $wnd.__svgDispatch, false);
	       elem.removeAttribute('onbegin');
	      }
	    }
	    if (chMask & 0x00800) {
	      if (bits & 0x00800) {
	       //elem.addEventListener('end', $wnd.__svgDispatch, false);
	       elem.setAttribute('onend', 'window.__svgDispatch(evt);');
	      } else {
	       //elem.removeEventListener('end', $wnd.__svgDispatch, false);
	       elem.removeAttribute('onend');
	      }
	    }
	    if (chMask & 0x01000) {
	      if (bits & 0x01000) {
	       //elem.addEventListener('repeat', $wnd.__svgDispatch, false);
	       elem.setAttribute('onrepeat', 'window.__svgDispatch(evt);');
	      } else {
	       //elem.removeEventListener('repeat', $wnd.__svgDispatch, false);
	       elem.removeAttribute('onrepeat');
	      }
	    }
	    if (chMask & 0x02000) elem.onunload = (bits & 0x02000) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x04000) elem.onabort = (bits & 0x04000) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x08000) elem.onerror = (bits & 0x08000) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x10000) elem.onresize = (bits & 0x10000) ?
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x20000) elem.onscroll  = (bits & 0x20000) ? 
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x40000) elem.onzoom = (bits & 0x40000) ? 
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x100000) elem.ontouchstart = (bits & 0x100000) ? 
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x200000) elem.ontouchend = (bits & 0x200000) ? 
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x400000) elem.ontouchmove = (bits & 0x400000) ? 
	        $wnd.__svgDispatch : null;
	    if (chMask & 0x800000) elem.ontouchcancel = (bits & 0x800000) ? 
	        $wnd.__svgDispatch : null;
	}-*/;
	
	/**
	 * Central dispatching function for events emitted by DOM objects
	 * @param event The DOM event
	 * @param node The object processing the event
	 * @param elem The object emitting the event
	 */
	public void dispatch(NativeEvent event, OMNode node, Element elem) {
		//Window.alert("type=" + event.getType());
		switch(eventGetTypeInt(event.getType())) {
			// Mouseover and mouseout deserve special treatment
			// to solve issues described in:
			// http://www.quirksmode.org/js/events_mouse.html
			// For SVG, it seems better to test against the tree rooted at
			// evt.currentTarget than againt the subtree rooted at evt.target
			case EVT_MOUSEOVER:
			case EVT_MOUSEOUT:
				if (isChildOf((Node)event.getCurrentEventTarget().cast(), (Node)event.getRelatedEventTarget().cast())) {
					return;
				}
				break;
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
			if (eventGetTypeInt(event.getType()) == EVT_LOOSECAPTURE) {
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
