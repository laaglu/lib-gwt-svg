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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.SVGCursorElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGURIReference;

public class OMSVGCursorElement extends OMSVGElement implements ISVGURIReference, ISVGTests, ISVGExternalResourcesRequired {
  protected OMSVGCursorElement(SVGCursorElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGCursorElement W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGCursorElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGCursorElement)ot).getY();
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGCursorElement)ot).getHref();
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGCursorElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGCursorElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGCursorElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGCursorElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGCursorElement)ot).getExternalResourcesRequired();
  }

}
