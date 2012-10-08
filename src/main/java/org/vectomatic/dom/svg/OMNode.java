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
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.FocusWidget;

/**
 * Wrapper class for DOM Node. Wrapper classes decorate native
 * DOM objects with java-like capabilities: capability to implement
 * interfaces, notably event handler interfaces.
 * @author laaglu
 * @author Michael Allan
 */
public class OMNode extends FocusWidget {
	/**
	 * The DOM native overlay type wrapped by this object
	 */
	protected final Node ot;

	/**
	 * Constructor
	 * @param node The node to wrap
	 */
	protected OMNode(Node node) {
		this.ot = node;
		
		setElement(Element.as(node));
		setTabIndex(0);
	}
	
	@Override
	protected void onDetach() {
	  cleanup();
	  super.onDetach();
	}
	
	@Deprecated
	private static native OMNode getWrapper(Node node) /*-{ 
		return node.__wrapper; 
	}-*/;
	
	@Deprecated
	private void cleanup() {
	  setWrapper(ot, null);
	}
	
	@Deprecated
  private static native void setWrapper(Node node, OMNode wrapper) /*-{
    node.__wrapper = wrapper;
  }-*/;
	
	/**
	 * Dispatches the specified event to this node
	 * event handlers
	 * @param event The event to dispatch
	 */
	@Deprecated
	public void dispatch(NativeEvent event) {
		// This call wraps the native event into a DomEvent
		// and invokes fireEvent
	    System.out.println("OMNNode.dispatch(): event=" + event);
	    DomEvent.fireNativeEvent(event, this, (Element)event.getCurrentEventTarget().cast());
	}

	@Deprecated
	private static class Conversion<T extends OMNode> {
	  
		static {
			initialize();
		}
		
