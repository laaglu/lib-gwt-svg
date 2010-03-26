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

import org.vectomatic.dom.svg.events.ActivateEvent;
import org.vectomatic.dom.svg.events.ActivateHandler;
import org.vectomatic.dom.svg.events.FocusInEvent;
import org.vectomatic.dom.svg.events.FocusInHandler;
import org.vectomatic.dom.svg.events.FocusOutEvent;
import org.vectomatic.dom.svg.events.FocusOutHandler;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.impl.SVGPathElement;
import org.vectomatic.dom.svg.itf.ISVGAnimatedPathData;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGTransformable;

import com.google.gwt.dom.client.TagName;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
import com.google.gwt.event.shared.HandlerRegistration;

@TagName("path")
public class OMSVGPathElement extends OMSVGElement implements HasGraphicalHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGTransformable, ISVGAnimatedPathData {
  protected OMSVGPathElement(SVGPathElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGPathElement W3C IDL interface
  public final OMSVGAnimatedNumber getPathLength() {
    return ((SVGPathElement)ot).getPathLength();
  }
  public final float getTotalLength() {
    return ((SVGPathElement)ot).getTotalLength();
  }
  public final OMSVGPoint getPointAtLength(float distance) {
    return ((SVGPathElement)ot).getPointAtLength(distance);
  }
  public final int getPathSegAtLength(float distance) {
    return ((SVGPathElement)ot).getPathSegAtLength(distance);
  }
  public final OMSVGPathSegClosePath createSVGPathSegClosePath() {
    return ((SVGPathElement)ot).createSVGPathSegClosePath();
  }
  public final OMSVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y) {
    return ((SVGPathElement)ot).createSVGPathSegMovetoAbs(x, y);
  }
  public final OMSVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y) {
    return ((SVGPathElement)ot).createSVGPathSegMovetoRel(x, y);
  }
  public final OMSVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y) {
    return ((SVGPathElement)ot).createSVGPathSegLinetoAbs(x, y);
  }
  public final OMSVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y) {
    return ((SVGPathElement)ot).createSVGPathSegLinetoRel(x, y);
  }
  public final OMSVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoCubicAbs(x, y, x1, y1, x2, y2);
  }
  public final OMSVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoCubicRel(x, y, x1, y1, x2, y2);
  }
  public final OMSVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoQuadraticAbs(x, y, x1, y1);
  }
  public final OMSVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoQuadraticRel(x, y, x1, y1);
  }
  public final OMSVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) {
    return ((SVGPathElement)ot).createSVGPathSegArcAbs(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }
  public final OMSVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) {
    return ((SVGPathElement)ot).createSVGPathSegArcRel(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }
  public final OMSVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x) {
    return ((SVGPathElement)ot).createSVGPathSegLinetoHorizontalAbs(x);
  }
  public final OMSVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x) {
    return ((SVGPathElement)ot).createSVGPathSegLinetoHorizontalRel(x);
  }
  public final OMSVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y) {
    return ((SVGPathElement)ot).createSVGPathSegLinetoVerticalAbs(y);
  }
  public final OMSVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y) {
    return ((SVGPathElement)ot).createSVGPathSegLinetoVerticalRel(y);
  }
  public final OMSVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoCubicSmoothAbs(x, y, x2, y2);
  }
  public final OMSVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoCubicSmoothRel(x, y, x2, y2);
  }
  public final OMSVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoQuadraticSmoothAbs(x, y);
  }
  public final OMSVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y) {
    return ((SVGPathElement)ot).createSVGPathSegCurvetoQuadraticSmoothRel(x, y);
  }

  // Implementation of the svg::SVGAnimatedPathData W3C IDL interface
  public final OMSVGPathSegList getPathSegList() {
    return ((SVGPathElement)ot).getPathSegList();
  }
  public final OMSVGPathSegList getNormalizedPathSegList() {
    return ((SVGPathElement)ot).getNormalizedPathSegList();
  }
  public final OMSVGPathSegList getAnimatedPathSegList() {
    return ((SVGPathElement)ot).getAnimatedPathSegList();
  }
  public final OMSVGPathSegList getAnimatedNormalizedPathSegList() {
    return ((SVGPathElement)ot).getAnimatedNormalizedPathSegList();
  }

  // Implementation of the svg::SVGTransformable W3C IDL interface
  public final OMSVGAnimatedTransformList getTransform() {
    return ((SVGPathElement)ot).getTransform();
  }

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGPathElement)ot).getNearestViewportElement());
  }
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGPathElement)ot).getFarthestViewportElement());
  }
  public final OMSVGRect getBBox() {
    return ((SVGPathElement)ot).getBBox();
  }
  public final OMSVGMatrix getCTM() {
    return ((SVGPathElement)ot).getCTM();
  }
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGPathElement)ot).getScreenCTM();
  }
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) {
    return ((SVGPathElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGPathElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGPathElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGPathElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGPathElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGPathElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGPathElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGPathElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGPathElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGPathElement)ot).getExternalResourcesRequired();
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
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }
  @Override
  public HandlerRegistration addFocusInHandler(FocusInHandler handler) {
    return addDomHandler(handler, FocusInEvent.getType());
  }
  @Override
  public HandlerRegistration addFocusOutHandler(FocusOutHandler handler) {
    return addDomHandler(handler, FocusOutEvent.getType());
  }
  @Override
  public HandlerRegistration addActivateHandler(ActivateHandler handler) {
    return addDomHandler(handler, ActivateEvent.getType());
  }
}
