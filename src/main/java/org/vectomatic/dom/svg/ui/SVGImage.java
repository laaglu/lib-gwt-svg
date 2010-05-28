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

import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.events.ActivateHandler;
import org.vectomatic.dom.svg.events.FocusInHandler;
import org.vectomatic.dom.svg.events.FocusOutHandler;
import org.vectomatic.dom.svg.events.HasDocumentHandlers;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.events.SVGZoomHandler;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasAllMouseHandlers;
import com.google.gwt.event.dom.client.LoadHandler;
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
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.ElementParserToUse;

/**
 * A widget which contains a single {@link org.vectomatic.dom.svg.OMSVGSVGElement OMSVGSVGElement}.
 * The class bridges event subscription methods and forwards
 * them to the underlying {@link org.vectomatic.dom.svg.OMSVGSVGElement OMSVGSVGElement}.
 * The class integrates with GWT Widget hierarchy.
 * <p>You can define an SVGImage using UiBinder templates. 
 * Depending on your needs, you can either define the SVG inline.
 * This can be convenient if you want to 
 * localize the button label, or use styles defined in the template. 
 * Or you can use an {@link org.vectomatic.dom.svg.ui.SVGResource SVGResource} with the <em>resource</em> attribute,
 * if your SVG is large or if you want to keep your template more readable.</p>
 * <p>The following section shows a sample UiBinder template. Notice
 * that you can bind tags inside the template to java variables. One
 * of the <em>&lt;g&gt;</em> tag is bound to a java variable
 * <em>eyes</em> of type {@link org.vectomatic.dom.svg.OMSVGGElement OMSVGGElement}
 * and one of the <em>&lt;path&gt;</em> tag is bound to a java variable
 * <em>mouth</em> of type {@link org.vectomatic.dom.svg.OMSVGPathElement OMSVGPathElement}.</p>
 * <pre>
 * &lt;svgui:SVGImage&gt;
 *  &lt;svg width="100" height="100" viewBox="80 190 140 130" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:svg="http://www.w3.org/2000/svg"&gt;
 *   &lt;path d="m 208,146.86218 a 63,63.5 0 1 1 -126,0 63,63.5 0 1 1 126,0 z" style="fill:#ffff00;stroke:#000000;" transform="translate(3.9895924,108.83705)" /&gt;
 *   &lt;g ui:field="eyes" transform="translate(10.960155,103.59114)"&gt;
 *    &lt;path d="m 124,133.36218 c 0,4.97057 -4.02944,9 -9,9 -4.97056,0 -9,-4.02943 -9,-9 0,-4.97056 4.02944,-9 9,-9 4.97056,0 9,4.02944 9,9 z" class="{style.eye}" /&gt;
 *    &lt;path d="m 124,133.36218 c 0,4.97057 -4.02944,9 -9,9 -4.97056,0 -9,-4.02943 -9,-9 0,-4.97056 4.02944,-9 9,-9 4.97056,0 9,4.02944 9,9 z" class="{style.eye}" transform="translate(44,0)" /&gt;
 *   &lt;/g&gt;
 *   &lt;path ui:field="mouth" d="m 118.88908,286.15612 5,10 10,5 30,0 10,-5 5,-10 -5,5 -10,5 -30,0 -10,-5 -5,-5 z" class="{style.mouth}" /&gt;
 *  &lt;/svg&gt;
 * &lt;/svgui:SVGImage&gt;
 * </pre>
 * @author laaglu
 */
@ElementParserToUse(className = "org.vectomatic.dev.svg.impl.gen.SVGImageParser")
public class SVGImage extends SVGWidget implements HasGraphicalHandlers, HasAllMouseHandlers, HasDocumentHandlers {
	protected DivElement div;
	protected OMSVGSVGElement svgElement;
	public SVGImage() {
		div = Document.get().createDivElement();
		setElement(div);
	}
	public SVGImage(SVGResource resource) {
		this();
		setResource(resource);
	}
	public SVGImage(OMSVGSVGElement svgElement) {
		this();
		setSvgElement(svgElement);
	}
	
	public OMSVGSVGElement getSvgElement() {
		return svgElement;
	}
	
	public void setResource(SVGResource resource) {
		setSvgElement(resource.getSvg());
	}
	
	public void setSvgElement(OMSVGSVGElement svgElement) {
		this.svgElement = (OMSVGSVGElement)svgElement.cloneNode(true);
		// Sets the element in UIObject. This guarantees that
		// SimplePanel.setWidget() and ComplexPanel.insertWidget()
		// get the SVGSVGElement when this widget is inserted
		// in a SimplePanel or a ComplexPanel
		Node firstChild = div.getFirstChild();
		Element svg = this.svgElement.getElement();
		if (firstChild == null) {
			div.appendChild(svg);
		} else if (firstChild != svg) {
			div.replaceChild(svg, firstChild);
		}
	}
 
	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
		// NB: standard mouse events will be caught by the container <div> element
		// not the the embedded <svg> element
		return addDomHandler(handler, MouseDownEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
		return addDomHandler(handler, MouseUpEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
		return addDomHandler(handler, MouseOutEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
		return addDomHandler(handler, MouseOverEvent.getType());
	}
	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
		return addDomHandler(handler, MouseMoveEvent.getType());
	}
	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return addDomHandler(handler, ClickEvent.getType());
	}
	@Override
	public HandlerRegistration addLoadHandler(LoadHandler handler) {
		return svgElement.addLoadHandler(handler);
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
	@Override
	public HandlerRegistration addFocusInHandler(FocusInHandler handler) {
		return svgElement.addFocusInHandler(handler);
	}
	@Override
	public HandlerRegistration addFocusOutHandler(FocusOutHandler handler) {
		return svgElement.addFocusOutHandler(handler);
	}
	@Override
	public HandlerRegistration addActivateHandler(ActivateHandler handler) {
		return svgElement.addActivateHandler(handler);
	}
	@Override
	public HandlerRegistration addMouseWheelHandler(MouseWheelHandler handler) {
		return addDomHandler(handler, MouseWheelEvent.getType());
	}
}
