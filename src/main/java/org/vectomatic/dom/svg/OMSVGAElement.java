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
public class OMSVGAElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGAElement() {
  }

  // Implementation of the nsIDOMSVGAElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getTarget() /*-{
    return this.target;
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

  // Implementation of the nsIDOMEventTarget XPCOM interface
  public final native void addEventListener(java.lang.String type, org.vectomatic.dom.events.OMEventListener listener, boolean useCapture) /*-{
    this.addEventListener(type, listener, useCapture);
  }-*/;
  public final native void removeEventListener(java.lang.String type, org.vectomatic.dom.events.OMEventListener listener, boolean useCapture) /*-{
    this.removeEventListener(type, listener, useCapture);
  }-*/;
  public final native boolean dispatchEvent(org.vectomatic.dom.events.OMEvent evt) /*-{
    return this.dispatchEvent(evt);
  }-*/;

}
