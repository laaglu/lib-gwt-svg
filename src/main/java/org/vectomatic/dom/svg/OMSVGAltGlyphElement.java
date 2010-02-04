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

import org.vectomatic.dom.svg.impl.SVGAltGlyphElement;
import org.vectomatic.dom.svg.itf.ISVGURIReference;

public class OMSVGAltGlyphElement extends OMSVGTextPositioningElement implements ISVGURIReference {
  protected OMSVGAltGlyphElement(SVGAltGlyphElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGAltGlyphElement W3C IDL interface
  public final String getGlyphRef() {
    return ((SVGAltGlyphElement)ot).getGlyphRef();
  }
  public final void setGlyphRef(java.lang.String value) {
    ((SVGAltGlyphElement)ot).setGlyphRef(value);
  }
  public final String getFormat() {
    return ((SVGAltGlyphElement)ot).getFormat();
  }
  public final void setFormat(java.lang.String value) {
    ((SVGAltGlyphElement)ot).setFormat(value);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGAltGlyphElement)ot).getHref();
  }

}
