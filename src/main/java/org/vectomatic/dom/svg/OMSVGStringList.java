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

public class OMSVGStringList implements Iterable<String> {
  @SuppressWarnings("unused")
  private JavaScriptObject ot;
  protected OMSVGStringList(JavaScriptObject ot) {
    this.ot = ot;
  }

  // Implementation of the svg::SVGStringList W3C IDL interface
  public final native int getNumberOfItems() /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.numberOfItems;
  }-*/;
  public final native void clear() /*-{
    this.@org.vectomatic.dom.svg.OMSVGStringList::ot.clear();
  }-*/;
  public final native String initialize(String newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.initialize(newItem);
  }-*/;
  public final native String getItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.getItem(index);
  }-*/;
  public final native String insertItemBefore(String newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.insertItemBefore(newItem, index);
  }-*/;
  public final native String replaceItem(String newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.replaceItem(newItem, index);
  }-*/;
  public final native String removeItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.removeItem(index);
  }-*/;
  public final native String appendItem(String newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGStringList::ot.appendItem(newItem);
  }-*/;
  @Override
  public final Iterator<String> iterator() {
	return new Iterator<String>() {
		private int index;
		@Override
		public boolean hasNext() {
			return index < getNumberOfItems();
		}

		@Override
		public String next() {
			return getItem(index++);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
  }

}
