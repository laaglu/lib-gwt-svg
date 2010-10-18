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

import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.impl.SVGUseElement;

import com.google.gwt.dom.client.EventTarget;

/**
 * <p>For each <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> element, the SVG DOM maintains
 * a shadow tree (the "instance tree") of objects of type {@link org.vectomatic.dom.svg.OMSVGElementInstance}.
 * An {@link org.vectomatic.dom.svg.OMSVGElementInstance} represents a single
 * node in the instance tree. The root object in the instance tree is pointed
 * to by the {@link org.vectomatic.dom.svg.impl.SVGUseElement#getInstanceRoot()}
 * attribute on the {@link org.vectomatic.dom.svg.impl.SVGUseElement} object
 * for the corresponding <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> element.</p> <p>If the <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> element references a simple graphics
 * element such as a <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
 * title='rect element specification'>rect</a>, then there is only a single
 * {@link org.vectomatic.dom.svg.OMSVGElementInstance} object, and the {@link
 * org.vectomatic.dom.svg.OMSVGElementInstance#getCorrespondingElement()}
 * attribute on this {@link org.vectomatic.dom.svg.OMSVGElementInstance} object
 * is the {@link org.vectomatic.dom.svg.impl.SVGRectElement} that corresponds
 * to the referenced <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
 * title='rect element specification'>rect</a> element.</p> <p>If the <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> element references a <a href='http://www.w3.org/TR/SVG11/struct.html#GElement'
 * title='g element specification'>g</a> which contains two <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
 * title='rect element specification'>rect</a> elements, then the instance
 * tree contains three {@link org.vectomatic.dom.svg.OMSVGElementInstance}
 * objects, a root {@link org.vectomatic.dom.svg.OMSVGElementInstance} object
 * whose {@link org.vectomatic.dom.svg.OMSVGElementInstance#getCorrespondingElement()}
 * is the {@link org.vectomatic.dom.svg.impl.SVGGElement} object for the <a
 * href='http://www.w3.org/TR/SVG11/struct.html#GElement' title='g element
 * specification'>g</a>, and then two child {@link org.vectomatic.dom.svg.OMSVGElementInstance}
 * objects, each of which has its {@link org.vectomatic.dom.svg.OMSVGElementInstance#getCorrespondingElement()}
 * that is an {@link org.vectomatic.dom.svg.impl.SVGRectElement} object.</p>
 * <p>If the referenced object is itself a <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a>, or if there are <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> subelements within the referenced
 * object, the instance tree will contain recursive expansion of the indirect
 * references to form a complete tree. For example, if a <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> element references a <a href='http://www.w3.org/TR/SVG11/struct.html#GElement'
 * title='g element specification'>g</a>, and the <a href='http://www.w3.org/TR/SVG11/struct.html#GElement'
 * title='g element specification'>g</a> itself contains a <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a>, and that <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> references a <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
 * title='rect element specification'>rect</a>, then the instance tree for
 * the original (outermost) <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
 * title='use element specification'>use</a> will consist of a hierarchy of
 * {@link org.vectomatic.dom.svg.OMSVGElementInstance} objects, as follows:</p>
 * <pre>SVGElementInstance #1 (parentNode=null, firstChild=#2, correspondingElement
 * is the 'g')
 * SVGElementInstance #2 (parentNode=#1, firstChild=#3, correspondingElement
 * is the other 'use')
 * SVGElementInstance #3 (parentNode=#2, firstChild=null, correspondingElement
 * is the 'rect')
 * </pre>
 */
public class OMSVGElementInstance extends EventTarget {
  protected OMSVGElementInstance() {
  }

  // Implementation of the svg::SVGElementInstance W3C IDL interface
  /**
   * The corresponding element to which this object is an instance. For example,
   * if a <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement' title='use
   * element specification'>use</a> element references a <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element, then an {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * is created, with its {@link org.vectomatic.dom.svg.OMSVGElementInstance#getCorrespondingElement()}
   * being the {@link org.vectomatic.dom.svg.OMSVGElementInstance} object for
   * the <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement' title='rect
   * element specification'>rect</a> element.
   */
  public final OMSVGElement getCorrespondingElement() {
    return (OMSVGElement) OMNode.convert(getCorrespondingElement_());
  };
  /**
   * The corresponding <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
   * title='use element specification'>use</a> element to which this {@link
   * org.vectomatic.dom.svg.OMSVGElementInstance} object belongs. When <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
   * title='use element specification'>use</a> elements are nested (e.g., a
   * <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement' title='use
   * element specification'>use</a> references another <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
   * title='use element specification'>use</a> which references a graphics element
   * such as a <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a>), then the {@link org.vectomatic.dom.svg.OMSVGElementInstance#getCorrespondingUseElement()}
   * is the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#UseElement'
   * title='use element specification'>use</a> (i.e., the one which indirectly
   * references the <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a>, not the one with the direct
   * reference).
   */
  public final OMSVGUseElement getCorrespondingUseElement() {
    return (OMSVGUseElement) OMNode.convert(getCorrespondingUseElement_());
  };
  /**
   * The parent of this {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * within the instance tree. All {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * objects have a parent except the {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * which corresponds to the element which was directly referenced by the <a
   * href='http://www.w3.org/TR/SVG11/struct.html#UseElement' title='use element
   * specification'>use</a> element, in which case {@link org.vectomatic.dom.svg.OMSVGElementInstance#getParentNode()}
   * is null.
   */
  public final native OMSVGElementInstance getParentNode() /*-{
    return this.parentNode;
  }-*/;
  /**
   * An {@link org.vectomatic.dom.svg.OMSVGElementInstanceList} that contains
   * all children of this {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * within the instance tree. If there are no children, this is an {@link org.vectomatic.dom.svg.OMSVGElementInstanceList}
   * containing no entries (i.e., an empty list).
   */
  public final native OMSVGElementInstanceList getChildNodes() /*-{
    return this.childNodes;
  }-*/;
  /**
   * The first child of this {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * within the instance tree. If there is no such {@link org.vectomatic.dom.svg.OMSVGElementInstance},
   * this returns null.
   */
  public final native OMSVGElementInstance getFirstChild() /*-{
    return this.firstChild;
  }-*/;
  /**
   * The last child of this {@link org.vectomatic.dom.svg.OMSVGElementInstance}
   * within the instance tree. If there is no such {@link org.vectomatic.dom.svg.OMSVGElementInstance},
   * this returns null.
   */
  public final native OMSVGElementInstance getLastChild() /*-{
    return this.lastChild;
  }-*/;
  /**
   * The {@link org.vectomatic.dom.svg.OMSVGElementInstance} immediately preceding
   * this {@link org.vectomatic.dom.svg.OMSVGElementInstance}. If there is no
   * such {@link org.vectomatic.dom.svg.OMSVGElementInstance}, this returns
   * null.
   */
  public final native OMSVGElementInstance getPreviousSibling() /*-{
    return this.previousSibling;
  }-*/;
  /**
   * The {@link org.vectomatic.dom.svg.OMSVGElementInstance} immediately following
   * this {@link org.vectomatic.dom.svg.OMSVGElementInstance}. If there is no
   * such {@link org.vectomatic.dom.svg.OMSVGElementInstance}, this returns
   * null.
   */
  public final native OMSVGElementInstance getNextSibling() /*-{
    return this.nextSibling;
  }-*/;

  private final native SVGElement getCorrespondingElement_() /*-{
    return this.correspondingElement;
  }-*/;
  private final native SVGUseElement getCorrespondingUseElement_() /*-{
    return this.correspondingUseElement;
  }-*/;

}
