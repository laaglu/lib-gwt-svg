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

import org.vectomatic.dom.svg.impl.SVGPaintParser;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;

/**
 * <p>The {@link org.vectomatic.dom.svg.OMSVGColor} interface corresponds
 * to color value definition for properties <code>stop-color</code>, <code>flood-color</code>
 * and <code>lighting-color</code> and is a base class for interface {@link
 * org.vectomatic.dom.svg.OMSVGPaint}. It incorporates SVG's extended notion
 * of color, which incorporates ICC-based color specifications.</p> <p>Interface
 * {@link org.vectomatic.dom.svg.OMSVGColor} does <em>not</em> correspond
 * to the <a href='types.html#DataTypeColor'>&lt;color&gt;</a> basic data
 * type. For the <a href='types.html#DataTypeColor'>&lt;color&gt;</a> basic
 * data type, the applicable DOM interfaces are defined in <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113/'>DOM
 * Level 2 Style</a>; in particular, see the <code>RGBColor</code> interface
 * ([<a href='refs.html#ref-DOM2STYLE'>DOM2STYLE</a>], section 2.2).</p> <p>Note:
 * The {@link org.vectomatic.dom.svg.OMSVGColor} interface is deprecated,
 * and may be dropped from future versions of the SVG specification.</p>
 */
public class OMSVGColor extends OMCSSValue {
/**
 * The color type is not one of predefined types. It is invalid to attempt
 * to define a new value of this type or to attempt to switch an existing
 * value to this type.
 */
  public static final short SVG_COLORTYPE_UNKNOWN = 0;
/**
 * An sRGB color has been specified without an alterICC color specification.
 */
  public static final short SVG_COLORTYPE_RGBCOLOR = 1;
/**
 * An sRGB color has been specified along with an alterICC color specification.
 */
  public static final short SVG_COLORTYPE_RGBCOLOR_ICCCOLOR = 2;
/**
 * Corresponds to when keyword <span class='attr-value'>currentColor</span>
 * has been specified.
 */
  public static final short SVG_COLORTYPE_CURRENTCOLOR = 3;
  
  protected short colorType;
  protected OMRGBColor rgbColor;
  protected OMSVGICCColor iccColor;

  protected OMSVGColor() {
	  super(CSS_CUSTOM);
  }

  // Implementation of the svg::SVGColor W3C IDL interface
  /**
   * The type of the value as specified by one of the SVG_COLORTYPE_ constants
   * defined on this interface.
   */
  public final short getColorType() {
    return this.colorType;
  }
  /**
   * The color specified in the sRGB color space.
   */
  public final OMRGBColor getRgbColor() {
    return rgbColor;
  }
  /**
   * The alternate ICC color specification.
   */
  public final OMSVGICCColor getIccColor() {
	return iccColor;
  }
  /**
   * Modifies the color value to be the specified sRGB color without an alternate
   * ICC color specification.
   * @param rgbColor A string that matches <a href='types.html#DataTypeColor'>&lt;color&gt;</a>,
   * which specifies the new sRGB color value.
   * @throws SVGException(SVG_INVALID_VALUE_ERR) Raised if <var>rgbColor</var>
   * does not match <a href='types.html#DataTypeColor'>&lt;color&gt;</a>.
   */
  public final void setRGBColor(String rgbColor) throws JavaScriptException {
    setColor(SVG_COLORTYPE_RGBCOLOR, rgbColor, null);
  }
  /**
   * Modifies the color value to be the specified sRGB color with an alternate
   * ICC color specification.
   * @param rgbColor A string that matches <a href='types.html#DataTypeColor'>&lt;color&gt;</a>,
   * which specifies the new sRGB color value.
   * @param iccColor A string that matches <a href='types.html#DataTypeICCColor'>&lt;icccolor&gt;</a>,
   * which specifies the alternate ICC color specification.
   * @throws SVGException(SVG_INVALID_VALUE_ERR) Raised if <var>rgbColor</var>
   * does not match <a href='types.html#DataTypeColor'>&lt;color&gt;</a>   or
   * if <var>iccColor</var> does not match   <a href='types.html#DataTypeICCColor'>&lt;icccolor&gt;</a>.
   */
  public final void setRGBColorICCColor(String rgbColor, String iccColor) throws JavaScriptException {
    setColor(SVG_COLORTYPE_RGBCOLOR_ICCCOLOR, rgbColor, iccColor);
  }
  /**
   * Sets the color value as specified by the parameters. If <var>colorType</var>
   * requires an <code>RGBColor</code>, then <var>rgbColor</var> must be a string
   * that matches <a href='types.html#DataTypeColor'>&lt;color&gt;</a>; otherwise,
   * <var>rgbColor</var>. must be null. If <var>colorType</var> requires an
   * {@link org.vectomatic.dom.svg.OMSVGICCColor}, then <var>iccColor</var>
   * must be a string that matches <a href='types.html#DataTypeICCColor'>&lt;icccolor&gt;</a>;
   * otherwise, <var>iccColor</var> must be null.
   * @param colorType One of the defined constants for {@link org.vectomatic.dom.svg.OMSVGColor#getColorType()}.
   * @param rgbColor The specification of an sRGB color, or null.
   * @param iccColor The specification of an ICC color, or null.
   * @throws SVGException(SVG_INVALID_VALUE_ERR) Raised if one of the   parameters
   * has an invalid value.
   */
  public final void setColor(short colorType, String rgbColor, String iccColor) throws JavaScriptException {
	  //GWT.log("OMSVGColor.setColor(" + colorType + ", '" + rgbColor + "', '" + iccColor + "')");
	  if (colorType == SVG_COLORTYPE_RGBCOLOR_ICCCOLOR && iccColor != null && rgbColor != null) {
		this.iccColor = SVGPaintParser.INSTANCE.iccColor(iccColor);
		this.rgbColor = SVGPaintParser.INSTANCE.rgbColor(rgbColor);
		setCssText(rgbColor + " " + iccColor);
	  } else if (colorType == SVG_COLORTYPE_RGBCOLOR && rgbColor != null && iccColor == null) {
		this.iccColor = null;
		this.rgbColor = SVGPaintParser.INSTANCE.rgbColor(rgbColor);
		setCssText(rgbColor);
	  } else if (colorType == SVG_COLORTYPE_CURRENTCOLOR && rgbColor == null && iccColor == null) {
		this.iccColor = null;
		this.rgbColor = null;
		setCssText(SVGConstants.CSS_CURRENTCOLOR_VALUE);
	  } else if (colorType == SVG_COLORTYPE_UNKNOWN && rgbColor == null && iccColor == null) {
		this.iccColor = null;
		this.rgbColor = null;
		setCssText(SVGConstants.CSS_NONE_VALUE);
	  } else {
		throw new JavaScriptException("Invalid color spec");
	  }
	  this.colorType = colorType;
  }

}
