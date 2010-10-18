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
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.events.ActivateEvent;
import org.vectomatic.dom.svg.events.ActivateHandler;
import org.vectomatic.dom.svg.events.BeginEvent;
import org.vectomatic.dom.svg.events.BeginHandler;
import org.vectomatic.dom.svg.events.EndEvent;
import org.vectomatic.dom.svg.events.EndHandler;
import org.vectomatic.dom.svg.events.FocusInEvent;
import org.vectomatic.dom.svg.events.FocusInHandler;
import org.vectomatic.dom.svg.events.FocusOutEvent;
import org.vectomatic.dom.svg.events.FocusOutHandler;
import org.vectomatic.dom.svg.events.HasAnimationHandlers;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.events.RepeatEvent;
import org.vectomatic.dom.svg.events.RepeatHandler;
import org.vectomatic.dom.svg.impl.SVGAnimationElement;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGTests;

import com.google.gwt.core.client.JavaScriptException;
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

/**
 * <p>The {@link org.vectomatic.dom.svg.OMSVGAnimationElement} interface is
 * the base interface for all of the animation element interfaces: {@link
 * org.vectomatic.dom.svg.OMSVGAnimateElement}, {@link org.vectomatic.dom.svg.OMSVGSetElement},
 * {@link org.vectomatic.dom.svg.OMSVGAnimateColorElement}, {@link org.vectomatic.dom.svg.OMSVGAnimateMotionElement}
 * and {@link org.vectomatic.dom.svg.OMSVGAnimateTransformElement}.</p> <p>Unlike
 * other SVG DOM interfaces, the SVG DOM does not specify convenience DOM
 * properties corresponding to the various language attributes on SVG's animation
 * elements. Specification of these convenience properties in a way that will
 * be compatible with future versions of SMIL Animation is expected in a future
 * version of SVG. The current method for accessing and modifying the attributes
 * on the animation elements is to use the standard <code>getAttribute</code>,
 * <code>setAttribute</code>, <code>getAttributeNS</code> and <code>setAttributeNS</code>
 * defined in <a href="http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/">DOM
 * Level 2 Core</a> [<a href="refs.html#ref-DOM2">DOM2</a>].</p>
 */
public abstract class OMSVGAnimationElement extends OMSVGElement implements HasGraphicalHandlers, HasAnimationHandlers, ISVGTests, ISVGExternalResourcesRequired {
  protected OMSVGAnimationElement(SVGAnimationElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGAnimationElement W3C IDL interface
  /**
   * The element which is being animated.
   */
  public final OMSVGElement getTargetElement() {
    return (OMSVGElement)convert(((SVGAnimationElement)ot).getTargetElement());
  }
  /**
   * Returns the begin time, in seconds, for this animation element's current
   * interval, if it exists, regardless of whether the interval has begun yet.
   * If there is no current interval, then a DOMException with code INVALID_STATE_ERR
   * is thrown.
   * @return The start time, in seconds, of this animation element's current
   * interval.
   * @throws DOMException(INVALID_STATE_ERR) The animation element does not
   * have a current interval.
   */
  public final float getStartTime() throws JavaScriptException {
    return ((SVGAnimationElement)ot).getStartTime();
  }
  /**
   * Returns the current time in seconds relative to time zero for the given
   * time container.
   * @return The current time in seconds relative to time zero for the given
   * time container.
   */
  public final float getCurrentTime() {
    return ((SVGAnimationElement)ot).getCurrentTime();
  }
  /**
   * Returns the number of seconds for the simple duration for this animation.
   * If the simple duration is undefined (e.g., the end time is indefinite),
   * then an exception is raised.
   * @return number of seconds for the simple duration for this animation.
   * @throws DOMException(NOT_SUPPORTED_ERR) The simple duration is not   determined
   * on the given element.
   */
  public final float getSimpleDuration() throws JavaScriptException {
    return ((SVGAnimationElement)ot).getSimpleDuration();
  }

  // Implementation of the smil::ElementTimeControl W3C IDL interface
  /**
   * Creates a begin instance time for the current time. The new instance time
   * is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>begin
   * instance times list</em></a>. The behavior of this method is equivalent
   * to <code>beginElementAt(0)</code>.
   */
  public final void beginElement() {
    ((SVGAnimationElement)ot).beginElement();
  }
  /**
   * Creates a begin instance time for the current time plus the specified offset.
   * The new instance time is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>begin
   * instance times list</em></a>.
   * @param offset The offset from the current document time, in seconds, at
   * which to begin the element.
   */
  public final void beginElementAt(float offset) {
    ((SVGAnimationElement)ot).beginElementAt(offset);
  }
  /**
   * Creates an end instance time for the current time. The new instance time
   * is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>end
   * instance times list</em></a>. The behavior of this method is equivalent
   * to <code>endElementAt(0)</code>.
   */
  public final void endElement() {
    ((SVGAnimationElement)ot).endElement();
  }
  /**
   * Creates a end instance time for the current time plus the specified offset.
   * The new instance time is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>end
   * instance times list</em></a>.
   * @param offset offset from the current document time, in seconds, at   which
   * to end the element.
   */
  public final void endElementAt(float offset) {
    ((SVGAnimationElement)ot).endElementAt(offset);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * on the given element. Note that the SVG DOM defines the attribute {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * as being of type {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean}, whereas
   * the SVG language definition says that {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * is not animated. Because the SVG language definition states that {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * cannot be animated, the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getAnimVal()}
   * will always be the same as the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getBaseVal()}.
   */
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGAnimationElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredFeatures()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGAnimationElement)ot).getRequiredFeatures();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredExtensions()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGAnimationElement)ot).getRequiredExtensions();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getSystemLanguage()}
   * on the given element.
   */
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGAnimationElement)ot).getSystemLanguage();
  }
  /**
   * Returns true if the user agent supports the given extension, specified
   * by a URI.
   * @param extension The name of the extension, expressed as a URI.
   * @return True or false, depending on whether the given extension is   supported.
   */
  public final boolean hasExtension(String extension) {
    return ((SVGAnimationElement)ot).hasExtension(extension);
  }

  @Override
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
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
  public final HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
    return addDomHandler(handler, MouseMoveEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
    return addDomHandler(handler, MouseOutEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
    return addDomHandler(handler, MouseOverEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
    return addDomHandler(handler, MouseUpEvent.getType());
  }
  @Override
  public final HandlerRegistration addActivateHandler(ActivateHandler handler) {
    return addDomHandler(handler, ActivateEvent.getType());
  }
  @Override
  public final HandlerRegistration addBeginHandler(BeginHandler handler) {
    return addDomHandler(handler, BeginEvent.getType());
  }
  @Override
  public final HandlerRegistration addEndHandler(EndHandler handler) {
    return addDomHandler(handler, EndEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusInHandler(FocusInHandler handler) {
    return addDomHandler(handler, FocusInEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusOutHandler(FocusOutHandler handler) {
    return addDomHandler(handler, FocusOutEvent.getType());
  }
  @Override
  public final HandlerRegistration addRepeatHandler(RepeatHandler handler) {
    return addDomHandler(handler, RepeatEvent.getType());
  }
}
