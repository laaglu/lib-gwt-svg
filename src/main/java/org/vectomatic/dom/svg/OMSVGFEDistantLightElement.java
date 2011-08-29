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

import org.vectomatic.dom.svg.impl.SVGFEDistantLightElement;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGFEDistantLightElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/filters.html#feDistantLightElement'
 * title='feDistantLight element specification'>feDistantLight</a> element.
 */
@TagName("feDistantLight")
public class OMSVGFEDistantLightElement extends OMSVGElement {
  public OMSVGFEDistantLightElement() {
    this((SVGFEDistantLightElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_FE_DISTANT_LIGHT_TAG).cast());
  }

  protected OMSVGFEDistantLightElement(SVGFEDistantLightElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGFEDistantLightElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEDistantLightElement#getAzimuth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDistantLightElement'
   * title='feDistantLight element specification'>feDistantLight</a> element.
   */
  public final OMSVGAnimatedNumber getAzimuth() {
    return ((SVGFEDistantLightElement)ot).getAzimuth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGFEDistantLightElement#getElevation()}
   * on the given <a href='http://www.w3.org/TR/SVG11/filters.html#feDistantLightElement'
   * title='feDistantLight element specification'>feDistantLight</a> element.
   */
  public final OMSVGAnimatedNumber getElevation() {
    return ((SVGFEDistantLightElement)ot).getElevation();
  }

}
