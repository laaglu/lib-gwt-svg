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
import org.vectomatic.dom.svg.impl.SVGDefsElement;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGTransformable;

public class OMSVGDefsElement extends OMSVGElement implements HasGraphicalHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGTransformable {
  protected OMSVGDefsElement(SVGDefsElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGDefsElement W3C IDL interface

  // Implementation of the svg::SVGTransformable W3C IDL interface
  public final OMSVGAnimatedTransformList getTransform() {
    return ((SVGDefsElement)ot).getTransform();
  }

  // Implementation of the svg::SVGLocatable W3C IDL interface
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGDefsElement)ot).getNearestViewportElement());
  }
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGDefsElement)ot).getFarthestViewportElement());
  }
  public final OMSVGRect getBBox() {
    return ((SVGDefsElement)ot).getBBox();
  }
  public final OMSVGMatrix getCTM() {
    return ((SVGDefsElement)ot).getCTM();
  }
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGDefsElement)ot).getScreenCTM();
  }
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) {
    return ((SVGDefsElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGDefsElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGDefsElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGDefsElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGDefsElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGDefsElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGDefsElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGDefsElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGDefsElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGDefsElement)ot).getExternalResourcesRequired();
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
