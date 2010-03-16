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

import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.impl.SVGUseElement;

import com.google.gwt.dom.client.EventTarget;

public class OMSVGElementInstance extends EventTarget {
  protected OMSVGElementInstance() {
  }

  // Implementation of the svg::SVGElementInstance W3C IDL interface
  public final OMSVGElement getCorrespondingElement() {
    return (OMSVGElement) OMNode.convert(getCorrespondingElement_());
  };
  public final OMSVGUseElement getCorrespondingUseElement() {
    return (OMSVGUseElement) OMNode.convert(getCorrespondingUseElement_());
  };
  private final native SVGElement getCorrespondingElement_() /*-{
    return this.correspondingElement;
  }-*/;
  private final native SVGUseElement getCorrespondingUseElement_() /*-{
    return this.correspondingUseElement;
  }-*/;
  public final native OMSVGElementInstance getParentNode() /*-{
    return this.parentNode;
  }-*/;
  public final native OMSVGElementInstanceList getChildNodes() /*-{
    return this.childNodes;
  }-*/;
  public final native OMSVGElementInstance getFirstChild() /*-{
    return this.firstChild;
  }-*/;
  public final native OMSVGElementInstance getLastChild() /*-{
    return this.lastChild;
  }-*/;
  public final native OMSVGElementInstance getPreviousSibling() /*-{
    return this.previousSibling;
  }-*/;
  public final native OMSVGElementInstance getNextSibling() /*-{
    return this.nextSibling;
  }-*/;

}
