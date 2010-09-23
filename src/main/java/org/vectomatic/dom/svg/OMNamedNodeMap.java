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

import java.util.Iterator;

import org.vectomatic.dom.svg.impl.NamedNodeMap;

import com.google.gwt.dom.client.Node;

public class OMNamedNodeMap<T extends OMNode> implements Iterable<T> {
	private NamedNodeMap<? extends Node> ot;
	protected OMNamedNodeMap(NamedNodeMap<? extends Node> ot) {
		this.ot = ot;
	}
	
	public final T getNamedItem(String name) {
		Node node = ot.getNamedItem(name);
		return (node != null) ? OMNode.<T>convert(node) : null;
	}

	public final T setNamedItem(T arg) {
		Node node = ot.setNamedItem(arg.getNode());
		return (node != null) ? OMNode.<T>convert(node) : null;
	}

	public final T removeNamedItem(String name) {
		Node node = ot.removeNamedItem(name);
		return (node != null) ? OMNode.<T>convert(node) : null;
	}

	public final T item(int index) {
		Node node = ot.item(index);
		return (node != null) ? OMNode.<T>convert(node) : null;
	}

	public final int getLength() {
		return ot.getLength();
	}

	public final T getNamedItemNS(String namespaceURI, String localName) {
		Node node = ot.getNamedItemNS(namespaceURI, localName);
		return (node != null) ? OMNode.<T>convert(node) : null;
	}

	public final T setNamedItemNS(T arg) {
		Node node = ot.setNamedItemNS(arg.getNode());
		return (node != null) ? OMNode.<T>convert(node) : null;
	}

	public final T removeNamedItemNS(String namespaceURI, String localName) {
		Node node = ot.removeNamedItemNS(namespaceURI, localName);
		return (node != null) ? OMNode.<T>convert(node) : null;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			private int index;

			@Override
			public boolean hasNext() {
				return index < getLength();
			}

			@Override
			public T next() {
				return item(index++);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}			
		};
	}
}