		@Deprecated
		private static final native void initialize() /*-{
			if ($wnd.otToWrapper == null) {
		    	$wnd.otToWrapper = new Object();
		    }
			$wnd.otToWrapper["SVGAElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAElement::new(Lorg/vectomatic/dom/svg/impl/SVGAElement;)(elem); };
			$wnd.otToWrapper["SVGAltGlyphDefElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAltGlyphDefElement::new(Lorg/vectomatic/dom/svg/impl/SVGAltGlyphDefElement;)(elem); };
			$wnd.otToWrapper["SVGAltGlyphElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAltGlyphElement::new(Lorg/vectomatic/dom/svg/impl/SVGAltGlyphElement;)(elem); };
			$wnd.otToWrapper["SVGAltGlyphItemElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAltGlyphItemElement::new(Lorg/vectomatic/dom/svg/impl/SVGAltGlyphItemElement;)(elem); };
			$wnd.otToWrapper["SVGAnimateColorElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAnimateColorElement::new(Lorg/vectomatic/dom/svg/impl/SVGAnimateColorElement;)(elem); };
			$wnd.otToWrapper["SVGAnimateElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAnimateElement::new(Lorg/vectomatic/dom/svg/impl/SVGAnimateElement;)(elem); };
			$wnd.otToWrapper["SVGAnimateMotionElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAnimateMotionElement::new(Lorg/vectomatic/dom/svg/impl/SVGAnimateMotionElement;)(elem); };
			$wnd.otToWrapper["SVGAnimateTransformElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGAnimateTransformElement::new(Lorg/vectomatic/dom/svg/impl/SVGAnimateTransformElement;)(elem); };
			$wnd.otToWrapper["SVGCircleElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGCircleElement::new(Lorg/vectomatic/dom/svg/impl/SVGCircleElement;)(elem); };
			$wnd.otToWrapper["SVGClipPathElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGClipPathElement::new(Lorg/vectomatic/dom/svg/impl/SVGClipPathElement;)(elem); };
			$wnd.otToWrapper["SVGColorProfileElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGColorProfileElement::new(Lorg/vectomatic/dom/svg/impl/SVGColorProfileElement;)(elem); };
			$wnd.otToWrapper["SVGCursorElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGCursorElement::new(Lorg/vectomatic/dom/svg/impl/SVGCursorElement;)(elem); };
			$wnd.otToWrapper["SVGDefsElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGDefsElement::new(Lorg/vectomatic/dom/svg/impl/SVGDefsElement;)(elem); };
			$wnd.otToWrapper["SVGDescElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGDescElement::new(Lorg/vectomatic/dom/svg/impl/SVGDescElement;)(elem); };
			$wnd.otToWrapper["SVGDocument"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGDocument::new(Lorg/vectomatic/dom/svg/impl/SVGDocument;)(elem); };
			$wnd.otToWrapper["SVGEllipseElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGEllipseElement::new(Lorg/vectomatic/dom/svg/impl/SVGEllipseElement;)(elem); };
			$wnd.otToWrapper["SVGFEBlendElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEBlendElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEBlendElement;)(elem); };
			$wnd.otToWrapper["SVGFEColorMatrixElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEColorMatrixElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEColorMatrixElement;)(elem); };
			$wnd.otToWrapper["SVGFEComponentTransferElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEComponentTransferElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEComponentTransferElement;)(elem); };
			$wnd.otToWrapper["SVGFECompositeElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFECompositeElement::new(Lorg/vectomatic/dom/svg/impl/SVGFECompositeElement;)(elem); };
			$wnd.otToWrapper["SVGFEConvolveMatrixElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEConvolveMatrixElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEConvolveMatrixElement;)(elem); };
			$wnd.otToWrapper["SVGFEDiffuseLightingElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEDiffuseLightingElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEDiffuseLightingElement;)(elem); };
			$wnd.otToWrapper["SVGFEDisplacementMapElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEDisplacementMapElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEDisplacementMapElement;)(elem); };
			$wnd.otToWrapper["SVGFEDistantLightElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEDistantLightElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEDistantLightElement;)(elem); };
			$wnd.otToWrapper["SVGFEFloodElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEFloodElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEFloodElement;)(elem); };
			$wnd.otToWrapper["SVGFEFuncAElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEFuncAElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEFuncAElement;)(elem); };
			$wnd.otToWrapper["SVGFEFuncBElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEFuncBElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEFuncBElement;)(elem); };
			$wnd.otToWrapper["SVGFEFuncGElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEFuncGElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEFuncGElement;)(elem); };
			$wnd.otToWrapper["SVGFEFuncRElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEFuncRElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEFuncRElement;)(elem); };
			$wnd.otToWrapper["SVGFEGaussianBlurElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEGaussianBlurElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEGaussianBlurElement;)(elem); };
			$wnd.otToWrapper["SVGFEImageElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEImageElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEImageElement;)(elem); };
			$wnd.otToWrapper["SVGFEMergeElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEMergeElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEMergeElement;)(elem); };
			$wnd.otToWrapper["SVGFEMergeNodeElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEMergeNodeElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEMergeNodeElement;)(elem); };
			$wnd.otToWrapper["SVGFEMorphologyElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEMorphologyElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEMorphologyElement;)(elem); };
			$wnd.otToWrapper["SVGFEOffsetElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEOffsetElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEOffsetElement;)(elem); };
			$wnd.otToWrapper["SVGFEPointLightElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFEPointLightElement::new(Lorg/vectomatic/dom/svg/impl/SVGFEPointLightElement;)(elem); };
			$wnd.otToWrapper["SVGFESpecularLightingElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFESpecularLightingElement::new(Lorg/vectomatic/dom/svg/impl/SVGFESpecularLightingElement;)(elem); };
			$wnd.otToWrapper["SVGFESpotLightElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFESpotLightElement::new(Lorg/vectomatic/dom/svg/impl/SVGFESpotLightElement;)(elem); };
			$wnd.otToWrapper["SVGFETileElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFETileElement::new(Lorg/vectomatic/dom/svg/impl/SVGFETileElement;)(elem); };
			$wnd.otToWrapper["SVGFETurbulenceElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFETurbulenceElement::new(Lorg/vectomatic/dom/svg/impl/SVGFETurbulenceElement;)(elem); };
			$wnd.otToWrapper["SVGFilterElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFilterElement::new(Lorg/vectomatic/dom/svg/impl/SVGFilterElement;)(elem); };
			$wnd.otToWrapper["SVGFontElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFontElement::new(Lorg/vectomatic/dom/svg/impl/SVGFontElement;)(elem); };
			$wnd.otToWrapper["SVGFontFaceElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFontFaceElement::new(Lorg/vectomatic/dom/svg/impl/SVGFontFaceElement;)(elem); };
			$wnd.otToWrapper["SVGFontFaceFormatElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFontFaceFormatElement::new(Lorg/vectomatic/dom/svg/impl/SVGFontFaceFormatElement;)(elem); };
			$wnd.otToWrapper["SVGFontFaceNameElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFontFaceNameElement::new(Lorg/vectomatic/dom/svg/impl/SVGFontFaceNameElement;)(elem); };
			$wnd.otToWrapper["SVGFontFaceSrcElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFontFaceSrcElement::new(Lorg/vectomatic/dom/svg/impl/SVGFontFaceSrcElement;)(elem); };
			$wnd.otToWrapper["SVGFontFaceUriElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGFontFaceUriElement::new(Lorg/vectomatic/dom/svg/impl/SVGFontFaceUriElement;)(elem); };
			$wnd.otToWrapper["SVGForeignObjectElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGForeignObjectElement::new(Lorg/vectomatic/dom/svg/impl/SVGForeignObjectElement;)(elem); };
			$wnd.otToWrapper["SVGGElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGGElement::new(Lorg/vectomatic/dom/svg/impl/SVGGElement;)(elem); };
			$wnd.otToWrapper["SVGGlyphElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGGlyphElement::new(Lorg/vectomatic/dom/svg/impl/SVGGlyphElement;)(elem); };
			$wnd.otToWrapper["SVGGlyphRefElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGGlyphRefElement::new(Lorg/vectomatic/dom/svg/impl/SVGGlyphRefElement;)(elem); };
			$wnd.otToWrapper["SVGHKernElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGHKernElement::new(Lorg/vectomatic/dom/svg/impl/SVGHKernElement;)(elem); };
			$wnd.otToWrapper["SVGImageElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGImageElement::new(Lorg/vectomatic/dom/svg/impl/SVGImageElement;)(elem); };
			$wnd.otToWrapper["SVGLinearGradientElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGLinearGradientElement::new(Lorg/vectomatic/dom/svg/impl/SVGLinearGradientElement;)(elem); };
			$wnd.otToWrapper["SVGLineElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGLineElement::new(Lorg/vectomatic/dom/svg/impl/SVGLineElement;)(elem); };
			$wnd.otToWrapper["SVGMarkerElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGMarkerElement::new(Lorg/vectomatic/dom/svg/impl/SVGMarkerElement;)(elem); };
			$wnd.otToWrapper["SVGMaskElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGMaskElement::new(Lorg/vectomatic/dom/svg/impl/SVGMaskElement;)(elem); };
			$wnd.otToWrapper["SVGMetadataElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGMetadataElement::new(Lorg/vectomatic/dom/svg/impl/SVGMetadataElement;)(elem); };
			$wnd.otToWrapper["SVGMissingGlyphElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGMissingGlyphElement::new(Lorg/vectomatic/dom/svg/impl/SVGMissingGlyphElement;)(elem); };
			$wnd.otToWrapper["SVGMPathElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGMPathElement::new(Lorg/vectomatic/dom/svg/impl/SVGMPathElement;)(elem); };
			$wnd.otToWrapper["SVGPathElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGPathElement::new(Lorg/vectomatic/dom/svg/impl/SVGPathElement;)(elem); };
			$wnd.otToWrapper["SVGPatternElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGPatternElement::new(Lorg/vectomatic/dom/svg/impl/SVGPatternElement;)(elem); };
			$wnd.otToWrapper["SVGPolygonElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGPolygonElement::new(Lorg/vectomatic/dom/svg/impl/SVGPolygonElement;)(elem); };
			$wnd.otToWrapper["SVGPolylineElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGPolylineElement::new(Lorg/vectomatic/dom/svg/impl/SVGPolylineElement;)(elem); };
			$wnd.otToWrapper["SVGRadialGradientElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGRadialGradientElement::new(Lorg/vectomatic/dom/svg/impl/SVGRadialGradientElement;)(elem); };
			$wnd.otToWrapper["SVGRectElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGRectElement::new(Lorg/vectomatic/dom/svg/impl/SVGRectElement;)(elem); };
			$wnd.otToWrapper["SVGRectElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGRectElement::new(Lorg/vectomatic/dom/svg/impl/SVGRectElement;)(elem); };
			$wnd.otToWrapper["SVGScriptElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGScriptElement::new(Lorg/vectomatic/dom/svg/impl/SVGScriptElement;)(elem); };
			$wnd.otToWrapper["SVGSetElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGSetElement::new(Lorg/vectomatic/dom/svg/impl/SVGSetElement;)(elem); };
			$wnd.otToWrapper["SVGStopElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGStopElement::new(Lorg/vectomatic/dom/svg/impl/SVGStopElement;)(elem); };
			$wnd.otToWrapper["SVGStyleElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGStyleElement::new(Lorg/vectomatic/dom/svg/impl/SVGStyleElement;)(elem); };
			$wnd.otToWrapper["SVGSVGElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGSVGElement::new(Lorg/vectomatic/dom/svg/impl/SVGSVGElement;)(elem); };
			$wnd.otToWrapper["SVGSwitchElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGSwitchElement::new(Lorg/vectomatic/dom/svg/impl/SVGSwitchElement;)(elem); };
			$wnd.otToWrapper["SVGSymbolElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGSymbolElement::new(Lorg/vectomatic/dom/svg/impl/SVGSymbolElement;)(elem); };
			$wnd.otToWrapper["SVGTextElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGTextElement::new(Lorg/vectomatic/dom/svg/impl/SVGTextElement;)(elem); };
			$wnd.otToWrapper["SVGTextPathElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGTextPathElement::new(Lorg/vectomatic/dom/svg/impl/SVGTextPathElement;)(elem); };
			$wnd.otToWrapper["SVGTitleElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGTitleElement::new(Lorg/vectomatic/dom/svg/impl/SVGTitleElement;)(elem); };
			$wnd.otToWrapper["SVGTRefElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGTRefElement::new(Lorg/vectomatic/dom/svg/impl/SVGTRefElement;)(elem); };
			$wnd.otToWrapper["SVGTSpanElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGTSpanElement::new(Lorg/vectomatic/dom/svg/impl/SVGTSpanElement;)(elem); };
			$wnd.otToWrapper["SVGUseElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGUseElement::new(Lorg/vectomatic/dom/svg/impl/SVGUseElement;)(elem); };
			$wnd.otToWrapper["SVGViewElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGViewElement::new(Lorg/vectomatic/dom/svg/impl/SVGViewElement;)(elem); };
			$wnd.otToWrapper["SVGVKernElement"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGVKernElement::new(Lorg/vectomatic/dom/svg/impl/SVGVKernElement;)(elem); };
		}-*/;
		
