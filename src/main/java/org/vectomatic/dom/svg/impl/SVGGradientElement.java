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
import org.vectomatic.dom.svg.OMSVGAnimatedString;
import org.vectomatic.dom.svg.OMSVGAnimatedTransformList;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGGradientElement} interface is
 * a base interface used by {@link org.vectomatic.dom.svg.impl.SVGLinearGradientElement}
 * and {@link org.vectomatic.dom.svg.impl.SVGRadialGradientElement}.
 */
public class SVGGradientElement extends SVGElement {
  protected SVGGradientElement() {
  }

  // Implementation of the svg::SVGGradientElement W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'gradientUnits'</span>
   * on the given element.  Takes one of the constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final native OMSVGAnimatedEnumeration getGradientUnits() /*-{
    return this.gradientUnits;
  }-*/;
  /**
   * Corresponds to attribute <span class='attr-name'>'gradientTransform'</span>
   * on the given element.
   */
  public final native OMSVGAnimatedTransformList getGradientTransform() /*-{
    return this.gradientTransform;
  }-*/;
  /**
   * Corresponds to attribute <span class='attr-name'>'spreadMethod'</span>
   * on the given element.  One of the Spread Method Types defined on this interface.
   */
  public final native OMSVGAnimatedEnumeration getSpreadMethod() /*-{
    return this.spreadMethod;
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
