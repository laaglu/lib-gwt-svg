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

import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGPaint} interface corresponds to
 * basic type <a href='painting.html#SpecifyingPaint'>&lt;paint&gt;</a> and
 * represents the values of properties <code>fill</code> and <code>stroke</code>.
 * <p>Note: The {@link org.vectomatic.dom.svg.OMSVGPaint} interface is deprecated,
 * and may be dropped from future versions of the SVG specification.</p>
 */
public class OMSVGPaint extends OMSVGColor {
/**
 * The paint type is not one of predefined types. It is invalid to attempt
 * to define a new value of this type or to attempt to switch an existing
 * value to this type.
 */
  public static final short SVG_PAINTTYPE_UNKNOWN = 0;
/**
 * An sRGB color has been specified without an alterICC color specification.
 */
  public static final short SVG_PAINTTYPE_RGBCOLOR = 1;
/**
 * An sRGB color has been specified along with an alterICC color specification.
 */
  public static final short SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR = 2;
/**
 * Corresponds to a <span class='prop-value'>none</span> value on a <a href='painting.html#SpecifyingPaint'>&lt;paint&gt;</a>
 * specification.
 */
  public static final short SVG_PAINTTYPE_NONE = 101;
/**
 * Corresponds to a <span class='prop-value'>currentColor</span> value on
 * a <a href='painting.html#SpecifyingPaint'>&lt;paint&gt;</a> specification.
 */
  public static final short SVG_PAINTTYPE_CURRENTCOLOR = 102;
/**
 * A URI has been specified, along with an explicit <span class='prop-value'>none</span>
 * as the backup paint method in case the URI is unavailable or invalid.
 */
  public static final short SVG_PAINTTYPE_URI_NONE = 103;
/**
 * A URI has been specified, along with an sRGB color as the backup paint
 * method in case the URI is unavailable or invalid.
 */
  public static final short SVG_PAINTTYPE_URI_CURRENTCOLOR = 104;
/**
 * A URI has been specified, along with an sRGB color as the backup paint
 * method in case the URI is unavailable or invalid.
 */
  public static final short SVG_PAINTTYPE_URI_RGBCOLOR = 105;
/**
 * A URI has been specified, along with both an sRGB color and alternate ICC
 * color as the backup paint method in case the URI is unavailable or invalid.
 */
  public static final short SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR = 106;
/**
 * Only a URI has been specified.
 */
  public static final short SVG_PAINTTYPE_URI = 107;
  
  private short paintType;
  private String uri;
  
  public OMSVGPaint(short paintType) {
	  this.paintType = paintType;
	  switch(paintType) {
		  case SVG_PAINTTYPE_NONE:
			  cssText = SVGConstants.CSS_NONE_VALUE;
			  break;
		  case SVG_PAINTTYPE_CURRENTCOLOR:
			  cssText = SVGConstants.CSS_CURRENTCOLOR_VALUE;
			  colorType = SVG_COLORTYPE_CURRENTCOLOR;
			  break;
	  }
  }
  
  @Override
  public int hashCode() {
	  int hashCode = paintType;
	  if (rgbColor != null) {
		  hashCode += rgbColor.hashCode();
	  }
	  if (iccColor != null) {
		  hashCode += iccColor.hashCode();
	  }
	  if (uri != null) {
		  hashCode += uri.hashCode();
	  }
	  return hashCode;
  }
  
  @Override
  public boolean equals(Object obj) {
	  if (obj instanceof OMSVGPaint) {
		  OMSVGPaint p = (OMSVGPaint)obj;
		  if (paintType == p.paintType) {
			  switch (paintType) {
			  case SVG_PAINTTYPE_NONE:
			  case SVG_PAINTTYPE_CURRENTCOLOR:
				  return true;
			  case SVG_PAINTTYPE_RGBCOLOR:
				  return rgbColor.equals(p.rgbColor);
			  case SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR:
				  return rgbColor.equals(p.rgbColor) && iccColor.equals(p.iccColor);
			  case SVG_PAINTTYPE_URI:
			  case SVG_PAINTTYPE_URI_NONE:
				  return uri.equals(p.uri);
			  case SVG_PAINTTYPE_URI_RGBCOLOR:
				  return uri.equals(p.uri) && rgbColor.equals(p.rgbColor);
			  case SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR:
				  return uri.equals(p.uri) && rgbColor.equals(p.rgbColor) && iccColor.equals(p.iccColor);
		  }
	   }
	}
	return false;
  }
  
  

