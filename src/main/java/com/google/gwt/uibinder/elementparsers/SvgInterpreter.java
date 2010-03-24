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

import org.w3c.dom.Element;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;
import com.google.gwt.uibinder.rebind.XMLElement.Interpreter;

public class SvgInterpreter implements XMLElement.Interpreter<String> {
	public static SvgInterpreter newInterpreterForUiObject(
			UiBinderWriter writer, String uiExpression, Element root) {
		String ancestorExpression = uiExpression + ".getElement()";
		return new SvgInterpreter(writer, ancestorExpression, root,
				new HtmlMessageInterpreter(writer, ancestorExpression));
	}

	private final UiBinderWriter writer;
	private final InterpreterPipe<String> pipe;

	public SvgInterpreter(UiBinderWriter writer, String ancestorExpression, Element root,
			Interpreter<String> messageInterpreter) {
		this.writer = writer;
		this.pipe = new InterpreterPipe<String>();

		pipe.add(new SvgFieldInterpreter(writer, ancestorExpression, root));
		pipe.add(new ComputedAttributeInterpreter(writer));
		pipe.add(new AttributeMessageInterpreter(writer));
		pipe.add(messageInterpreter);
	}

	public String interpretElement(XMLElement elem)
			throws UnableToCompleteException {
		if (writer.isWidgetElement(elem)) {
			writer.die("Found widget %s in an SVG context", elem);
		}
		return pipe.interpretElement(elem);
	}
}
