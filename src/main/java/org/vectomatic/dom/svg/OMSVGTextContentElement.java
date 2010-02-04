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
import org.vectomatic.dom.svg.impl.SVGTextContentElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;

public abstract class OMSVGTextContentElement extends OMSVGElement implements HasGraphicalHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable {
  public static final short LENGTHADJUST_UNKNOWN = 0;
  public static final short LENGTHADJUST_SPACING = 1;
  public static final short LENGTHADJUST_SPACINGANDGLYPHS = 2;
  protected OMSVGTextContentElement(SVGTextContentElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextContentElement W3C IDL interface
  public final OMSVGAnimatedLength getTextLength() {
    return ((SVGTextContentElement)ot).getTextLength();
  }
  public final OMSVGAnimatedEnumeration getLengthAdjust() {
    return ((SVGTextContentElement)ot).getLengthAdjust();
  }
  public final int getNumberOfChars() {
    return ((SVGTextContentElement)ot).getNumberOfChars();
  }
  public final float getComputedTextLength() {
    return ((SVGTextContentElement)ot).getComputedTextLength();
  }
  public final float getSubStringLength(int charnum, int nchars) {
    return ((SVGTextContentElement)ot).getSubStringLength(charnum, nchars);
  }
  public final OMSVGPoint getStartPositionOfChar(int charnum) {
    return ((SVGTextContentElement)ot).getStartPositionOfChar(charnum);
  }
  public final OMSVGPoint getEndPositionOfChar(int charnum) {
    return ((SVGTextContentElement)ot).getEndPositionOfChar(charnum);
  }
  public final OMSVGRect getExtentOfChar(int charnum) {
    return ((SVGTextContentElement)ot).getExtentOfChar(charnum);
  }
  public final float getRotationOfChar(int charnum) {
    return ((SVGTextContentElement)ot).getRotationOfChar(charnum);
  }
  public final int getCharNumAtPosition(OMSVGPoint point) {
    return ((SVGTextContentElement)ot).getCharNumAtPosition(point);
  }
  public final void selectSubString(int charnum, int nchars) {
    ((SVGTextContentElement)ot).selectSubString(charnum, nchars);
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGTextContentElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGTextContentElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGTextContentElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGTextContentElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGTextContentElement)ot).getRequiredFeatures();
  }
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGTextContentElement)ot).getRequiredExtensions();
  }
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGTextContentElement)ot).getSystemLanguage();
  }
  public final boolean hasExtension(String extension) {
    return ((SVGTextContentElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGTextContentElement)ot).getExternalResourcesRequired();
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
