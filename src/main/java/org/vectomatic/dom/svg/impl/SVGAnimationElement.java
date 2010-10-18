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

package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGAnimatedBoolean;
import org.vectomatic.dom.svg.OMSVGStringList;

import com.google.gwt.core.client.JavaScriptException;

/**
 * <p>The {@link org.vectomatic.dom.svg.impl.SVGAnimationElement} interface
 * is the base interface for all of the animation element interfaces: {@link
 * org.vectomatic.dom.svg.impl.SVGAnimateElement}, {@link org.vectomatic.dom.svg.impl.SVGSetElement},
 * {@link org.vectomatic.dom.svg.impl.SVGAnimateColorElement}, {@link org.vectomatic.dom.svg.impl.SVGAnimateMotionElement}
 * and {@link org.vectomatic.dom.svg.impl.SVGAnimateTransformElement}.</p>
 * <p>Unlike other SVG DOM interfaces, the SVG DOM does not specify convenience
 * DOM properties corresponding to the various language attributes on SVG's
 * animation elements. Specification of these convenience properties in a
 * way that will be compatible with future versions of SMIL Animation is expected
 * in a future version of SVG. The current method for accessing and modifying
 * the attributes on the animation elements is to use the standard <code>getAttribute</code>,
 * <code>setAttribute</code>, <code>getAttributeNS</code> and <code>setAttributeNS</code>
 * defined in <a href="http://www.w3.org/TR/2000/REC-DOM-Level-2-Core-20001113/">DOM
 * Level 2 Core</a> [<a href="refs.html#ref-DOM2">DOM2</a>].</p>
 */
public class SVGAnimationElement extends SVGElement {
  protected SVGAnimationElement() {
  }

  // Implementation of the svg::SVGAnimationElement W3C IDL interface
  /**
   * The element which is being animated.
   */
  public final native SVGElement getTargetElement() /*-{
    return this.targetElement;
  }-*/;
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
  public final native float getStartTime() throws JavaScriptException /*-{
    return this.getStartTime();
  }-*/;
  /**
   * Returns the current time in seconds relative to time zero for the given
   * time container.
   * @return The current time in seconds relative to time zero for the given
   * time container.
   */
  public final native float getCurrentTime() /*-{
    return this.getCurrentTime();
  }-*/;
  /**
   * Returns the number of seconds for the simple duration for this animation.
   * If the simple duration is undefined (e.g., the end time is indefinite),
   * then an exception is raised.
   * @return number of seconds for the simple duration for this animation.
   * @throws DOMException(NOT_SUPPORTED_ERR) The simple duration is not   determined
   * on the given element.
   */
  public final native float getSimpleDuration() throws JavaScriptException /*-{
    return this.getSimpleDuration();
  }-*/;

  // Implementation of the smil::ElementTimeControl W3C IDL interface
  /**
   * Creates a begin instance time for the current time. The new instance time
   * is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>begin
   * instance times list</em></a>. The behavior of this method is equivalent
   * to <code>beginElementAt(0)</code>.
   */
  public final native void beginElement() /*-{
    this.beginElement();
  }-*/;
  /**
   * Creates a begin instance time for the current time plus the specified offset.
   * The new instance time is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>begin
   * instance times list</em></a>.
   * @param offset The offset from the current document time, in seconds, at
   * which to begin the element.
   */
  public final native void beginElementAt(float offset) /*-{
    this.beginElementAt(offset);
  }-*/;
  /**
   * Creates an end instance time for the current time. The new instance time
   * is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>end
   * instance times list</em></a>. The behavior of this method is equivalent
   * to <code>endElementAt(0)</code>.
   */
  public final native void endElement() /*-{
    this.endElement();
  }-*/;
  /**
   * Creates a end instance time for the current time plus the specified offset.
   * The new instance time is added to the <a href="http://www.w3.org/TR/2001/REC-smil-animation-20010904/#Timing-BeginEnd-InstanceTimesLists"><em>end
   * instance times list</em></a>.
   * @param offset offset from the current document time, in seconds, at   which
   * to end the element.
   */
  public final native void endElementAt(float offset) /*-{
    this.endElementAt(offset);
  }-*/;

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
  public final native OMSVGAnimatedBoolean getExternalResourcesRequired() /*-{
    return this.externalResourcesRequired;
  }-*/;

  // Implementation of the svg::SVGTests W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredFeatures()}
   * on the given element.
   */
  public final native OMSVGStringList getRequiredFeatures() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredFeatures);
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredExtensions()}
   * on the given element.
   */
  public final native OMSVGStringList getRequiredExtensions() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.requiredExtensions);
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getSystemLanguage()}
   * on the given element.
   */
  public final native OMSVGStringList getSystemLanguage() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.systemLanguage);
  }-*/;
  /**
   * Returns true if the user agent supports the given extension, specified
   * by a URI.
   * @param extension The name of the extension, expressed as a URI.
   * @return True or false, depending on whether the given extension is   supported.
   */
  public final native boolean hasExtension(String extension) /*-{
    return this.hasExtension(extension);
  }-*/;

}
