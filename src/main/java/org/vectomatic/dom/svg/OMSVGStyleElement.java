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

import org.vectomatic.dom.svg.impl.SVGStyleElement;

public class OMSVGStyleElement extends OMSVGElement {
  protected OMSVGStyleElement(SVGStyleElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGStyleElement W3C IDL interface
  public final String getXmlspace() {
    return ((SVGStyleElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGStyleElement)ot).setXmlspace(value);
  }
  public final String getType() {
    return ((SVGStyleElement)ot).getType();
  }
  public final void setType(java.lang.String value) {
    ((SVGStyleElement)ot).setType(value);
  }
  public final String getMedia() {
    return ((SVGStyleElement)ot).getMedia();
  }
  public final void setMedia(java.lang.String value) {
    ((SVGStyleElement)ot).setMedia(value);
  }

}
