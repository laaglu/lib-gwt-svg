/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of libgwtsvg.
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

import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import org.vectomatic.dom.svg.events.HasDocumentHandlers;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.events.SVGZoomEvent;
import org.vectomatic.dom.svg.events.SVGZoomHandler;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.impl.SVGSVGElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGFitToViewBox;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGLocatable;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGZoomAndPan;

public class OMSVGSVGElement extends OMSVGElement implements HasGraphicalHandlers, HasDocumentHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGLocatable, ISVGFitToViewBox, ISVGZoomAndPan {
  public OMSVGSVGElement(SVGSVGElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGSVGElement W3C IDL interface
  public final OMSVGAnimatedLength getX() {
    return ((SVGSVGElement)ot).getX();
  }
  public final OMSVGAnimatedLength getY() {
    return ((SVGSVGElement)ot).getY();
  }
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGSVGElement)ot).getWidth();
  }
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGSVGElement)ot).getHeight();
  }
  public final String getContentScriptType() {
    return ((SVGSVGElement)ot).getContentScriptType();
  }
  public final void setContentScriptType(java.lang.String value) {
    ((SVGSVGElement)ot).setContentScriptType(value);
  }
  public final String getContentStyleType() {
    return ((SVGSVGElement)ot).getContentStyleType();
  }
  public final void setContentStyleType(java.lang.String value) {
    ((SVGSVGElement)ot).setContentStyleType(value);
  }
  public final OMSVGRect getViewport() {
    return ((SVGSVGElement)ot).getViewport();
  }
  public final float getPixelUnitToMillimeterX() {
    return ((SVGSVGElement)ot).getPixelUnitToMillimeterX();
  }
  public final float getPixelUnitToMillimeterY() {
    return ((SVGSVGElement)ot).getPixelUnitToMillimeterY();
  }
  public final float getScreenPixelToMillimeterX() {
    return ((SVGSVGElement)ot).getScreenPixelToMillimeterX();
  }
  public final float getScreenPixelToMillimeterY() {
    return ((SVGSVGElement)ot).getScreenPixelToMillimeterY();
  }
  public final boolean getUseCurrentView() {
    return ((SVGSVGElement)ot).getUseCurrentView();
  }
  public final void setUseCurrentView(boolean value) {
    ((SVGSVGElement)ot).setUseCurrentView(value);
  }
  public final OMSVGViewSpec getCurrentView() {
    return ((SVGSVGElement)ot).getCurrentView();
  }
  public final float getCurrentScale() {
    return ((SVGSVGElement)ot).getCurrentScale();
  }
  public final void setCurrentScale(float value) {
    ((SVGSVGElement)ot).setCurrentScale(value);
  }
  public final OMSVGPoint getCurrentTranslate() {
    return ((SVGSVGElement)ot).getCurrentTranslate();
  }
  public final int suspendRedraw(int max_wait_milliseconds) {
    return ((SVGSVGElement)ot).suspendRedraw(max_wait_milliseconds);
  }
  public final void unsuspendRedraw(int suspend_handle_id) {
    ((SVGSVGElement)ot).unsuspendRedraw(suspend_handle_id);
  }
  public final void unsuspendRedrawAll() {
    ((SVGSVGElement)ot).unsuspendRedrawAll();
  }
  public final void forceRedraw() {
    ((SVGSVGElement)ot).forceRedraw();
  }
  public final void pauseAnimations() {
    ((SVGSVGElement)ot).pauseAnimations();
  }
  public final void unpauseAnimations() {
    ((SVGSVGElement)ot).unpauseAnimations();
  }
  public final boolean animationsPaused() {
    return ((SVGSVGElement)ot).animationsPaused();
  }
  public final float getCurrentTime() {
    return ((SVGSVGElement)ot).getCurrentTime();
  }
  public final void setCurrentTime(float seconds) {
    ((SVGSVGElement)ot).setCurrentTime(seconds);
  }
  public final NodeList<? extends Node> getIntersectionList(OMSVGRect rect, OMSVGElement referenceElement) {
    return ((SVGSVGElement)ot).getIntersectionList(rect, ((SVGElement)referenceElement.ot));
  }
  public final NodeList<? extends Node> getEnclosureList(OMSVGRect rect, OMSVGElement referenceElement) {
    return ((SVGSVGElement)ot).getEnclosureList(rect, ((SVGElement)referenceElement.ot));
  }
  public final boolean checkIntersection(OMSVGElement element, OMSVGRect rect) {
    return ((SVGSVGElement)ot).checkIntersection(((SVGElement)element.ot), rect);
  }
  public final boolean checkEnclosure(OMSVGElement element, OMSVGRect rect) {
    return ((SVGSVGElement)ot).checkEnclosure(((SVGElement)element.ot), rect);
  }
  public final void deselectAll() {
    ((SVGSVGElement)ot).deselectAll();
  }
  public final OMSVGNumber createSVGNumber() {
    return ((SVGSVGElement)ot).createSVGNumber();
  }
  public final OMSVGLength createSVGLength() {
    return ((SVGSVGElement)ot).createSVGLength();
  }
  public final OMSVGAngle createSVGAngle() {
    return ((SVGSVGElement)ot).createSVGAngle();
  }
  public final OMSVGPoint createSVGPoint() {
    return ((SVGSVGElement)ot).createSVGPoint();
  }
  public final OMSVGMatrix createSVGMatrix() {
    return ((SVGSVGElement)ot).createSVGMatrix();
  }
  public final OMSVGRect createSVGRect() {
    return ((SVGSVGElement)ot).createSVGRect();
  }
  public final OMSVGTransform createSVGTransform() {
    return ((SVGSVGElement)ot).createSVGTransform();
  }
  public final OMSVGTransform createSVGTransformFromMatrix(OMSVGMatrix matrix) {
    return ((SVGSVGElement)ot).createSVGTransformFromMatrix(matrix);
  }
  public final OMElement getElementById(String elementId) {
    return (OMElement) convert(((SVGSVGElement)ot).getElementById(elementId));
  }

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  public final OMSVGAnimatedRect getViewBox() {
    return ((SVGSVGElement)ot).getViewBox();
  }
  public final OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
    return ((SVGSVGElement)ot).getPreserveAspectRatio();
  }

  // Implementation of the svg::SVGZoomAndPan W3C IDL interface
  public final short getZoomAndPan() {
    return ((SVGSVGElement)ot).getZoomAndPan();
  }
  public final void setZoomAndPan(short value) {
    ((SVGSVGElement)ot).setZoomAndPan(value);
  }

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGSVGElement)ot).getNearestViewportElement());
  }
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGSVGElement)ot).getFarthestViewportElement());
  }
  public final OMSVGRect getBBox() {
    return ((SVGSVGElement)ot).getBBox();
  }
  public final OMSVGMatrix getCTM() {
    return ((SVGSVGElement)ot).getCTM();
  }
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGSVGElement)ot).getScreenCTM();
  }
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) {
    return ((SVGSVGElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGSVGElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGSVGElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGSVGElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGSVGElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGSVGElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGSVGElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGSVGElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGSVGElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGSVGElement)ot).getExternalResourcesRequired();
  }

  @Override
  public final HandlerRegistration addResizeHandler(ResizeHandler handler) {
    return addHandler(handler, ResizeEvent.getType());
  }
  @Override
  public final HandlerRegistration addLoadHandler(LoadHandler handler) {
    return addDomHandler(handler, LoadEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
    return addDomHandler(handler, MouseDownEvent.getType());
  }
  @Override
  public final HandlerRegistration addBlurHandler(BlurHandler handler) {
    return addDomHandler(handler, BlurEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
    return addDomHandler(handler, MouseUpEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
    return addDomHandler(handler, MouseOverEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
    return addDomHandler(handler, MouseOutEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
    return addDomHandler(handler, MouseMoveEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusHandler(FocusHandler handler) {
    return addDomHandler(handler, FocusEvent.getType());
  }
  @Override
  public final HandlerRegistration addScrollHandler(ScrollHandler handler) {
    return addDomHandler(handler, ScrollEvent.getType());
  }
  @Override
  public final HandlerRegistration addSVGZoomHandler(SVGZoomHandler handler) {
    return addDomHandler(handler, SVGZoomEvent.getType());
  }
  @Override
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }
  
  // Helper methods
  public final OMSVGNumber createSVGNumber(float value) {
	OMSVGNumber number = createSVGNumber();
	number.setValue(value);
    return number;
  }
  public final OMSVGLength createSVGLength(short unitType, float valueInSpecifiedUnits) {
	OMSVGLength length = ((SVGSVGElement)ot).createSVGLength();
	length.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
	return length;
  }
  public final OMSVGAngle createSVGAngle(short unitType, float valueInSpecifiedUnits) {
	OMSVGAngle angle = ((SVGSVGElement)ot).createSVGAngle();
	angle.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
	return angle;
  }
  public final OMSVGPoint createSVGPoint(float x, float y) {
	OMSVGPoint point = ((SVGSVGElement)ot).createSVGPoint();
	point.setX(x);
	point.setY(y);
	return point;
  }
  public final OMSVGMatrix createSVGMatrix(float a, float b, float c, float d, float e, float f) {
	OMSVGMatrix matrix = ((SVGSVGElement)ot).createSVGMatrix();
	matrix.setA(a);
	matrix.setB(b);
	matrix.setC(c);
	matrix.setD(d);
	matrix.setE(e);
	matrix.setF(f);
	return matrix;
  }
  public final OMSVGRect createSVGRect(float x, float y, float width, float height) {
	OMSVGRect rect = ((SVGSVGElement)ot).createSVGRect();
	rect.setX(x);
	rect.setY(y);
	rect.setWidth(width);
	rect.setHeight(height);
	return rect;
  }

}
