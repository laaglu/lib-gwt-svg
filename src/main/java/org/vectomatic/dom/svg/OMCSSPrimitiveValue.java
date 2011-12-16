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

import java.util.HashMap;
import java.util.Map;

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
  private float floatValue;
  private String stringValue;
  private static Map<Short,String> unitToString;
  protected OMCSSPrimitiveValue(float f) {
	  this(f, CSS_NUMBER);
  }

  public OMCSSPrimitiveValue(float floatValue, short primitiveType) {
	  super(CSS_PRIMITIVE_VALUE);
	  if (unitToString == null) {
		  unitToString = new HashMap<Short, String>();
		  unitToString.put(CSS_EMS, "em");
		  unitToString.put(CSS_EXS, "ex");
		  unitToString.put(CSS_PX, "px");
		  unitToString.put(CSS_IN, "in");
		  unitToString.put(CSS_CM, "cm");
		  unitToString.put(CSS_MM, "mm");
		  unitToString.put(CSS_PT, "pt");
		  unitToString.put(CSS_PC, "pc");
		  unitToString.put(CSS_PERCENTAGE, "%");
	  }
	  StringBuilder builder = new StringBuilder(Float.toString(floatValue));
	  String unit = unitToString.get(primitiveType);
	  if (unit != null) {
		  builder.append(unit);
	  }
	  setCssText(builder.toString());
	  this.floatValue = floatValue;
	  this.primitiveType = primitiveType;
  }
  public OMCSSPrimitiveValue(String stringValue, short primitiveType) {
	  super(CSS_PRIMITIVE_VALUE);
	  this.stringValue = stringValue;
	  this.primitiveType = primitiveType;
	  this.cssText = stringValue;
  }

  // Implementation of the css::CSSPrimitiveValue W3C IDL interface
  public final short getPrimitiveType() {
    return this.primitiveType;
  }
  public final void setFloatValue(short unitType, float floatValue) throws JavaScriptException {
	this.primitiveType = unitType;
    this.floatValue = floatValue;
  }
  public final float getFloatValue(short unitType) throws JavaScriptException {
    return floatValue;
  }
  public final void setStringValue(short stringType, String stringValue) throws JavaScriptException {
	  this.primitiveType = stringType;
	  this.stringValue = stringValue;
  }
  public final String getStringValue() throws JavaScriptException {
    return stringValue;
  }
  public final OMRGBColor getRGBColorValue() throws JavaScriptException {
    throw new UnsupportedOperationException();
  }
  @Override
  public String getDescription() {
	StringBuilder builder = new StringBuilder("OMCSSPrimitiveValue(primitiveType=");
	builder.append(primitiveType);
	builder.append(", value=");
	if (primitiveType >= CSS_NUMBER && CSS_NUMBER <= CSS_GRAD) {
		builder.append(floatValue);
	} else {
		builder.append(stringValue);
	}
	builder.append(", cssValueType=");
	builder.append(cssValueType);
	builder.append(", cssText=");
	builder.append(cssText);
	builder.append(")");
	return builder.toString();
  }

}
