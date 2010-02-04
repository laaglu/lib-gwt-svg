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

import org.vectomatic.dom.svg.impl.SVGClipPathElement;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGTransformable;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;

public class OMSVGClipPathElement extends OMSVGElement implements ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGTransformable, ISVGUnitTypes {
  protected OMSVGClipPathElement(SVGClipPathElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGClipPathElement W3C IDL interface
  public final OMSVGAnimatedEnumeration getClipPathUnits() {
    return ((SVGClipPathElement)ot).getClipPathUnits();
  }

  // Implementation of the svg::SVGTransformable W3C IDL interface
  public final OMSVGAnimatedTransformList getTransform() {
    return ((SVGClipPathElement)ot).getTransform();
  }

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGClipPathElement)ot).getNearestViewportElement());
  }
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGClipPathElement)ot).getFarthestViewportElement());
  }
  public final OMSVGRect getBBox() {
    return ((SVGClipPathElement)ot).getBBox();
  }
  public final OMSVGMatrix getCTM() {
    return ((SVGClipPathElement)ot).getCTM();
  }
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGClipPathElement)ot).getScreenCTM();
  }
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) {
    return ((SVGClipPathElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGClipPathElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGClipPathElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGClipPathElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGClipPathElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGClipPathElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGClipPathElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGClipPathElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGClipPathElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGClipPathElement)ot).getExternalResourcesRequired();
  }

}
