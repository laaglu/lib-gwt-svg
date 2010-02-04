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
import com.google.gwt.event.shared.HandlerRegistration;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.impl.SVGCircleElement;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGTransformable;

public class OMSVGCircleElement extends OMSVGElement implements HasGraphicalHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGTransformable {
  protected OMSVGCircleElement(SVGCircleElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGCircleElement W3C IDL interface
  public final OMSVGAnimatedLength getCx() {
    return ((SVGCircleElement)ot).getCx();
  }
  public final OMSVGAnimatedLength getCy() {
    return ((SVGCircleElement)ot).getCy();
  }
  public final OMSVGAnimatedLength getR() {
    return ((SVGCircleElement)ot).getR();
  }

  // Implementation of the svg::SVGTransformable W3C IDL interface
  public final OMSVGAnimatedTransformList getTransform() {
    return ((SVGCircleElement)ot).getTransform();
  }

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGCircleElement)ot).getNearestViewportElement());
  }
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGCircleElement)ot).getFarthestViewportElement());
  }
  public final OMSVGRect getBBox() {
    return ((SVGCircleElement)ot).getBBox();
  }
  public final OMSVGMatrix getCTM() {
    return ((SVGCircleElement)ot).getCTM();
  }
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGCircleElement)ot).getScreenCTM();
  }
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) {
    return ((SVGCircleElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGCircleElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGCircleElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGCircleElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGCircleElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGCircleElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGCircleElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGCircleElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGCircleElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGCircleElement)ot).getExternalResourcesRequired();
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
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }
}
