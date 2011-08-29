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

import org.vectomatic.dom.svg.impl.SVGGlyphRefElement;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/text.html#GlyphRefElement' title='glyphRef
 * element specification'>glyphRef</a>  element.
 */
@TagName("glyphRef")
public class OMSVGGlyphRefElement extends OMSVGElement implements ISVGURIReference, ISVGStylable {
  public OMSVGGlyphRefElement() {
    this((SVGGlyphRefElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_GLYPH_REF_TAG).cast());
  }

  protected OMSVGGlyphRefElement(SVGGlyphRefElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGGlyphRefElement W3C IDL interface
  /**
   * Corresponds to attribute <code>glyphRef attribute</code> on the given element.
   */
  public final String getGlyphRef() {
    return ((SVGGlyphRefElement)ot).getGlyphRef();
  }
  /**
   * Corresponds to attribute <code>glyphRef attribute</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setGlyphRef(java.lang.String value) throws JavaScriptException {
    ((SVGGlyphRefElement)ot).setGlyphRef(value);
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getFormat()}
   * on the given element.
   */
  public final String getFormat() {
    return ((SVGGlyphRefElement)ot).getFormat();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getFormat()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setFormat(java.lang.String value) throws JavaScriptException {
    ((SVGGlyphRefElement)ot).setFormat(value);
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getX()}
   * on the given element.
   */
  public final float getX() {
    return ((SVGGlyphRefElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getX()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setX(float value) throws JavaScriptException {
    ((SVGGlyphRefElement)ot).setX(value);
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getY()}
   * on the given element.
   */
  public final float getY() {
    return ((SVGGlyphRefElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getY()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setY(float value) throws JavaScriptException {
    ((SVGGlyphRefElement)ot).setY(value);
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getDx()}
   * on the given element.
   */
  public final float getDx() {
    return ((SVGGlyphRefElement)ot).getDx();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getDx()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setDx(float value) throws JavaScriptException {
    ((SVGGlyphRefElement)ot).setDx(value);
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getDy()}
   * on the given element.
   */
  public final float getDy() {
    return ((SVGGlyphRefElement)ot).getDy();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGGlyphRefElement#getDy()}
   * on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setDy(float value) throws JavaScriptException {
    ((SVGGlyphRefElement)ot).setDy(value);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final OMSVGAnimatedString getHref() {
    return ((SVGGlyphRefElement)ot).getHref();
  }

}
