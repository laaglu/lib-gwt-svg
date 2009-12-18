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
public class OMSVGViewSpec extends org.vectomatic.dom.svg.OMSVGZoomAndPan {
  protected OMSVGViewSpec() {
  }

  // Implementation of the nsIDOMSVGViewSpec XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGTransformList getTransform() /*-{
    return this.transform;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGElement getViewTarget() /*-{
    return this.viewTarget;
  }-*/;
  public final native java.lang.String getViewBoxString() /*-{
    return this.viewBoxString;
  }-*/;
  public final native java.lang.String getPreserveAspectRatioString() /*-{
    return this.preserveAspectRatioString;
  }-*/;
  public final native java.lang.String getTransformString() /*-{
    return this.transformString;
  }-*/;
  public final native java.lang.String getViewTargetString() /*-{
    return this.viewTargetString;
  }-*/;

  // Implementation of the nsIDOMSVGFitToViewBox XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedRect getViewBox() /*-{
    return this.viewBox;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() /*-{
    return this.preserveAspectRatio;
  }-*/;

}
