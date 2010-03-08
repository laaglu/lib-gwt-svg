/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of libgwtsvg.
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

public abstract class OMSVGElement extends OMElement {
  protected OMSVGElement(SVGElement ot) {
    super(ot);
  }
  
  // Implementation of the svg::SVGElement W3C IDL interface
  public final String getXmlbase() {
    return ((SVGElement)ot).getXmlbase();
  }
  public final void setXmlbase(java.lang.String value) {
    ((SVGElement)ot).setXmlbase(value);
  }
  public final OMSVGSVGElement getOwnerSVGElement() {
    return (OMSVGSVGElement)convert(((SVGElement)ot).getOwnerSVGElement());
  }
  public final OMSVGElement getViewportElement() {
    return (OMSVGElement)convert(((SVGElement)ot).getViewportElement());
  }
  public final void setId(java.lang.String value) {
    ((SVGElement)ot).setId(value);
  }

  // Implementation of the svg::Stylable W3C IDL interface
  public OMSVGStyle getStyle() {
	return ((SVGElement) ot).getStyle().cast();
  }

  public final OMSVGAnimatedString getClassName() {
    return ((SVGElement) ot).getClassName_();
  }

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

  public final void replaceClassNameBaseVal(String oldClassName, String newClassName) {
    removeClassNameBaseVal(oldClassName);
    addClassNameBaseVal(newClassName);
  }

  public final void setClassNameBaseVal(String className) {
    getClassName().setBaseVal(className);
  }
  public final String getMarkup() {
	return ((SVGElement) ot).getMarkup();
  }
}
