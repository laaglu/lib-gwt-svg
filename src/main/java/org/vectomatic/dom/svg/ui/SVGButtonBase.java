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
package org.vectomatic.dom.svg.ui;

import java.util.HashMap;
import java.util.Map;

import org.vectomatic.dom.svg.OMSVGSVGElement;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.MouseWheelEvent;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * Abstract base class for SVG buttons. 
 * <p>SVG buttons consists
 * in an SVG element and a collection of six predefined faces<p>
 * <ul>
 * <li>UP</li>
 * <li>UP_DISABLED</li>
 * <li>UP_HOVERING</li>
 * <li>DOWN</li>
 * <li>DOWN_DISABLED</li>
 * <li>DOWN_HOVERING</li>
 * </ul>
 * <p>Each face consists in a list of changes which are applied to the
 * main SVG element (currently, CSS style changes but other changes
 * are possible). You do not need to specify all faces for a button. In
 * case a face is missing, the widget will attempt to use another face for
 * the button.</p>
 * @author laaglu
 */
public abstract class SVGButtonBase extends SVGWidget implements HasClickHandlers, HasAllMouseHandlers, MouseDownHandler, MouseUpHandler, MouseOverHandler, MouseOutHandler {
	/**
	 * Enum to represent the possible states of an SVG button
	 * @author laaglu
	 */
	public enum SVGFaceName {
		/**
		 * face shown when button is up
		 */
		UP,
		/**
		 * face shown when button is up and disabled
		 */
		UP_DISABLED,
		/**
		 * face shown when the cursor is hovering over an up enabled button
		 */
		UP_HOVERING,
		/**
		 * face shown when button is down
		 */
		DOWN,
		/**
		 * face shown when button is down and disabled
		 */
		DOWN_DISABLED,
		/**
		 * face shown when the cursor is hovering over a down enabled button
		 */
		DOWN_HOVERING
	}
	public static class SVGFace {
		private SVGFaceChange[] changes;
		public SVGFace(SVGFaceChange[] changes) {
			this.changes = changes;
		}
		public SVGFaceChange[] getChanges() {
			return changes;
		}
	}
	
	/**
	 * Base class to represent the changes occurring
	 * to an SVG button when it enters a new state.
	 * @author laaglu
	 */
	public static abstract class SVGFaceChange {
		void install(SVGButtonBase button) {	
		}
		void uninstall(SVGButtonBase button) {
		}
	}
	
	/**
	 * Class to represent a style change as an SVG
	 * button enters a new state.
	 * @author laaglu
	 */
	public static class SVGStyleChange extends SVGFaceChange {
		private String[] classNames;
		public SVGStyleChange(String[] classNames) {
			this.classNames = classNames;
		}
		@Override
		void uninstall(SVGButtonBase button) {
			button.svgElement.getStyle();
			for (String className : classNames) {
				button.svgElement.removeClassNameBaseVal(className);
			}
		}
		@Override
		void install(SVGButtonBase button) {
			button.svgElement.getStyle();
			for (String className : classNames) {
				button.svgElement.addClassNameBaseVal(className);
			}
			button.install(button.svgElement);
		}
		public String[] getClassNames() {
			return classNames;
		}
		public void getClassNames(String[] classNames) {
			this.classNames = classNames;
		}
	}
	
	protected DivElement div;
	protected OMSVGSVGElement svgElement;
	protected SVGFaceName currentFaceName;
	protected SVGFace currentFace;
	protected Map<SVGFaceName, SVGFace> faces;
	
	/**
	 * Constructor
	 */
	protected SVGButtonBase() {
		div = Document.get().createDivElement();
		setElement(div);
		faces = new HashMap<SVGFaceName, SVGFace>();
	}
	/**
	 * Constructor
	 * @param svgElement
	 * The SVG element defining the button
	 * @param faces
	 * A collection of faces
	 */
	protected SVGButtonBase(OMSVGSVGElement svgElement, Map<SVGFaceName, SVGFace> faces) {
		this();
		setSvgElement(svgElement);
		if (faces != null) {
			this.faces.putAll(faces);
		}
	}
	/**
	 * Constructor
	 * @param resource
	 * An SVG resource to use for the SVG element defining the button
	 * @param faces
	 * The SVG element defining the button
	 */
	protected SVGButtonBase(SVGResource resource, Map<SVGFaceName, SVGFace> faces) {
		this(resource.getSvg(), faces);
	}
	
