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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMNode;
import org.vectomatic.dom.svg.OMSVGElement;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.event.dom.client.LoseCaptureHandler;
import com.google.gwt.event.shared.HandlerRegistration;

public class DOMHelperImpl {
	  protected static boolean eventsInitialized;
	  private static final int EVT_FOCUSIN = 0x00001;
	  private static final int EVT_FOCUSOUT = 0x00002;
	  private static final int EVT_MOUSEDOWN = 0x00004;
	  private static final int EVT_MOUSEUP = 0x00008;
	  private static final int EVT_MOUSEOVER = 0x00010;
	  private static final int EVT_MOUSEOUT = 0x00020;
	  private static final int EVT_MOUSEMOVE = 0x00040;
	  private static final int EVT_ACTIVATE = 0x00080;
	  private static final int EVT_CLICK = 0x00100;
	  private static final int EVT_LOAD = 0x00200;
	  private static final int EVT_BEGIN = 0x00400;
	  private static final int EVT_END = 0x00800;
	  private static final int EVT_REPEAT = 0x01000;
	  private static final int EVT_UNLOAD = 0x02000;
	  private static final int EVT_ABORT = 0x04000;
	  private static final int EVT_ERROR = 0x08000;
	  private static final int EVT_RESIZE = 0x10000;
	  private static final int EVT_SCROLL = 0x20000;
	  private static final int EVT_ZOOM = 0x40000;
	  private static final int EVT_LOOSECAPTURE = 0x80000;
	  
	  @SuppressWarnings("unused")
	  private static JavaScriptObject svgHandler;
	  
	  @SuppressWarnings("unused")
	  private static JavaScriptObject svgCaptureHandler;

	  private OMSVGElement captureElt;
	  
	  protected native void initEventSystem() /*-{
	    $wnd.__helperImpl = this;
  
	    @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler = function(evt) {
	        $wnd.__helperImpl.@org.vectomatic.dom.svg.impl.DOMHelperImpl::dispatch(Lcom/google/gwt/dom/client/NativeEvent;Lorg/vectomatic/dom/svg/OMNode;Lcom/google/gwt/dom/client/Element;)(evt, evt.currentTarget.__wrapper, evt.currentTarget);
	    };

	    @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler = function(evt) {
	        $wnd.__helperImpl.@org.vectomatic.dom.svg.impl.DOMHelperImpl::dispatchCapturedEvent(Lcom/google/gwt/dom/client/NativeEvent;Lcom/google/gwt/dom/client/Element;)(evt, evt.currentTarget);
	    };

	    $wnd.addEventListener('mousedown', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);
	    $wnd.addEventListener('mouseup', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);
	    $wnd.addEventListener('mousemove', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);
	    $wnd.addEventListener('mouseover', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);
	    $wnd.addEventListener('mouseout', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);
	    $wnd.addEventListener('mousewheel', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);
	    $wnd.addEventListener('click', @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgCaptureHandler, true);

	  }-*/;
	  
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
		    default: return 0;
	    }
	  }-*/;
	
	private void init() {
		if (!eventsInitialized) {
			eventsInitialized = true;
			initEventSystem();
		}
	}
	public void bindEventListener(OMNode source, Element elem, String eventName) {
		init();
		sinkEvents(source, elem, eventGetTypeInt(eventName) | getEventsSunk(elem));
	}
	public OMSVGElement getCaptureElement() {
		init();
		return captureElt;
	}

	public HandlerRegistration setCaptureElement(OMSVGElement captureElt, LoseCaptureHandler loseCaptureHandler) {
		init();
		this.captureElt = captureElt;
		HandlerRegistration registration = null;
		if (loseCaptureHandler != null) {
			registration = captureElt.addHandler(loseCaptureHandler, LoseCaptureEvent.getType());
		}
		return registration;
	}

	public void releaseCaptureElement() {
		init();
		captureElt = null;
	}
	
	public native int getEventsSunk(Element elem) /*-{
	    return elem.__eventMask || 0;
	}-*/;

	protected native void sinkEvents(OMNode source, Element elem, int bits) /*-{
	    elem.__wrapper = source;
	    var chMask = (elem.__eventMask || 0) ^ bits;
	    elem.__eventMask = bits;
	    if (!chMask) return;
	   
	    if (chMask & 0x00001) elem.onfocusin       = (bits & 0x00001) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00002) elem.onfocusout    = (bits & 0x00002) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00004) elem.onmousedown   = (bits & 0x00004) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00008) elem.onmouseup     = (bits & 0x00008) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00010) elem.onmouseover   = (bits & 0x00010) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00020) elem.onmouseout    = (bits & 0x00020) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00040) elem.onmousemove   = (bits & 0x00040) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00080) elem.onactivate     = (bits & 0x00080) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00100) elem.onclick    = (bits & 0x00100) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00200) elem.onload       = (bits & 0x00200) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00400) elem.onbegin      = (bits & 0x00400) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x00800) elem.onend       = (bits & 0x00800) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x01000) elem.onrepeat        = (bits & 0x01000) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x02000) elem.onunload = (bits & 0x02000) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x04000) elem.onabort      = (bits & 0x04000) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x08000) elem.onerror       = (bits & 0x08000) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x10000) elem.onresize       = (bits & 0x10000) ?
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x20000) elem.onscroll  = (bits & 0x20000) ? 
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	    if (chMask & 0x40000) elem.onzoom = (bits & 0x40000) ? 
	        @org.vectomatic.dom.svg.impl.DOMHelperImpl::svgHandler : null;
	}-*/;
	
	public void dispatch(NativeEvent event, OMNode node, Element elem) {
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
	    DomEvent.fireNativeEvent(event, node, elem);
	}

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
		while (node != root && node.nodeName != 'BODY') {
			node= node.parentNode
		}
		if (node === root) {
			return true;
		}
		return false;
	}-*/;

}
