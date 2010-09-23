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
import com.google.gwt.dom.client.Node;

/**
 * Overlay class for DOM NamedNodeMap
 * @author laaglu
 */
public class NamedNodeMap<T extends Node> extends JavaScriptObject {
	protected NamedNodeMap() {
	}
	public final native T getNamedItem(String name) /*-{
	   return this.getNamedItem(name);
	}-*/;

	public final native T setNamedItem(Node arg) /*-{
	   return this.setNamedItem(arg);
	}-*/;

	public final native T removeNamedItem(String name) /*-{
	   return this.removeNamedItem(name);
	}-*/;

	public final native T item(int index) /*-{
	   return this.item(index);
	}-*/;

	public final native int getLength() /*-{
	   return this.length;
	}-*/;

	public final native T getNamedItemNS(String namespaceURI, String localName) /*-{
	   return this.getNamedItem(namespaceURI, localName);
	}-*/;

	public final native T setNamedItemNS(Node arg) /*-{
	   return this.setNamedItem(arg);
	}-*/;

	public final native T removeNamedItemNS(String namespaceURI, String localName) /*-{
	  return this.removeNamedItem(namespaceURI, localName);
	}-*/;
}
