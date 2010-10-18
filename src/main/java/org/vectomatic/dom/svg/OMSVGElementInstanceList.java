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
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGElementInstanceList} interface provides
 * the abstraction of an ordered collection of {@link org.vectomatic.dom.svg.OMSVGElementInstance}
 * objects, without defining or constraining how this collection is implemented.
 */
public class OMSVGElementInstanceList extends JavaScriptObject {
  protected OMSVGElementInstanceList() {
  }

  // Implementation of the svg::SVGElementInstanceList W3C IDL interface
  /**
   * The number of {@link org.vectomatic.dom.svg.OMSVGElementInstance} objects
   * in the list. The range of valid child indices is 0 to {@link org.vectomatic.dom.svg.OMSVGElementInstanceList#getLength()}−1
   * inclusive.
   */
  public final native int getLength() /*-{
    return this.length;
  }-*/;
  /**
   * Returns the <var>index</var>th item in the collection. If <var>index</var>
   * is greater than or equal to the number of nodes in the list, this returns
   * null.
   * @param index Index into the collection.
   * @return The {@link org.vectomatic.dom.svg.OMSVGElementInstance} object
   * at the <var>index</var>th   position in the {@link org.vectomatic.dom.svg.OMSVGElementInstanceList},
   * or null if that is not   a valid index.
   */
  public final native OMSVGElementInstance item(int index) /*-{
    return this.item(index);
  }-*/;

}
