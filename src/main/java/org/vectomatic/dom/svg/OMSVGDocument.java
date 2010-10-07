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

import org.vectomatic.dom.svg.events.HasDocumentHandlers;
import org.vectomatic.dom.svg.events.SVGZoomEvent;
import org.vectomatic.dom.svg.events.SVGZoomHandler;
import org.vectomatic.dom.svg.impl.SVGAElement;
import org.vectomatic.dom.svg.impl.SVGAltGlyphDefElement;
import org.vectomatic.dom.svg.impl.SVGAltGlyphElement;
import org.vectomatic.dom.svg.impl.SVGAltGlyphItemElement;
import org.vectomatic.dom.svg.impl.SVGAnimateColorElement;
import org.vectomatic.dom.svg.impl.SVGAnimateElement;
import org.vectomatic.dom.svg.impl.SVGAnimateMotionElement;
import org.vectomatic.dom.svg.impl.SVGAnimateTransformElement;
import org.vectomatic.dom.svg.impl.SVGCircleElement;
import org.vectomatic.dom.svg.impl.SVGClipPathElement;
import org.vectomatic.dom.svg.impl.SVGColorProfileElement;
import org.vectomatic.dom.svg.impl.SVGCursorElement;
import org.vectomatic.dom.svg.impl.SVGDefsElement;
import org.vectomatic.dom.svg.impl.SVGDescElement;
import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.impl.SVGEllipseElement;
import org.vectomatic.dom.svg.impl.SVGFEBlendElement;
import org.vectomatic.dom.svg.impl.SVGFEColorMatrixElement;
import org.vectomatic.dom.svg.impl.SVGFEComponentTransferElement;
import org.vectomatic.dom.svg.impl.SVGFECompositeElement;
import org.vectomatic.dom.svg.impl.SVGFEConvolveMatrixElement;
import org.vectomatic.dom.svg.impl.SVGFEDiffuseLightingElement;
import org.vectomatic.dom.svg.impl.SVGFEDisplacementMapElement;
import org.vectomatic.dom.svg.impl.SVGFEDistantLightElement;
import org.vectomatic.dom.svg.impl.SVGFEFloodElement;
import org.vectomatic.dom.svg.impl.SVGFEFuncAElement;
import org.vectomatic.dom.svg.impl.SVGFEFuncBElement;
import org.vectomatic.dom.svg.impl.SVGFEFuncGElement;
import org.vectomatic.dom.svg.impl.SVGFEFuncRElement;
import org.vectomatic.dom.svg.impl.SVGFEGaussianBlurElement;
import org.vectomatic.dom.svg.impl.SVGFEImageElement;
import org.vectomatic.dom.svg.impl.SVGFEMergeElement;
import org.vectomatic.dom.svg.impl.SVGFEMergeNodeElement;
import org.vectomatic.dom.svg.impl.SVGFEMorphologyElement;
import org.vectomatic.dom.svg.impl.SVGFEOffsetElement;
import org.vectomatic.dom.svg.impl.SVGFEPointLightElement;
import org.vectomatic.dom.svg.impl.SVGFESpecularLightingElement;
import org.vectomatic.dom.svg.impl.SVGFESpotLightElement;
import org.vectomatic.dom.svg.impl.SVGFETileElement;
import org.vectomatic.dom.svg.impl.SVGFETurbulenceElement;
import org.vectomatic.dom.svg.impl.SVGFilterElement;
import org.vectomatic.dom.svg.impl.SVGFontElement;
import org.vectomatic.dom.svg.impl.SVGFontFaceElement;
import org.vectomatic.dom.svg.impl.SVGFontFaceFormatElement;
import org.vectomatic.dom.svg.impl.SVGFontFaceNameElement;
import org.vectomatic.dom.svg.impl.SVGFontFaceSrcElement;
import org.vectomatic.dom.svg.impl.SVGFontFaceUriElement;
import org.vectomatic.dom.svg.impl.SVGForeignObjectElement;
import org.vectomatic.dom.svg.impl.SVGGElement;
import org.vectomatic.dom.svg.impl.SVGGlyphElement;
import org.vectomatic.dom.svg.impl.SVGGlyphRefElement;
import org.vectomatic.dom.svg.impl.SVGHKernElement;
import org.vectomatic.dom.svg.impl.SVGImageElement;
import org.vectomatic.dom.svg.impl.SVGLineElement;
import org.vectomatic.dom.svg.impl.SVGLinearGradientElement;
import org.vectomatic.dom.svg.impl.SVGMPathElement;
import org.vectomatic.dom.svg.impl.SVGMarkerElement;
import org.vectomatic.dom.svg.impl.SVGMaskElement;
import org.vectomatic.dom.svg.impl.SVGMetadataElement;
import org.vectomatic.dom.svg.impl.SVGMissingGlyphElement;
import org.vectomatic.dom.svg.impl.SVGPathElement;
import org.vectomatic.dom.svg.impl.SVGPatternElement;
import org.vectomatic.dom.svg.impl.SVGPolygonElement;
import org.vectomatic.dom.svg.impl.SVGPolylineElement;
import org.vectomatic.dom.svg.impl.SVGRadialGradientElement;
import org.vectomatic.dom.svg.impl.SVGRectElement;
import org.vectomatic.dom.svg.impl.SVGSVGElement;
import org.vectomatic.dom.svg.impl.SVGScriptElement;
import org.vectomatic.dom.svg.impl.SVGSetElement;
import org.vectomatic.dom.svg.impl.SVGStopElement;
import org.vectomatic.dom.svg.impl.SVGStyleElement;
import org.vectomatic.dom.svg.impl.SVGSwitchElement;
import org.vectomatic.dom.svg.impl.SVGSymbolElement;
import org.vectomatic.dom.svg.impl.SVGTRefElement;
import org.vectomatic.dom.svg.impl.SVGTSpanElement;
import org.vectomatic.dom.svg.impl.SVGTextElement;
import org.vectomatic.dom.svg.impl.SVGTextPathElement;
import org.vectomatic.dom.svg.impl.SVGTitleElement;
import org.vectomatic.dom.svg.impl.SVGUseElement;
import org.vectomatic.dom.svg.impl.SVGVKernElement;
import org.vectomatic.dom.svg.impl.SVGViewElement;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.Document;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.HandlerRegistration;

