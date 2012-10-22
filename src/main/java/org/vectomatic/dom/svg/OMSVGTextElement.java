/**********************************************
 * Copyright (C) 2010-2011 Lukas Laag
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
import org.vectomatic.dom.svg.impl.SVGTextElement;
import org.vectomatic.dom.svg.itf.ISVGGraphicsElement;
import org.vectomatic.dom.svg.itf.ISVGTransformable;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGTextElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/text.html#TextElement' title='text
 * element specification'>text</a> element.
 */
@TagName("text")
public class OMSVGTextElement extends OMSVGTextPositioningElement implements ISVGTransformable, ISVGGraphicsElement {
  public OMSVGTextElement() {
    this((SVGTextElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_TEXT_TAG).cast());
  }

  protected OMSVGTextElement(SVGTextElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextElement W3C IDL interface

  // Implementation of the svg::SVGLocatable W3C IDL interface
  /**
   * The element which established the current viewport. Often, the nearest
   * ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element. Null if the current element is
   * the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGTextElement)ot).getNearestViewportElement());
  }
  /**
   * The farthest ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element. Null if the current
   * element is the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGTextElement)ot).getFarthestViewportElement());
  }
  /**
   * Returns the tight bounding box in current user space (i.e., after application
   * of the <code>transform</code> attribute, if any) on the geometry of all
   * contained graphics elements, exclusive of stroking, clipping, masking and
   * filter effects). Note that getBBox must return the actual bounding box
   * at the time the method was called, even in case the element has not yet
   * been rendered.
   * @return An {@link org.vectomatic.dom.svg.OMSVGRect} object that defines
   * the bounding box.
   */
  public final OMSVGRect getBBox() {
    return ((SVGTextElement)ot).getBBox();
  }
  /**
   * Returns the transformation matrix from current user units (i.e., after
   * application of the <code>transform</code> attribute, if any) to the viewport
   * coordinate system for the {@link org.vectomatic.dom.svg.itf.ISVGLocatable#getNearestViewportElement()}.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the CTM.
   */
  public final OMSVGMatrix getCTM() {
    return ((SVGTextElement)ot).getCTM();
  }
  /**
   * Returns the transformation matrix from current user units (i.e., after
   * application of the <code>transform</code> attribute, if any) to the parent
   * user agent's notice of a "pixel". For display devices, ideally this represents
   * a physical screen pixel. For other devices or environments where physical
   * pixel sizes are not known, then an algorithm similar to the CSS2 definition
   * of a "pixel" can be used instead.  Note that null is returned if this element
   * is not hooked into the document tree. This method would have been more
   * aptly named as <code>getClientCTM</code>, but the name <code>getScreenCTM</code>
   * is kept for historical reasons.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the given   transformation matrix.
   */
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGTextElement)ot).getScreenCTM();
  }
  /**
   * Returns the transformation matrix from the user coordinate system on the
   * current element (after application of the <code>transform</code> attribute,
   * if any) to the user coordinate system on parameter <var>element</var> (after
   * application of its <code>transform</code> attribute, if any).
   * @param element The target element.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the transformation.
   * @throws SVGException(SVG_MATRIX_NOT_INVERTABLE) Raised if the currently
   * defined transformation matrices make it impossible to compute the   given
   * matrix (e.g., because one of the transformations is singular).
   */
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) throws JavaScriptException {
    return ((SVGTextElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGTransformable W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTransformable#getTransform()}
   * on the given element.
   */
  public final OMSVGAnimatedTransformList getTransform() {
    return ((SVGTextElement)ot).getTransform();
  }

  // Helper methods
  /**
   * Constructor.
   * @param x the X coordinate of the text in specified units
   * @param y the Y coordinate of the text in specified units
   * @param unitType the unit type used to specify the text coordinates
   * @param data the string represented by the text object.
   */
  public OMSVGTextElement(float x, float y, short unitType, String data) {
    this();
    OMSVGSVGElement svg = new OMSVGSVGElement();
  	OMSVGLength xCoord = svg.createSVGLength(unitType, x);
  	getX().getBaseVal().appendItem(xCoord);
  	OMSVGLength yCoord = svg.createSVGLength(unitType, y);
  	getY().getBaseVal().appendItem(yCoord);
  	appendChild(new OMText(data));
  }
}
