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
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */
package org.vectomatic.dom.svg;

import java.util.Iterator;

import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;

/**
 * Wrapper class for DOM NodeList
 * @author laaglu
 */
public class OMNodeList<T extends OMNode> implements Iterable<T> {
	private NodeList<? extends Node> ot;
	/**
	 * Constructor
	 * @param nodeList The wrapped node list
	 */
	protected OMNodeList(NodeList<? extends Node> nodeList) {
		this.ot = nodeList;
	}
    /**
     * Returns the <code>index</code>th item in the collection. If 
     * <code>index</code> is greater than or equal to the number of nodes in 
     * the list, this returns <code>null</code>.
     * @param index Index into the collection.
     * @return The node at the <code>index</code>th position in the 
     *   <code>NodeList</code>, or <code>null</code> if that is not a valid 
     *   index.
     */
	public final T getItem(int index) {
		Node node = ot.getItem(index);
		return (node != null) ? OMNode.<T>convert(node) : null;
	}
    /**
     * The number of nodes in the list. The range of valid child node indices 
     * is 0 to <code>length-1</code> inclusive.
     */
	public final int getLength() {
		return ot.getLength();
	}
	/**
	 * Returns an iterator over the {@link org.vectomatic.dom.svg.OMNode}
	 * elements in this list in proper sequence.
	 *
	 * <p>This implementation returns a straightforward implementation of the
	 * iterator interface, relying on the backing list's {@code getNumberOfItems()},
	 * and {@code getItem(int)} methods.
	 *
	 * <p>Note that the iterator returned by this method will throw an
	 * {@code UnsupportedOperationException} in response to its
	 * {@code remove} method.
	 *
	 * @return an iterator over the {@link org.vectomatic.dom.svg.OMNode}
	 * elements in this list in proper sequence
	 */
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
				return getItem(index++);
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}			
		};
	}
}
