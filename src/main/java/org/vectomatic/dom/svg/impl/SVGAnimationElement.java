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
import org.vectomatic.dom.svg.OMSVGStringList;

public class SVGAnimationElement extends SVGElement {
  protected SVGAnimationElement() {
  }

  // Implementation of the svg::SVGAnimationElement W3C IDL interface
  public final native SVGElement getTargetElement() /*-{
    return this.targetElement;
  }-*/;
  public final native float getStartTime() /*-{
    return this.getStartTime();
  }-*/;
  public final native float getCurrentTime() /*-{
    return this.getCurrentTime();
  }-*/;
  public final native float getSimpleDuration() /*-{
    return this.getSimpleDuration();
  }-*/;

  // Implementation of the smil::ElementTimeControl W3C IDL interface
  public final native boolean beginElement() /*-{
    return this.beginElement();
  }-*/;
  public final native boolean beginElementAt(float offset) /*-{
    return this.beginElementAt(offset);
  }-*/;
  public final native boolean endElement() /*-{
    return this.endElement();
  }-*/;
  public final native boolean endElementAt(float offset) /*-{
    return this.endElementAt(offset);
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
