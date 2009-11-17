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
 * along with libgwtsvg.  If not, see <http://www.gnu.org/licenses/>
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGTextPositioningElement extends org.vectomatic.dom.svg.OMSVGTextContentElement {
  protected OMSVGTextPositioningElement() {
  }

  // Implementation of the nsIDOMSVGTextPositioningElement XPCOM interface
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLengthList getX() /*-{
    return this.x;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLengthList getY() /*-{
    return this.y;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLengthList getDx() /*-{
    return this.dx;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedLengthList getDy() /*-{
    return this.dy;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGAnimatedNumberList getRotate() /*-{
    return this.rotate;
  }-*/;

}
