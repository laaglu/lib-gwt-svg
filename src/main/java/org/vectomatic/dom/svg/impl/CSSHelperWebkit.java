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
package org.vectomatic.dom.svg.impl;

import org.vectomatic.dom.svg.OMSVGStyle;

/**
 * Webkit implementation of class {@link org.vectomatic.dom.svg.impl.CSSHelper}
 * @author laaglu
 */
public class CSSHelperWebkit extends CSSHelper {
	public native String getProperty(OMSVGStyle style, String name) /*-{
		// Webkit returns uri paint values in the form '#uri', instead of 'url(#url)'
		// which makes it hard to parse these values (because they cannot be
		// distinguished from '#aabbcc' rgb paint values)
		var value = style.getPropertyCSSValue(name);
		if (value != null && typeof value.paintType != "undefined" && value.uri != null && value.uri.length > 0) {
			return "url(" + value.uri + ")";
		}
		return style.getPropertyValue(name);
	}-*/;
}
