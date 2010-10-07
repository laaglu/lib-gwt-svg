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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.Element;

public class OMNode implements HasHandlers {
	protected Node ot;

	protected OMNode(Node ot) {
		this.ot = ot;
	}
	public void fireEvent(GwtEvent<?> event) {
		HandlerManager handlerManager = getHandlerManager(ot);
		if (handlerManager != null) {
			handlerManager.fireEvent(event);
		}
	}

	public void dispatch(NativeEvent event) {
	    DomEvent.fireNativeEvent(event, this, (Element)event.getCurrentEventTarget().cast());
	}

	public final <H extends EventHandler> HandlerRegistration addDomHandler(
			final H handler, DomEvent.Type<H> type) {
		assert handler != null : "handler must not be null";
		assert type != null : "type must not be null";
		DOMHelper.bindEventListener(this, (Element)ot.cast(), type.getName());
		return ensureHandlers().addHandler(type, handler);
	}

	public final <H extends EventHandler> HandlerRegistration addHandler(
			final H handler, GwtEvent.Type<H> type) {
		return ensureHandlers().addHandler(type, handler);
	}

	HandlerManager ensureHandlers() {
		HandlerManager handlerManager = getHandlerManager(ot);
		if (handlerManager == null) {
			handlerManager = new HandlerManager(this);
			setHandlerManager(ot, handlerManager);
		}
		return handlerManager;
	}
	
	private static native HandlerManager getHandlerManager(Node ot) /*-{
		return ot.__hm;
	}-*/;
	
	private static native void setHandlerManager(Node ot, HandlerManager manager) /*-{
		ot.__hm = manager;
	}-*/;
	
	static class Conversion<T extends OMNode> {
		static {
			initialize();
		}
		private static final native void initialize() /*-{
		    $wnd.otToWrapper = new Object();
			$wnd.otToWrapper["HTMLDocument"] = function(elem) { return @org.vectomatic.dom.svg.OMSVGDocument::new(Lorg/vectomatic/dom/svg/impl/SVGDocument;)(elem); };
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
		private final native void convert(Node node) /*-{
			var wrapper = null;
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
		    			wrapper = @org.vectomatic.dom.svg.OMDocument::new(Lcom/google/gwt/dom/client/Document;)(node);
		    		} else {
		    			wrapper = @org.vectomatic.dom.svg.OMNode::new(Lcom/google/gwt/dom/client/Node;)(node);
		    		}
		    	}
		    }
	        this.@org.vectomatic.dom.svg.OMNode.Conversion::result = wrapper;
	    }-*/;
	}
	
	public static <T extends OMNode> T convert(Node obj) {
		return new Conversion<T>(obj).result;
	}
	
	public Node getNode() {
		return ot;
	}
		
	// Implementation of the dom::Node W3C IDL interface
	public final String getNodeName() {
		return ot.getNodeName();
	}

	public final String getNodeValue() {
		return ot.getNodeValue();
	}

	public final void setNodeValue(String value) {
		ot.setNodeValue(value);
	}

	public final short getNodeType() {
		return ot.getNodeType();
	}

	public final OMNode getParentNode() {
		Node parentNode = ot.getParentNode();
		return (parentNode != null) ? convert(parentNode) : null;
	}
	
	public final <T extends OMNode> OMNodeList<T> getChildNodes() {
		return new OMNodeList<T>(ot.getChildNodes());
	}

	public final OMNode getFirstChild() {
		Node firstChild = ot.getFirstChild();
		return (firstChild != null) ? convert(firstChild) : null;
	}

	public final OMNode getLastChild() {
		Node lastChild = ot.getLastChild();
		return (lastChild != null) ? convert(lastChild) : null;
	}

	public final OMNode getPreviousSibling() {
		Node previousSibling = ot.getPreviousSibling();
		return (previousSibling != null) ? convert(previousSibling) : null;
	}

	public final OMNode getNextSibling() {
		Node nextSibling = ot.getNextSibling();
		return (nextSibling != null) ? convert(nextSibling) : null;
	}

	public final OMSVGDocument getOwnerDocument() {
		Document document = ot.getOwnerDocument();
		return (document != null) ? (OMSVGDocument)convert(document) : null;
	}

	public final OMNode insertBefore(OMNode newChild, OMNode refChild) {
		ot.insertBefore(newChild.ot, refChild.ot);
		return newChild;
	}

	public final OMNode replaceChild(OMNode newChild, OMNode oldChild) {
		ot.replaceChild(newChild.ot, oldChild.ot);
		return oldChild;
	}

	public final OMNode removeChild(OMNode oldChild) {
		ot.removeChild(oldChild.ot);
		return oldChild;
	}

	public final OMNode appendChild(OMNode newChild) {
		ot.appendChild(newChild.ot);
		return newChild;
	}

	public final boolean hasChildNodes() {
		return ot.hasChildNodes();
	}

	public final OMNode cloneNode(boolean deep) {
		return convert(ot.cloneNode(deep));
	}

	public final void normalize() {
		DOMHelper.normalize(ot);
	}
	
	@Override
	public String toString() {
		return ot.toString();
	}
}
