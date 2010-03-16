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

import org.vectomatic.dom.svg.impl.SVGMaskElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;

public class OMSVGMaskElement extends OMSVGElement implements ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGUnitTypes {
  protected OMSVGMaskElement(SVGMaskElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGMaskElement W3C IDL interface
  public final OMSVGAnimatedEnumeration getMaskUnits() {
    return ((SVGMaskElement)ot).getMaskUnits();
  }
  public final OMSVGAnimatedEnumeration getMaskContentUnits() {
    return ((SVGMaskElement)ot).getMaskContentUnits();
  }
  public final OMSVGAnimatedLength getX() {
    return ((SVGMaskElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGMaskElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGMaskElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGMaskElement)ot).getHeight();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGMaskElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGMaskElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGMaskElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGMaskElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGMaskElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGMaskElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGMaskElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGMaskElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGMaskElement)ot).getExternalResourcesRequired();
  }

}
