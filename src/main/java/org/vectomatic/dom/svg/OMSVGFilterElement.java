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
 * along with libgwtsvg.  If not, see <http://www.gnu.org/licenses/>
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGFilterElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGFilterElement() {
  }

  // Implementation of the nsIDOMSVGFilterElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getFilterUnits() /*-{
    return this.filterUnits;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getPrimitiveUnits() /*-{
    return this.primitiveUnits;
  }-*/;
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
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getFilterResX() /*-{
    return this.filterResX;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedInteger getFilterResY() /*-{
    return this.filterResY;
  }-*/;
  public final native void setFilterRes(int filterResX, int filterResY) /*-{
    this.setFilterRes(filterResX, filterResY);
  }-*/;

  // Implementation of the nsIDOMSVGURIReference XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getHref() /*-{
    return this.href;
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

  // Implementation of the nsIDOMSVGUnitTypes XPCOM interface

}
