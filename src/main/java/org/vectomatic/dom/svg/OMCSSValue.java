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


/**
 * Base class for CSS values
 * @author laaglu
 */
public abstract class OMCSSValue {
  public static final short CSS_INHERIT = 0;
  public static final short CSS_PRIMITIVE_VALUE = 1;
  public static final short CSS_VALUE_LIST = 2;
  public static final short CSS_CUSTOM = 3;
  protected String cssText;
  protected short cssValueType;
  protected OMCSSValue(short cssValueType) {
	  this.cssValueType = cssValueType;
  }

  // Implementation of the css::CSSValue W3C IDL interface
  public final String getCssText() {
    return this.cssText;
  }
  public final void setCssText(String value) {
    this.cssText = value;
  }
  public final short getCssValueType() {
    return this.cssValueType;
  }
  @Override
  public String toString() {
	return cssText;
  }
  public abstract String getDescription();
}
