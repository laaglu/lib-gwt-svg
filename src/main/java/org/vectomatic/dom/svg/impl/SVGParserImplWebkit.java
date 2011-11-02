/**********************************************
 * Copyright (C) 2011 Lukas Laag
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

import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.ParserException;
import org.vectomatic.dom.svg.utils.XPathPrefixResolver;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Text;

/**
 * Internal class to wrap DOM parser implementations for webkit based browsers
 * @author laaglu
 */
public class SVGParserImplWebkit extends SVGParserImpl {
	/**
	 * Parses the supplied SVG text into a document
	 * @param rawSvg
	 * raw xml to be parsed
	 * @return
	 * the document resulting from the parse
	 */
	public final SVGSVGElement parse(String rawSvg) throws ParserException {
		SVGDocument doc = parseFromString(rawSvg, "text/xml").cast();
		Element elt = doc.getDocumentElement();
		if ("parsererror".equals(DOMHelper.getLocalName(elt))) {
			String message = "Parsing error";
			if (elt.getFirstChild() != null) {
				message = elt.getFirstChild().<Text>cast().getData();
			}
			throw new ParserException(ParserException.Type.NotWellFormed, message);
		} else if ("html".equals(DOMHelper.getLocalName(elt))) {
			String message = DOMHelper.evaluateStringXPath(elt, "./x:body/x:parsererror/x:div/text()", new XPathPrefixResolver() {
				@Override
				public String resolvePrefix(String prefix) {
					if ("x".equals(prefix)) {
						return "http://www.w3.org/1999/xhtml";
					}
					return null;
				}
			});
			throw new ParserException(ParserException.Type.NotWellFormed, message);
		}
		SVGSVGElement svg = DOMHelper.importNode(DOMHelper.getCurrentDocument(), elt, true).cast();
		// For some reason xlink:href are not correctly evaluated in
		// some cases in mozilla. If one clones the node this seems
		// to solve the problem
    	return svg.cloneNode(true).<SVGSVGElement>cast();
	}

}