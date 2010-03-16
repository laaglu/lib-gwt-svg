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

import org.vectomatic.dom.svg.impl.SVGPatternElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGFitToViewBox;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;

public class OMSVGPatternElement extends OMSVGElement implements ISVGURIReference, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGFitToViewBox, ISVGUnitTypes {
  protected OMSVGPatternElement(SVGPatternElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGPatternElement W3C IDL interface
  public final OMSVGAnimatedEnumeration getPatternUnits() {
    return ((SVGPatternElement)ot).getPatternUnits();
  }
  public final OMSVGAnimatedEnumeration getPatternContentUnits() {
    return ((SVGPatternElement)ot).getPatternContentUnits();
  }
  public final OMSVGAnimatedTransformList getPatternTransform() {
    return ((SVGPatternElement)ot).getPatternTransform();
  }
  public final OMSVGAnimatedLength getX() {
    return ((SVGPatternElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGPatternElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGPatternElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGPatternElement)ot).getHeight();
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGPatternElement)ot).getHref();
  }

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  public final OMSVGAnimatedRect getViewBox() {
    return ((SVGPatternElement)ot).getViewBox();
  }
  public final OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
    return ((SVGPatternElement)ot).getPreserveAspectRatio();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGPatternElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGPatternElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGPatternElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGPatternElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGPatternElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGPatternElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGPatternElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGPatternElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGPatternElement)ot).getExternalResourcesRequired();
  }

}
