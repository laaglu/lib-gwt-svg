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

package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGStringList;

import com.google.gwt.core.client.JavaScriptException;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGMaskElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement' title='mask
 * element specification'>mask</a>  element.
 */
public class SVGMaskElement extends SVGElement {
  protected SVGMaskElement() {
  }

  // Implementation of the svg::SVGMaskElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMaskElement#getMaskUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement'
   * title='mask element specification'>mask</a>  element.  Takes one of the
   * constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final native OMSVGAnimatedEnumeration getMaskUnits() /*-{
    return this.maskUnits;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMaskElement#getMaskContentUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement'
   * title='mask element specification'>mask</a>  element.  Takes one of the
   * constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final native OMSVGAnimatedEnumeration getMaskContentUnits() /*-{
    return this.maskContentUnits;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMaskElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement'
   * title='mask element specification'>mask</a> element.
   */
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMaskElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement'
   * title='mask element specification'>mask</a> element.
   */
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMaskElement#getWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement'
   * title='mask element specification'>mask</a>  element.
   */
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMaskElement#getHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/masking.html#MaskElement'
   * title='mask element specification'>mask</a>  element.
   */
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;

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
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final native String getXmllang() /*-{
    return this.xmllang;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setXmllang(String value) throws JavaScriptException /*-{
    this.xmllang = value;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final native String getXmlspace() /*-{
    return this.xmlspace;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setXmlspace(String value) throws JavaScriptException /*-{
    this.xmlspace = value;
  }-*/;

  // Implementation of the svg::SVGTests W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredFeatures()}
   * on the given element.
   */
  public final native OMSVGStringList getRequiredFeatures() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredFeatures);
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredExtensions()}
   * on the given element.
   */
  public final native OMSVGStringList getRequiredExtensions() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredExtensions);
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getSystemLanguage()}
   * on the given element.
   */
  public final native OMSVGStringList getSystemLanguage() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.systemLanguage);
  }-*/;
  /**
   * Returns true if the user agent supports the given extension, specified
   * by a URI.
   * @param extension The name of the extension, expressed as a URI.
   * @return True or false, depending on whether the given extension is   supported.
   */
  public final native boolean hasExtension(String extension) /*-{
    return this.hasExtension(extension);
  }-*/;

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

}
