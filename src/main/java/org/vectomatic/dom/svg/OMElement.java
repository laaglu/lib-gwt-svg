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

import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;

public class OMElement extends OMNode {

	protected OMElement(Node ot) {
		super(ot);
	}
	
	public Element getElement() {
		return ot.cast();
	}

	// Implementation of the dom::Element W3C IDL interface
	public final OMNodeList getElementsByTagName(String name) {
		return new OMNodeList(((Element) ot).getElementsByTagName(name));
	}

	public final OMNodeList getElementsByTagNameNS(String namespaceURI, String localName) {
		return new OMNodeList(DOMHelper.getElementsByTagNameNS(((Element) ot), namespaceURI, localName));
	}

	public final String getId() {
		return ((Element) ot).getId();
	}

	public final String getTagName() {
		return ((Element) ot).getTagName();
	}
	
	public final String getAttribute(String name) {
		return ((Element) ot).getAttribute(name);
	}
	public final void setAttribute(String name, String value) {
		((Element) ot).setAttribute(name, value);
	}
	public final void removeAttribute(String name) {
		((Element) ot).removeAttribute(name);
	}

}