		T result;
		Conversion(Node node) {
			convert(node);
		}
		
		@Deprecated
		private final native void convert(Node node) /*-{
			var wrapper = null;
			if (node != null) {
			    var type = @org.vectomatic.dom.svg.utils.DOMHelper::getType(Lcom/google/gwt/core/client/JavaScriptObject;)(node);
			    if (type) {
			    	var ctor = $wnd.otToWrapper[type];
			    	if (ctor != null) {
		    			wrapper = ctor(node);
			    	} else {
			    		if (node.nodeType == 1) {
			    			wrapper = @org.vectomatic.dom.svg.OMElement::new(Lcom/google/gwt/dom/client/Element;)(node);
			    		} else if (node.nodeType == 2) {
			    			wrapper = @org.vectomatic.dom.svg.OMAttr::new(Lorg/vectomatic/dom/svg/impl/Attr;)(node);
			    		} else if (node.nodeType == 3) {
			    			wrapper = @org.vectomatic.dom.svg.OMText::new(Lcom/google/gwt/dom/client/Text;)(node);
			    		} else if (node.nodeType == 9) {
							  wrapper = @org.vectomatic.dom.svg.OMSVGDocument::new(Lorg/vectomatic/dom/svg/impl/SVGDocument;)(node);
			    		} else {
			    			wrapper = @org.vectomatic.dom.svg.OMNode::new(Lcom/google/gwt/dom/client/Node;)(node);
			    		}
			    	}
			    }
			}
	        this.@org.vectomatic.dom.svg.OMNode.Conversion::result = wrapper;
	    }-*/;
	}
	
