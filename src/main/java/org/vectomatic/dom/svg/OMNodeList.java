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

import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;

public class OMNodeList {
	private NodeList<? extends Node> ot;
	protected OMNodeList(NodeList<? extends Node> ot) {
		this.ot = ot;
	}
	public final OMNode getItem(int index) {
		Node node = ot.getItem(index);
		return (node != null) ? new OMNode.Conversion(node).result : null;
	}
	public final int getLength() {
		return ot.getLength();
	}
}
