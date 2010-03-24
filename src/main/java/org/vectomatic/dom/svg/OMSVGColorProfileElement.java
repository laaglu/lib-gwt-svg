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

import org.vectomatic.dom.svg.impl.SVGColorProfileElement;
import org.vectomatic.dom.svg.itf.ISVGRenderingIntent;
import org.vectomatic.dom.svg.itf.ISVGURIReference;

import com.google.gwt.dom.client.TagName;

@TagName("color-profile")
public class OMSVGColorProfileElement extends OMSVGElement implements ISVGURIReference, ISVGRenderingIntent {
  protected OMSVGColorProfileElement(SVGColorProfileElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGColorProfileElement W3C IDL interface
  public final String getLocal() {
    return ((SVGColorProfileElement)ot).getLocal();
  }
  public final void setLocal(java.lang.String value) {
    ((SVGColorProfileElement)ot).setLocal(value);
  }
  public final String getName() {
    return ((SVGColorProfileElement)ot).getName();
  }
  public final void setName(java.lang.String value) {
    ((SVGColorProfileElement)ot).setName(value);
  }
  public final short getRenderingIntent() {
    return ((SVGColorProfileElement)ot).getRenderingIntent();
  }
  public final void setRenderingIntent(short value) {
    ((SVGColorProfileElement)ot).setRenderingIntent(value);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  public final OMSVGAnimatedString getHref() {
    return ((SVGColorProfileElement)ot).getHref();
  }

  // Implementation of the svg::SVGRenderingIntent W3C IDL interface

}
