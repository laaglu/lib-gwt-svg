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

import org.vectomatic.dom.svg.impl.CSSHelper;
import org.vectomatic.dom.svg.impl.DashArrayParser;
import org.vectomatic.dom.svg.impl.SVGPaintParser;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.TagName;

/**
 * Class to represent a CSS style
 * @author laaglu
 */
@TagName("style")
public class OMSVGStyle extends Style {
	protected static CSSHelper cssHelper = GWT.create(CSSHelper.class);
	/**
	 * Constructor
	 */
	protected OMSVGStyle() {
	}
	/**
	 * Clears the value of a named property, causing it to 
	 * revert to its default.
 	 * @param name The property name
     */
	public final void clearSVGProperty(String name) {
		cssHelper.setProperty(this, name, "");
	}

	/**
	 * Gets the value of a named property.
	 * @param name The property name
	 * @return The property name
	 */
	public final String getSVGProperty(String name) {
		return cssHelper.getProperty(this, name);
	}

	/**
	 * Sets the value of a named property.
	 * @param name The property name
	 * @param value The property name
	 */
	public final void setSVGProperty(String name, String value) {
		cssHelper.setProperty(this, name, value);
	}

	/**
	 * Gets the value of a named property as a CSS value.
	 * This method can be applied to get the value of the
	 * 'fill' and 'paint' properties, which will be returned
	 * as {@link org.vectomatic.dom.svg.OMSVGPaint} values.
	 * @param name
	 * The name of CSS property
	 * @return
	 * The property value
	 */
	public final OMCSSValue getSVGPropertyCSS(String name) {
		String cssText = getSVGProperty(name);
		return SVGConstants.CSS_STROKE_DASHARRAY_PROPERTY.equals(name)
			? DashArrayParser.INSTANCE.parse(cssText)
			: SVGPaintParser.INSTANCE.parse(cssText);
	}
}
