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
package org.vectomatic.dev.svg.impl.gen;

import org.vectomatic.dom.svg.ui.SVGResource;
import org.vectomatic.dom.svg.utils.OMSVGParser;
import org.vectomatic.dom.svg.utils.SVGConstants;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.elementparsers.ElementParser;
import com.google.gwt.uibinder.elementparsers.SvgInterpreter;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;

public class SVGImageParser implements ElementParser {
	private static final String ATTR_RESOURCE = "resource";
	public SVGImageParser() {
	}

	@Override
	public void parse(XMLElement elem, String fieldName, JClassType type,
			UiBinderWriter writer) throws UnableToCompleteException {
		if (elem.hasAttribute(ATTR_RESOURCE) && elem.hasChildNodes()) {
			writer.die("In %s, attribute \"%s\" and inline svg are mutually exclusive", elem, ATTR_RESOURCE);
		}
		if (!(elem.hasAttribute(ATTR_RESOURCE) || elem.hasChildNodes())) {
			writer.die("In %s, attribute \"%s\" or inline svg must be present", elem, ATTR_RESOURCE);
		}
		if (elem.hasAttribute(ATTR_RESOURCE)) {
		    JClassType svgResourceType = writer.getOracle().findType(SVGResource.class.getCanonicalName());
			String resource = elem.consumeAttribute(ATTR_RESOURCE, svgResourceType); 
			writer.addStatement("%s.setResource(%s);", fieldName, resource);		
		} else {
			Element container = elem.getElement();
			NodeList childNodes = container.getChildNodes();
			Element root = null;
			for (int i = 0, length = childNodes.getLength(); i < length; i++) {
				Node node = childNodes.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					if (root == null 
					&& SVGConstants.SVG_NAMESPACE_URI.equals(node.getNamespaceURI()) 
					&& SVGConstants.SVG_SVG_TAG.equals(node.getLocalName())) {
						root = (Element)node;
					} else {
						writer.die("In %s, attribute \"%s\" or inline svg must be present", elem, ATTR_RESOURCE);
					}
				}
			}
			if (root == null) {
				writer.die("In %s, attribute \"%s\" or inline svg must be present", elem, ATTR_RESOURCE);
			}
		    writer.beginAttachedSection(fieldName + ".getElement()");
	        SvgInterpreter interpreter = SvgInterpreter.newInterpreterForUiObject(writer, fieldName, root);
	        String rawSvg = elem.consumeInnerHtml(interpreter);
	        String omSvgParser = OMSVGParser.class.getName();
			writer.addStatement("%s.setSvgElement(%s.parse(\"%s\"));", fieldName, omSvgParser, rawSvg);		
			writer.endAttachedSection();
		}
	}

}
