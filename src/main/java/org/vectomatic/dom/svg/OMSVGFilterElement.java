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

import org.vectomatic.dom.svg.impl.SVGFilterElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;
import org.vectomatic.dom.svg.utils.SVGConstants;

public class OMSVGFilterElement extends OMSVGElement implements ISVGURIReference, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGUnitTypes {
  public static final String IN_SOURCE_GRAPHIC = SVGConstants.SVG_SOURCE_GRAPHIC_VALUE;
  public static final String IN_SOURCE_ALPHA = SVGConstants.SVG_SOURCE_ALPHA_VALUE;
  public static final String IN_BACKGROUND_IMAGE = SVGConstants.SVG_BACKGROUND_IMAGE_VALUE;
  public static final String IN_BACKGROUND_ALPHA = SVGConstants.SVG_BACKGROUND_ALPHA_VALUE;
  public static final String IN_FILL_PAINT = SVGConstants.SVG_FILL_PAINT_VALUE;
  public static final String IN_STROKE_PAINT = SVGConstants.SVG_STROKE_PAINT_VALUE;
	
  protected OMSVGFilterElement(SVGFilterElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFilterElement W3C IDL interface
  public final OMSVGAnimatedEnumeration getFilterUnits() {
    return ((SVGFilterElement)ot).getFilterUnits();
  }
  public final OMSVGAnimatedEnumeration getPrimitiveUnits() {
    return ((SVGFilterElement)ot).getPrimitiveUnits();
  }
  public final OMSVGAnimatedLength getX() {
    return ((SVGFilterElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGFilterElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGFilterElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGFilterElement)ot).getHeight();
  }
  public final OMSVGAnimatedInteger getFilterResX() {
    return ((SVGFilterElement)ot).getFilterResX();
  }
  public final OMSVGAnimatedInteger getFilterResY() {
    return ((SVGFilterElement)ot).getFilterResY();
  }
  public final void setFilterRes(int filterResX, int filterResY) {
    ((SVGFilterElement)ot).setFilterRes(filterResX, filterResY);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGFilterElement)ot).getHref();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGFilterElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGFilterElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGFilterElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGFilterElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGFilterElement)ot).getExternalResourcesRequired();
  }

}