	/**
	 * Returns the wrapper for the specified overlay type node, automatically constructing
	 * a new wrapper if the node was previously unwrapped.
	 * @param <T> the node type
	 * @param obj The overlay type node
	 * @return The node wrapper
	 */
	@Deprecated
	public static <T extends OMNode> T convert(Node obj) {
		// Misleading to parametize by T here, because we cannot guarantee type safety.
		// The explicit cast below is liable to failure, and so is the implicit cast in
		// Conversion.  Instead we might try overloading the convert methods, as with a
		// convert(Element) that safely casts to OMElement.  (Later)
		@SuppressWarnings("unchecked") T wrapper = (T)getWrapper(obj);
		if (wrapper == null) wrapper = new Conversion<T>(obj).result;
		return wrapper;
	}
	
	@Deprecated
	private static class ListConversion<T extends Iterable<? extends OMNode>> {
		static {
			initialize();
		}
		
		@Deprecated
		private static final native void initialize() /*-{
			if ($wnd.otToWrapper == null) {
		    	$wnd.otToWrapper = new Object();
		    }
			$wnd.otToWrapper["NodeList"] = function(elem) { return @org.vectomatic.dom.svg.OMNodeList::new(Lcom/google/gwt/dom/client/NodeList;)(elem); };
			$wnd.otToWrapper["SVGLengthList"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGLengthList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(elem); };
			$wnd.otToWrapper["SVGNumberList"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGNumberList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(elem); };
			$wnd.otToWrapper["SVGPathSegList"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGPathSegList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(elem); };
			$wnd.otToWrapper["SVGPointList"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGPointList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(elem); };
			$wnd.otToWrapper["SVGStringList"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGStringList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(elem); };
			$wnd.otToWrapper["SVGTransformList"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGTransformList::new(Lcom/google/gwt/core/client/JavaScriptObject;)(elem); };
		}-*/;
		T result;
		ListConversion(JavaScriptObject list) {
			convert(list);
		}
		
