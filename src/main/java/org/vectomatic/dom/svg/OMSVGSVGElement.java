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
public class OMSVGSVGElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGSVGElement() {
  }

  // Implementation of the nsIDOMSVGSVGElement XPCOM interface
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
  public final native java.lang.String getContentScriptType() /*-{
    return this.contentScriptType;
  }-*/;
  public final native void setContentScriptType(java.lang.String value) /*-{
    this.contentScriptType = value;
  }-*/;
  public final native java.lang.String getContentStyleType() /*-{
    return this.contentStyleType;
  }-*/;
  public final native void setContentStyleType(java.lang.String value) /*-{
    this.contentStyleType = value;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGRect getViewport() /*-{
    return this.viewport;
  }-*/;
  public final native float getPixelUnitToMillimeterX() /*-{
    return this.pixelUnitToMillimeterX;
  }-*/;
  public final native float getPixelUnitToMillimeterY() /*-{
    return this.pixelUnitToMillimeterY;
  }-*/;
  public final native float getScreenPixelToMillimeterX() /*-{
    return this.screenPixelToMillimeterX;
  }-*/;
  public final native float getScreenPixelToMillimeterY() /*-{
    return this.screenPixelToMillimeterY;
  }-*/;
  public final native boolean getUseCurrentView() /*-{
    return this.useCurrentView;
  }-*/;
  public final native void setUseCurrentView(boolean value) /*-{
    this.useCurrentView = value;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGViewSpec getCurrentView() /*-{
    return this.currentView;
  }-*/;
  public final native float getCurrentScale() /*-{
    return this.currentScale;
  }-*/;
  public final native void setCurrentScale(float value) /*-{
    this.currentScale = value;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint getCurrentTranslate() /*-{
    return this.currentTranslate;
  }-*/;
  public final native int suspendRedraw(int max_wait_milliseconds) /*-{
    return this.suspendRedraw(max_wait_milliseconds);
  }-*/;
  public final native void unsuspendRedraw(int suspend_handle_id) /*-{
    this.unsuspendRedraw(suspend_handle_id);
  }-*/;
  public final native void unsuspendRedrawAll() /*-{
    this.unsuspendRedrawAll();
  }-*/;
  public final native void forceRedraw() /*-{
    this.forceRedraw();
  }-*/;
  public final native void pauseAnimations() /*-{
    this.pauseAnimations();
  }-*/;
  public final native void unpauseAnimations() /*-{
    this.unpauseAnimations();
  }-*/;
  public final native boolean animationsPaused() /*-{
    return this.animationsPaused();
  }-*/;
  public final native float getCurrentTime() /*-{
    return this.getCurrentTime();
  }-*/;
  public final native void setCurrentTime(float seconds) /*-{
    this.setCurrentTime(seconds);
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getIntersectionList(org.vectomatic.dom.svg.OMSVGRect rect, org.vectomatic.dom.svg.OMSVGElement referenceElement) /*-{
    return this.getIntersectionList(rect, referenceElement);
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getEnclosureList(org.vectomatic.dom.svg.OMSVGRect rect, org.vectomatic.dom.svg.OMSVGElement referenceElement) /*-{
    return this.getEnclosureList(rect, referenceElement);
  }-*/;
  public final native boolean checkIntersection(org.vectomatic.dom.svg.OMSVGElement element, org.vectomatic.dom.svg.OMSVGRect rect) /*-{
    return this.checkIntersection(element, rect);
  }-*/;
  public final native boolean checkEnclosure(org.vectomatic.dom.svg.OMSVGElement element, org.vectomatic.dom.svg.OMSVGRect rect) /*-{
    return this.checkEnclosure(element, rect);
  }-*/;
  public final native void deSelectAll() /*-{
    this.deSelectAll();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGNumber createSVGNumber() /*-{
    return this.createSVGNumber();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGLength createSVGLength() /*-{
    return this.createSVGLength();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAngle createSVGAngle() /*-{
    return this.createSVGAngle();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint createSVGPoint() /*-{
    return this.createSVGPoint();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix createSVGMatrix() /*-{
    return this.createSVGMatrix();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGRect createSVGRect() /*-{
    return this.createSVGRect();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGTransform createSVGTransform() /*-{
    return this.createSVGTransform();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGTransform createSVGTransformFromMatrix(org.vectomatic.dom.svg.OMSVGMatrix matrix) /*-{
    return this.createSVGTransformFromMatrix(matrix);
  }-*/;
  public final native java.lang.String createSVGString() /*-{
    return this.createSVGString();
  }-*/;
  public final native org.vectomatic.dom.OMElement getElementById(java.lang.String elementId) /*-{
    return this.getElementById(elementId);
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

  // Implementation of the nsIDOMSVGFitToViewBox XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

  // Implementation of the nsIDOMSVGZoomAndPan XPCOM interface
  public final native short getZoomAndPan() /*-{
    return this.zoomAndPan;
  }-*/;
  public final native void setZoomAndPan(short value) /*-{
    this.zoomAndPan = value;
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

  // Implementation of the nsIDOMDocumentEvent XPCOM interface
  public final native org.vectomatic.dom.events.OMEvent createEvent(java.lang.String eventType) /*-{
    return this.createEvent(eventType);
  }-*/;

  // Implementation of the nsIDOMViewCSS XPCOM interface
  public final native org.vectomatic.dom.css.OMStyleDeclaration getComputedStyle(org.vectomatic.dom.OMElement elt, java.lang.String pseudoElt) /*-{
    return this.getComputedStyle(elt, pseudoElt);
  }-*/;

  // Implementation of the nsIDOMAbstractView XPCOM interface
  public final native org.vectomatic.dom.views.OMDocumentView getDocument() /*-{
    return this.document;
  }-*/;

  // Implementation of the nsIDOMDocumentCSS XPCOM interface
  public final native org.vectomatic.dom.css.OMStyleDeclaration getOverrideStyle(org.vectomatic.dom.OMElement elt, java.lang.String pseudoElt) /*-{
    return this.getOverrideStyle(elt, pseudoElt);
  }-*/;

  // Implementation of the nsIDOMDocumentStyle XPCOM interface
  public final native org.vectomatic.dom.stylesheets.OMStyleSheetList getStyleSheets() /*-{
    return this.styleSheets;
  }-*/;

}
