/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of libgwtsvg.
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

import org.vectomatic.dom.svg.impl.SVGGradientElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;

public abstract class OMSVGGradientElement extends OMSVGElement implements ISVGURIReference, ISVGExternalResourcesRequired, ISVGStylable, ISVGUnitTypes {
  public static final short SVG_SPREADMETHOD_UNKNOWN = 0;
  public static final short SVG_SPREADMETHOD_PAD = 1;
  public static final short SVG_SPREADMETHOD_REFLECT = 2;
  public static final short SVG_SPREADMETHOD_REPEAT = 3;
  protected OMSVGGradientElement(SVGGradientElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGGradientElement W3C IDL interface
  public final OMSVGAnimatedEnumeration getGradientUnits() {
    return ((SVGGradientElement)ot).getGradientUnits();
  }
  public final OMSVGAnimatedTransformList getGradientTransform() {
    return ((SVGGradientElement)ot).getGradientTransform();
  }
  public final OMSVGAnimatedEnumeration getSpreadMethod() {
    return ((SVGGradientElement)ot).getSpreadMethod();
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGGradientElement)ot).getHref();
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGGradientElement)ot).getExternalResourcesRequired();
  }

}
