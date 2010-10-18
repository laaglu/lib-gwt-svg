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

import org.vectomatic.dom.svg.impl.SVGGradientElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGGradientElement} interface is a
 * base interface used by {@link org.vectomatic.dom.svg.OMSVGLinearGradientElement}
 * and {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement}.
 */
public abstract class OMSVGGradientElement extends OMSVGElement implements ISVGURIReference, ISVGExternalResourcesRequired, ISVGStylable, ISVGUnitTypes {
  /**
   * The type is not one of predefined types. It is invalid to attempt to define
   * a new value of this type or to attempt to switch an existing value to this
   * type.
   */
  public static final short SVG_SPREADMETHOD_UNKNOWN = 0;
  /**
   * Corresponds to value <span class='attr-value'>'pad'</span>.
   */
  public static final short SVG_SPREADMETHOD_PAD = 1;
  /**
   * Corresponds to value <span class='attr-value'>'reflect'</span>.
   */
  public static final short SVG_SPREADMETHOD_REFLECT = 2;
  /**
   * Corresponds to value <span class='attr-value'>'repeat'</span>.
   */
  public static final short SVG_SPREADMETHOD_REPEAT = 3;
  protected OMSVGGradientElement(SVGGradientElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGGradientElement W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'gradientUnits'</span>
   * on the given element.  Takes one of the constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final OMSVGAnimatedEnumeration getGradientUnits() {
    return ((SVGGradientElement)ot).getGradientUnits();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'gradientTransform'</span>
   * on the given element.
   */
  public final OMSVGAnimatedTransformList getGradientTransform() {
    return ((SVGGradientElement)ot).getGradientTransform();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'spreadMethod'</span>
   * on the given element.  One of the Spread Method Types defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getSpreadMethod() {
    return ((SVGGradientElement)ot).getSpreadMethod();
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
    return ((SVGGradientElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final OMSVGAnimatedString getHref() {
    return ((SVGGradientElement)ot).getHref();
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

}
