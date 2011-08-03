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

import com.google.gwt.core.client.JavaScriptException;

/**
 * Class for a CSS primitive value
 * @author laaglu
 */
public class OMCSSPrimitiveValue extends OMCSSValue {
  public static final short CSS_UNKNOWN = 0;
  public static final short CSS_NUMBER = 1;
  public static final short CSS_PERCENTAGE = 2;
  public static final short CSS_EMS = 3;
  public static final short CSS_EXS = 4;
  public static final short CSS_PX = 5;
  public static final short CSS_CM = 6;
  public static final short CSS_MM = 7;
  public static final short CSS_IN = 8;
  public static final short CSS_PT = 9;
  public static final short CSS_PC = 10;
  public static final short CSS_DEG = 11;
  public static final short CSS_RAD = 12;
  public static final short CSS_GRAD = 13;
  public static final short CSS_MS = 14;
  public static final short CSS_S = 15;
  public static final short CSS_HZ = 16;
  public static final short CSS_KHZ = 17;
  public static final short CSS_DIMENSION = 18;
  public static final short CSS_STRING = 19;
  public static final short CSS_URI = 20;
  public static final short CSS_IDENT = 21;
  public static final short CSS_ATTR = 22;
  public static final short CSS_COUNTER = 23;
  public static final short CSS_RECT = 24;
  public static final short CSS_RGBCOLOR = 25;
  
  private short primitiveType;
  private float value;
  protected OMCSSPrimitiveValue(float f) {
	  this(f, CSS_NUMBER);
  }

  public OMCSSPrimitiveValue(float value, short primitiveType) {
	  super(CSS_PRIMITIVE_VALUE);
	  setCssText(Float.toString(value));
	  this.value = value;
	  this.primitiveType = primitiveType;
  }

  // Implementation of the css::CSSPrimitiveValue W3C IDL interface
  public final short getPrimitiveType() {
    return this.primitiveType;
  }
  public final void setFloatValue(short unitType, float floatValue) throws JavaScriptException {
	this.primitiveType = unitType;
    this.value = floatValue;
  }
  public final float getFloatValue(short unitType) throws JavaScriptException {
    return value;
  }
  public final void setStringValue(short stringType, String stringValue) throws JavaScriptException {
    this.setStringValue(stringType, stringValue);
  }
  public final String getStringValue() throws JavaScriptException {
    return this.getStringValue();
  }
  public final OMRGBColor getRGBColorValue() throws JavaScriptException {
    return this.getRGBColorValue();
  }
  @Override
  public String getDescription() {
	StringBuilder builder = new StringBuilder("OMCSSPrimitiveValue(primitiveType=");
	builder.append(primitiveType);
	builder.append(", value=");
	builder.append(value);
	builder.append(", cssValueType=");
	builder.append(cssValueType);
	builder.append(", cssText=");
	builder.append(cssText);
	builder.append(")");
	return builder.toString();
  }

}
