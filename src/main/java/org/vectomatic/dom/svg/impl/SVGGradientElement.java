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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedString;
import org.vectomatic.dom.svg.OMSVGAnimatedTransformList;

public class SVGGradientElement extends SVGElement {
  protected SVGGradientElement() {
  }

  // Implementation of the svg::SVGGradientElement W3C IDL interface
  public final native OMSVGAnimatedEnumeration getGradientUnits() /*-{
    return this.gradientUnits;
  }-*/;
  public final native OMSVGAnimatedTransformList getGradientTransform() /*-{
    return this.gradientTransform;
  }-*/;
  public final native OMSVGAnimatedEnumeration getSpreadMethod() /*-{
    return this.spreadMethod;
  }-*/;

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
  }-*/;

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

}
