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
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedString;
import org.vectomatic.dom.svg.OMSVGStringList;

public class SVGCursorElement extends SVGElement {
  protected SVGCursorElement() {
  }

  // Implementation of the svg::SVGCursorElement W3C IDL interface
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final native OMSVGAnimatedString getHref() /*-{
    return this.href;
  }-*/;

  // Implementation of the svg::SVGTests W3C IDL interface
  public final native OMSVGStringList getRequiredFeatures() /*-{
    return this.requiredFeatures;
  }-*/;
  public final native OMSVGStringList getRequiredExtensions() /*-{
    return this.requiredExtensions;
  }-*/;
  public final native OMSVGStringList getSystemLanguage() /*-{
    return this.systemLanguage;
  }-*/;
  public final native boolean hasExtension(String extension) /*-{
    return this.hasExtension(extension);
  }-*/;

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

}
