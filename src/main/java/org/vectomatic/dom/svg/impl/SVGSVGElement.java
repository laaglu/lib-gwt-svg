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

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;

/**
 * <p>A key interface definition is the {@link org.vectomatic.dom.svg.impl.SVGSVGElement}
 * interface, which is the interface that corresponds to the <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
 * title='svg element specification'>svg</a> element. This interface contains
 * various miscellaneous commonly-used utility methods, such as matrix operations
 * and the ability to control the time of redraw on visual rendering devices.</p>
 * <p>{@link org.vectomatic.dom.svg.impl.SVGSVGElement} extends <code>ViewCSS</code>
 * and <code>DocumentCSS</code> to provide access to the computed values of
 * properties and the override style sheet as described in <a href="http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113/"><cite>DOM
 * Level 2 Style</cite></a> [<a href="refs.html#ref-DOM2STYLE">DOM2STYLE</a>].</p>
 */
public class SVGSVGElement extends SVGElement {
  protected SVGSVGElement() {
  }

  // Implementation of the svg::SVGSVGElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native OMSVGAnimatedLength getX() /*-{
    return this.x;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native OMSVGAnimatedLength getY() /*-{
    return this.y;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native OMSVGAnimatedLength getWidth() /*-{
    return this.width;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native OMSVGAnimatedLength getHeight() /*-{
    return this.height;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getContentScriptType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native String getContentScriptType() /*-{
    return this.contentScriptType;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getContentScriptType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to   change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setContentScriptType(String value) throws JavaScriptException /*-{
    this.contentScriptType = value;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getContentStyleType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native String getContentStyleType() /*-{
    return this.contentStyleType;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getContentStyleType()}
   * on the given <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to   change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setContentStyleType(String value) throws JavaScriptException /*-{
    this.contentStyleType = value;
  }-*/;
  /**
   * <p>The position and size of the viewport (implicit or explicit) that corresponds
   * to this <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element. When the user agent is actually
   * rendering the content, then the position and size values represent the
   * actual values when rendering. The position and size values are unitless
   * values in the coordinate system of the parent element. If no parent element
   * exists (i.e., <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element represents the root of
   * the document tree), if this SVG document is embedded as part of another
   * document (e.g., via the HTML <span class='element-name'>'object'</span>
   * element), then the position and size are unitless values in the coordinate
   * system of the parent document. (If the parent uses CSS or XSL layout, then
   * unitless values represent pixel units for the current CSS or XSL viewport,
   * as described in the CSS2 specification.) If the parent element does not
   * have a coordinate system, then the user agent should provide reasonable
   * default values for this attribute.</p> <p>The {@link org.vectomatic.dom.svg.OMSVGRect}
   * object is <a href="types.html#ReadOnlyRect">read only</a>.</p>
   */
  public final native OMSVGRect getViewport() /*-{
    return this.viewport;
  }-*/;
  /**
   * Size of a pixel units (as defined by CSS2) along the x-axis of the viewport,
   * which represents a unit somewhere in the range of 70dpi to 120dpi, and,
   * on systems that support this, might actually match the characteristics
   * of the target medium. On systems where it is impossible to know the size
   * of a pixel, a suitable default pixel size is provided.
   */
  public final native float getPixelUnitToMillimeterX() /*-{
    return this.pixelUnitToMillimeterX;
  }-*/;
  /**
   * Corresponding size of a pixel unit along the y-axis of the viewport.
   */
  public final native float getPixelUnitToMillimeterY() /*-{
    return this.pixelUnitToMillimeterY;
  }-*/;
  /**
   * User interface (UI) events in DOM Level 2 indicate the screen positions
   * at which the given UI event occurred. When the user agent actually knows
   * the physical size of a "screen unit", this attribute will express that
   * information; otherwise, user agents will provide a suitable default value
   * such as .28mm.
   */
  public final native float getScreenPixelToMillimeterX() /*-{
    return this.screenPixelToMillimeterX;
  }-*/;
  /**
   * Corresponding size of a screen pixel along the y-axis of the viewport.
   */
  public final native float getScreenPixelToMillimeterY() /*-{
    return this.screenPixelToMillimeterY;
  }-*/;
  /**
   * The initial view (i.e., before magnification and panning) of the current
   * innermost SVG document fragment can be either the "standard" view (i.e.,
   * based on attributes on the <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element such as <code>svg/viewBox</code>)
   * or to a "custom" view (i.e., a hyperlink into a particular <a href='http://www.w3.org/TR/SVG11/linking.html#ViewElement'
   * title='view element specification'>view</a> or other element - see <a href="linking.html#LinksIntoSVG">Linking
   * into SVG content: URI fragments and SVG views</a>). If the initial view
   * is the "standard" view, then this attribute is false. If the initial view
   * is a "custom" view, then this attribute is true.
   */
  public final native boolean getUseCurrentView() /*-{
    return this.useCurrentView;
  }-*/;
  /**
   * <p>The definition of the initial view (i.e., before magnification and panning)
   * of the current innermost SVG document fragment. The meaning depends on
   * the situation:</p> <ul>   <li>     If the initial view was a "standard"
   * view, then:     <ul>       <li>the values for {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()},
   * {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * and       {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * within {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}
   * will match the values for the corresponding DOM attributes       that are
   * on SVGSVGElement directly</li>       <li>the values for {@link org.vectomatic.dom.svg.itf.ISVGViewSpec#getTransform()}
   * and       {@link org.vectomatic.dom.svg.itf.ISVGViewSpec#getViewTarget()}
   * within {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}
   * will be null</li>     </ul>   </li>   <li>     If the initial view was
   * a link into a <a href='http://www.w3.org/TR/SVG11/linking.html#ViewElement'
   * title='view element specification'>view</a> element, then:     <ul>   
   * <li>the values for {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()},
   * {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * and       {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * within {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}
   * will correspond to the corresponding attributes for the       given <a
   * href='http://www.w3.org/TR/SVG11/linking.html#ViewElement' title='view
   * element specification'>view</a> element</li>       <li>the values for {@link
   * org.vectomatic.dom.svg.itf.ISVGViewSpec#getTransform()} and       {@link
   * org.vectomatic.dom.svg.itf.ISVGViewSpec#getViewTarget()} within {@link
   * org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}       will
   * be null</li>     </ul>   </li>   <li>     If the initial view was a link
   * into another element (i.e.,     other than a <a href='http://www.w3.org/TR/SVG11/linking.html#ViewElement'
   * title='view element specification'>view</a>), then:     <ul>       <li>the
   * values for {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()},
   * {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * and       {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * within {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}
   * will match the values for the corresponding DOM attributes       that are
   * on SVGSVGElement directly for the closest ancestor       <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element</li>       <li>the values
   * for {@link org.vectomatic.dom.svg.itf.ISVGViewSpec#getTransform()} within
   * {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()} will
   * be null</li>       <li>the {@link org.vectomatic.dom.svg.itf.ISVGViewSpec#getViewTarget()}
   * within       {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}
   * will represent the target of the       link</li>     </ul>   </li>   <li>
   * If the initial view was a link into the SVG document fragment     using
   * an SVG view specification fragment identifier (i.e.,     #svgView(...)),
   * then:     <ul>       <li>the values for {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()},
   * {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()},
   * {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()},    
   * {@link org.vectomatic.dom.svg.itf.ISVGViewSpec#getTransform()} and    
   * {@link org.vectomatic.dom.svg.itf.ISVGViewSpec#getViewTarget()} within
   * {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentView()}    
   * will correspond to the values from the SVG view       specification fragment
   * identifier</li>     </ul>   </li> </ul> <p>The object itself and its contents
   * are both read only.</p>
   */
  public final native OMSVGViewSpec getCurrentView() /*-{
    return this.currentView;
  }-*/;
  /**
   * On an outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, this attribute indicates
   * the current scale factor relative to the initial view to take into account
   * user magnification and panning operations, as described under <a href='interact.html#ZoomAndPanAttribute'>Magnification
   * and panning</a>. DOM attributes {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentScale()}
   * and {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentTranslate()}
   * are equivalent to the 2x3 matrix [a b c d e f] = [currentScale 0 0 currentScale currentTranslate.x currentTranslate.y].
   * If "magnification" is enabled (i.e., <span class='attr-value'>zoomAndPan="magnify"</span>),
   * then the effect is as if an extra transformation were placed at the outermost
   * level on the SVG document fragment (i.e., outside the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element). <p>When accessed on
   * an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element that is not an outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, it is undefined what
   * behavior this attribute has.</p>
   */
  public final native float getCurrentScale() /*-{
    return this.currentScale;
  }-*/;
  /**
   * On an outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, this attribute indicates
   * the current scale factor relative to the initial view to take into account
   * user magnification and panning operations, as described under <a href='interact.html#ZoomAndPanAttribute'>Magnification
   * and panning</a>. DOM attributes {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentScale()}
   * and {@link org.vectomatic.dom.svg.impl.SVGSVGElement#getCurrentTranslate()}
   * are equivalent to the 2x3 matrix [a b c d e f] = [currentScale 0 0 currentScale currentTranslate.x currentTranslate.y].
   * If "magnification" is enabled (i.e., <span class='attr-value'>zoomAndPan="magnify"</span>),
   * then the effect is as if an extra transformation were placed at the outermost
   * level on the SVG document fragment (i.e., outside the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element). <p>When accessed on
   * an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element that is not an outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, it is undefined what
   * behavior this attribute has.</p>
   */
  public final native void setCurrentScale(float value) /*-{
    this.currentScale = value;
  }-*/;
  /**
   * On an outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, the corresponding translation
   * factor that takes into account user "magnification". <p>When accessed on
   * an <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element that is not an outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, it is undefined what
   * behavior this attribute has.</p>
   */
  public final native OMSVGPoint getCurrentTranslate() /*-{
    return this.currentTranslate;
  }-*/;
  /**
   * Takes a time-out value which indicates that redraw shall not occur until:
   * <ol>   <li>the corresponding unsuspendRedraw() call has been made,</li>
   * <li>an unsuspendRedrawAll() call has been made, or</li>   <li>its timer
   * has timed out.</li> </ol> <p>In environments that do not support interactivity
   * (e.g., print media), then redraw shall not be suspended. Calls to suspendRedraw()
   * and unsuspendRedraw() should, but need not be, made in balanced pairs.</p>
   * <p>To suspend redraw actions as a collection of SVG DOM changes occur,
   * precede the changes to the SVG DOM with a method call similar to:</p> <pre>suspendHandleID
   * = suspendRedraw(maxWaitMilliseconds);</pre> <p>and follow the changes with
   * a method call similar to:</p> <pre>unsuspendRedraw(suspendHandleID);</pre>
   * <p>Note that multiple suspendRedraw calls can be used at once and that
   * each such method call is treated independently of the other suspendRedraw
   * method calls.</p>
   * @param maxWaitMilliseconds The amount of time in milliseconds   to hold
   * off before redrawing the device. Values greater than 60 seconds   will
   * be truncated down to 60 seconds.
   * @return A number which acts as a unique identifier for the given   suspendRedraw()
   * call. This value must be passed as the parameter to the   corresponding
   * unsuspendRedraw() method call.
   */
  public final native int suspendRedraw(int maxWaitMilliseconds) /*-{
    return this.suspendRedraw(maxWaitMilliseconds);
  }-*/;
  /**
   * Cancels a specified suspendRedraw() by providing a unique suspend handle
   * ID that was returned by a previous suspendRedraw() call.
   * @param suspendHandleID A number which acts as a unique identifier for 
   * the desired suspendRedraw() call. The number supplied must be a value 
   * returned from a previous call to suspendRedraw(). If an invalid   handle
   * ID value is provided then the request to unsuspendRedraw() is   silently
   * ignored.
   */
  public final native void unsuspendRedraw(int suspendHandleID) /*-{
    this.unsuspendRedraw(suspendHandleID);
  }-*/;
  /**
   * Cancels all currently active suspendRedraw() method calls. This method
   * is most useful at the very end of a set of SVG DOM calls to ensure that
   * all pending suspendRedraw() method calls have been cancelled.
   */
  public final native void unsuspendRedrawAll() /*-{
    this.unsuspendRedrawAll();
  }-*/;
  /**
   * In rendering environments supporting interactivity, forces the user agent
   * to immediately redraw all regions of the viewport that require updating.
   */
  public final native void forceRedraw() /*-{
    this.forceRedraw();
  }-*/;
  /**
   * Suspends (i.e., pauses) all currently running animations that are defined
   * within the SVG document fragment corresponding to this <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element, causing the animation
   * clock corresponding to this document fragment to stand still until it is
   * unpaused.
   */
  public final native void pauseAnimations() /*-{
    this.pauseAnimations();
  }-*/;
  /**
   * Unsuspends (i.e., unpauses) currently running animations that are defined
   * within the SVG document fragment, causing the animation clock to continue
   * from the time at which it was suspended.
   */
  public final native void unpauseAnimations() /*-{
    this.unpauseAnimations();
  }-*/;
  /**
   * Returns true if this SVG document fragment is in a paused state.
   * @return Boolean indicating whether this SVG document fragment is in a 
   * paused state.
   */
  public final native boolean animationsPaused() /*-{
    return this.animationsPaused();
  }-*/;
  /**
   * Returns the current time in seconds relative to the start time for the
   * current SVG document fragment. If <span class="dom-method-name">getCurrentTime</span>
   * is called before the document timeline has begun (for example, by script
   * running in a <a href='http://www.w3.org/TR/SVG11/script.html#ScriptElement'
   * title='script element specification'>script</a>  element before the document's
   * <a href="interact.html#LoadEvent">SVGLoad</a> event is dispatched), then
   * 0 is returned.
   * @return The current time in seconds, or 0 if the document timeline has
   * not yet begun.
   */
  public final native float getCurrentTime() /*-{
    return this.getCurrentTime();
  }-*/;
  /**
   * Adjusts the clock for this SVG document fragment, establishing a new current
   * time. If <span class="dom-method-name">setCurrentTime</span> is called
   * before the document timeline has begun (for example, by script running
   * in a <a href='http://www.w3.org/TR/SVG11/script.html#ScriptElement' title='script
   * element specification'>script</a> element before the document's <a href="interact.html#LoadEvent">SVGLoad</a>
   * event is dispatched), then the value of <var>seconds</var> in the last
   * invocation of the method gives the time that the document will seek to
   * once the document timeline has begun.
   * @param seconds The new current time in seconds relative to the start  
   * time for the current SVG document fragment.
   */
  public final native void setCurrentTime(float seconds) /*-{
    this.setCurrentTime(seconds);
  }-*/;
  /**
   * Returns the list of graphics elements whose rendered content intersects
   * the supplied rectangle. Each candidate graphics element is to be considered
   * a match only if the same graphics element can be a <a href="interact.html#PointerEventsProperty">target
   * of pointer events</a> as defined in <code>pointer-events</code> processing.
   * @param rect The test rectangle. The values are in the <code>initial coordinate
   * system</code> for the current <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   * @param referenceElement If not null, then any intersected element that
   * doesn't have the referenceElement as ancestor must not be included   in
   * the returned NodeList.
   * @return A list of Elements whose content intersects the supplied   rectangle.
   * This {@link com.google.gwt.dom.client.NodeList} must be implemented identically
   * to   the {@link com.google.gwt.dom.client.NodeList} interface as defined
   * in DOM Level 2 Core   ([<a href="refs.html#ref-DOM2">DOM2</a>], section
   * 1.2) with the   exception that the interface is not   <a href="http://www.w3.org/TR/DOM-Level-2-Core/core.html#td-live">live</a>.
   */
  public final native NodeList<? extends Node> getIntersectionList(OMSVGRect rect, SVGElement referenceElement) /*-{
    return this.getIntersectionList(rect, referenceElement);
  }-*/;
  /**
   * Returns the list of graphics elements whose rendered content is entirely
   * contained within the supplied rectangle. Each candidate graphics element
   * is to be considered a match only if the same graphics element can be a
   * <a href="interact.html#PointerEventsProperty">target of pointer events</a>
   * as defined in <code>pointer-events</code> processing.
   * @param rect The test rectangle. The values are in the <code>initial coordinate
   * system</code> for the current <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   * @param referenceElement If not null, then any intersected element that
   * doesn't have the referenceElement as ancestor must not be included   in
   * the returned NodeList.
   * @return A list of Elements whose content is enclosed by the supplied  
   * rectangle.  This {@link com.google.gwt.dom.client.NodeList} must be implemented
   * identically to   the {@link com.google.gwt.dom.client.NodeList} interface
   * as defined in DOM Level 2 Core   ([<a href="refs.html#ref-DOM2">DOM2</a>],
   * section 1.2) with the   exception that the interface is not   <a href="http://www.w3.org/TR/DOM-Level-2-Core/core.html#td-live">live</a>.
   */
  public final native NodeList<? extends Node> getEnclosureList(OMSVGRect rect, SVGElement referenceElement) /*-{
    return this.getEnclosureList(rect, referenceElement);
  }-*/;
  /**
   * Returns true if the rendered content of the given element intersects the
   * supplied rectangle. Each candidate graphics element is to be considered
   * a match only if the same graphics element can be a <a href="interact.html#PointerEventsProperty">target
   * of pointer events</a> as defined in <code>pointer-events</code> processing.
   * @param element The element on which to perform the given test.
   * @param rect The test rectangle. The values are in the <code>initial coordinate
   * system</code> for the current <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   * @return True or false, depending on whether the given element intersects
   * the supplied rectangle.
   */
  public final native boolean checkIntersection(SVGElement element, OMSVGRect rect) /*-{
    return this.checkIntersection(element, rect);
  }-*/;
  /**
   * Returns true if the rendered content of the given element is entirely contained
   * within the supplied rectangle. Each candidate graphics element is to be
   * considered a match only if the same graphics element can be a <a href="interact.html#PointerEventsProperty">target
   * of pointer events</a> as defined in <code>pointer-events</code> processing.
   * @param element The element on which to perform the given test.
   * @param rect The test rectangle. The values are in the <code>initial coordinate
   * system</code> for the current <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   * @return True or false, depending on whether the given element is enclosed
   * by the supplied rectangle.
   */
  public final native boolean checkEnclosure(SVGElement element, OMSVGRect rect) /*-{
    return this.checkEnclosure(element, rect);
  }-*/;
  /**
   * Unselects any selected objects, including any selections of text strings
   * and type-in bars.
   */
  public final native void deselectAll() /*-{
    this.deselectAll();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGNumber} object outside of
   * any document trees. The object is initialized to a value of zero.
   * @return An {@link org.vectomatic.dom.svg.OMSVGNumber} object.
   */
  public final native OMSVGNumber createSVGNumber() /*-{
    return this.createSVGNumber();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGLength} object outside of
   * any document trees. The object is initialized to the value of 0 user units.
   * @return An {@link org.vectomatic.dom.svg.OMSVGLength} object.
   */
  public final native OMSVGLength createSVGLength() /*-{
    return this.createSVGLength();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGAngle} object outside of
   * any document trees. The object is initialized to the value 0 degrees (unitless).
   * @return An {@link org.vectomatic.dom.svg.OMSVGAngle} object.
   */
  public final native OMSVGAngle createSVGAngle() /*-{
    return this.createSVGAngle();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGPoint} object outside of
   * any document trees. The object is initialized to the point (0,0) in the
   * user coordinate system.
   * @return An {@link org.vectomatic.dom.svg.OMSVGPoint} object.
   */
  public final native OMSVGPoint createSVGPoint() /*-{
    return this.createSVGPoint();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGMatrix} object outside of
   * any document trees. The object is initialized to the identity matrix.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object.
   */
  public final native OMSVGMatrix createSVGMatrix() /*-{
    return this.createSVGMatrix();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGRect} object outside of any
   * document trees. The object is initialized such that all values are set
   * to 0 user units.
   * @return An {@link org.vectomatic.dom.svg.OMSVGRect} object.
   */
  public final native OMSVGRect createSVGRect() /*-{
    return this.createSVGRect();
  }-*/;
  /**
   * Creates an {@link org.vectomatic.dom.svg.OMSVGTransform} object outside
   * of any document trees. The object is initialized to an identity matrix
   * transform (SVG_TRANSFORM_MATRIX).
   * @return An {@link org.vectomatic.dom.svg.OMSVGTransform} object.
   */
  public final native OMSVGTransform createSVGTransform() /*-{
    return this.createSVGTransform();
  }-*/;
  /**
   * <p xmlns:edit="http://xmlns.grorg.org/SVGT12NG/"> Creates an {@link org.vectomatic.dom.svg.OMSVGTransform}
   * object outside of any document trees. The object is initialized to the
   * given matrix transform (i.e., SVG_TRANSFORM_MATRIX).  The values from the
   * parameter <var>matrix</var> are copied, the <var>matrix</var> parameter
   * is not adopted as <a edit:format="expanded">SVGTransform::matrix</a>. </p>
   * @param matrix The transform matrix.
   * @return An {@link org.vectomatic.dom.svg.OMSVGTransform} object.
   */
  public final native OMSVGTransform createSVGTransformFromMatrix(OMSVGMatrix matrix) /*-{
    return this.createSVGTransformFromMatrix(matrix);
  }-*/;
  /**
   * Searches this SVG document fragment (i.e., the search is restricted to
   * a subset of the document tree) for an Element whose id is given by <var>elementId</var>.
   * If an Element is found, that Element is returned. If no such element exists,
   * returns null. Behavior is not defined if more than one element has this
   * id.
   * @param elementId The unique id value for an element.
   * @return The matching element.
   */
  public final native Element getElementById(String elementId) /*-{
    return this.getElementById(elementId);
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

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()}
   * on the given element.
   */
  public final native OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * on the given element.
   */
  public final native OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final native String getXmllang() /*-{
    return this.xmllang;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setXmllang(String value) throws JavaScriptException /*-{
    this.xmllang = value;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final native String getXmlspace() /*-{
    return this.xmlspace;
  }-*/;
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setXmlspace(String value) throws JavaScriptException /*-{
    this.xmlspace = value;
  }-*/;

