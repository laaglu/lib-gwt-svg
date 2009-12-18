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
package org.vectomatic.dom.css;
public class OMPrimitiveValue extends org.vectomatic.dom.css.OMValue {
  protected OMPrimitiveValue() {
  }

  // Implementation of the nsIDOMCSSPrimitiveValue XPCOM interface
  public final native short getPrimitiveType() /*-{
    return this.primitiveType;
  }-*/;
  public final native void setFloatValue(short unitType, float floatValue) /*-{
    this.setFloatValue(unitType, floatValue);
  }-*/;
  public final native float getFloatValue(short unitType) /*-{
    return this.getFloatValue(unitType);
  }-*/;
  public final native void setStringValue(short stringType, java.lang.String stringValue) /*-{
    this.setStringValue(stringType, stringValue);
  }-*/;
  public final native java.lang.String getStringValue() /*-{
    return this.getStringValue();
  }-*/;
  public final native org.vectomatic.dom.css.OMCounter getCounterValue() /*-{
    return this.getCounterValue();
  }-*/;
  public final native org.vectomatic.dom.css.OMRect getRectValue() /*-{
    return this.getRectValue();
  }-*/;
  public final native org.vectomatic.dom.css.OMRGBColor getRGBColorValue() /*-{
    return this.getRGBColorValue();
  }-*/;

}
