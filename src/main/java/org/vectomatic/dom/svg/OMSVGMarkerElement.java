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

import org.vectomatic.dom.svg.impl.SVGMarkerElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGFitToViewBox;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;

public class OMSVGMarkerElement extends OMSVGElement implements ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGFitToViewBox {
  public static final short SVG_MARKERUNITS_UNKNOWN = 0;
  public static final short SVG_MARKERUNITS_USERSPACEONUSE = 1;
  public static final short SVG_MARKERUNITS_STROKEWIDTH = 2;
  public static final short SVG_MARKER_ORIENT_UNKNOWN = 0;
  public static final short SVG_MARKER_ORIENT_AUTO = 1;
  public static final short SVG_MARKER_ORIENT_ANGLE = 2;
  protected OMSVGMarkerElement(SVGMarkerElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGMarkerElement W3C IDL interface
  public final OMSVGAnimatedLength getRefX() {
    return ((SVGMarkerElement)ot).getRefX();
  }
  public final OMSVGAnimatedLength getRefY() {
    return ((SVGMarkerElement)ot).getRefY();
  }
  public final OMSVGAnimatedEnumeration getMarkerUnits() {
    return ((SVGMarkerElement)ot).getMarkerUnits();
  }
  public final OMSVGAnimatedLength getMarkerWidth() {
    return ((SVGMarkerElement)ot).getMarkerWidth();
  }
  public final OMSVGAnimatedLength getMarkerHeight() {
    return ((SVGMarkerElement)ot).getMarkerHeight();
  }
  public final OMSVGAnimatedEnumeration getOrientType() {
    return ((SVGMarkerElement)ot).getOrientType();
  }
  public final OMSVGAnimatedAngle getOrientAngle() {
    return ((SVGMarkerElement)ot).getOrientAngle();
  }
  public final void setOrientToAuto() {
    ((SVGMarkerElement)ot).setOrientToAuto();
  }
  public final void setOrientToAngle(OMSVGAngle angle) {
    ((SVGMarkerElement)ot).setOrientToAngle(angle);
  }

  // Implementation of the svg::SVGFitToViewBox W3C IDL interface
  public final OMSVGAnimatedRect getViewBox() {
    return ((SVGMarkerElement)ot).getViewBox();
  }
  public final OMSVGAnimatedPreserveAspectRatio getPreserveAspectRatio() {
    return ((SVGMarkerElement)ot).getPreserveAspectRatio();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  public final String getXmllang() {
    return ((SVGMarkerElement)ot).getXmllang();
  }
  public final void setXmllang(java.lang.String value) {
    ((SVGMarkerElement)ot).setXmllang(value);
  }
  public final String getXmlspace() {
    return ((SVGMarkerElement)ot).getXmlspace();
  }
  public final void setXmlspace(java.lang.String value) {
    ((SVGMarkerElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGMarkerElement)ot).getExternalResourcesRequired();
  }

}
