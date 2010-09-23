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
package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.impl.Attr;

public class OMAttr extends OMNode {

	protected OMAttr(Attr ot) {
		super(ot);
	}
	public Attr getAttr() {
		return ot.cast();
	}

	public final String getName() {
	   return ((Attr)ot).getName();
	 }

	public final void setName(String name) {
	   ((Attr)ot).setName(name);
	 }

	public final String getValue() {
	   return ((Attr)ot).getValue();
	 }

	public final void setValue(String value) {
	   ((Attr)ot).setValue(value);
	 }

	public final boolean isId() {
	 return ((Attr)ot).isId();
	}
}
