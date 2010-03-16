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
package org.vectomatic.dom.svg.impl;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import org.vectomatic.dom.svg.OMSVGAngle;
import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio;
import org.vectomatic.dom.svg.OMSVGAnimatedRect;
import org.vectomatic.dom.svg.OMSVGLength;
import org.vectomatic.dom.svg.OMSVGMatrix;
import org.vectomatic.dom.svg.OMSVGNumber;
import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;
import org.vectomatic.dom.svg.OMSVGStringList;
import org.vectomatic.dom.svg.OMSVGTransform;
import org.vectomatic.dom.svg.OMSVGViewSpec;

public class SVGSVGElement extends SVGElement {
  protected SVGSVGElement() {
  }

  // Implementation of the svg::SVGSVGElement W3C IDL interface
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  public final native String getContentScriptType() /*-{
    return this.contentScriptType;
  }-*/;
  public final native void setContentScriptType(String value) /*-{
    this.contentScriptType = value;
  }-*/;
  public final native String getContentStyleType() /*-{
    return this.contentStyleType;
  }-*/;
  public final native void setContentStyleType(String value) /*-{
    this.contentStyleType = value;
  }-*/;
  public final native OMSVGRect getViewport() /*-{
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
  public final native OMSVGViewSpec getCurrentView() /*-{
    return this.currentView;
  }-*/;
  public final native float getCurrentScale() /*-{
    return this.currentScale;
  }-*/;
  public final native void setCurrentScale(float value) /*-{
    this.currentScale = value;
  }-*/;
  public final native OMSVGPoint getCurrentTranslate() /*-{
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
  public final native NodeList<? extends Node> getIntersectionList(OMSVGRect rect, SVGElement referenceElement) /*-{
    return this.getIntersectionList(rect, referenceElement);
  }-*/;
  public final native NodeList<? extends Node> getEnclosureList(OMSVGRect rect, SVGElement referenceElement) /*-{
    return this.getEnclosureList(rect, referenceElement);
  }-*/;
  public final native boolean checkIntersection(SVGElement element, OMSVGRect rect) /*-{
    return this.checkIntersection(element, rect);
  }-*/;
  public final native boolean checkEnclosure(SVGElement element, OMSVGRect rect) /*-{
    return this.checkEnclosure(element, rect);
  }-*/;
  public final native void deselectAll() /*-{
    this.deselectAll();
  }-*/;
  public final native OMSVGNumber createSVGNumber() /*-{
    return this.createSVGNumber();
  }-*/;
  public final native OMSVGLength createSVGLength() /*-{
    return this.createSVGLength();
  }-*/;
  public final native OMSVGAngle createSVGAngle() /*-{
    return this.createSVGAngle();
  }-*/;
  public final native OMSVGPoint createSVGPoint() /*-{
    return this.createSVGPoint();
  }-*/;
  public final native OMSVGMatrix createSVGMatrix() /*-{
    return this.createSVGMatrix();
  }-*/;
  public final native OMSVGRect createSVGRect() /*-{
    return this.createSVGRect();
  }-*/;
  public final native OMSVGTransform createSVGTransform() /*-{
    return this.createSVGTransform();
  }-*/;
  public final native OMSVGTransform createSVGTransformFromMatrix(OMSVGMatrix matrix) /*-{
    return this.createSVGTransformFromMatrix(matrix);
  }-*/;
  public final native Element getElementById(String elementId) /*-{
    return this.getElementById(elementId);
  }-*/;

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  public final native OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  public final native OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

  // Implementation of the svg::SVGZoomAndPan W3C IDL interface
  public final native short getZoomAndPan() /*-{
    return this.zoomAndPan;
  }-*/;
  public final native void setZoomAndPan(short value) /*-{
    this.zoomAndPan = value;
  }-*/;

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final native SVGElement getNearestViewportElement() /*-{
    return this.nearestViewportElement;
  }-*/;
  public final native SVGElement getFarthestViewportElement() /*-{
    return this.farthestViewportElement;
  }-*/;
  public final native OMSVGRect getBBox() /*-{
    return this.getBBox();
  }-*/;
  public final native OMSVGMatrix getCTM() /*-{
    return this.getCTM();
  }-*/;
  public final native OMSVGMatrix getScreenCTM() /*-{
    return this.getScreenCTM();
  }-*/;
  public final native OMSVGMatrix getTransformToElement(SVGElement element) /*-{
    return this.getTransformToElement(element);
  }-*/;

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final native String getXmllang() /*-{
    return this.xmllang;
  }-*/;
  public final native void setXmllang(String value) /*-{
    this.xmllang = value;
  }-*/;
  public final native String getXmlspace() /*-{
    return this.xmlspace;
  }-*/;
  public final native void setXmlspace(String value) /*-{
    this.xmlspace = value;
  }-*/;

  // Implementation of the svg::SVGTests W3C IDL interface
  public final native OMSVGStringList getRequiredFeatures() /*-{
    return this.requiredFeatures;
  }-*/;
  public final native OMSVGStringList getRequiredExtensions() /*-{
    return this.requiredExtensions;
  }-*/;
  public final native OMSVGStringList getSystemLanguage() /*-{
    return this.systemLanguage;
  }-*/;
  public final native boolean hasExtension(String extension) /*-{
    return this.hasExtension(extension);
  }-*/;

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

}