  // Implementation of the svg::SVGLocatable W3C IDL interface
  /**
   * The element which established the current viewport. Often, the nearest
   * ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element. Null if the current element is
   * the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native SVGElement getNearestViewportElement() /*-{
    return this.nearestViewportElement;
  }-*/;
  /**
   * The farthest ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element. Null if the current
   * element is the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final native SVGElement getFarthestViewportElement() /*-{
    return this.farthestViewportElement;
  }-*/;
  /**
   * Returns the tight bounding box in current user space (i.e., after application
   * of the <code>transform</code> attribute, if any) on the geometry of all
   * contained graphics elements, exclusive of stroking, clipping, masking and
   * filter effects). Note that getBBox must return the actual bounding box
   * at the time the method was called, even in case the element has not yet
   * been rendered.
   * @return An {@link org.vectomatic.dom.svg.OMSVGRect} object that defines
   * the bounding box.
   */
  public final native OMSVGRect getBBox() /*-{
    return this.getBBox();
  }-*/;
  /**
   * Returns the transformation matrix from current user units (i.e., after
   * application of the <code>transform</code> attribute, if any) to the viewport
   * coordinate system for the {@link org.vectomatic.dom.svg.itf.ISVGLocatable#getNearestViewportElement()}.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the CTM.
   */
  public final native OMSVGMatrix getCTM() /*-{
    return this.getCTM();
  }-*/;
  /**
   * Returns the transformation matrix from current user units (i.e., after
   * application of the <code>transform</code> attribute, if any) to the parent
   * user agent's notice of a "pixel". For display devices, ideally this represents
   * a physical screen pixel. For other devices or environments where physical
   * pixel sizes are not known, then an algorithm similar to the CSS2 definition
   * of a "pixel" can be used instead.  Note that null is returned if this element
   * is not hooked into the document tree. This method would have been more
   * aptly named as <code>getClientCTM</code>, but the name <code>getScreenCTM</code>
   * is kept for historical reasons.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the given   transformation matrix.
   */
  public final native OMSVGMatrix getScreenCTM() /*-{
    return this.getScreenCTM();
  }-*/;
  /**
   * Returns the transformation matrix from the user coordinate system on the
   * current element (after application of the <code>transform</code> attribute,
   * if any) to the user coordinate system on parameter <var>element</var> (after
   * application of its <code>transform</code> attribute, if any).
   * @param element The target element.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the transformation.
   * @throws SVGException(SVG_MATRIX_NOT_INVERTABLE) Raised if the currently
   * defined transformation matrices make it impossible to compute the   given
   * matrix (e.g., because one of the transformations is singular).
   */
  public final native OMSVGMatrix getTransformToElement(SVGElement element) throws JavaScriptException /*-{
    return this.getTransformToElement(element);
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

  // Implementation of the svg::SVGZoomAndPan W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * on the given element. The value must be one of the SVG_ZOOMANDPAN_ constants
   * defined on this interface.
   */
  public final native short getZoomAndPan() /*-{
    return this.zoomAndPan;
  }-*/;
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGZoomAndPan#getZoomAndPan()}
   * on the given element. The value must be one of the SVG_ZOOMANDPAN_ constants
   * defined on this interface.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final native void setZoomAndPan(short value) throws JavaScriptException /*-{
    this.zoomAndPan = value;
  }-*/;

}
