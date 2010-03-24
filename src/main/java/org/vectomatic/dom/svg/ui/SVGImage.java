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

import org.vectomatic.dom.svg.OMSVGLength;
import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.events.HasDocumentHandlers;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.events.SVGZoomHandler;

import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.ElementParserToUse;

/**
 * A widget which contains a single <pre><svg></pre> element.
 * The class bridges event subscription methods and forwards
 * them to the underlying OMSVGSVGElement.
 * The class integrates with GWT Widget hierarchy.
 * @author laaglu
 */
@ElementParserToUse(className = "org.vectomatic.dev.svg.impl.gen.SVGImageParser")
public class SVGImage extends SVGWidget implements HasGraphicalHandlers, HasDocumentHandlers {
	protected OMSVGSVGElement svgElement;
	public SVGImage() {
	}
	public SVGImage(SVGResource resource) {
		this(resource.getSvg());
	}
	public SVGImage(OMSVGSVGElement svgElement) {
		setSvgElement(svgElement);
	}
	
	public OMSVGSVGElement getSvgElement() {
		return svgElement;
	}
	
	public void setResource(SVGResource resource) {
		setSvgElement(resource.getSvg());
	}
	
	public void setSvgElement(OMSVGSVGElement svgElement) {
		this.svgElement = svgElement;
		// Sets the element in UIObject. This guarantees that
		// SimplePanel.setWidget() and ComplexPanel.insertWidget()
		// get the SVGSVGElement when this widget is inserted
		// in a SimplePanel or a ComplexPanel
		setElement(svgElement.getElement());
	}
	
	/**
	 * Reimplement the onAttach method which cannot be based on
	 * com.google.gwt.user.client.DOM but needs to use
	 * org.vectomatic.dom.svg.DOMHelper instead. This method
	 * is invoked by Panel.adopt()
	 */
	@Override
	protected void onAttach() {
	}
	
	/**
	 * Reimplement the onAttach method which cannot be based on
	 * com.google.gwt.user.client.DOM but needs to use
	 * org.vectomatic.dom.svg.DOMHelper instead. This method
	 * is invoked by Panel.adopt()
	 */
	@Override
	protected void onDetach() {
	}
	
	/**
	 * Reimplement the getStyleName method because SVGElement.className
	 * is a SVGAnimatedString, not a string
	 */
	@Override
	public String getStyleName() {
		return svgElement.getClassName().getBaseVal();
	}
	
	/**
	 * Reimplement the getStylePrimaryName method because SVGElement.className
	 * is a SVGAnimatedString, not a string
	 */
	@Override
	public String getStylePrimaryName() {
		return getStyleName();
	}
	
	/**
	 * Reimplement the removeStyleName method because SVGElement.className
	 * is a SVGAnimatedString, not a string
	 */
	@Override
	public void removeStyleName(String style) {
		svgElement.removeClassNameBaseVal(style);
	}
	
	/**
	 * Reimplement the setStyleName method because SVGElement.className
	 * is a SVGAnimatedString, not a string
	 */
	@Override
	public void setStyleName(String style) {
		svgElement.setClassNameBaseVal(style);
	}
	
	/**
	 * Reimplement the setStylePrimaryName method because SVGElement.className
	 * is a SVGAnimatedString, not a string
	 */
	@Override
	public void setStylePrimaryName(String style) {
		setStyleName(style);
	}

	/**
	 * Reimplement the setWidth method becaue of Bug 374216
	 */
	@Override
	public void setWidth(String width) {
		OMSVGLength length = svgElement.createSVGLength();
		length.setValueAsString(width);
		svgElement.setWidth(length.getUnitType(), length.getValue());
	}

	/**
	 * Reimplement the setHeight method becaue of Bug 374216
	 */
	@Override
	public void setHeight(String height) {
		OMSVGLength length = svgElement.createSVGLength();
		length.setValueAsString(height);
		svgElement.setHeight(length.getUnitType(), length.getValue());
	}

	/**
	 * Reimplement the addStyleName method because SVGElement.className
	 * is a SVGAnimatedString, not a string
	 */
	public void addStyleName(String style) {
		svgElement.addClassNameBaseVal(style);
	}
 
	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		return svgElement.addMouseDownHandler(handler);
	}
	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return svgElement.addMouseUpHandler(handler);
	}
	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return svgElement.addMouseOutHandler(handler);
	}
	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return svgElement.addMouseOverHandler(handler);
	}
	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		return svgElement.addMouseMoveHandler(handler);
	}
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return svgElement.addClickHandler(handler);
	}
	@Override
	public HandlerRegistration addLoadHandler(LoadHandler handler) {
		return svgElement.addLoadHandler(handler);
	}
	@Override
	public HandlerRegistration addFocusHandler(FocusHandler handler) {
		return svgElement.addFocusHandler(handler);
	}
	@Override
	public HandlerRegistration addBlurHandler(BlurHandler handler) {
		return svgElement.addBlurHandler(handler);
	}
	@Override
	public HandlerRegistration addResizeHandler(ResizeHandler handler) {
		return svgElement.addResizeHandler(handler);
	}
	@Override
	public HandlerRegistration addScrollHandler(ScrollHandler handler) {
		return svgElement.addScrollHandler(handler);
	}
	@Override
	public HandlerRegistration addSVGZoomHandler(SVGZoomHandler handler) {
		return svgElement.addSVGZoomHandler(handler);
	}
}
