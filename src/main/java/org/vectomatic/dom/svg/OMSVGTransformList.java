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

public class OMSVGTransformList implements Iterable<OMSVGTransform> {
  @SuppressWarnings("unused")
  private JavaScriptObject ot;
  protected OMSVGTransformList(JavaScriptObject ot) {
    this.ot = ot;
  }

  // Implementation of the svg::SVGTransformList W3C IDL interface
  public final native int getNumberOfItems() /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.numberOfItems;
  }-*/;
  public final native void clear() /*-{
    this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.clear();
  }-*/;
  public final native OMSVGTransform initialize(OMSVGTransform newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.initialize(newItem);
  }-*/;
  public final native OMSVGTransform getItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.getItem(index);
  }-*/;
  public final native OMSVGTransform insertItemBefore(OMSVGTransform newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.insertItemBefore(newItem, index);
  }-*/;
  public final native OMSVGTransform replaceItem(OMSVGTransform newItem, int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.replaceItem(newItem, index);
  }-*/;
  public final native OMSVGTransform removeItem(int index) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.removeItem(index);
  }-*/;
  public final native OMSVGTransform appendItem(OMSVGTransform newItem) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.appendItem(newItem);
  }-*/;
  public final native OMSVGTransform createSVGTransformFromMatrix(OMSVGMatrix matrix) /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.createSVGTransformFromMatrix(matrix);
  }-*/;
  public final native OMSVGTransform consolidate() /*-{
    return this.@org.vectomatic.dom.svg.OMSVGTransformList::ot.consolidate();
  }-*/;
  @Override
  public final Iterator<OMSVGTransform> iterator() {
	return new Iterator<OMSVGTransform>() {
		private int index;
		@Override
		public boolean hasNext() {
			return index < getNumberOfItems();
		}

		@Override
		public OMSVGTransform next() {
			return getItem(index++);
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};
  }

}
