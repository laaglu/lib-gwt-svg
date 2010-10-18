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
 * The {@link org.vectomatic.dom.svg.OMSVGAngle} interface corresponds to
 * the <a href='types.html#DataTypeAngle'>&lt;angle&gt;</a> basic data type.
 * <p id="ReadOnlyAngle">An {@link org.vectomatic.dom.svg.OMSVGAngle} object
 * can be designated as <em>read only</em>, which means that attempts to modify
 * the object will result in an exception being thrown, as described below.</p>
 */
public class OMSVGAngle extends JavaScriptObject {
/**
 * The unit type is not one of predefined unit types. It is invalid to attempt
 * to define a new value of this type or to attempt to switch an existing
 * value to this type.
 */
  public static final short SVG_ANGLETYPE_UNKNOWN = 0;
/**
 * No unit type was provided (i.e., a unitless value was specified). For angles,
 * a unitless value is treated the same as if degrees were specified.
 */
  public static final short SVG_ANGLETYPE_UNSPECIFIED = 1;
/**
 * The unit type was explicitly set to degrees.
 */
  public static final short SVG_ANGLETYPE_DEG = 2;
/**
 * The unit type is radians.
 */
  public static final short SVG_ANGLETYPE_RAD = 3;
/**
 * The unit type is radians.
 */
  public static final short SVG_ANGLETYPE_GRAD = 4;
  protected OMSVGAngle() {
  }

  // Implementation of the svg::SVGAngle W3C IDL interface
  /**
   * The type of the value as specified by one of the SVG_ANGLETYPE_ constants
   * defined on this interface.
   */
  public final native short getUnitType() /*-{
    return this.unitType;
  }-*/;
  /**
   * The angle value as a floating point value, in degrees. Setting this attribute
   * will cause {@link org.vectomatic.dom.svg.OMSVGAngle#getValueInSpecifiedUnits()}
   * and {@link org.vectomatic.dom.svg.OMSVGAngle#getValueAsString()} to be
   * updated automatically to reflect this setting.
   */
  public final native float getValue() /*-{
    return this.value;
  }-*/;
  /**
   * The angle value as a floating point value, in degrees. Setting this attribute
   * will cause {@link org.vectomatic.dom.svg.OMSVGAngle#getValueInSpecifiedUnits()}
   * and {@link org.vectomatic.dom.svg.OMSVGAngle#getValueAsString()} to be
   * updated automatically to reflect this setting.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the angle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyAngle">read only</a>.
   */
  public final native void setValue(float value) throws JavaScriptException /*-{
    this.value = value;
  }-*/;
  /**
   * The angle value as a floating point value, in the units expressed by {@link
   * org.vectomatic.dom.svg.OMSVGAngle#getUnitType()}. Setting this attribute
   * will cause {@link org.vectomatic.dom.svg.OMSVGAngle#getValue()} and {@link
   * org.vectomatic.dom.svg.OMSVGAngle#getValueAsString()} to be updated automatically
   * to reflect this setting.
   */
  public final native float getValueInSpecifiedUnits() /*-{
    return this.valueInSpecifiedUnits;
  }-*/;
  /**
   * The angle value as a floating point value, in the units expressed by {@link
   * org.vectomatic.dom.svg.OMSVGAngle#getUnitType()}. Setting this attribute
   * will cause {@link org.vectomatic.dom.svg.OMSVGAngle#getValue()} and {@link
   * org.vectomatic.dom.svg.OMSVGAngle#getValueAsString()} to be updated automatically
   * to reflect this setting.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the angle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyAngle">read only</a>.
   */
  public final native void setValueInSpecifiedUnits(float value) throws JavaScriptException /*-{
    this.valueInSpecifiedUnits = value;
  }-*/;
  /**
   * The angle value as a string value, in the units expressed by {@link org.vectomatic.dom.svg.OMSVGAngle#getUnitType()}.
   * Setting this attribute will cause {@link org.vectomatic.dom.svg.OMSVGAngle#getValue()},
   * {@link org.vectomatic.dom.svg.OMSVGAngle#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGAngle#getUnitType()} to be updated automatically
   * to reflect this setting.
   */
  public final native String getValueAsString() /*-{
    return this.valueAsString;
  }-*/;
  /**
   * The angle value as a string value, in the units expressed by {@link org.vectomatic.dom.svg.OMSVGAngle#getUnitType()}.
   * Setting this attribute will cause {@link org.vectomatic.dom.svg.OMSVGAngle#getValue()},
   * {@link org.vectomatic.dom.svg.OMSVGAngle#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGAngle#getUnitType()} to be updated automatically
   * to reflect this setting.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the angle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyAngle">read only</a>.
   * @throws DOMException(SYNTAX_ERR) Raised if the assigned string cannot 
   * be parsed as a valid <code>&lt;angle&gt;</code>.
   */
  public final native void setValueAsString(String value) throws JavaScriptException /*-{
    this.valueAsString = value;
  }-*/;
  /**
   * Reset the value as a number with an associated {@link org.vectomatic.dom.svg.OMSVGAngle#getUnitType()},
   * thereby replacing the values for all of the attributes on the object.
   * @param unitType The unit type for the value (e.g., <code>SVG_ANGLETYPE_DEG</code>).
   * @param valueInSpecifiedUnits The angle value.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the angle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyAngle">read only</a>.
   * @throws DOMException(NOT_SUPPORTED_ERR) Raised if unitType is SVG_ANGLETYPE_UNKNOWN
   * or not a valid unit type constant (one of the other SVG_ANGLETYPE_ constants
   * defined on this interface).
   */
  public final native void newValueSpecifiedUnits(short unitType, float valueInSpecifiedUnits) throws JavaScriptException /*-{
    this.newValueSpecifiedUnits(unitType, valueInSpecifiedUnits);
  }-*/;
  /**
   * Preserve the same underlying stored value, but reset the stored unit identifier
   * to the given <var>unitType</var>. Object attributes {@link org.vectomatic.dom.svg.OMSVGAngle#getUnitType()},
   * {@link org.vectomatic.dom.svg.OMSVGAngle#getValueInSpecifiedUnits()} and
   * {@link org.vectomatic.dom.svg.OMSVGAngle#getValueAsString()} might be modified
   * as a result of this method.
   * @param unitType The unit type to switch to (e.g., <code>SVG_ANGLETYPE_DEG</code>).
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised when the angle
   * corresponds to a <a href="svgdom.html#ReadOnlyNodes">read only attribute</a>
   * or when the object itself is   <a href="#ReadOnlyAngle">read only</a>.
   * @throws DOMException(NOT_SUPPORTED_ERR) Raised if unitType is SVG_ANGLETYPE_UNKNOWN
   * or not a valid unit type constant (one of the other SVG_ANGLETYPE_ constants
   * defined on this interface).
   */
  public final native void convertToSpecifiedUnits(short unitType) throws JavaScriptException /*-{
    this.convertToSpecifiedUnits(unitType);
  }-*/;

}
