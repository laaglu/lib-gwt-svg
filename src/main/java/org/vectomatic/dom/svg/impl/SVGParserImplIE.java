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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.ParserException;
import org.vectomatic.dom.svg.utils.SVGPrefixResolver;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Text;

/**
 * Internal class to wrap DOM parser implementations for IE based browsers
 * @author laaglu
 */
public class SVGParserImplIE extends SVGParserImpl {
	/**
	 * Parses the supplied SVG text into a document
	 * @param rawSvg
	 * raw xml to be parsed
	 * @param enableScripts
	 * true to enable embedded scripts, false otherwise
	 * @return
	 * the document resulting from the parse
	 */
	@Override
	public final SVGSVGElement parse(String rawSvg, boolean enableScripts) throws ParserException {
		SVGDocument doc = null;
		try {
			doc = parseFromString(rawSvg, "text/xml").cast();
			
		} catch(JavaScriptException e) {
			throw new ParserException(ParserException.Type.NotWellFormed, e.getMessage());
		}
		Element elt = doc.getDocumentElement();
		if ("parsererror".equals(DOMHelper.getLocalName(elt))) {
			String message = "Parsing error";
			if (elt.getFirstChild() != null) {
				message = elt.getFirstChild().<Text>cast().getData();
			}
			throw new ParserException(ParserException.Type.NotWellFormed, message);
		}
		SVGSVGElement svg = DOMHelper.importNode(DOMHelper.getCurrentDocument(), elt, true).cast();
		// IE9 bug workaround: update all SVG style elements by
		// adding a trailing whitespace char, otherwise IE9 will
		// ignore them
		Iterator<Text> iterator = DOMHelper.evaluateNodeListXPath(svg, ".//svg:style/text()", SVGPrefixResolver.INSTANCE);
		List<Text> styleTexts = new ArrayList<Text>();
		while(iterator.hasNext()) {
			Text styleText = iterator.next();
			styleTexts.add(styleText);
		}
		for (Text styleText : styleTexts) {
			styleText.<Text>cast().setData(styleText.<Text>cast().getData() + " ");
		}
		
		return enableScripts ? enableScriptElements(svg) : svg;
	}

}