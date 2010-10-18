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
import org.vectomatic.dom.svg.OMSVGAnimatedNumber;
import org.vectomatic.dom.svg.OMSVGAnimatedTransformList;
import org.vectomatic.dom.svg.OMSVGMatrix;
import org.vectomatic.dom.svg.OMSVGPathSegArcAbs;
import org.vectomatic.dom.svg.OMSVGPathSegArcRel;
import org.vectomatic.dom.svg.OMSVGPathSegClosePath;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicAbs;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicRel;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothAbs;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothRel;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticAbs;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticRel;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothAbs;
import org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothRel;
import org.vectomatic.dom.svg.OMSVGPathSegLinetoAbs;
import org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalAbs;
import org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalRel;
import org.vectomatic.dom.svg.OMSVGPathSegLinetoRel;
import org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalAbs;
import org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalRel;
import org.vectomatic.dom.svg.OMSVGPathSegList;
import org.vectomatic.dom.svg.OMSVGPathSegMovetoAbs;
import org.vectomatic.dom.svg.OMSVGPathSegMovetoRel;
import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;
import org.vectomatic.dom.svg.OMSVGStringList;

import com.google.gwt.core.client.JavaScriptException;

/**
 * The {@link org.vectomatic.dom.svg.impl.SVGPathElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/paths.html#PathElement' title='path
 * element specification'>path</a> element.
 */
public class SVGPathElement extends SVGElement {
  protected SVGPathElement() {
  }

