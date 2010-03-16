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

import org.vectomatic.dom.svg.impl.SVGFEImageElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGFilterPrimitiveStandardAttributes;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGURIReference;

public class OMSVGFEImageElement extends OMSVGElement implements ISVGURIReference, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGFilterPrimitiveStandardAttributes {
  protected OMSVGFEImageElement(SVGFEImageElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEImageElement W3C IDL interface

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGFEImageElement)ot).getHref();
  }

  // Implementation of the svg::SVGFilterPrimitiveStandardAttributes W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGFEImageElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFEImageElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFEImageElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFEImageElement)ot).getHeight();
  }
  public final OMSVGAnimatedString getResult() {
    return ((SVGFEImageElement)ot).getResult();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGFEImageElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGFEImageElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGFEImageElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGFEImageElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGFEImageElement)ot).getExternalResourcesRequired();
  }

}
