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

import java.util.Stack;

import org.vectomatic.dom.svg.OMSVGAnimatedString;
import org.vectomatic.dom.svg.OMSVGStyle;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.ParserException;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.Text;
import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;


/**
 * Internal class to wrap DOM parser implementations for opera
 * @author laaglu
 */
public class SVGParserImplOpera extends SVGParserImpl {
	private static final String URL = "^url\\((['\"])?[^#\\)]*#([^'\"\\)]*)\\1\\)$";
	private static final RegExp URLExp = RegExp.compile(URL, "g");
	private static String getRef(String expr) {
		URLExp.setLastIndex(0);
		MatchResult result = URLExp.exec(expr);
		if (result != null && result.getGroupCount() == 3) {
			return result.getGroup(2);
		}
		return null;
	}
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
		}
		SVGSVGElement svg = DOMHelper.importNode(DOMHelper.getCurrentDocument(), elt, true).cast();
		operaFix(svg);
    	return svg;
	}
	
	/**
	 * Fix for opera.
	 * SVG Objects created by the parser and imported do not seem to recognize their
	 * CSS attributes. Reapplying them seems to solve the issue.
	 * The CSS style attributes which contain hrefs to svg elements are corrupted an
	 * need to be fixed as well.
	 * @param root
	 */
	private static void operaFix(Element root) {
		Stack<Element> stack = new Stack<Element>();
		stack.push(root);
		while(!stack.empty()) {
			Element element = stack.pop();
			if (SVGConstants.SVG_NAMESPACE_URI.equals(DOMHelper.getNamespaceURI(element))) {
				OMSVGAnimatedString cn = element.<SVGElement>cast().getClassName_();
				if (cn != null) {
					String value = cn.getBaseVal();
					if (value != null && value.length() > 0) {
						cn.setBaseVal(value);
					}
				}
				if (element.hasAttribute(SVGConstants.SVG_STYLE_ATTRIBUTE)) {
					element.setAttribute(SVGConstants.SVG_STYLE_ATTRIBUTE, element.getAttribute(SVGConstants.SVG_STYLE_ATTRIBUTE));
					OMSVGStyle style = element.getStyle().<OMSVGStyle>cast();
					fixProperty(style, SVGConstants.CSS_FILL_PROPERTY);
					fixProperty(style, SVGConstants.CSS_STROKE_PROPERTY);
				}
			}
			NodeList<Node> childNodes = element.getChildNodes();
			for (int i = 0, length = childNodes.getLength(); i < length; i++) {
				Node node = childNodes.getItem(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					stack.push(node.<Element>cast());
				}
			}
		}
	}
	private static void fixProperty(OMSVGStyle style, String propertyName) {
		String propertyValue = style.getSVGProperty(propertyName);
		if (propertyValue != null && propertyValue.length() > 0) {
			String ref = getRef(propertyValue);
			if (ref != null) {
				String url = "url('#" + ref + "')";
				style.setSVGProperty(propertyName, url);
			}
		}		
	}
}