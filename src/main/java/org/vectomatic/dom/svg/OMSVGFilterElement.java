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

import org.vectomatic.dom.svg.impl.SVGFilterElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFilterElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
 * title='filter element specification'>filter</a> element.
 */
@TagName("filter")
public class OMSVGFilterElement extends OMSVGElement implements ISVGURIReference, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGUnitTypes {
  public OMSVGFilterElement() {
    this((SVGFilterElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FILTER_TAG).cast());
  }

  protected OMSVGFilterElement(SVGFilterElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFilterElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFilterElement#getFilterUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element. Takes one of the
   * constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final OMSVGAnimatedEnumeration getFilterUnits() {
    return ((SVGFilterElement)ot).getFilterUnits();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFilterElement#getPrimitiveUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element. Takes one of the
   * constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final OMSVGAnimatedEnumeration getPrimitiveUnits() {
    return ((SVGFilterElement)ot).getPrimitiveUnits();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFilterElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGFilterElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFilterElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGFilterElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFilterElement#getWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFilterElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFilterElement#getHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFilterElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute <code>filterRes</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element.  Contains the
   * X component of attribute <code>filterRes</code>.
   */
  public final OMSVGAnimatedInteger getFilterResX() {
    return ((SVGFilterElement)ot).getFilterResX();
  }
  /**
   * Corresponds to attribute <code>filterRes</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element.  Contains the
   * Y component (possibly computed automatically) of attribute <code>filterRes</code>.
   */
  public final OMSVGAnimatedInteger getFilterResY() {
    return ((SVGFilterElement)ot).getFilterResY();
  }
  /**
   * Sets the values for attribute <code>filterRes</code>.
   * @param filterResX The X component of attribute <code>filterRes</code>.
   * @param filterResY The Y component of attribute <code>filterRes</code>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setFilterRes(int filterResX, int filterResY) throws JavaScriptException {
    ((SVGFilterElement)ot).setFilterRes(filterResX, filterResY);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * on the given element. Note that the SVG DOM defines the attribute {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * as being of type {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean}, whereas
   * the SVG language definition says that {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * is not animated. Because the SVG language definition states that {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * cannot be animated, the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getAnimVal()}
   * will always be the same as the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getBaseVal()}.
   */
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGFilterElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final String getXmllang() {
    return ((SVGFilterElement)ot).getXmllang();
  }
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmllang(java.lang.String value) throws JavaScriptException {
    ((SVGFilterElement)ot).setXmllang(value);
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final String getXmlspace() {
    return ((SVGFilterElement)ot).getXmlspace();
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmlspace(java.lang.String value) throws JavaScriptException {
    ((SVGFilterElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final OMSVGAnimatedString getHref() {
    return ((SVGFilterElement)ot).getHref();
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  /**
   * This keyword represents the graphics elements that were the original 
   * input into the ‘filter’ element. For raster effects filter primitives, 
   * the graphics elements will be rasterized into an initially clear RGBA 
   * raster in image space. Pixels left untouched by the original graphic 
   * will be left clear. The image is specified to be rendered in linear RGBA pixels. 
   * The alpha channel of this image captures any anti-aliasing specified by SVG. 
   * (Since the raster is linear, the alpha channel of this image will represent 
   * the exact percent coverage of each pixel.)  
   */
  public static final String IN_SOURCE_GRAPHIC = org.vectomatic.dom.svg.utils.SVGConstants.SVG_SOURCE_GRAPHIC_VALUE;
  /**
   * This keyword represents the graphics elements that were the original 
   * input into the ‘filter’ element. SourceAlpha has all of the same rules 
   * as SourceGraphic except that only the alpha channel is used. The input 
   * image is an RGBA image consisting of implicitly black color values for 
   * the RGB channels, but whose alpha channel is the same as SourceGraphic. 
   * If this option is used, then some implementations might need to rasterize 
   * the graphics elements in order to extract the alpha channel.
   */
  public static final String IN_SOURCE_ALPHA = org.vectomatic.dom.svg.utils.SVGConstants.SVG_SOURCE_ALPHA_VALUE;
  /**
   * This keyword represents an image snapshot of the canvas under the filter 
   * region at the time that the ‘filter’ element was invoked.
   */
  public static final String IN_BACKGROUND_IMAGE = org.vectomatic.dom.svg.utils.SVGConstants.SVG_BACKGROUND_IMAGE_VALUE;
  /**
   * Same as BackgroundImage except only the alpha channel is used.
   */
  public static final String IN_BACKGROUND_ALPHA = org.vectomatic.dom.svg.utils.SVGConstants.SVG_BACKGROUND_ALPHA_VALUE;
  /**
   * This keyword represents the value of the ‘fill’ property on the target 
   * element for the filter effect. The FillPaint image has conceptually 
   * infinite extent. Frequently this image is opaque everywhere, but 
   * it might not be if the "paint" itself has alpha, as in the case 
   * of a gradient or pattern which itself includes transparent or semi-transparent 
   * parts.
   */
  public static final String IN_FILL_PAINT = org.vectomatic.dom.svg.utils.SVGConstants.SVG_FILL_PAINT_VALUE;
  /**
   * This keyword represents the value of the ‘stroke’ property on 
   * the target element for the filter effect. The StrokePaint image has 
   * conceptually infinite extent. Frequently this image is opaque everywhere, 
   * but it might not be if the "paint" itself has alpha, as in the case of a 
   * gradient or pattern which itself includes transparent or semi-transparent parts.
   */
  public static final String IN_STROKE_PAINT = org.vectomatic.dom.svg.utils.SVGConstants.SVG_STROKE_PAINT_VALUE;}