		@Deprecated
		private final native void convert(JavaScriptObject list) /*-{
			var wrapper = null;
		    var type = @org.vectomatic.dom.svg.utils.DOMHelper::getType(Lcom/google/gwt/core/client/JavaScriptObject;)(list);
		    if (type) {
		    	var ctor = $wnd.otToWrapper[type];
		    	if (ctor != null) {
	    			wrapper = ctor(list);
		    	}
		    }
	        this.@org.vectomatic.dom.svg.OMNode.ListConversion::result = wrapper;
	    }-*/;
	}
	
	/**
	 * Generates a wrapper around an overlay type list
	 * @param <T> the list type
	 * @param obj The overlay type list
	 * @return The list wrapper
	 */
	@Deprecated
	public static <T extends Iterable<? extends OMNode>> T convertList(JavaScriptObject obj) {
		return new ListConversion<T>(obj).result;
	}

	/**
	 * Returns the wrapped node
	 * @return the wrapped node
	 */
	@Deprecated
	public Node getNode() {
		return ot;
	}
		
	// Implementation of the dom::Node W3C IDL interface
    /**
     * The name of this node, depending on its type.
     * @return name of this node
     */
	@Deprecated
	public final String getNodeName() {
		return ot.getNodeName();
	}

    /**
     * The value of this node, depending on its type. 
     * When it is defined to be <code>null</code>, setting it has no effect, 
     * including if the node is read-only.
     */
	@Deprecated
	public final String getNodeValue() {
		return ot.getNodeValue();
	}

