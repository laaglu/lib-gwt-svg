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

import com.google.gwt.core.client.JavaScriptException;

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the
 * SVG language (such as the {@link org.vectomatic.dom.svg.OMSVGPathElement}
 * interface for the <a href='http://www.w3.org/TR/SVG11/paths.html#PathElement'
 * title='path element specification'>path</a> element) derive from the {@link
 * org.vectomatic.dom.svg.OMSVGElement} interface.
 */
public abstract class OMSVGElement extends OMElement {
  protected OMSVGElement(SVGElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGElement W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:base</code> on the given element.
   */
  public final String getXmlbase() {
    return ((SVGElement)ot).getXmlbase();
  }
  /**
   * Corresponds to attribute <code>xml:base</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmlbase(java.lang.String value) throws JavaScriptException {
    ((SVGElement)ot).setXmlbase(value);
  }
  /**
   * The nearest ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element. Null if the given element
   * is the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final OMSVGSVGElement getOwnerSVGElement() {
    return (OMSVGSVGElement)convert(((SVGElement)ot).getOwnerSVGElement());
  }
  /**
   * The element which established the current viewport. Often, the nearest
   * ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element. Null if the given element is the
   * outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element.
   */
  public final OMSVGElement getViewportElement() {
    return (OMSVGElement)convert(((SVGElement)ot).getViewportElement());
  }

  /**
   * Sets the 'id' attribute of the specified element
   * @param value the value of the 'id' attribute
   */
  public final void setId(java.lang.String value) {
    ((SVGElement)ot).setId(value);
  }

  // Implementation of the svg::Stylable W3C IDL interface
  /**
   * Returns the CSS style of this element
   */
  public OMSVGStyle getStyle() {
	return ((SVGElement) ot).getStyle().cast();
  }

  /**
   * Returns the CSS class name of this element. Note that
   * in SVG, this class name can change over the time (there is
   * a baseVal and an animVal).
   * @return the CSS class name of this element
   */
  public final OMSVGAnimatedString getClassName() {
    return ((SVGElement) ot).getClassName_();
  }

  /**
   * Adds the specified class name to the baseVal CSS class name of this element
   * @param className the class name to add
   */
  public final void addClassNameBaseVal(String className) {
    assert (className != null) : "Unexpectedly null class name";

    className = className.trim();
    assert (className.length() != 0) : "Unexpectedly empty class name";

    // Get the current style string.
    String oldClassName = getClassName().getBaseVal();
    int idx = oldClassName.indexOf(className);

    // Calculate matching index.
    while (idx != -1) {
      if (idx == 0 || oldClassName.charAt(idx - 1) == ' ') {
        int last = idx + className.length();
        int lastPos = oldClassName.length();
        if ((last == lastPos)
            || ((last < lastPos) && (oldClassName.charAt(last) == ' '))) {
          break;
        }
      }
      idx = oldClassName.indexOf(className, idx + 1);
    }

    // Only add the style if it's not already present.
    if (idx == -1) {
      if (oldClassName.length() > 0) {
        oldClassName += " ";
      }
      setClassNameBaseVal(oldClassName + className);
    }
  }

  /**
   * Removes the specified class name from the baseVal CSS class name of this element
   * @param className the class name to remove
   */
  public final void removeClassNameBaseVal(String className) {
    assert (className != null) : "Unexpectedly null class name";

    className = className.trim();
    assert (className.length() != 0) : "Unexpectedly empty class name";

    // Get the current style string.
    String oldStyle = getClassName().getBaseVal();
    int idx = oldStyle.indexOf(className);

    // Calculate matching index.
    while (idx != -1) {
      if (idx == 0 || oldStyle.charAt(idx - 1) == ' ') {
        int last = idx + className.length();
        int lastPos = oldStyle.length();
        if ((last == lastPos)
            || ((last < lastPos) && (oldStyle.charAt(last) == ' '))) {
          break;
        }
      }
      idx = oldStyle.indexOf(className, idx + 1);
    }

    // Don't try to remove the style if it's not there.
    if (idx != -1) {
      // Get the leading and trailing parts, without the removed name.
      String begin = oldStyle.substring(0, idx).trim();
      String end = oldStyle.substring(idx + className.length()).trim();

      // Some contortions to make sure we don't leave extra spaces.
      String newClassName;
      if (begin.length() == 0) {
        newClassName = end;
      } else if (end.length() == 0) {
        newClassName = begin;
      } else {
        newClassName = begin + " " + end;
      }

      setClassNameBaseVal(newClassName);
    }
  }

  /**
   * Replaces the specified class name in the baseVal CSS class name of this element
   * with a new class name
   * @param oldClassName the class name to replace
   * @param newClassName the replacement class name
   */
  public final void replaceClassNameBaseVal(String oldClassName, String newClassName) {
    removeClassNameBaseVal(oldClassName);
    addClassNameBaseVal(newClassName);
  }

  /**
   * Sets the baseVal CSS class name of this element to the specified value
   * @param className the class name
   */
  public final void setClassNameBaseVal(String className) {
    getClassName().setBaseVal(className);
  }
  
  /**
   * Returns the XML markup which corresponds to the subtree rooted
   * at this element
   * @return the XML markup which corresponds to the subtree rooted
   * at this element
   */
  public final String getMarkup() {
	return ((SVGElement) ot).getMarkup();
  }
}
