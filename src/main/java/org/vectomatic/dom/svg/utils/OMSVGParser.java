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

import org.vectomatic.dom.svg.OMCSSValueList;
import org.vectomatic.dom.svg.OMNode;
import org.vectomatic.dom.svg.OMSVGDocument;
import org.vectomatic.dom.svg.OMSVGPaint;
import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.impl.DashArrayParser;
import org.vectomatic.dom.svg.impl.SVGDocument;
import org.vectomatic.dom.svg.impl.SVGPaintParser;
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
    	return OMNode.convert(doc);
	}

	/**
	 * Returns the current document, as an SVG document
	 * @return the current document, as an SVG document
	 */
	public static final OMSVGDocument currentDocument() {
    	return OMNode.convert(DOMHelper.getCurrentDocument());
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

	/**
	 * Parses an SVG paint value. SVG paint value are
	 * used for the 'fill' and the 'stroke' SVG attributes.
	 * @param cssText
	 * The value to parse
	 * @return
	 * The resulting paint object
	 * @throws JavaScriptException
	 * If the string to parse is not a valid paint value
	 */
	public static OMSVGPaint parsePaint(String cssText) throws JavaScriptException {
		return SVGPaintParser.INSTANCE.parse(cssText);
	}
	
	/**
	 * Parses an SVG dasharray value
	 * @param cssText
	 * The dash array to parse
	 * @return
	 * The resulting dasharray
	 * @throws JavaScriptException
	 */
	public static OMCSSValueList parseDashArray(String cssText) throws JavaScriptException {
		return DashArrayParser.INSTANCE.parse(cssText);
	}
}
