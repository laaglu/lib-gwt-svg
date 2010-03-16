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

import com.google.gwt.core.client.JavaScriptObject;

public class OMSVGLength extends JavaScriptObject {
  public static final short SVG_LENGTHTYPE_UNKNOWN = 0;
  public static final short SVG_LENGTHTYPE_NUMBER = 1;
  public static final short SVG_LENGTHTYPE_PERCENTAGE = 2;
  public static final short SVG_LENGTHTYPE_EMS = 3;
  public static final short SVG_LENGTHTYPE_EXS = 4;
  public static final short SVG_LENGTHTYPE_PX = 5;
  public static final short SVG_LENGTHTYPE_CM = 6;
  public static final short SVG_LENGTHTYPE_MM = 7;
  public static final short SVG_LENGTHTYPE_IN = 8;
  public static final short SVG_LENGTHTYPE_PT = 9;
  public static final short SVG_LENGTHTYPE_PC = 10;
  protected OMSVGLength() {
  }

  // Implementation of the svg::SVGLength W3C IDL interface
  public final native short getUnitType() /*-{
    return this.unitType;
  }-*/;
  public final native float getValue() /*-{
    return this.value;
  }-*/;
  public final native void setValue(float value) /*-{
    this.value = value;
  }-*/;
  public final native float getValueInSpecifiedUnits() /*-{
    return this.valueInSpecifiedUnits;
  }-*/;
  public final native void setValueInSpecifiedUnits(float value) /*-{
    this.valueInSpecifiedUnits = value;
  }-*/;
  public final native String getValueAsString() /*-{
    return this.valueAsString;
  }-*/;
  public final native void setValueAsString(String value) /*-{
    this.valueAsString = value;
  }-*/;
  public final native void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits) /*-{
    this.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
  }-*/;
  public final native void convertToSpecifiedUnits(short unitType) /*-{
    this.convertToSpecifiedUnits(unitType);
  }-*/;

}
