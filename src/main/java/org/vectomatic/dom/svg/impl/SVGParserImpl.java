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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;

public class SVGParserImpl {
	@SuppressWarnings("unused")
	private final JavaScriptObject domParser = createDOMParser();
	
	private native JavaScriptObject createDOMParser() /*-{
	  return new DOMParser();
	}-*/;

	public final native Document parseFromString(String rawText, String contentType) /*-{
      return this.@org.vectomatic.dom.svg.impl.SVGParserImpl::domParser.parseFromString(rawText, contentType);
	}-*/;

}