    /**
     * The value of this node, depending on its type; see the table above. 
     * When it is defined to be <code>null</code>, setting it has no effect, 
     * including if the node is read-only.
     * @param value The node value
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised when the node is readonly and if 
     *   it is not defined to be <code>null</code>.
     */
	@Deprecated
	public final void setNodeValue(String value) throws JavaScriptException {
		ot.setNodeValue(value);
	}

    /**
     * A code representing the type of the underlying object.
     * @return A code representing the type of the underlying object
     */
	@Deprecated
	public final short getNodeType() {
		return ot.getNodeType();
	}

    /**
     * The parent of this node. All nodes, except <code>OMAttr</code>, 
     * <code>OMDocument</code> may have a parent. 
     * However, if a node has just been created and not yet added to the 
     * tree, or if it has been removed from the tree, this is 
     * <code>null</code>.
     * @return The parent of this node
     */
	@Deprecated
	public final OMNode getParentNode() {
		Node parentNode = ot.getParentNode();
		return (parentNode != null) ? convert(parentNode) : null;
	}
	
    /**
     * A <code>OMNodeList</code> that contains all children of this node. If 
     * there are no children, this is a <code>OMNodeList</code> containing no 
     * nodes.
     * @return A <code>OMNodeList</code> that contains all children of this node. If 
     */
	@Deprecated
	public final <T extends OMNode> OMNodeList<T> getChildNodes() {
		return new OMNodeList<T>(ot.getChildNodes());
	}

    /**
     * The first child of this node. If there is no such node, this returns 
     * <code>null</code>.
     * @return The first child of this node.
     */
	@Deprecated
	public final OMNode getFirstChild() {
		Node firstChild = ot.getFirstChild();
		return (firstChild != null) ? convert(firstChild) : null;
	}

    /**
     * The last child of this node. If there is no such node, this returns 
     * <code>null</code>.
     * @return The last child of this node. 
     */
	@Deprecated
	public final OMNode getLastChild() {
		Node lastChild = ot.getLastChild();
		return (lastChild != null) ? convert(lastChild) : null;
	}
	
	/**
     * Returns the local part of the qualified name of this node.
     * <br>For nodes of any type other than <code>ELEMENT_NODE</code> and 
     * <code>ATTRIBUTE_NODE</code> and nodes created with a DOM Level 1 
     * method, such as <code>Document.createElement()</code>, this is always 
     * <code>null</code>.
     * @return The local part of the qualified name of this node
     */
	@Deprecated
	public final String getLocalName() {
		return DOMHelper.getLocalName(ot);
	}

    /**
     * The node immediately preceding this node. If there is no such node, 
     * this returns <code>null</code>.
     * @return The node immediately preceding this node.
     */
	@Deprecated
	public final OMNode getPreviousSibling() {
		Node previousSibling = ot.getPreviousSibling();
		return (previousSibling != null) ? convert(previousSibling) : null;
	}

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
     * @return The namespace URI of this node
     */
	@Deprecated
	public String getNamespaceURI() {
		return DOMHelper.getNamespaceURI(ot);
	}
    /**
     * The node immediately following this node. If there is no such node, 
     * this returns <code>null</code>.
     * @return The node immediately following this node.
     */
	@Deprecated
	public final OMNode getNextSibling() {
		Node nextSibling = ot.getNextSibling();
		return (nextSibling != null) ? convert(nextSibling) : null;
	}

    /**
     * The <code>OMDocument</code> object associated with this node. This is 
     * also the <code>OMDocument</code> object used to create new nodes. When 
     * this node is a <code>OMNode</code> 
     * which is not used with any <code>OMDocument</code> yet, this is 
     * <code>null</code>.
     * @return The <code>OMDocument</code> object associated with this node.
     */
	@Deprecated
	public final OMDocument getOwnerDocument() {
		Document document = ot.getOwnerDocument();
		return (document != null) ? (OMDocument)convert(document) : null;
	}

