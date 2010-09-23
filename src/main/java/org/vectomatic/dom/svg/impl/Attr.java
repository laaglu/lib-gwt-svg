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

import com.google.gwt.dom.client.Node;

/**
 * Overlay class for DOM Attr
 * @author laaglu
 */
public class Attr extends Node {
	protected Attr() {
	}
	public final native String getName() /*-{
	   return this.name;
	 }-*/;

	public final native void setName(String name) /*-{
	   this.name = name;
	 }-*/;

	public final native String getValue() /*-{
	   return this.value;
	 }-*/;

	public final native void setValue(String value) /*-{
	   this.value = value;
	 }-*/;

	public final native boolean isId() /*-{
	 return this.isId;
	}-*/;

}
