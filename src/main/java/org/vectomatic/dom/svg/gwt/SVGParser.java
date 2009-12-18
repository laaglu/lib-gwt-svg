/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg.gwt;

import org.vectomatic.dom.svg.OMSVGDocument;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Node;

/**
 * libgwtsvg entry points
 * @author laaglu
 */
public class SVGParser {

	/**
	 * Creates a new empty SVG document
	 * @return
	 * a new empty SVG document
	 */
	public static final native OMSVGDocument createDocument() /*-{
    	return $doc.implementation.createDocument("http://www.w3.org/2000/svg", "", null);
	}-*/;

	/**
	 * Parse the supplied SVG text into a document
	 * @param rawSvg
	 * raw xml to be parsed
	 * @return
	 * the document resulting from the parse
	 */
	// TODO error handling
	public static final native OMSVGDocument parse(String rawSvg) /*-{
		return new DOMParser().parseFromString(rawSvg, "text/xml");
	}-*/;
	
	/**
	 * Patch GWT Document.importNode, which fails to return the imported nodes
	 */
	public static final native Node importNode(Document doc, Node node, boolean deep) /*-{
		return doc.importNode(node, deep);
	}-*/;

}
