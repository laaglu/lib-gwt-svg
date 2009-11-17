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
public class OMSVGGradientElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGGradientElement() {
  }

  // Implementation of the nsIDOMSVGGradientElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getGradientUnits() /*-{
    return this.gradientUnits;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedTransformList getGradientTransform() /*-{
    return this.gradientTransform;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedEnumeration getSpreadMethod() /*-{
    return this.spreadMethod;
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
