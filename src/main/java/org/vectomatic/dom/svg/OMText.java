/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of libgwtsvg.
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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Text;

public class OMText extends OMNode {
	protected OMText(Text ot) {
		super(ot);
	}

	// Implementation of the dom::CharacterData W3C IDL interface
	public final String getData() {
		return ((Text)ot.cast()).getData();
	};

	public final void setData(String value) {
		((Text)ot.cast()).setData(value);
	};

	public final int getLength() {
		return ((Text)ot.cast()).getLength();
	};

	public final String substringData(int offset, int count) {
		return DOMHelper.substringData((Text)ot.cast(), offset, count);
	};

	public final void appendData(String arg) {
		DOMHelper.appendData((Text)ot.cast(), arg);
	};

	public final void insertData(int offset, String arg) {
		((Text)ot.cast()).insertData(offset, arg);
	};

	public final void deleteData(int offset, int count) {
		((Text)ot.cast()).deleteData(offset, count);
	};

	public final void replaceData(int offset, int count, String arg) {
		((Text)ot.cast()).replaceData(offset, count, arg);
	};

	// Implementation of the dom::Text W3C IDL interface
	public final OMText splitText(int offset) {
		return new OMText(((Text)ot.cast()).splitText(offset));
	};

}
