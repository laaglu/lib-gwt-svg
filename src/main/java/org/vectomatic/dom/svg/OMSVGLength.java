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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGLength} interface corresponds to
 * the <a href='types.html#DataTypeLength'>&lt;length&gt;</a> basic data type.
 * <p id="ReadOnlyLength">An {@link org.vectomatic.dom.svg.OMSVGLength} object
 * can be designated as <em>read only</em>, which means that attempts to modify
 * the object will result in an exception being thrown, as described below.</p>
 */
public class OMSVGLength extends JavaScriptObject {
/**
 * The unit type is not one of predefined unit types. It is invalid to attempt
 * to define a new value of this type or to attempt to switch an existing
 * value to this type.
 */
  public static final short SVG_LENGTHTYPE_UNKNOWN = 0;
/**
 * No unit type was provided (i.e., a unitless value was specified), which
 * indicates a value in user units.
 */
  public static final short SVG_LENGTHTYPE_NUMBER = 1;
/**
 * A percentage value was specified.
 */
  public static final short SVG_LENGTHTYPE_PERCENTAGE = 2;
/**
 * A value was specified using the em units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_EMS = 3;
/**
 * A value was specified using the ex units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_EXS = 4;
/**
 * A value was specified using the px units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_PX = 5;
/**
 * A value was specified using the cm units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_CM = 6;
/**
 * A value was specified using the mm units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_MM = 7;
/**
 * A value was specified using the in units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_IN = 8;
/**
 * A value was specified using the pt units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_PT = 9;
/**
 * A value was specified using the pc units defined in CSS2.
 */
  public static final short SVG_LENGTHTYPE_PC = 10;
  protected OMSVGLength() {
  }

