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

public class OMSVGLengthList implements Iterable<OMSVGLength> {
  @SuppressWarnings("unused")
  private JavaScriptObject ot;
  protected OMSVGLengthList(JavaScriptObject ot) {
    this.ot = ot;
  }

  // Implementation of the svg::SVGLengthList W3C IDL interface
  public final native int getNumberOfItems() /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.numberOfItems;
  }-*/;
  public final native void clear() /*-{
    this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.clear();
  }-*/;
  public final native OMSVGLength initialize(OMSVGLength newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.initialize(newItem);
  }-*/;
  public final native OMSVGLength getItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.getItem(index);
  }-*/;
  public final native OMSVGLength insertItemBefore(OMSVGLength newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.insertItemBefore(newItem, index);
  }-*/;
  public final native OMSVGLength replaceItem(OMSVGLength newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.replaceItem(newItem, index);
  }-*/;
  public final native OMSVGLength removeItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.removeItem(index);
  }-*/;
  public final native OMSVGLength appendItem(OMSVGLength newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGLengthList::ot.appendItem(newItem);
  }-*/;

  @Override
  public final Iterator<OMSVGLength> iterator() {
	return new Iterator<OMSVGLength>() {
		private int index;
		@Override
		public boolean hasNext() {
			return index < getNumberOfItems();
		}

		@Override
		public OMSVGLength next() {
			return getItem(index++);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
  }
}
