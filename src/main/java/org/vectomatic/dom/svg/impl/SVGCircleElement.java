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
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGAnimatedTransformList;
import org.vectomatic.dom.svg.OMSVGMatrix;
import org.vectomatic.dom.svg.OMSVGRect;
import org.vectomatic.dom.svg.OMSVGStringList;

public class SVGCircleElement extends SVGElement {
  protected SVGCircleElement() {
  }

  // Implementation of the svg::SVGCircleElement W3C IDL interface
  public final native OMSVGAnimatedLength getCx() /*-{
    return this.cx;
  }-*/;
  public final native OMSVGAnimatedLength getCy() /*-{
    return this.cy;
  }-*/;
  public final native OMSVGAnimatedLength getR() /*-{
    return this.r;
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
