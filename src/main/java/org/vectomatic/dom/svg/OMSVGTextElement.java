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
public class OMSVGTextElement extends org.vectomatic.dom.svg.OMSVGTextPositioningElement {
  protected OMSVGTextElement() {
  }

  // Implementation of the nsIDOMSVGTextElement XPCOM interface

  // Implementation of the nsIDOMSVGTransformable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedTransformList getTransform() /*-{
    return this.transform;
  }-*/;

  // Implementation of the nsIDOMSVGLocatable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGElement getNearestViewportElement() /*-{
    return this.nearestViewportElement;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGElement getFarthestViewportElement() /*-{
    return this.farthestViewportElement;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGRect getBBox() /*-{
    return this.getBBox();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getCTM() /*-{
    return this.getCTM();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getScreenCTM() /*-{
    return this.getScreenCTM();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getTransformToElement(org.vectomatic.dom.svg.OMSVGElement element) /*-{
    return this.getTransformToElement(element);
  }-*/;

}