public class OMSVGDocument extends OMDocument implements HasDocumentHandlers {
  public OMSVGDocument(SVGDocument ot) {
    super(ot);
  }

  // Implementation of the svg::SVGDocument W3C IDL interface
  public final OMSVGSVGElement getRootElement() {
    return (OMSVGSVGElement)convert(((SVGDocument)ot).getRootElement());
  }

  @Override
  public final HandlerRegistration addResizeHandler(ResizeHandler handler) {
    return addHandler(handler, ResizeEvent.getType());
  }
  @Override
  public final HandlerRegistration addScrollHandler(ScrollHandler handler) {
    return addDomHandler(handler, ScrollEvent.getType());
  }
  @Override
  public final HandlerRegistration addSVGZoomHandler(SVGZoomHandler handler) {
    return addDomHandler(handler, SVGZoomEvent.getType());
  }
  public final OMSVGSVGElement createSVGSVGElement() {
    return (OMSVGSVGElement)convert((SVGSVGElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_SVG_TAG).cast());
  }
  public final OMSVGGElement createSVGGElement() {
    return (OMSVGGElement)convert((SVGGElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_G_TAG).cast());
  }
  public final OMSVGDefsElement createSVGDefsElement() {
    return (OMSVGDefsElement)convert((SVGDefsElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_DEFS_TAG).cast());
  }
  public final OMSVGDescElement createSVGDescElement() {
    return (OMSVGDescElement)convert((SVGDescElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_DESC_TAG).cast());
  }
  public final OMSVGTitleElement createSVGTitleElement() {
    return (OMSVGTitleElement)convert((SVGTitleElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_TITLE_TAG).cast());
  }
  public final OMSVGSymbolElement createSVGSymbolElement() {
    return (OMSVGSymbolElement)convert((SVGSymbolElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_SYMBOL_TAG).cast());
  }
  public final OMSVGUseElement createSVGUseElement() {
    return (OMSVGUseElement)convert((SVGUseElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_USE_TAG).cast());
  }
  public final OMSVGImageElement createSVGImageElement() {
    return (OMSVGImageElement)convert((SVGImageElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_IMAGE_TAG).cast());
  }
  public final OMSVGSwitchElement createSVGSwitchElement() {
    return (OMSVGSwitchElement)convert((SVGSwitchElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_SWITCH_TAG).cast());
  }
  public final OMSVGStyleElement createSVGStyleElement() {
    return (OMSVGStyleElement)convert((SVGStyleElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_STYLE_TAG).cast());
  }
  public final OMSVGPathElement createSVGPathElement() {
    return (OMSVGPathElement)convert((SVGPathElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_PATH_TAG).cast());
  }
  public final OMSVGRectElement createSVGRectElement() {
    return (OMSVGRectElement)convert((SVGRectElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_RECT_TAG).cast());
  }
  public final OMSVGCircleElement createSVGCircleElement() {
    return (OMSVGCircleElement)convert((SVGCircleElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_CIRCLE_TAG).cast());
  }
  public final OMSVGEllipseElement createSVGEllipseElement() {
    return (OMSVGEllipseElement)convert((SVGEllipseElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ELLIPSE_TAG).cast());
  }
  public final OMSVGLineElement createSVGLineElement() {
    return (OMSVGLineElement)convert((SVGLineElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_LINE_TAG).cast());
  }
  public final OMSVGPolylineElement createSVGPolylineElement() {
    return (OMSVGPolylineElement)convert((SVGPolylineElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_POLYLINE_TAG).cast());
  }
  public final OMSVGPolygonElement createSVGPolygonElement() {
    return (OMSVGPolygonElement)convert((SVGPolygonElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_POLYGON_TAG).cast());
  }
  public final OMSVGTextElement createSVGTextElement() {
    return (OMSVGTextElement)convert((SVGTextElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_TEXT_TAG).cast());
  }
  public final OMSVGTSpanElement createSVGTSpanElement() {
    return (OMSVGTSpanElement)convert((SVGTSpanElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_T_SPAN_TAG).cast());
  }
  public final OMSVGTRefElement createSVGTRefElement() {
    return (OMSVGTRefElement)convert((SVGTRefElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_T_REF_TAG).cast());
  }
  public final OMSVGTextPathElement createSVGTextPathElement() {
    return (OMSVGTextPathElement)convert((SVGTextPathElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_TEXT_PATH_TAG).cast());
  }
  public final OMSVGAltGlyphElement createSVGAltGlyphElement() {
    return (OMSVGAltGlyphElement)convert((SVGAltGlyphElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ALT_GLYPH_TAG).cast());
  }
  public final OMSVGAltGlyphDefElement createSVGAltGlyphDefElement() {
    return (OMSVGAltGlyphDefElement)convert((SVGAltGlyphDefElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ALT_GLYPH_DEF_TAG).cast());
  }
  public final OMSVGAltGlyphItemElement createSVGAltGlyphItemElement() {
    return (OMSVGAltGlyphItemElement)convert((SVGAltGlyphItemElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ALT_GLYPH_ITEM_TAG).cast());
  }
  public final OMSVGGlyphRefElement createSVGGlyphRefElement() {
    return (OMSVGGlyphRefElement)convert((SVGGlyphRefElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_GLYPH_REF_TAG).cast());
  }
  public final OMSVGMarkerElement createSVGMarkerElement() {
    return (OMSVGMarkerElement)convert((SVGMarkerElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_MARKER_TAG).cast());
  }
  public final OMSVGColorProfileElement createSVGColorProfileElement() {
    return (OMSVGColorProfileElement)convert((SVGColorProfileElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_COLOR_PROFILE_TAG).cast());
  }
  public final OMSVGLinearGradientElement createSVGLinearGradientElement() {
    return (OMSVGLinearGradientElement)convert((SVGLinearGradientElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_LINEAR_GRADIENT_TAG).cast());
  }
  public final OMSVGRadialGradientElement createSVGRadialGradientElement() {
    return (OMSVGRadialGradientElement)convert((SVGRadialGradientElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_RADIAL_GRADIENT_TAG).cast());
  }
  public final OMSVGStopElement createSVGStopElement() {
    return (OMSVGStopElement)convert((SVGStopElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_STOP_TAG).cast());
  }
  public final OMSVGPatternElement createSVGPatternElement() {
    return (OMSVGPatternElement)convert((SVGPatternElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_PATTERN_TAG).cast());
  }
  public final OMSVGClipPathElement createSVGClipPathElement() {
    return (OMSVGClipPathElement)convert((SVGClipPathElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_CLIP_PATH_TAG).cast());
  }
  public final OMSVGMaskElement createSVGMaskElement() {
    return (OMSVGMaskElement)convert((SVGMaskElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_MASK_TAG).cast());
  }
  public final OMSVGFilterElement createSVGFilterElement() {
    return (OMSVGFilterElement)convert((SVGFilterElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FILTER_TAG).cast());
  }
  public final OMSVGFEBlendElement createSVGFEBlendElement() {
    return (OMSVGFEBlendElement)convert((SVGFEBlendElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_BLEND_TAG).cast());
  }
  public final OMSVGFEColorMatrixElement createSVGFEColorMatrixElement() {
    return (OMSVGFEColorMatrixElement)convert((SVGFEColorMatrixElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_COLOR_MATRIX_TAG).cast());
  }
  public final OMSVGFEComponentTransferElement createSVGFEComponentTransferElement() {
    return (OMSVGFEComponentTransferElement)convert((SVGFEComponentTransferElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_COMPONENT_TRANSFER_TAG).cast());
  }
  public final OMSVGFEFuncRElement createSVGFEFuncRElement() {
    return (OMSVGFEFuncRElement)convert((SVGFEFuncRElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_FUNC_R_TAG).cast());
  }
  public final OMSVGFEFuncGElement createSVGFEFuncGElement() {
    return (OMSVGFEFuncGElement)convert((SVGFEFuncGElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_FUNC_G_TAG).cast());
  }
  public final OMSVGFEFuncBElement createSVGFEFuncBElement() {
    return (OMSVGFEFuncBElement)convert((SVGFEFuncBElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_FUNC_B_TAG).cast());
  }
  public final OMSVGFEFuncAElement createSVGFEFuncAElement() {
    return (OMSVGFEFuncAElement)convert((SVGFEFuncAElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_FUNC_A_TAG).cast());
  }
  public final OMSVGFECompositeElement createSVGFECompositeElement() {
    return (OMSVGFECompositeElement)convert((SVGFECompositeElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_COMPOSITE_TAG).cast());
  }
  public final OMSVGFEConvolveMatrixElement createSVGFEConvolveMatrixElement() {
    return (OMSVGFEConvolveMatrixElement)convert((SVGFEConvolveMatrixElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_CONVOLVE_MATRIX_TAG).cast());
  }
  public final OMSVGFEDiffuseLightingElement createSVGFEDiffuseLightingElement() {
    return (OMSVGFEDiffuseLightingElement)convert((SVGFEDiffuseLightingElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_DIFFUSE_LIGHTING_TAG).cast());
  }
  public final OMSVGFEDistantLightElement createSVGFEDistantLightElement() {
    return (OMSVGFEDistantLightElement)convert((SVGFEDistantLightElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_DISTANT_LIGHT_TAG).cast());
  }
  public final OMSVGFEPointLightElement createSVGFEPointLightElement() {
    return (OMSVGFEPointLightElement)convert((SVGFEPointLightElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_POINT_LIGHT_TAG).cast());
  }
  public final OMSVGFESpotLightElement createSVGFESpotLightElement() {
    return (OMSVGFESpotLightElement)convert((SVGFESpotLightElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_SPOT_LIGHT_TAG).cast());
  }
  public final OMSVGFEDisplacementMapElement createSVGFEDisplacementMapElement() {
    return (OMSVGFEDisplacementMapElement)convert((SVGFEDisplacementMapElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_DISPLACEMENT_MAP_TAG).cast());
  }
  public final OMSVGFEFloodElement createSVGFEFloodElement() {
    return (OMSVGFEFloodElement)convert((SVGFEFloodElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_FLOOD_TAG).cast());
  }
  public final OMSVGFEGaussianBlurElement createSVGFEGaussianBlurElement() {
    return (OMSVGFEGaussianBlurElement)convert((SVGFEGaussianBlurElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_GAUSSIAN_BLUR_TAG).cast());
  }
  public final OMSVGFEImageElement createSVGFEImageElement() {
    return (OMSVGFEImageElement)convert((SVGFEImageElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_IMAGE_TAG).cast());
  }
  public final OMSVGFEMergeElement createSVGFEMergeElement() {
    return (OMSVGFEMergeElement)convert((SVGFEMergeElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_MERGE_TAG).cast());
  }
  public final OMSVGFEMergeNodeElement createSVGFEMergeNodeElement() {
    return (OMSVGFEMergeNodeElement)convert((SVGFEMergeNodeElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_MERGE_NODE_TAG).cast());
  }
  public final OMSVGFEMorphologyElement createSVGFEMorphologyElement() {
    return (OMSVGFEMorphologyElement)convert((SVGFEMorphologyElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_MORPHOLOGY_TAG).cast());
  }
  public final OMSVGFEOffsetElement createSVGFEOffsetElement() {
    return (OMSVGFEOffsetElement)convert((SVGFEOffsetElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_OFFSET_TAG).cast());
  }
  public final OMSVGFESpecularLightingElement createSVGFESpecularLightingElement() {
    return (OMSVGFESpecularLightingElement)convert((SVGFESpecularLightingElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_SPECULAR_LIGHTING_TAG).cast());
  }
  public final OMSVGFETileElement createSVGFETileElement() {
    return (OMSVGFETileElement)convert((SVGFETileElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_TILE_TAG).cast());
  }
  public final OMSVGFETurbulenceElement createSVGFETurbulenceElement() {
    return (OMSVGFETurbulenceElement)convert((SVGFETurbulenceElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_TURBULENCE_TAG).cast());
  }
  public final OMSVGCursorElement createSVGCursorElement() {
    return (OMSVGCursorElement)convert((SVGCursorElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_CURSOR_TAG).cast());
  }
  public final OMSVGAElement createSVGAElement() {
    return (OMSVGAElement)convert((SVGAElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_A_TAG).cast());
  }
  public final OMSVGViewElement createSVGViewElement() {
    return (OMSVGViewElement)convert((SVGViewElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_VIEW_TAG).cast());
  }
  public final OMSVGScriptElement createSVGScriptElement() {
    return (OMSVGScriptElement)convert((SVGScriptElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_SCRIPT_TAG).cast());
  }
  public final OMSVGAnimateElement createSVGAnimateElement() {
    return (OMSVGAnimateElement)convert((SVGAnimateElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ANIMATE_TAG).cast());
  }
  public final OMSVGSetElement createSVGSetElement() {
    return (OMSVGSetElement)convert((SVGSetElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_SET_TAG).cast());
  }
  public final OMSVGAnimateMotionElement createSVGAnimateMotionElement() {
    return (OMSVGAnimateMotionElement)convert((SVGAnimateMotionElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ANIMATE_MOTION_TAG).cast());
  }
  public final OMSVGMPathElement createSVGMPathElement() {
    return (OMSVGMPathElement)convert((SVGMPathElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_M_PATH_TAG).cast());
  }
  public final OMSVGAnimateColorElement createSVGAnimateColorElement() {
    return (OMSVGAnimateColorElement)convert((SVGAnimateColorElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ANIMATE_COLOR_TAG).cast());
  }
  public final OMSVGAnimateTransformElement createSVGAnimateTransformElement() {
    return (OMSVGAnimateTransformElement)convert((SVGAnimateTransformElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_ANIMATE_TRANSFORM_TAG).cast());
  }
  public final OMSVGFontElement createSVGFontElement() {
    return (OMSVGFontElement)convert((SVGFontElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FONT_TAG).cast());
  }
  public final OMSVGGlyphElement createSVGGlyphElement() {
    return (OMSVGGlyphElement)convert((SVGGlyphElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_GLYPH_TAG).cast());
  }
  public final OMSVGMissingGlyphElement createSVGMissingGlyphElement() {
    return (OMSVGMissingGlyphElement)convert((SVGMissingGlyphElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_MISSING_GLYPH_TAG).cast());
  }
  public final OMSVGHKernElement createSVGHKernElement() {
    return (OMSVGHKernElement)convert((SVGHKernElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_H_KERN_TAG).cast());
  }
  public final OMSVGVKernElement createSVGVKernElement() {
    return (OMSVGVKernElement)convert((SVGVKernElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_V_KERN_TAG).cast());
  }
  public final OMSVGFontFaceElement createSVGFontFaceElement() {
    return (OMSVGFontFaceElement)convert((SVGFontFaceElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FONT_FACE_TAG).cast());
  }
  public final OMSVGFontFaceSrcElement createSVGFontFaceSrcElement() {
    return (OMSVGFontFaceSrcElement)convert((SVGFontFaceSrcElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FONT_FACE_SRC_TAG).cast());
  }
  public final OMSVGFontFaceUriElement createSVGFontFaceUriElement() {
    return (OMSVGFontFaceUriElement)convert((SVGFontFaceUriElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FONT_FACE_URI_TAG).cast());
  }
  public final OMSVGFontFaceFormatElement createSVGFontFaceFormatElement() {
    return (OMSVGFontFaceFormatElement)convert((SVGFontFaceFormatElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FONT_FACE_FORMAT_TAG).cast());
  }
  public final OMSVGFontFaceNameElement createSVGFontFaceNameElement() {
    return (OMSVGFontFaceNameElement)convert((SVGFontFaceNameElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FONT_FACE_NAME_TAG).cast());
  }
  public final OMSVGMetadataElement createSVGMetadataElement() {
    return (OMSVGMetadataElement)convert((SVGMetadataElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_METADATA_TAG).cast());
  }
  public final OMSVGForeignObjectElement createSVGForeignObjectElement() {
    return (OMSVGForeignObjectElement)convert((SVGForeignObjectElement)DOMHelper.createElementNS((Document)ot.cast(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FOREIGN_OBJECT_TAG).cast());
  }
  
  // Helper methods
  public final OMSVGCircleElement createSVGCircleElement(float cx, float cy, float r) {
	OMSVGCircleElement circle = createSVGCircleElement();
	circle.getCx().getBaseVal().setValue(cx);
	circle.getCy().getBaseVal().setValue(cy);
	circle.getR().getBaseVal().setValue(r);
	return circle;
  }
  public final OMSVGEllipseElement createSVGEllipseElement(float cx, float cy, float rx, float ry) {
	OMSVGEllipseElement ellipse = createSVGEllipseElement();
	ellipse.getCx().getBaseVal().setValue(cx);
	ellipse.getCy().getBaseVal().setValue(cy);
	ellipse.getRx().getBaseVal().setValue(rx);
	ellipse.getRy().getBaseVal().setValue(ry);
	return ellipse;
  }
  public final OMSVGLineElement createSVGLineElement(float x1, float y1, float x2, float y2) {
	OMSVGLineElement line = createSVGLineElement();
	line.getX1().getBaseVal().setValue(x1);
	line.getY1().getBaseVal().setValue(y1);
	line.getX2().getBaseVal().setValue(x2);
	line.getY2().getBaseVal().setValue(y2);
	return line;
  }
  public final OMSVGRectElement createSVGRectElement(float x, float y, float width, float height, float rx, float ry) {
	OMSVGRectElement rect = createSVGRectElement();
	rect.getX().getBaseVal().setValue(x);
	rect.getY().getBaseVal().setValue(y);
	rect.getWidth().getBaseVal().setValue(width);
	rect.getHeight().getBaseVal().setValue(height);
	if (rx != 0f) {
		rect.getRx().getBaseVal().setValue(rx);
	}
	if (ry != 0f) {
		rect.getRy().getBaseVal().setValue(ry);
	}
	return rect;
 }
  public final OMSVGTextElement createSVGTextElement(float x, float y, short unitType, String data) {
    OMSVGTextElement text = createSVGTextElement();
    OMSVGSVGElement svg = createSVGSVGElement();
	OMSVGLength xCoord = svg.createSVGLength(unitType, x);
	text.getX().getBaseVal().appendItem(xCoord);
	OMSVGLength yCoord = svg.createSVGLength(unitType, y);
	text.getY().getBaseVal().appendItem(yCoord);
	text.appendChild(createTextNode(data));
	return text;
  }
  public final OMSVGImageElement createSVGImageElement(float x, float y, float width, float height, String href) {
	OMSVGImageElement image = createSVGImageElement();
	image.getX().getBaseVal().setValue(x);
	image.getY().getBaseVal().setValue(y);
	image.getWidth().getBaseVal().setValue(width);
	image.getHeight().getBaseVal().setValue(height);
	image.getHref().setBaseVal(href);
	return image;
  }
}