    /**
     * Inserts the node <code>newChild</code> before the existing child node 
     * <code>refChild</code>. If <code>refChild</code> is <code>null</code>, 
     * insert <code>newChild</code> at the end of the list of children.
     * <br>If <code>newChild</code> is a <code>DocumentFragment</code> object, 
     * all of its children are inserted, in the same order, before 
     * <code>refChild</code>. If the <code>newChild</code> is already in the 
     * tree, it is first removed.
     * <p ><b>Note:</b>  Inserting a node before itself is implementation 
     * dependent. 
     * @param newChild The node to insert.
     * @param refChild The reference node, i.e., the node before which the 
     *   new node must be inserted.
     * @return The node being inserted.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not 
     *   allow children of the type of the <code>newChild</code> node, or if 
     *   the node to insert is one of this node's ancestors or this node 
     *   itself, or if this node is of type <code>Document</code> and the 
     *   DOM application attempts to insert a second 
     *   <code>DocumentType</code> or <code>Element</code> node.
     *   <br>WRONG_DOCUMENT_ERR: Raised if <code>newChild</code> was created 
     *   from a different document than the one that created this node.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly or 
     *   if the parent of the node being inserted is readonly.
     *   <br>NOT_FOUND_ERR: Raised if <code>refChild</code> is not a child of 
     *   this node.
     *   <br>NOT_SUPPORTED_ERR: if this node is of type <code>Document</code>, 
     *   this exception might be raised if the DOM implementation doesn't 
     *   support the insertion of a <code>DocumentType</code> or 
     *   <code>Element</code> node.
     */
	@Deprecated
	public final OMNode insertBefore(OMNode newChild, OMNode refChild) throws JavaScriptException {
		ot.insertBefore(newChild.ot, refChild != null ? refChild.ot : null);
		return newChild;
	}

    /**
     * Replaces the child node <code>oldChild</code> with <code>newChild</code>
     *  in the list of children, and returns the <code>oldChild</code> node.
     * <br>If <code>newChild</code> is a <code>DocumentFragment</code> object, 
     * <code>oldChild</code> is replaced by all of the 
     * <code>DocumentFragment</code> children, which are inserted in the 
     * same order. If the <code>newChild</code> is already in the tree, it 
     * is first removed.
     * <p ><b>Note:</b>  Replacing a node with itself is implementation 
     * dependent. 
     * @param newChild The new node to put in the child list.
     * @param oldChild The node being replaced in the list.
     * @return The node replaced.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not 
     *   allow children of the type of the <code>newChild</code> node, or if 
     *   the node to put in is one of this node's ancestors or this node 
     *   itself, or if this node is of type <code>Document</code> and the 
     *   result of the replacement operation would add a second 
     *   <code>DocumentType</code> or <code>Element</code> on the 
     *   <code>Document</code> node.
     *   <br>WRONG_DOCUMENT_ERR: Raised if <code>newChild</code> was created 
     *   from a different document than the one that created this node.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node or the parent of 
     *   the new node is readonly.
     *   <br>NOT_FOUND_ERR: Raised if <code>oldChild</code> is not a child of 
     *   this node.
     *   <br>NOT_SUPPORTED_ERR: if this node is of type <code>Document</code>, 
     *   this exception might be raised if the DOM implementation doesn't 
     *   support the replacement of the <code>DocumentType</code> child or 
     *   <code>Element</code> child.
     */
	@Deprecated
	public final OMNode replaceChild(OMNode newChild, OMNode oldChild) throws JavaScriptException {
		ot.replaceChild(newChild.ot, oldChild.ot);
		return oldChild;
	}

	  /**
     * Removes the child node indicated by <code>oldChild</code> from the list 
     * of children, and returns it.
     * @param oldChild The node being removed.
     * @return The node removed.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
     *   <br>NOT_FOUND_ERR: Raised if <code>oldChild</code> is not a child of 
     *   this node.
     *   <br>NOT_SUPPORTED_ERR: if this node is of type <code>Document</code>, 
     *   this exception might be raised if the DOM implementation doesn't 
     *   support the removal of the <code>DocumentType</code> child or the 
     *   <code>Element</code> child.
     */
	@Deprecated
	public final OMNode removeChild(OMNode oldChild) throws JavaScriptException {
		ot.removeChild(oldChild.ot);
		return oldChild;
	}

