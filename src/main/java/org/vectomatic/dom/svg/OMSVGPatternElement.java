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

import org.vectomatic.dom.svg.impl.SVGPatternElement;
import org.vectomatic.dom.svg.itf.ISVGContainerElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGFitToViewBox;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGURIReference;
import org.vectomatic.dom.svg.itf.ISVGUnitTypes;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGPatternElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
 * title='pattern element specification'>pattern</a> element.
 */
@TagName("pattern")
public class OMSVGPatternElement extends OMSVGElement implements ISVGURIReference, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGFitToViewBox, ISVGUnitTypes, ISVGContainerElement {
  protected OMSVGPatternElement(SVGPatternElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGPatternElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getPatternUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element. Takes one of
   * the constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final OMSVGAnimatedEnumeration getPatternUnits() {
    return ((SVGPatternElement)ot).getPatternUnits();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getPatternContentUnits()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element. Takes one of
   * the constants defined in {@link org.vectomatic.dom.svg.itf.ISVGUnitTypes}.
   */
  public final OMSVGAnimatedEnumeration getPatternContentUnits() {
    return ((SVGPatternElement)ot).getPatternContentUnits();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getPatternTransform()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element.
   */
  public final OMSVGAnimatedTransformList getPatternTransform() {
    return ((SVGPatternElement)ot).getPatternTransform();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGPatternElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGPatternElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGPatternElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGPatternElement#getHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/pservers.html#PatternElement'
   * title='pattern element specification'>pattern</a> element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGPatternElement)ot).getHeight();
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * on the given element. Note that the SVG DOM defines the attribute {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * as being of type {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean}, whereas
   * the SVG language definition says that {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * is not animated. Because the SVG language definition states that {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * cannot be animated, the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getAnimVal()}
   * will always be the same as the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getBaseVal()}.
   */
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGPatternElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getViewBox()}
   * on the given element.
   */
  public final OMSVGAnimatedRect getViewBox() {
    return ((SVGPatternElement)ot).getViewBox();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGFitToViewBox#getPreserveAspectRatio()}
   * on the given element.
   */
  public final OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
    return ((SVGPatternElement)ot).getPreserveAspectRatio();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final String getXmllang() {
    return ((SVGPatternElement)ot).getXmllang();
  }
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmllang(java.lang.String value) throws JavaScriptException {
    ((SVGPatternElement)ot).setXmllang(value);
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final String getXmlspace() {
    return ((SVGPatternElement)ot).getXmlspace();
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmlspace(java.lang.String value) throws JavaScriptException {
    ((SVGPatternElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredFeatures()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGPatternElement)ot).getRequiredFeatures();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredExtensions()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGPatternElement)ot).getRequiredExtensions();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getSystemLanguage()}
   * on the given element.
   */
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGPatternElement)ot).getSystemLanguage();
  }
  /**
   * Returns true if the user agent supports the given extension, specified
   * by a URI.
   * @param extension The name of the extension, expressed as a URI.
   * @return True or false, depending on whether the given extension is   supported.
   */
  public final boolean hasExtension(String extension) {
    return ((SVGPatternElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGURIReference W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'xlink:href'</span> on
   * the given element.
   */
  public final OMSVGAnimatedString getHref() {
    return ((SVGPatternElement)ot).getHref();
  }

  // Implementation of the svg::SVGUnitTypes W3C IDL interface

}
