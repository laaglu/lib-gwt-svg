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
import org.vectomatic.dom.svg.OMSVGAnimatedInteger;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedString;

import com.google.gwt.core.client.JavaScriptException;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGFilterElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
 * title='filter element specification'>filter</a> element.
 */
public class SVGFilterElement extends SVGElement {
  protected SVGFilterElement() {
  }

  // Implementation of the svg::SVGFilterElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFilterElement#getFilterUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element. Takes one of the
   * constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final native OMSVGAnimatedEnumeration getFilterUnits() /*-{
    return this.filterUnits;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFilterElement#getPrimitiveUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element. Takes one of the
   * constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final native OMSVGAnimatedEnumeration getPrimitiveUnits() /*-{
    return this.primitiveUnits;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFilterElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFilterElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFilterElement#getWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGFilterElement#getHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a>  element.
   */
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  /**
   * Corresponds to attribute <code>filterRes</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element.  Contains the
   * X component of attribute <code>filterRes</code>.
   */
  public final native OMSVGAnimatedInteger getFilterResX() /*-{
    return this.filterResX;
  }-*/;
  /**
   * Corresponds to attribute <code>filterRes</code> on the given <a href='http://www.w3.org/TR/SVG11/filters.html#FilterElement'
   * title='filter element specification'>filter</a> element.  Contains the
   * Y component (possibly computed automatically) of attribute <code>filterRes</code>.
   */
  public final native OMSVGAnimatedInteger getFilterResY() /*-{
    return this.filterResY;
  }-*/;
  /**
   * Sets the values for attribute <code>filterRes</code>.
   * @param filterResX The X component of attribute <code>filterRes</code>.
   * @param filterResY The Y component of attribute <code>filterRes</code>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setFilterRes(int filterResX, int filterResY) throws JavaScriptException /*-{
    this.setFilterRes(filterResX, filterResY);
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

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
  }-*/;

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

}
