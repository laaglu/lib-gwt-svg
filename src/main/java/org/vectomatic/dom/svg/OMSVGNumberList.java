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
package org.vectomatic.dom.svg;

import com.google.gwt.core.client.JavaScriptObject;

public class OMSVGNumberList extends JavaScriptObject {
  protected OMSVGNumberList() {
  }

  // Implementation of the svg::SVGNumberList W3C IDL interface
  public final native int getNumberOfItems() /*-{
    return this.numberOfItems;
  }-*/;
  public final native void clear() /*-{
    this.clear();
  }-*/;
  public final native OMSVGNumber initialize(OMSVGNumber newItem) /*-{
    return this.initialize(newItem);
  }-*/;
  public final native OMSVGNumber getItem(int index) /*-{
    return this.getItem(index);
  }-*/;
  public final native OMSVGNumber insertItemBefore(OMSVGNumber newItem, int index) /*-{
    return this.insertItemBefore(newItem, index);
  }-*/;
  public final native OMSVGNumber replaceItem(OMSVGNumber newItem, int index) /*-{
    return this.replaceItem(newItem, index);
  }-*/;
  public final native OMSVGNumber removeItem(int index) /*-{
    return this.removeItem(index);
  }-*/;
  public final native OMSVGNumber appendItem(OMSVGNumber newItem) /*-{
    return this.appendItem(newItem);
  }-*/;
  
  // Helper methods
  public final OMSVGNumber insertItemBefore(OMSVGSVGElement svg, float value, int index) {
	 return insertItemBefore(svg.createSVGNumber(value), index);
  }
  public final OMSVGNumber appendItem(OMSVGSVGElement svg, float value) {
	 return appendItem(svg.createSVGNumber(value));
  }
  public final OMSVGNumber[] appendItems(OMSVGSVGElement svg, float[] values) {
	 OMSVGNumber[] newItems = new OMSVGNumber[values.length];
	 for (int i = 0; i < values.length; i++) {
		newItems[i] = appendItem(svg, values[i]);
	 }
	 return newItems;
  }
  public final OMSVGNumber replaceItem(OMSVGSVGElement svg, float value, int index) {
	 return replaceItem(svg.createSVGNumber(value), index);
  }
}
