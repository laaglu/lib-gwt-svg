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

import org.vectomatic.dom.svg.impl.SVGTextPathElement;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGTextPathElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/text.html#TextPathElement' title='textPath
 * element specification'>textPath</a> element.
 */
@TagName("textPath")
public class OMSVGTextPathElement extends OMSVGTextContentElement implements ISVGURIReference {
  /**
   * The enumeration was set to a value that is not one of predefined types.
   * It is invalid to attempt to define a new value of this type or to attempt
   * to switch an existing value to this type.
   */
  public static final short TEXTPATH_METHODTYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class='attr-value'>'align'</span>.
   */
  public static final short TEXTPATH_METHODTYPE_ALIGN = 1;
  /**
   * Corresponds to value <span class='attr-value'>'stretch'</span>.
   */
  public static final short TEXTPATH_METHODTYPE_STRETCH = 2;
  /**
   * The enumeration was set to a value that is not one of predefined types.
   * It is invalid to attempt to define a new value of this type or to attempt
   * to switch an existing value to this type.
   */
  public static final short TEXTPATH_SPACINGTYPE_UNKNOWN = 0;
  /**
   * Corresponds to value <span class='attr-value'>'auto'</span>.
   */
  public static final short TEXTPATH_SPACINGTYPE_AUTO = 1;
  /**
   * Corresponds to value <span class='attr-value'>'exact'</span>.
   */
  public static final short TEXTPATH_SPACINGTYPE_EXACT = 2;
  public OMSVGTextPathElement() {
    this((SVGTextPathElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_TEXT_PATH_TAG).cast());
  }

  protected OMSVGTextPathElement(SVGTextPathElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextPathElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGTextPathElement#getStartOffset()}
   * on the given <a href='http://www.w3.org/TR/SVG11/text.html#TextPathElement'
   * title='textPath element specification'>textPath</a> element.
   */
  public final OMSVGAnimatedLength getStartOffset() {
    return ((SVGTextPathElement)ot).getStartOffset();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGTextPathElement#getMethod()}
   * on the given <a href='http://www.w3.org/TR/SVG11/text.html#TextPathElement'
   * title='textPath element specification'>textPath</a> element.
   */
  public final OMSVGAnimatedEnumeration getMethod() {
    return ((SVGTextPathElement)ot).getMethod();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGTextPathElement#getSpacing()}
   * on the given <a href='http://www.w3.org/TR/SVG11/text.html#TextPathElement'
   * title='textPath element specification'>textPath</a> element.
   */
  public final OMSVGAnimatedEnumeration getSpacing() {
    return ((SVGTextPathElement)ot).getSpacing();
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final OMSVGAnimatedString getHref() {
    return ((SVGTextPathElement)ot).getHref();
  }

}
