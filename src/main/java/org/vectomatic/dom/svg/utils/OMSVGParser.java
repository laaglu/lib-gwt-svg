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
/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of lib-gwt-svg.
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
package org.vectomatic.dom.svg.utils;

import org.vectomatic.dom.svg.OMSVGDocument;
import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.impl.SVGParserImpl;
import org.vectomatic.dom.svg.impl.SVGSVGElement;

import com.google.gwt.core.client.GWT;

/**
 * libgwtsvg entry points
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

	public static final OMSVGDocument currentDocument() {
    	return new OMSVGDocument((SVGDocument)DOMHelper.getCurrentDocument().cast());
	}

	/**
	 * Parse the supplied SVG text into a document
	 * @param rawSvg
	 * raw xml to be parsed
	 * @return
	 * the document resulting from the parse
	 */
	// TODO error handling
	public static final OMSVGSVGElement parse(String rawSvg) {
		SVGDocument doc = impl.parseFromString(rawSvg, "text/xml").cast();
		SVGSVGElement svg = DOMHelper.importNode(DOMHelper.getCurrentDocument(), doc.getDocumentElement(), true).cast();
    	return new OMSVGSVGElement(svg);
	}
	

}
