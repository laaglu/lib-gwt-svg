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

import org.vectomatic.dom.svg.impl.SVGGlyphRefElement;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGURIReference;

import com.google.gwt.dom.client.TagName;

@TagName("glyphRef")
public class OMSVGGlyphRefElement extends OMSVGElement implements ISVGURIReference, ISVGStylable {
  protected OMSVGGlyphRefElement(SVGGlyphRefElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGGlyphRefElement W3C IDL interface
  public final String getGlyphRef() {
    return ((SVGGlyphRefElement)ot).getGlyphRef();
  }
  public final void setGlyphRef(java.lang.String value) {
    ((SVGGlyphRefElement)ot).setGlyphRef(value);
  }
  public final String getFormat() {
    return ((SVGGlyphRefElement)ot).getFormat();
  }
  public final void setFormat(java.lang.String value) {
    ((SVGGlyphRefElement)ot).setFormat(value);
  }
  public final float getX() {
    return ((SVGGlyphRefElement)ot).getX();
  }
  public final void setX(float value) {
    ((SVGGlyphRefElement)ot).setX(value);
  }
  public final float getY() {
    return ((SVGGlyphRefElement)ot).getY();
  }
  public final void setY(float value) {
    ((SVGGlyphRefElement)ot).setY(value);
  }
  public final float getDx() {
    return ((SVGGlyphRefElement)ot).getDx();
  }
  public final void setDx(float value) {
    ((SVGGlyphRefElement)ot).setDx(value);
  }
  public final float getDy() {
    return ((SVGGlyphRefElement)ot).getDy();
  }
  public final void setDy(float value) {
    ((SVGGlyphRefElement)ot).setDy(value);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGGlyphRefElement)ot).getHref();
  }

}