  // Implementation of the svg::SVGPathElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.impl.SVGPathElement#getPathLength()}
   * on the given <a href='http://www.w3.org/TR/SVG11/paths.html#PathElement'
   * title='path element specification'>path</a> element.
   */
  public final native OMSVGAnimatedNumber getPathLength() /*-{
    return this.pathLength;
  }-*/;
  /**
   * Returns the user agent's computed value for the total length of the path
   * using the user agent's distance-along-a-path algorithm, as a distance in
   * the current user coordinate system.
   * @return The total length of the path.
   */
  public final native float getTotalLength() /*-{
    return this.getTotalLength();
  }-*/;
  /**
   * Returns the (x,y) coordinate in user space which is <var>distance</var>
   * units along the path, utilizing the user agent's distance-along-a-path
   * algorithm.
   * @param distance The distance along the path, relative to the start of 
   * the path, as a distance in the current user coordinate system.
   * @return The returned point in user space.
   */
  public final native OMSVGPoint getPointAtLength(float distance) /*-{
    return this.getPointAtLength(distance);
  }-*/;
  /**
   * Returns the index into {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}
   * which is <var>distance</var> units along the path, utilizing the user agent's
   * distance-along-a-path algorithm.
   * @param distance The distance along the path, relative to the start of 
   * the path, as a distance in the current user coordinate system.
   * @return The index of the path segment, where the first path segment is
   * number 0.
   */
  public final native int getPathSegAtLength(float distance) /*-{
    return this.getPathSegAtLength(distance);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegClosePath}
   * object.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegClosePath}
   * object.
   */
  public final native OMSVGPathSegClosePath createSVGPathSegClosePath() /*-{
    return this.createSVGPathSegClosePath();
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegMovetoAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegMovetoAbs}
   * object.
   */
  public final native OMSVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y) /*-{
    return this.createSVGPathSegMovetoAbs(x, y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegMovetoRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegMovetoRel}
   * object.
   */
  public final native OMSVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y) /*-{
    return this.createSVGPathSegMovetoRel(x, y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoAbs}
   * object.
   */
  public final native OMSVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y) /*-{
    return this.createSVGPathSegLinetoAbs(x, y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoRel}
   * object.
   */
  public final native OMSVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y) /*-{
    return this.createSVGPathSegLinetoRel(x, y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @param x1 The absolute X coordinate for the first control point.
   * @param y1 The absolute Y coordinate for the first control point.
   * @param x2 The absolute X coordinate for the second control point.
   * @param y2 The absolute Y coordinate for the second control point.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicAbs}
   * object.
   */
  public final native OMSVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicAbs(x, y, x1, y1, x2, y2);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @param x1 The relative X coordinate for the first control point.
   * @param y1 The relative Y coordinate for the first control point.
   * @param x2 The relative X coordinate for the second control point.
   * @param y2 The relative Y coordinate for the second control point.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicRel}
   * object.
   */
  public final native OMSVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicRel(x, y, x1, y1, x2, y2);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @param x1 The absolute X coordinate for the first control point.
   * @param y1 The absolute Y coordinate for the first control point.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticAbs}
   * object.
   */
  public final native OMSVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1) /*-{
    return this.createSVGPathSegCurvetoQuadraticAbs(x, y, x1, y1);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @param x1 The relative X coordinate for the first control point.
   * @param y1 The relative Y coordinate for the first control point.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticRel}
   * object.
   */
  public final native OMSVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1) /*-{
    return this.createSVGPathSegCurvetoQuadraticRel(x, y, x1, y1);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegArcAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @param r1 The x-axis radius for the ellipse (i.e., r1).
   * @param r2 The y-axis radius for the ellipse (i.e., r2).
   * @param angle The rotation angle in degrees for the ellipse's x-axis relative
   * to the x-axis of the user coordinate system.
   * @param largeArcFlag The value of the large-arc-flag parameter.
   * @param sweepFlag The value of the large-arc-flag parameter.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegArcAbs}
   * object.
   */
  public final native OMSVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) /*-{
    return this.createSVGPathSegArcAbs(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegArcRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @param r1 The x-axis radius for the ellipse (i.e., r1).
   * @param r2 The y-axis radius for the ellipse (i.e., r2).
   * @param angle The rotation angle in degrees for the ellipse's x-axis relative
   * to the x-axis of the user coordinate system.
   * @param largeArcFlag The value of the large-arc-flag parameter.
   * @param sweepFlag The value of the large-arc-flag parameter.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegArcRel}
   * object.
   */
  public final native OMSVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) /*-{
    return this.createSVGPathSegArcRel(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalAbs}
   * object.
   */
  public final native OMSVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x) /*-{
    return this.createSVGPathSegLinetoHorizontalAbs(x);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalRel}
   * object.
   */
  public final native OMSVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x) /*-{
    return this.createSVGPathSegLinetoHorizontalRel(x);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalAbs}
   * object.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalAbs}
   * object.
   */
  public final native OMSVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y) /*-{
    return this.createSVGPathSegLinetoVerticalAbs(y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalRel}
   * object.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalRel}
   * object.
   */
  public final native OMSVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y) /*-{
    return this.createSVGPathSegLinetoVerticalRel(y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @param x2 The absolute X coordinate for the second control point.
   * @param y2 The absolute Y coordinate for the second control point.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothAbs}
   * object.
   */
  public final native OMSVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicSmoothAbs(x, y, x2, y2);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @param x2 The relative X coordinate for the second control point.
   * @param y2 The relative Y coordinate for the second control point.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothRel}
   * object.
   */
  public final native OMSVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicSmoothRel(x, y, x2, y2);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothAbs}
   * object.
   * @param x The absolute X coordinate for the end point of this path segment.
   * @param y The absolute Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothAbs}
   * object.
   */
  public final native OMSVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y) /*-{
    return this.createSVGPathSegCurvetoQuadraticSmoothAbs(x, y);
  }-*/;
  /**
   * Returns a stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothRel}
   * object.
   * @param x The relative X coordinate for the end point of this path segment.
   * @param y The relative Y coordinate for the end point of this path segment.
   * @return A stand-alone, parentless {@link org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothRel}
   * object.
   */
  public final native OMSVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y) /*-{
    return this.createSVGPathSegCurvetoQuadraticSmoothRel(x, y);
  }-*/;

  // Implementation of the svg::SVGAnimatedPathData W3C IDL interface
  /**
   * Provides access to the base (i.e., static) contents of the <span class='attr-name'>'d'</span>
   * attribute in a form which matches one-for-one with SVG's syntax. Thus,
   * if the <span class='attr-name'>'d'</span> attribute has an "absolute moveto
   * (M)" and an "absolute arcto (A)" command, then {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}
   * will have two entries: a SVG_PATHSEG_MOVETO_ABS and a SVG_PATHSEG_ARC_ABS.
   */
  public final native OMSVGPathSegList getPathSegList() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.pathSegList);
  }-*/;
  /**
   * <p>Provides access to the base (i.e., static) contents of the <span class='attr-name'>'d'</span>
   * attribute in a form where all path data commands are expressed in terms
   * of the following subset of {@link org.vectomatic.dom.svg.OMSVGPathSeg}
   * types: SVG_PATHSEG_MOVETO_ABS (M), SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS
   * (C) and SVG_PATHSEG_CLOSEPATH (z). Thus, if the <span class='attr-name'>'d'</span>
   * attribute has an "absolute moveto (M)" and an "absolute arcto (A)" command,
   * then pathSegList will have one SVG_PATHSEG_MOVETO_ABS entry followed by
   * a series of SVG_PATHSEG_LINETO_ABS entries which approximate the arc. This
   * alternate representation is available to provide a simpler interface to
   * developers who would benefit from a more limited set of commands.</p> <p>The
   * only valid {@link org.vectomatic.dom.svg.OMSVGPathSeg} types are SVG_PATHSEG_MOVETO_ABS
   * (M), SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS (C) and
   * SVG_PATHSEG_CLOSEPATH (z).</p>
   */
  public final native OMSVGPathSegList getNormalizedPathSegList() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.normalizedPathSegList);
  }-*/;
  /**
   * Provides access to the current animated contents of the <span class='attr-name'>'d'</span>
   * attribute in a form which matches one-for-one with SVG's syntax. If the
   * given attribute or property is being animated, contains the current animated
   * value of the attribute or property, and both the object itself and its
   * contents are read only. If the given attribute or property is not currently
   * being animated, contains the same value as {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}.
   */
  public final native OMSVGPathSegList getAnimatedPathSegList() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animatedPathSegList);
  }-*/;
  /**
   * Provides access to the current animated contents of the <span class='attr-name'>'d'</span>
   * attribute in a form where all path data commands are expressed in terms
   * of the following subset of {@link org.vectomatic.dom.svg.OMSVGPathSeg}
   * types: SVG_PATHSEG_MOVETO_ABS (M), SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS
   * (C) and SVG_PATHSEG_CLOSEPATH (z). If the given attribute or property is
   * being animated, contains the current animated value of the attribute or
   * property, and both the object itself and its contents are read only. If
   * the given attribute or property is not currently being animated, contains
   * the same value as {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getNormalizedPathSegList()}.
   */
  public final native OMSVGPathSegList getAnimatedNormalizedPathSegList() /*-{
    return @org.vectomatic.dom.svg.OMNode::convertList(Lcom/google/gwt/core/client/JavaScriptObject;)(this.animatedNormalizedPathSegList);
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

  // Implementation of the svg::SVGTransformable W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTransformable#getTransform()}
   * on the given element.
   */
  public final native OMSVGAnimatedTransformList getTransform() /*-{
    return this.transform;
  }-*/;

}
