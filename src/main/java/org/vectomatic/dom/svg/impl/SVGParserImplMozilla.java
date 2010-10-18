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

import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.core.client.JavaScriptException;

/**
 * Internal class to wrap DOM parser implementations for mozilla
 * @author laaglu
 */
public class SVGParserImplMozilla extends SVGParserImpl {
	/**
	 * Parses the supplied SVG text into a document
	 * @param rawSvg
	 * raw xml to be parsed
	 * @return
	 * the document resulting from the parse
	 */
	public final OMSVGSVGElement parse(String rawSvg) throws JavaScriptException {
		SVGDocument doc = parseFromString(rawSvg, "text/xml").cast();
		SVGSVGElement svg = DOMHelper.importNode(DOMHelper.getCurrentDocument(), doc.getDocumentElement(), true).cast();
		// For some reason xlink:href are not correctly evaluated in
		// some cases in mozilla. If one clones the node this seems
		// to solve the problem
    	return new OMSVGSVGElement((SVGSVGElement)svg.cloneNode(true).cast());
	}

}