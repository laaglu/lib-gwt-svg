/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGLength extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGLength() {
  }

  // Implementation of the nsIDOMSVGLength XPCOM interface
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
  public final native java.lang.String getValueAsString() /*-{
    return this.valueAsString;
  }-*/;
  public final native void setValueAsString(java.lang.String value) /*-{
    this.valueAsString = value;
  }-*/;
  public final native void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits) /*-{
    this.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
  }-*/;
  public final native void convertToSpecifiedUnits(short unitType) /*-{
    this.convertToSpecifiedUnits(unitType);
  }-*/;

}
