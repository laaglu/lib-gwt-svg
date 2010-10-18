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

import org.vectomatic.dom.svg.OMSVGAngle;
import org.vectomatic.dom.svg.OMSVGAnimatedAngle;
import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio;
import org.vectomatic.dom.svg.OMSVGAnimatedRect;

import com.google.gwt.core.client.JavaScriptException;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGMarkerElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
 * title='marker element specification'>marker</a>  element.
 */
public class SVGMarkerElement extends SVGElement {
  protected SVGMarkerElement() {
  }

  // Implementation of the svg::SVGMarkerElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMarkerElement#getRefX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final native OMSVGAnimatedLength getRefX() /*-{
    return this.refX;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMarkerElement#getRefY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final native OMSVGAnimatedLength getRefY() /*-{
    return this.refY;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMarkerElement#getMarkerUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.  One of the Marker
   * Unit Types defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getMarkerUnits() /*-{
    return this.markerUnits;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMarkerElement#getMarkerWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final native OMSVGAnimatedLength getMarkerWidth() /*-{
    return this.markerWidth;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGMarkerElement#getMarkerHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final native OMSVGAnimatedLength getMarkerHeight() /*-{
    return this.markerHeight;
  }-*/;
  /**
   * Corresponds to attribute <code>orient</code> on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.  One of the Marker
   * Orientation Types defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getOrientType() /*-{
    return this.orientType;
  }-*/;
  /**
   * Corresponds to attribute <code>orient</code> on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.  If {@link org.vectomatic.dom.svg.impl.SVGMarkerElement#getMarkerUnits()}
   * is SVG_MARKER_ORIENT_ANGLE, the angle value for attribute <code>orient</code>;
   * otherwise, it will be set to zero.
   */
  public final native OMSVGAnimatedAngle getOrientAngle() /*-{
    return this.orientAngle;
  }-*/;
  /**
   * Sets the value of attribute <code>orient</code> to <span class='attr-value'>'auto'</span>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setOrientToAuto() throws JavaScriptException /*-{
    this.setOrientToAuto();
  }-*/;
  /**
   * Sets the value of attribute <code>orient</code> to the given angle.
   * @param angle The angle value to use for attribute <code>orient</code>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setOrientToAngle(OMSVGAngle angle) throws JavaScriptException /*-{
    this.setOrientToAngle(angle);
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

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()}
   * on the given element.
   */
  public final native OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * on the given element.
   */
  public final native OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
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

}
