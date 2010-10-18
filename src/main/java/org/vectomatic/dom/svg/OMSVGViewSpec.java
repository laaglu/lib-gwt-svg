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

import org.vectomatic.dom.svg.impl.SVGElement;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The interface corresponds to an SVG View Specification.
 */
public class OMSVGViewSpec extends JavaScriptObject {
  protected OMSVGViewSpec() {
  }

  // Implementation of the svg::SVGViewSpec W3C IDL interface
  /**
   * Corresponds to the transform setting on the SVG View Specification.
   */
  public final native OMSVGTransformList getTransform() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.transform);
  }-*/;
  /**
   * Corresponds to the viewTarget setting on the SVG View Specification.
   */
  public final native SVGElement getViewTarget() /*-{
    return this.viewTarget;
  }-*/;
  /**
   * Corresponds to the viewBox setting on the SVG View Specification.
   */
  public final native String getViewBoxString() /*-{
    return this.viewBoxString;
  }-*/;
  /**
   * Corresponds to the preserveAspectRatio setting on the SVG View Specification.
   */
  public final native String getPreserveAspectRatioString() /*-{
    return this.preserveAspectRatioString;
  }-*/;
  /**
   * Corresponds to the transform setting on the SVG View Specification.
   */
  public final native String getTransformString() /*-{
    return this.transformString;
  }-*/;
  /**
   * Corresponds to the viewTarget setting on the SVG View Specification.
   */
  public final native String getViewTargetString() /*-{
    return this.viewTargetString;
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

  // Implementation of the svg::SVGZoomAndPan W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * on the given element. The value must be one of the SVG_ZOOMANDPAN_ constants
   * defined on this interface.
   */
  public final native short getZoomAndPan() /*-{
    return this.zoomAndPan;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * on the given element. The value must be one of the SVG_ZOOMANDPAN_ constants
   * defined on this interface.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setZoomAndPan(short value) throws JavaScriptException /*-{
    this.zoomAndPan = value;
  }-*/;

}
