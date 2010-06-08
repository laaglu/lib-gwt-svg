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

/**
 * Interface to provide XPath prefix resolution.
 * @author laaglu
 */
public interface XPathPrefixResolver {
	/**
	 * Returns the namespace URI which corresponds to this prefix.
	 * This method is called by the browser XPath engine when
	 * it evaluates XPath expressions which contain prefixes
	 * (like: <tt>/foo:bar/foo:boo</tt>)
	 * @param prefix
	 * The prefix to resolve
	 * @return
	 * The namespace URI which corresponds to this prefix
	 */
	public String resolvePrefix(String prefix);
}