    /**
     * Adds the node <code>newChild</code> to the end of the list of children 
     * of this node. If the <code>newChild</code> is already in the tree, it 
     * is first removed.
     * @param newChild The node to add.If it is a 
     *   <code>DocumentFragment</code> object, the entire contents of the 
     *   document fragment are moved into the child list of this node
     * @return The node added.
     * @exception DOMException
     *   HIERARCHY_REQUEST_ERR: Raised if this node is of a type that does not 
     *   allow children of the type of the <code>newChild</code> node, or if 
     *   the node to append is one of this node's ancestors or this node 
     *   itself, or if this node is of type <code>Document</code> and the 
     *   DOM application attempts to append a second 
     *   <code>DocumentType</code> or <code>Element</code> node.
     *   <br>WRONG_DOCUMENT_ERR: Raised if <code>newChild</code> was created 
     *   from a different document than the one that created this node.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly or 
     *   if the previous parent of the node being inserted is readonly.
     *   <br>NOT_SUPPORTED_ERR: if the <code>newChild</code> node is a child 
     *   of the <code>Document</code> node, this exception might be raised 
     *   if the DOM implementation doesn't support the removal of the 
     *   <code>DocumentType</code> child or <code>Element</code> child.
     */
	@Deprecated
	public final OMNode appendChild(OMNode newChild) throws JavaScriptException {
		ot.appendChild(newChild.ot);
		return newChild;
	}

    /**
     * Returns whether this node has any children.
     * @return Returns <code>true</code> if this node has any children, 
     *   <code>false</code> otherwise.
     */
	@Deprecated
	public final boolean hasChildNodes() {
		return ot.hasChildNodes();
	}

    /**
     * Returns a duplicate of this node, i.e., serves as a generic copy 
     * constructor for nodes. The duplicate node has no parent (
     * <code>parentNode</code> is <code>null</code>) and no user data. User 
     * data associated to the imported node is not carried over. However, if 
     * any <code>UserDataHandlers</code> has been specified along with the 
     * associated data these handlers will be called with the appropriate 
     * parameters before this method returns.
     * <br>Cloning an <code>Element</code> copies all attributes and their 
     * values, including those generated by the XML processor to represent 
     * defaulted attributes, but this method does not copy any children it 
     * contains unless it is a deep clone. This includes text contained in 
     * an the <code>Element</code> since the text is contained in a child 
     * <code>Text</code> node. Cloning an <code>Attr</code> directly, as 
     * opposed to be cloned as part of an <code>Element</code> cloning 
     * operation, returns a specified attribute (<code>specified</code> is 
     * <code>true</code>). Cloning an <code>Attr</code> always clones its 
     * children, since they represent its value, no matter whether this is a 
     * deep clone or not. Cloning an <code>EntityReference</code> 
     * automatically constructs its subtree if a corresponding 
     * <code>Entity</code> is available, no matter whether this is a deep 
     * clone or not. Cloning any other type of node simply returns a copy of 
     * this node.
     * <br>Note that cloning an immutable subtree results in a mutable copy, 
     * but the children of an <code>EntityReference</code> clone are readonly
     * . In addition, clones of unspecified <code>Attr</code> nodes are 
     * specified. And, cloning <code>Document</code>, 
     * <code>DocumentType</code>, <code>Entity</code>, and 
     * <code>Notation</code> nodes is implementation dependent.
     * @param deep If <code>true</code>, recursively clone the subtree under 
     *   the specified node; if <code>false</code>, clone only the node 
     *   itself (and its attributes, if it is an <code>Element</code>).
     * @return The duplicate node.
     */
	@Deprecated
	public final OMNode cloneNode(boolean deep) {
		return convert(ot.cloneNode(deep));
	}

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
     */
	@Deprecated
	public final void normalize() {
		DOMHelper.normalize(ot);
	}
	
	@Override
	@Deprecated
	public String toString() {
		return ot.toString();
	}
}
