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
package org.vectomatic.dom.svg.itf;

import org.vectomatic.dom.svg.OMSVGAnimatedString;
import org.vectomatic.dom.svg.OMSVGStyle;

/**
 * The {@link org.vectomatic.dom.svg.itf.ISVGStylable} interface is implemented on all objects
 * corresponding to SVG elements that can have <code>'style'</code> attribute,
 * <code>'class'</code> and presentation attributes specified on them.  It
 * is thus an ancestor interface for many of the interfaces defined in this
 * specification.
 */
public interface ISVGStylable {
	  /**
	   * Returns the CSS style of this element
	   */
	  public OMSVGStyle getStyle();
	  /**
	   * Returns the CSS class name of this element. Note that
	   * in SVG, this class name can change over the time (there is
	   * a baseVal and an animVal).
	   * @return the CSS class name of this element
	   */
	  public OMSVGAnimatedString getClassName();
	  /**
	   * Adds the specified class name to the baseVal CSS class name of this element
	   * @param className the class name to add
	   */
	  public void addClassNameBaseVal(String className);
	  /**
	   * Removes the specified class name from the baseVal CSS class name of this element
	   * @param className the class name to remove
	   */
	  public void removeClassNameBaseVal(String className);
	  /**
	   * Replaces the specified class name in the baseVal CSS class name of this element
	   * with a new class name
	   * @param oldClassName the class name to replace
	   * @param newClassName the replacement class name
	   */
	  public void replaceClassNameBaseVal(String oldClassName, String newClassName);
	  /**
	   * Sets the baseVal CSS class name of this element to the specified value
	   * @param className the class name
	   */
	  public void setClassNameBaseVal(String className);
}
