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
import com.google.gwt.dom.client.Element;

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
		operaFix(svg);
    	return new OMSVGSVGElement(svg);
	}

	/**
	 * Fix for opera.
	 * SVG Objects created by the parser and imported do not seem to recognize their
	 * CSS attributes. Reapplying them seems to solve the issue
	 * @param root
	 */
	protected static native void operaFix(Element root) /*-{
	  var stack = [];
	  stack.push(root);
	  while(stack.length > 0) {
	  	 var elt = stack.pop();
	  	 if (elt.nodeType == 1 && elt.className && elt.className.baseVal) {
	  	 	elt.className.baseVal = elt.className.baseVal;
	  	 }
	  	 if (elt.nodeType == 1 && elt.hasAttribute("style")) {
	  	 	elt.setAttribute("style", elt.getAttribute("style"));
	  	 }
	  	 var children = elt.childNodes;
	  	 for(var i = 0; i < children.length; i++) {
	  	   //alert(elt.tagName + "[" + i + "] --> " + children.item(i));
	  	   stack.push(children.item(i));
	  	 }
	  }
	}-*/;


}
