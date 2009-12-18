/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGFilterPrimitiveStandardAttributes extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGFilterPrimitiveStandardAttributes() {
  }

  // Implementation of the nsIDOMSVGFilterPrimitiveStandardAttributes XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getResult() /*-{
    return this.result;
  }-*/;

  // Implementation of the nsIDOMSVGStylable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getClassName() /*-{
    return this.className;
  }-*/;
  public final native org.vectomatic.dom.css.OMStyleDeclaration getStyle() /*-{
    return this.style;
  }-*/;
  public final native org.vectomatic.dom.css.OMValue getPresentationAttribute(java.lang.String name) /*-{
    return this.getPresentationAttribute(name);
  }-*/;

}
