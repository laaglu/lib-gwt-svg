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

import org.vectomatic.dom.svg.impl.SVGTextPathElement;
import org.vectomatic.dom.svg.itf.ISVGURIReference;

import com.google.gwt.dom.client.TagName;

@TagName("textPath")
public class OMSVGTextPathElement extends OMSVGTextContentElement implements ISVGURIReference {
  public static final short TEXTPATH_METHODTYPE_UNKNOWN = 0;
  public static final short TEXTPATH_METHODTYPE_ALIGN = 1;
  public static final short TEXTPATH_METHODTYPE_STRETCH = 2;
  public static final short TEXTPATH_SPACINGTYPE_UNKNOWN = 0;
  public static final short TEXTPATH_SPACINGTYPE_AUTO = 1;
  public static final short TEXTPATH_SPACINGTYPE_EXACT = 2;
  protected OMSVGTextPathElement(SVGTextPathElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextPathElement W3C IDL interface
  public final OMSVGAnimatedLength getStartOffset() {
    return ((SVGTextPathElement)ot).getStartOffset();
  }
  public final OMSVGAnimatedEnumeration getMethod() {
    return ((SVGTextPathElement)ot).getMethod();
  }
  public final OMSVGAnimatedEnumeration getSpacing() {
    return ((SVGTextPathElement)ot).getSpacing();
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGTextPathElement)ot).getHref();
  }

}
