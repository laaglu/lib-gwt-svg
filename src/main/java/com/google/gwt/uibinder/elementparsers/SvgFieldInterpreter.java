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
package com.google.gwt.uibinder.elementparsers;

import org.vectomatic.dom.svg.ui.SVGWidget;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;

public class SvgFieldInterpreter implements XMLElement.Interpreter<String> {

	private final UiBinderWriter writer;
	private final String ancestorExpression;
	private final Element root;

	public SvgFieldInterpreter(UiBinderWriter writer, String ancestorExpression, Element root) {
		this.writer = writer;
		this.ancestorExpression = ancestorExpression;
		this.root = root;
	}

	public String interpretElement(XMLElement elem) throws UnableToCompleteException {
		String fieldName = writer.declareFieldIfNeeded(elem);
		if (fieldName != null) {
			JClassType type = writer.findFieldType(elem);
		    writer.setFieldInitializer(fieldName, "null");
		    writer.addInitStatement(
		        "%s = (" + type.getQualifiedSourceName() + ")" + SVGWidget.class.getName() + ".getUiBinderField(%s, \"%s\");",
		        fieldName, ancestorExpression, getXpath(elem.getElement()));
		    return null;
		}

		/*
		 * Return null because we don't want to replace the dom element with any
		 * particular string (though we may have consumed its id or gwt:field)
		 */
		return null;
	}
	
	private String getXpath(Element element) {
		StringBuilder buffer = new StringBuilder();
		while (!root.isSameNode(element)) {
			int index = 1;
			Node sibling = element.getPreviousSibling();
			while (sibling != null) {
				if (sibling.getNodeType() == Node.ELEMENT_NODE) {
					index++;
				}
				sibling = sibling.getPreviousSibling();
			}
			buffer.insert(0, "/*[" + index + "]");
			Node node = element.getParentNode();
			while (node.getNodeType() != Node.ELEMENT_NODE) {
				node = node.getParentNode();
			}
			element = (Element)node;
		}
		buffer.insert(0, ".");
		return buffer.toString();
	}
}
