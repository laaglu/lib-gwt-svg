/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGPathElement extends org.vectomatic.dom.svg.OMSVGElement {
  protected OMSVGPathElement() {
  }

  // Implementation of the nsIDOMSVGPathElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumber getPathLength() /*-{
    return this.pathLength;
  }-*/;
  public final native float getTotalLength() /*-{
    return this.getTotalLength();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint getPointAtLength(float distance) /*-{
    return this.getPointAtLength(distance);
  }-*/;
  public final native int getPathSegAtLength(float distance) /*-{
    return this.getPathSegAtLength(distance);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegClosePath createSVGPathSegClosePath() /*-{
    return this.createSVGPathSegClosePath();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegMovetoAbs createSVGPathSegMovetoAbs(float x, float y) /*-{
    return this.createSVGPathSegMovetoAbs(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegMovetoRel createSVGPathSegMovetoRel(float x, float y) /*-{
    return this.createSVGPathSegMovetoRel(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegLinetoAbs createSVGPathSegLinetoAbs(float x, float y) /*-{
    return this.createSVGPathSegLinetoAbs(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegLinetoRel createSVGPathSegLinetoRel(float x, float y) /*-{
    return this.createSVGPathSegLinetoRel(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(float x, float y, float x1, float y1, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicAbs(x, y, x1, y1, x2, y2);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(float x, float y, float x1, float y1, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicRel(x, y, x1, y1, x2, y2);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(float x, float y, float x1, float y1) /*-{
    return this.createSVGPathSegCurvetoQuadraticAbs(x, y, x1, y1);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(float x, float y, float x1, float y1) /*-{
    return this.createSVGPathSegCurvetoQuadraticRel(x, y, x1, y1);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegArcAbs createSVGPathSegArcAbs(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) /*-{
    return this.createSVGPathSegArcAbs(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegArcRel createSVGPathSegArcRel(float x, float y, float r1, float r2, float angle, boolean largeArcFlag, boolean sweepFlag) /*-{
    return this.createSVGPathSegArcRel(x, y, r1, r2, angle, largeArcFlag, sweepFlag);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(float x) /*-{
    return this.createSVGPathSegLinetoHorizontalAbs(x);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(float x) /*-{
    return this.createSVGPathSegLinetoHorizontalRel(x);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(float y) /*-{
    return this.createSVGPathSegLinetoVerticalAbs(y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(float y) /*-{
    return this.createSVGPathSegLinetoVerticalRel(y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(float x, float y, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicSmoothAbs(x, y, x2, y2);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(float x, float y, float x2, float y2) /*-{
    return this.createSVGPathSegCurvetoCubicSmoothRel(x, y, x2, y2);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(float x, float y) /*-{
    return this.createSVGPathSegCurvetoQuadraticSmoothAbs(x, y);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(float x, float y) /*-{
    return this.createSVGPathSegCurvetoQuadraticSmoothRel(x, y);
  }-*/;

  // Implementation of the nsIDOMSVGStylable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedString getClassName() /*-{
    return this.className;
  }-*/;
  public final native org.vectomatic.dom.css.OMStyleDeclaration getStyle() /*-{
    return this.style;
  }-*/;
  public final native org.vectomatic.dom.css.OMValue getPresentationAttribute(java.lang.String name) /*-{
    return this.getPresentationAttribute(name);
  }-*/;

  // Implementation of the nsIDOMSVGTransformable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedTransformList getTransform() /*-{
    return this.transform;
  }-*/;

  // Implementation of the nsIDOMSVGLocatable XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGElement getNearestViewportElement() /*-{
    return this.nearestViewportElement;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGElement getFarthestViewportElement() /*-{
    return this.farthestViewportElement;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGRect getBBox() /*-{
    return this.getBBox();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getCTM() /*-{
    return this.getCTM();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getScreenCTM() /*-{
    return this.getScreenCTM();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGMatrix getTransformToElement(org.vectomatic.dom.svg.OMSVGElement element) /*-{
    return this.getTransformToElement(element);
  }-*/;

  // Implementation of the nsIDOMEventTarget XPCOM interface
  public final native void addEventListener(java.lang.String type, org.vectomatic.dom.events.OMEventListener listener, boolean useCapture) /*-{
    this.addEventListener(type, listener, useCapture);
  }-*/;
  public final native void removeEventListener(java.lang.String type, org.vectomatic.dom.events.OMEventListener listener, boolean useCapture) /*-{
    this.removeEventListener(type, listener, useCapture);
  }-*/;
  public final native boolean dispatchEvent(org.vectomatic.dom.events.OMEvent evt) /*-{
    return this.dispatchEvent(evt);
  }-*/;

  // Implementation of the nsIDOMSVGAnimatedPathData XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGPathSegList getPathSegList() /*-{
    return this.pathSegList;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegList getNormalizedPathSegList() /*-{
    return this.normalizedPathSegList;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegList getAnimatedPathSegList() /*-{
    return this.animatedPathSegList;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPathSegList getAnimatedNormalizedPathSegList() /*-{
    return this.animatedNormalizedPathSegList;
  }-*/;

}
