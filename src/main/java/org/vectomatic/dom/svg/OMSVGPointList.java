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
public class OMSVGPointList extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGPointList() {
  }

  // Implementation of the nsIDOMSVGPointList XPCOM interface
  public final native int getNumberOfItems() /*-{
    return this.numberOfItems;
  }-*/;
  public final native void clear() /*-{
    this.clear();
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint initialize(org.vectomatic.dom.svg.OMSVGPoint newItem) /*-{
    return this.initialize(newItem);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint getItem(int index) /*-{
    return this.getItem(index);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint insertItemBefore(org.vectomatic.dom.svg.OMSVGPoint newItem, int index) /*-{
    return this.insertItemBefore(newItem, index);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint replaceItem(org.vectomatic.dom.svg.OMSVGPoint newItem, int index) /*-{
    return this.replaceItem(newItem, index);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint removeItem(int index) /*-{
    return this.removeItem(index);
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGPoint appendItem(org.vectomatic.dom.svg.OMSVGPoint newItem) /*-{
    return this.appendItem(newItem);
  }-*/;

}
