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

import org.vectomatic.dom.svg.impl.SVGMarkerElement;
import org.vectomatic.dom.svg.itf.ISVGContainerElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGFitToViewBox;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGMarkerElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
 * title='marker element specification'>marker</a>  element.
 */
@TagName("marker")
public class OMSVGMarkerElement extends OMSVGElement implements ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGFitToViewBox, ISVGContainerElement {
  /**
   * The marker unit type is not one of predefined types. It is invalid to attempt
   * to define a new value of this type or to attempt to switch an existing
   * value to this type.
   */
  public static final short SVG_MARKERUNITS_UNKNOWN = 0;
  /**
   * The value of attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getMarkerUnits()}
   * is <span class='attr-value'>'userSpaceOnUse'</span>.
   */
  public static final short SVG_MARKERUNITS_USERSPACEONUSE = 1;
  /**
   * The value of attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getMarkerUnits()}
   * is <span class='attr-value'>'strokeWidth'</span>.
   */
  public static final short SVG_MARKERUNITS_STROKEWIDTH = 2;
  /**
   * The marker orientation is not one of predefined types. It is invalid to
   * attempt to define a new value of this type or to attempt to switch an existing
   * value to this type.
   */
  public static final short SVG_MARKER_ORIENT_UNKNOWN = 0;
  /**
   * Attribute <code>orient</code> has value <span class='attr-value'>'auto'</span>.
   */
  public static final short SVG_MARKER_ORIENT_AUTO = 1;
  /**
   * Attribute <code>orient</code> has an angle value.
   */
  public static final short SVG_MARKER_ORIENT_ANGLE = 2;
  public OMSVGMarkerElement() {
    this((SVGMarkerElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_MARKER_TAG).cast());
  }

  protected OMSVGMarkerElement(SVGMarkerElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGMarkerElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getRefX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final OMSVGAnimatedLength getRefX() {
    return ((SVGMarkerElement)ot).getRefX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getRefY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final OMSVGAnimatedLength getRefY() {
    return ((SVGMarkerElement)ot).getRefY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getMarkerUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.  One of the Marker
   * Unit Types defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getMarkerUnits() {
    return ((SVGMarkerElement)ot).getMarkerUnits();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getMarkerWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final OMSVGAnimatedLength getMarkerWidth() {
    return ((SVGMarkerElement)ot).getMarkerWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getMarkerHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.
   */
  public final OMSVGAnimatedLength getMarkerHeight() {
    return ((SVGMarkerElement)ot).getMarkerHeight();
  }
  /**
   * Corresponds to attribute <code>orient</code> on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.  One of the Marker
   * Orientation Types defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getOrientType() {
    return ((SVGMarkerElement)ot).getOrientType();
  }
  /**
   * Corresponds to attribute <code>orient</code> on the given <a href='http://www.w3.org/TR/SVG11/painting.html#MarkerElement'
   * title='marker element specification'>marker</a>  element.  If {@link org.vectomatic.dom.svg.OMSVGMarkerElement#getMarkerUnits()}
   * is SVG_MARKER_ORIENT_ANGLE, the angle value for attribute <code>orient</code>;
   * otherwise, it will be set to zero.
   */
  public final OMSVGAnimatedAngle getOrientAngle() {
    return ((SVGMarkerElement)ot).getOrientAngle();
  }
  /**
   * Sets the value of attribute <code>orient</code> to <span class='attr-value'>'auto'</span>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setOrientToAuto() throws JavaScriptException {
    ((SVGMarkerElement)ot).setOrientToAuto();
  }
  /**
   * Sets the value of attribute <code>orient</code> to the given angle.
   * @param angle The angle value to use for attribute <code>orient</code>.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setOrientToAngle(OMSVGAngle angle) throws JavaScriptException {
    ((SVGMarkerElement)ot).setOrientToAngle(angle);
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
    return ((SVGMarkerElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()}
   * on the given element.
   */
  public final OMSVGAnimatedRect getViewBox() {
    return ((SVGMarkerElement)ot).getViewBox();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * on the given element.
   */
  public final OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
    return ((SVGMarkerElement)ot).getPreserveAspectRatio();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final String getXmllang() {
    return ((SVGMarkerElement)ot).getXmllang();
  }
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmllang(java.lang.String value) throws JavaScriptException {
    ((SVGMarkerElement)ot).setXmllang(value);
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final String getXmlspace() {
    return ((SVGMarkerElement)ot).getXmlspace();
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmlspace(java.lang.String value) throws JavaScriptException {
    ((SVGMarkerElement)ot).setXmlspace(value);
  }

}