  // Implementation of the svg::SVGLength W3C IDL interface
  /**
   * The type of the value as specified by one of the SVG_LENGTHTYPE_ constants
   * defined on this interface.
   */
  public final native short getUnitType() /*-{
    return this.unitType;
  }-*/;
  /**
   * The value as a floating point value, in user units. Setting this attribute
   * will cause {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()}
   * and {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()} to be
   * updated automatically to reflect this setting.
   */
  public final native float getValue() /*-{
    return this.value;
  }-*/;
  /**
   * The value as a floating point value, in user units. Setting this attribute
   * will cause {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()}
   * and {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()} to be
   * updated automatically to reflect this setting.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   */
  public final native void setValue(float value) throws JavaScriptException /*-{
    this.value = value;
  }-*/;
  /**
   * The value as a floating point value, in the units expressed by {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()}.
   * Setting this attribute will cause {@link org.vectomatic.dom.svg.OMSVGLength#getValue()}
   * and {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()} to be
   * updated automatically to reflect this setting.
   */
  public final native float getValueInSpecifiedUnits() /*-{
    return this.valueInSpecifiedUnits;
  }-*/;
  /**
   * The value as a floating point value, in the units expressed by {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()}.
   * Setting this attribute will cause {@link org.vectomatic.dom.svg.OMSVGLength#getValue()}
   * and {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()} to be
   * updated automatically to reflect this setting.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   */
  public final native void setValueInSpecifiedUnits(float value) throws JavaScriptException /*-{
    this.valueInSpecifiedUnits = value;
  }-*/;
  /**
   * The value as a string value, in the units expressed by {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()}.
   * Setting this attribute will cause {@link org.vectomatic.dom.svg.OMSVGLength#getValue()},
   * {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()} to be updated
   * automatically to reflect this setting.
   */
  public final native String getValueAsString() /*-{
    return this.valueAsString;
  }-*/;
  /**
   * The value as a string value, in the units expressed by {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()}.
   * Setting this attribute will cause {@link org.vectomatic.dom.svg.OMSVGLength#getValue()},
   * {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()} to be updated
   * automatically to reflect this setting.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   * @throws DOMException(SYNTAX_ERR) Raised if the assigned string cannot 
   * be parsed as a valid <code>&lt;length&gt;</code>.
   */
  public final native void setValueAsString(String value) throws JavaScriptException /*-{
    this.valueAsString = value;
  }-*/;
  /**
   * Reset the value as a number with an associated {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()},
   * thereby replacing the values for all of the attributes on the object.
   * @param unitType The unit type for the value (e.g., <code>SVG_LENGTHTYPE_MM</code>).
   * @param valueInSpecifiedUnits The new value.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   * @throws DOMException(NOT_SUPPORTED_ERR) Raised if unitType is SVG_LENGTHTYPE_UNKNOWN
   * or not a valid unit type constant (one of the other SVG_LENGTHTYPE_ constants
   * defined on this interface).
   */
  public final native void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits) throws JavaScriptException /*-{
    this.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
  }-*/;
  /**
   * Preserve the same underlying stored value, but reset the stored unit identifier
   * to the given <var>unitType</var>. Object attributes {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()},
   * {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()} might be
   * modified as a result of this method. For example, if the original value
   * were "0.5cm" and the method was invoked to convert to millimeters, then
   * the {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()} would be changed
   * to <code>SVG_LENGTHTYPE_MM</code>, {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()}
   * would be changed to the numeric value 5 and {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()}
   * would be changed to "5mm".
   * @param unitType The unit type to switch to (e.g., <code>SVG_LENGTHTYPE_MM</code>).
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   * @throws DOMException(NOT_SUPPORTED_ERR) Raised if unitType is SVG_LENGTHTYPE_UNKNOWN
   * or not a valid unit type constant (one of the other SVG_LENGTHTYPE_ constants
   * defined on this interface).
   */
  public final native void convertToSpecifiedUnits(short unitType) throws JavaScriptException /*-{
    this.convertToSpecifiedUnits(unitType);
  }-*/;

  // Helper methods
  /**
   * Converts a {@link com.google.gwt.dom.client.Style.Unit} enum to an
   * SVG length constant.
   * @return an SVG length constant.
   */
  public static final short unitToCode(com.google.gwt.dom.client.Style.Unit unit) {
	if (unit != null) {
		switch(unit) {
			case PCT:
				return SVG_LENGTHTYPE_PERCENTAGE;
			case EM:
				return SVG_LENGTHTYPE_EMS;
			case EX:
				return SVG_LENGTHTYPE_EXS;
			case PX:
				return SVG_LENGTHTYPE_PX;
			case CM:
				return SVG_LENGTHTYPE_CM;
			case MM:
				return SVG_LENGTHTYPE_MM;
			case IN:
				return SVG_LENGTHTYPE_IN;
			case PT:
				return SVG_LENGTHTYPE_PT;
			case PC:
				return SVG_LENGTHTYPE_PC;
		}
	}
	return SVG_LENGTHTYPE_NUMBER;
  }
  /**
   * Converts an SVG length constant to
   * a {@link com.google.gwt.dom.client.Style.Unit} enum.
   * @return a {@link com.google.gwt.dom.client.Style.Unit} enum.
   */
  public static final com.google.gwt.dom.client.Style.Unit codeToUnit(short unit) {
	switch(unit) {
		case SVG_LENGTHTYPE_NUMBER:
			return null;
		case SVG_LENGTHTYPE_PERCENTAGE:
			return com.google.gwt.dom.client.Style.Unit.PCT;
		case SVG_LENGTHTYPE_EMS:
			return com.google.gwt.dom.client.Style.Unit.EM;
		case SVG_LENGTHTYPE_EXS:
			return com.google.gwt.dom.client.Style.Unit.EX;
		case SVG_LENGTHTYPE_PX:
			return com.google.gwt.dom.client.Style.Unit.PX;
		case SVG_LENGTHTYPE_CM:
			return com.google.gwt.dom.client.Style.Unit.CM;
		case SVG_LENGTHTYPE_MM:
			return com.google.gwt.dom.client.Style.Unit.MM;
		case SVG_LENGTHTYPE_IN:
			return com.google.gwt.dom.client.Style.Unit.IN;
		case SVG_LENGTHTYPE_PT:
			return com.google.gwt.dom.client.Style.Unit.PT;
		case SVG_LENGTHTYPE_PC:
			return com.google.gwt.dom.client.Style.Unit.PC;
	}
	throw new IllegalStateException("Unsupported unit conversion");
  }
  /**
   * Returns the type of the value as defined by the
   * {@link com.google.gwt.dom.client.Style.Unit} enum.
   */
  public final com.google.gwt.dom.client.Style.Unit getUnit() {
	return codeToUnit(getUnitType());
  }
  /**
   * Reset the value as a number with an associated {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()},
   * thereby replacing the values for all of the attributes on the object.
   * @param unitType The unit type for the value.
   * @param valueInSpecifiedUnits The new value.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   * @throws DOMException(NOT_SUPPORTED_ERR) Raised if unitType is SVG_LENGTHTYPE_UNKNOWN
   * or not a valid unit type constant (one of the other SVG_LENGTHTYPE_ constants
   * defined on this interface).
   */
  public final void newValueSpecifiedUnits(com.google.gwt.dom.client.Style.Unit unitType, float valueInSpecifiedUnits) throws JavaScriptException {
	newValueSpecifiedUnits(unitToCode(unitType), valueInSpecifiedUnits);
  }
  /**
   * Preserve the same underlying stored value, but reset the stored unit identifier
   * to the given <var>unitType</var>. Object attributes {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()},
   * {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()} might be
   * modified as a result of this method. For example, if the original value
   * were "0.5cm" and the method was invoked to convert to millimeters, then
   * the {@link org.vectomatic.dom.svg.OMSVGLength#getUnitType()} would be changed
   * to <code>SVG_LENGTHTYPE_MM</code>, {@link org.vectomatic.dom.svg.OMSVGLength#getValueInSpecifiedUnits()}
   * would be changed to the numeric value 5 and {@link org.vectomatic.dom.svg.OMSVGLength#getValueAsString()}
   * would be changed to "5mm".
   * @param unitType The unit type to switch to.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the length
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyLength">read only</a>.
   * @throws DOMException(NOT_SUPPORTED_ERR) Raised if unitType is SVG_LENGTHTYPE_UNKNOWN
   * or not a valid unit type constant (one of the other SVG_LENGTHTYPE_ constants
   * defined on this interface).
   */
  public final void convertToSpecifiedUnits(com.google.gwt.dom.client.Style.Unit unitType) throws JavaScriptException {
	convertToSpecifiedUnits(unitToCode(unitType));
  }
}