  // Implementation of the svg::SVGPaint W3C IDL interface
  /**
   * The type of paint, identified by one of the SVG_PAINTTYPE_ constants defined
   * on this interface.
   */
  public final short getPaintType() {
    return this.paintType;
  }
  /**
   * When the {@link org.vectomatic.dom.svg.OMSVGPaint#getPaintType()} specifies
   * a URI, this attribute holds the URI string. When the {@link org.vectomatic.dom.svg.OMSVGPaint#getPaintType()}
   * does not specify a URI, this attribute is null.
   */
  public final String getUri() {
    return this.uri;
  }
  /**
   * Sets the {@link org.vectomatic.dom.svg.OMSVGPaint#getPaintType()} to SVG_PAINTTYPE_URI_NONE
   * and sets {@link org.vectomatic.dom.svg.OMSVGPaint#getUri()} to the specified
   * value.
   * @param uri The URI for the desired paint server.
   */
  public final void setUri(String uri) {
	this.paintType = SVG_PAINTTYPE_URI_NONE;
    this.uri = uri;
    this.rgbColor = null;
    this.iccColor = null;
  }
  /**
   * Sets the paint as specified by the parameters. If <var>paintType</var>
   * requires a URI, then <var>uri</var> must be non-null; otherwise, <var>uri</var>
   * must be null. If <var>paintType</var> requires an <code>RGBColor</code>,
   * then <var>rgbColor</var> must be a string that matches <a href='types.html#DataTypeColor'>&lt;color&gt;</a>;
   * otherwise, <var>rgbColor</var> must be null. If <var>paintType</var> requires
   * an {@link org.vectomatic.dom.svg.OMSVGICCColor}, then <var>iccColor</var>
   * must be a string that matches <a href='types.html#DataTypeICCColor'>&lt;icccolor&gt;</a>;
   * otherwise, <var>iccColor</var> must be null.
   * @param paintType One of the defined constants for {@link org.vectomatic.dom.svg.OMSVGPaint#getPaintType()}.
   * @param uri The URI for the desired paint server, or null.
   * @param rgbColor The specification of an sRGB color, or null.
   * @param iccColor The specification of an ICC color, or null.
   * @throws SVGException(SVG_INVALID_VALUE_ERR) Raised if one of the  parameters
   * has an invalid value.
   */
  public final void setPaint(short paintType, String uri, String rgbColor, String iccColor) throws JavaScriptException {
	if (((paintType == SVG_PAINTTYPE_RGBCOLOR && uri == null) || (paintType == SVG_PAINTTYPE_URI_RGBCOLOR && uri != null)) && iccColor == null) {
	  setRGBColor(rgbColor);
	} else if ((paintType == SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR && uri == null) || (paintType == SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR && uri != null)) {
	  setRGBColorICCColor(rgbColor, iccColor);
	} else if ((paintType == SVG_PAINTTYPE_NONE && uri == null) || (paintType == SVG_PAINTTYPE_URI_NONE && uri != null)) {
	  setColor(SVG_COLORTYPE_UNKNOWN, rgbColor, iccColor);
	} else if ((paintType == SVG_PAINTTYPE_CURRENTCOLOR && uri == null) || (paintType == SVG_PAINTTYPE_URI_CURRENTCOLOR && uri != null)) {
	  setColor(SVG_COLORTYPE_CURRENTCOLOR, rgbColor, iccColor);
	} else if (paintType == SVG_PAINTTYPE_URI) {
	    this.rgbColor = null;
	    this.iccColor = null;
	    this.cssText = "url(" + uri + ")";
	} else {
	  throw new JavaScriptException("Invalid paint spec");
	}
	this.paintType = paintType;
    this.uri = uri;
    if (paintType != SVG_PAINTTYPE_URI && cssText != null && uri != null) {
      cssText = "url(" + uri + ") " + cssText;
    }
  }
  
  @Override
  public String toString() {
	StringBuilder builder = new StringBuilder("OMSVGPaint(paintType=");
	builder.append(paintType);
	builder.append(", uri=");
	builder.append(uri);
	builder.append(", colorType=");
	builder.append(colorType);
	builder.append(", rgbColor=");
	builder.append(rgbColor);
	builder.append(", iccColor=");
	builder.append(iccColor);
	builder.append(", cssValueType=");
	builder.append(cssValueType);
	builder.append(", cssText=");
	builder.append(cssText);
	builder.append(")");
	return builder.toString();
  }

}
