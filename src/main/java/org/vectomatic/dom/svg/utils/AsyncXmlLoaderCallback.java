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

import com.google.gwt.dom.client.Element;

/**
 * Interface to process Xml payloads returned by AsyncXmlLoader.
 */
public interface AsyncXmlLoaderCallback {
	/**
	 * Method invoked if the resource could not be fetched
	 * @param resourceName
	 * The name of the resource
	 * @param error
	 * An error describing why the resource could not be fetched.
	 */
	public void onError(String resourceName, Throwable error);
	/**
	 * Method invoked if the resource has successfully been loaded
	 * @param resourceName
	 * The name of the resource
	 * @param root
	 * The root elment of the XML document corresponding to the resource
	 */
	public void onSuccess(String resourceName, Element root);
}
