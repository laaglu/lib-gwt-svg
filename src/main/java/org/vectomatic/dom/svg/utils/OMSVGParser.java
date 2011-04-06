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

import org.vectomatic.dom.svg.OMSVGDocument;
import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.impl.SVGParserImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptException;

/**
 * Class to parse SVG documents and instantiate SVG documents
 * @author laaglu
 */
public class OMSVGParser {
	private static final SVGParserImpl impl = GWT.create(SVGParserImpl.class);

	/**
	 * Creates a new empty SVG document
	 * @return
	 * a new empty SVG document
	 */
	public static final OMSVGDocument createDocument() {
		SVGDocument doc = DOMHelper.createDocument("http://www.w3.org/2000/svg", "").cast();
    	return new OMSVGDocument(doc);
	}

	/**
	 * Returns the current document, as an SVG document
	 * @return the current document, as an SVG document
	 */
	public static final OMSVGDocument currentDocument() {
    	return new OMSVGDocument((SVGDocument)DOMHelper.getCurrentDocument().cast());
	}

	/**
	 * Parses the supplied SVG text into a document
	 * @param rawSvg
	 * raw xml to be parsed
	 * @return
	 * the document resulting from the parse
	 */
	public static final OMSVGSVGElement parse(String rawSvg) throws JavaScriptException {
		return impl.parse(rawSvg);
	}
}