	/**
	 * Adds a new faces to the button
	 * @param faceName
	 * The face name
	 * @param face
	 * The face
	 * @return
	 * The face previously associated with this face name if there was one,
	 * null otherwise
	 */
	public SVGFace addFace(SVGFaceName faceName, SVGFace face) {
		return faces.put(faceName, face);
	}
	/**
	 * Returns the face associated with a face name
	 * @param faceName
	 * The face name
	 * @return
	 * The face associated with this face name if there is one,
	 * null otherwise
	 */
	public SVGFace getFace(SVGFaceName faceName) {
		return faces.get(faceName);
	}
	/**
	 * Sets the SVG resource defining the button
	 * @param resource
	 * An SVG resource
	 */
	public void setResource(SVGResource resource) {
		setSvgElement(resource.getSvg());
	}
	/**
	 * Returns the SVG element defining the button
	 * @return
	 * the SVG element defining the button
	 */
	public OMSVGSVGElement getSvgElement() {
		return svgElement;
	}
	/**
	 * Sets the SVG element defining the button
	 * @param svgElement
	 * the SVG element defining the button
	 */
	public void setSvgElement(OMSVGSVGElement svgElement) {
		this.svgElement = svgElement;
		if (svgElement != null) {
			svgElement.addDomHandler(this, MouseOutEvent.getType());
			svgElement.addDomHandler(this, MouseOverEvent.getType());
			svgElement.addDomHandler(this, MouseUpEvent.getType());
			svgElement.addDomHandler(this, MouseDownEvent.getType());
		}
	}
	/**
	 * Returns the name of the face currently displayed by this button
	 * @return
	 * the name of the face currently displayed by this button
	 */
	public SVGFaceName getCurrentFaceName() {
		return currentFaceName;
	}
	/**
	 * Returns true if this button is enabled, false otherwise
	 * @return
	 * true if this button is enabled, false otherwise
	 */
	public boolean isEnabled() {
		return currentFaceName != SVGFaceName.UP_DISABLED && currentFaceName != SVGFaceName.DOWN_DISABLED;
	}
	/**
	 * Sets whether this button is enabled
	 * @param enabled
	 * true to enable the button, false to disable it
	 */
	public void setEnabled(boolean enabled) {
		if (enabled) {
			switch(currentFaceName) {
				case UP_DISABLED:
				case UP_HOVERING:
					showFace(SVGFaceName.UP);
					break;
				case DOWN_DISABLED:
				case DOWN_HOVERING:
					showFace(SVGFaceName.DOWN);
					break;
			}
		} else {
			switch(currentFaceName) {
				case UP:
				case UP_HOVERING:
					showFace(SVGFaceName.UP_DISABLED);
					break;
				case DOWN:
				case DOWN_HOVERING:
					showFace(SVGFaceName.DOWN_DISABLED);
					break;
			}
		}
	}
	protected void install(OMSVGSVGElement svgElement) {
		Node firstChild = div.getFirstChild();
		Element svg = svgElement.getElement();
		if (firstChild == null) {
			div.appendChild(svg);
		} else if (firstChild != svg) {
			div.replaceChild(svg, firstChild);
		}
	}
	/**
	 * Forces the button to display the specified face
	 * @param faceName
	 * The name of the face to display
	 */
	public void showFace(SVGFaceName faceName) {
//		GWT.log((currentFaceName != null ? currentFaceName.name() : "null") + " -> " + faceName.name());
		if (faceName != currentFaceName || currentFace == null) {
			if (currentFace != null) {
				for (SVGFaceChange change : currentFace.getChanges()) {
					change.uninstall(this);
				}
			}
			currentFaceName = faceName;
			currentFace = getFace(currentFaceName);
			if (currentFace != null) {
				for (SVGFaceChange change : currentFace.getChanges()) {
					change.install(this);
				}
			}
		}
	}
	
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return svgElement.addDomHandler(handler, ClickEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		return svgElement.addDomHandler(handler, MouseDownEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return svgElement.addDomHandler(handler, MouseUpEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return svgElement.addDomHandler(handler, MouseOutEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return svgElement.addDomHandler(handler, MouseOverEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		return svgElement.addDomHandler(handler, MouseMoveEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		return svgElement.addDomHandler(handler, MouseWheelEvent.getType());
	}

}
