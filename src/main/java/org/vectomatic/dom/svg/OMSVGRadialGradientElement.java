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

import org.vectomatic.dom.svg.impl.SVGRadialGradientElement;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement} interface
 * corresponds to the <a href='http://www.w3.org/TR/SVG11/pservers.html#RadialGradientElement'
 * title='radialGradient element specification'>radialGradient</a> element.
 */
@TagName("radialGradient")
public class OMSVGRadialGradientElement extends OMSVGGradientElement {
  public OMSVGRadialGradientElement() {
    this((SVGRadialGradientElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_RADIAL_GRADIENT_TAG).cast());
  }

  protected OMSVGRadialGradientElement(SVGRadialGradientElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGRadialGradientElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement#getCx()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#RadialGradientElement'
   * title='radialGradient element specification'>radialGradient</a> element.
   */
  public final OMSVGAnimatedLength getCx() {
    return ((SVGRadialGradientElement)ot).getCx();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement#getCy()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#RadialGradientElement'
   * title='radialGradient element specification'>radialGradient</a> element.
   */
  public final OMSVGAnimatedLength getCy() {
    return ((SVGRadialGradientElement)ot).getCy();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement#getR()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#RadialGradientElement'
   * title='radialGradient element specification'>radialGradient</a> element.
   */
  public final OMSVGAnimatedLength getR() {
    return ((SVGRadialGradientElement)ot).getR();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement#getFx()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#RadialGradientElement'
   * title='radialGradient element specification'>radialGradient</a> element.
   */
  public final OMSVGAnimatedLength getFx() {
    return ((SVGRadialGradientElement)ot).getFx();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRadialGradientElement#getFy()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#RadialGradientElement'
   * title='radialGradient element specification'>radialGradient</a> element.
   */
  public final OMSVGAnimatedLength getFy() {
    return ((SVGRadialGradientElement)ot).getFy();
  }

}
