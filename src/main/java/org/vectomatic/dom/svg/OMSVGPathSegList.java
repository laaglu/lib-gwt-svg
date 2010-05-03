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

import java.util.Iterator;

import com.google.gwt.core.client.JavaScriptObject;

public class OMSVGPathSegList implements Iterable<OMSVGPathSeg> {
  @SuppressWarnings("unused")
  private JavaScriptObject ot;
  protected OMSVGPathSegList(JavaScriptObject ot) {
    this.ot = ot;
  }

  // Implementation of the svg::SVGPathSegList W3C IDL interface
  public final native int getNumberOfItems() /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.numberOfItems;
  }-*/;
  public final native void clear() /*-{
    this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.clear();
  }-*/;
  public final native OMSVGPathSeg initialize(OMSVGPathSeg newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.initialize(newItem);
  }-*/;
  public final native OMSVGPathSeg getItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.getItem(index);
  }-*/;
  public final native OMSVGPathSeg insertItemBefore(OMSVGPathSeg newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.insertItemBefore(newItem, index);
  }-*/;
  public final native OMSVGPathSeg replaceItem(OMSVGPathSeg newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.replaceItem(newItem, index);
  }-*/;
  public final native OMSVGPathSeg removeItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.removeItem(index);
  }-*/;
  public final native OMSVGPathSeg appendItem(OMSVGPathSeg newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGPathSegList::ot.appendItem(newItem);
  }-*/;

  @Override
  public final Iterator<OMSVGPathSeg> iterator() {
	return new Iterator<OMSVGPathSeg>() {
		private int index;
		@Override
		public boolean hasNext() {
			return index < getNumberOfItems();
		}

		@Override
		public OMSVGPathSeg next() {
			return getItem(index++);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
  }
}
