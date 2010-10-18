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

package org.vectomatic.dom.svg.ui;

import org.vectomatic.dom.svg.OMNode;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * Abstract base class for SVG Widgets
 * @author laaglu
 */
public abstract class SVGWidget extends Widget {
	/**
	 * Constructor
	 */
	public SVGWidget() {
	}

	/**
	 * Method invoked by the UiBinder to retrieve a UiBinder field inside an SVG document
	 * @param svgElement
	 * The root element of the SVG document
	 * @param expr
	 * An XPath to reach the field
	 * @return the retrieved UiBinder field
	 */
	public static OMNode getUiBinderField(Element svgElement, String expr) {
		Element elt = getUiBinderField_(svgElement, expr);
		return OMNode.convert(elt);
	}
	
	private static native Element getUiBinderField_(Element svgElement, String expr) /*-{
		var result = $doc.evaluate(expr, svgElement, null, XPathResult.ORDERED_NODE_ITERATOR_TYPE , null);
		return result.iterateNext();
	}-*/;

}
