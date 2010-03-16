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
import org.vectomatic.dom.svg.OMSVGAnimatedEnumeration;
import org.vectomatic.dom.svg.OMSVGAnimatedLength;
import org.vectomatic.dom.svg.OMSVGPoint;
import org.vectomatic.dom.svg.OMSVGRect;
import org.vectomatic.dom.svg.OMSVGStringList;

public class SVGTextContentElement extends SVGElement {
  protected SVGTextContentElement() {
  }

  // Implementation of the svg::SVGTextContentElement W3C IDL interface
  public final native OMSVGAnimatedLength getTextLength() /*-{
    return this.textLength;
  }-*/;
  public final native OMSVGAnimatedEnumeration getLengthAdjust() /*-{
    return this.lengthAdjust;
  }-*/;
  public final native int getNumberOfChars() /*-{
    return this.getNumberOfChars();
  }-*/;
  public final native float getComputedTextLength() /*-{
    return this.getComputedTextLength();
  }-*/;
  public final native float getSubStringLength(int charnum, int nchars) /*-{
    return this.getSubStringLength(charnum, nchars);
  }-*/;
  public final native OMSVGPoint getStartPositionOfChar(int charnum) /*-{
    return this.getStartPositionOfChar(charnum);
  }-*/;
  public final native OMSVGPoint getEndPositionOfChar(int charnum) /*-{
    return this.getEndPositionOfChar(charnum);
  }-*/;
  public final native OMSVGRect getExtentOfChar(int charnum) /*-{
    return this.getExtentOfChar(charnum);
  }-*/;
  public final native float getRotationOfChar(int charnum) /*-{
    return this.getRotationOfChar(charnum);
  }-*/;
  public final native int getCharNumAtPosition(OMSVGPoint point) /*-{
    return this.getCharNumAtPosition(point);
  }-*/;
  public final native void selectSubString(int charnum, int nchars) /*-{
    this.selectSubString(charnum, nchars);
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
