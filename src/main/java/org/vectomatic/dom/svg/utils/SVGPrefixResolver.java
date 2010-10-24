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
package org.vectomatic.dom.svg.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Default implementation of the XPathPrefixResolver. It is
 * capable of solving the commonly used 'svg' and 'xlink' prefixes.
 * @author laaglu
 */
public class SVGPrefixResolver implements XPathPrefixResolver {
	public static final SVGPrefixResolver INSTANCE = new SVGPrefixResolver();
	
	protected Map<String, String> prefixToUri;
	/**
	 * Constructor
	 */
	public SVGPrefixResolver() { 
		prefixToUri = new HashMap<String, String>();
		prefixToUri.put(SVGConstants.SVG_PREFIX, SVGConstants.SVG_NAMESPACE_URI);
		prefixToUri.put(SVGConstants.XLINK_PREFIX, SVGConstants.XLINK_NAMESPACE_URI);
	}
	@Override
	public String resolvePrefix(String prefix) {
		return prefixToUri.get(prefix);
	}
}
