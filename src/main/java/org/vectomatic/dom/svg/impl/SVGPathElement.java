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

public class SVGPathElement extends SVGElement {
  protected SVGPathElement() {
  }

  // Implementation of the svg::SVGPathElement W3C IDL interface
  public final native OMSVGAnimatedNumber getPathLength() /*-{
    return this.pathLength;
  }-*/;
  public final native float getTotalLength() /*-{
    return this.getTotalLength();
  }-*/;
  public final native OMSVGPoint getPointAtLength(float distance) /*-{
    return this.getPointAtLength(distance);
  }-*/;
  public final native int getPathSegAtLength(float distance) /*-{
    return this.getPathSegAtLength(distance);
  }-*/;
  public final native OMSVGPathSegClosePath createSVGPathSegClosePath() /*-{
    return this.createSVGPathSegClosePath();
  }-*/;
  public final native OMSVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y) /*-{
    return this.createSVGPathSegMovetoAbs(x, y);
  }-*/;
  public final native OMSVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y) /*-{
    return this.createSVGPathSegMovetoRel(x, y);
  }-*/;
  public final native OMSVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y) /*-{
    return this.createSVGPathSegLinetoAbs(x, y);
  }-*/;
  public final native OMSVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y) /*-{
    return this.createSVGPathSegLinetoRel(x, y);
  }-*/;
  public final native OMSVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicAbs(x, y, x1, y1, x2, y2);
  }-*/;
  public final native OMSVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicRel(x, y, x1, y1, x2, y2);
  }-*/;
  public final native OMSVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1) /*-{
    return this.createSVGPathSegCurvetoQuadraticAbs(x, y, x1, y1);
  }-*/;
  public final native OMSVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1) /*-{
    return this.createSVGPathSegCurvetoQuadraticRel(x, y, x1, y1);
  }-*/;
  public final native OMSVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) /*-{
    return this.createSVGPathSegArcAbs(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }-*/;
  public final native OMSVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) /*-{
    return this.createSVGPathSegArcRel(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }-*/;
  public final native OMSVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x) /*-{
    return this.createSVGPathSegLinetoHorizontalAbs(x);
  }-*/;
  public final native OMSVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x) /*-{
    return this.createSVGPathSegLinetoHorizontalRel(x);
  }-*/;
  public final native OMSVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y) /*-{
    return this.createSVGPathSegLinetoVerticalAbs(y);
  }-*/;
  public final native OMSVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y) /*-{
    return this.createSVGPathSegLinetoVerticalRel(y);
  }-*/;
  public final native OMSVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicSmoothAbs(x, y, x2, y2);
  }-*/;
  public final native OMSVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicSmoothRel(x, y, x2, y2);
  }-*/;
  public final native OMSVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y) /*-{
    return this.createSVGPathSegCurvetoQuadraticSmoothAbs(x, y);
  }-*/;
  public final native OMSVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y) /*-{
    return this.createSVGPathSegCurvetoQuadraticSmoothRel(x, y);
  }-*/;

  // Implementation of the svg::SVGAnimatedPathData W3C IDL interface
  public final native OMSVGPathSegList getPathSegList() /*-{
    return this.pathSegList;
  }-*/;
  public final native OMSVGPathSegList getNormalizedPathSegList() /*-{
    return this.normalizedPathSegList;
  }-*/;
  public final native OMSVGPathSegList getAnimatedPathSegList() /*-{
    return this.animatedPathSegList;
  }-*/;
  public final native OMSVGPathSegList getAnimatedNormalizedPathSegList() /*-{
    return this.animatedNormalizedPathSegList;
  }-*/;

  // Implementation of the svg::SVGTransformable W3C IDL interface
  public final native OMSVGAnimatedTransformList getTransform() /*-{
    return this.transform;
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
