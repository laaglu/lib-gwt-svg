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

import org.vectomatic.dom.svg.OMSVGAnimatedString;
import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.OMSVGStyle;
import org.vectomatic.dom.svg.events.ActivateHandler;
import org.vectomatic.dom.svg.events.FocusInHandler;
import org.vectomatic.dom.svg.events.FocusOutHandler;
import org.vectomatic.dom.svg.events.HasDocumentHandlers;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.events.SVGZoomHandler;
import org.vectomatic.dom.svg.itf.ISVGStylable;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DragEndEvent;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterEvent;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragEvent;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveEvent;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverEvent;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartEvent;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropEvent;
import com.google.gwt.event.dom.client.DropHandler;
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
import com.google.gwt.event.dom.client.TouchCancelEvent;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.dom.client.TouchStartHandler;
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
 * Note that by default SVGImages are validated against the SVG 1.1 XSD schema.
 * You can opt out of validation by setting the <code>validated="false"</code>
 * attribute on the SVGImages.
 * @author laaglu
 */
@ElementParserToUse(className = "org.vectomatic.dev.svg.impl.gen.SVGImageParser")
public class SVGImage extends SVGWidget implements HasGraphicalHandlers, HasAllMouseHandlers, HasDocumentHandlers, ISVGStylable {
	protected OMSVGSVGElement svgElement;
	/**
	 * No-arg constructor.
	 * You must call {@link SVGImage#setResource(SVGResource)} or {@link SVGImage#setSvgElement(OMSVGSVGElement)}
	 * before using the widget.
	 */
	public SVGImage() {
	}
	@UiConstructor public SVGImage(SVGResource resource) {
		setResource(resource);
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
		setElement(this.svgElement.getElement());
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
	public final HandlerRegistration addTouchCancelHandler(TouchCancelHandler handler) {
		return addDomHandler(handler, TouchCancelEvent.getType());
	}
	@Override
	public final HandlerRegistration addTouchEndHandler(TouchEndHandler handler) {
		return addDomHandler(handler, TouchEndEvent.getType());
	}
	@Override
	public final HandlerRegistration addTouchMoveHandler(TouchMoveHandler handler) {
		return addDomHandler(handler, TouchMoveEvent.getType());
	}
	@Override
	public final HandlerRegistration addTouchStartHandler(TouchStartHandler handler) {
		return addDomHandler(handler, TouchStartEvent.getType());
	}
	@Override
	public final HandlerRegistration addDragEndHandler(DragEndHandler handler) {
		return addDomHandler(handler, DragEndEvent.getType());
	}
	@Override
	public final HandlerRegistration addDragEnterHandler(DragEnterHandler handler) {
		return addDomHandler(handler, DragEnterEvent.getType());
	}
	@Override
	public final HandlerRegistration addDragHandler(DragHandler handler) {
		return addDomHandler(handler, DragEvent.getType());
	}
	@Override
	public final HandlerRegistration addDragLeaveHandler(DragLeaveHandler handler) {
		return addDomHandler(handler, DragLeaveEvent.getType());
	}
	@Override
	public final HandlerRegistration addDragOverHandler(DragOverHandler handler) {
		return addDomHandler(handler, DragOverEvent.getType());
	}
	@Override
	public final HandlerRegistration addDragStartHandler(DragStartHandler handler) {
		return addDomHandler(handler, DragStartEvent.getType());
	}
	@Override
	public final HandlerRegistration addDropHandler(DropHandler handler) {
		return addDomHandler(handler, DropEvent.getType());
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
	
	// Implementation of the svg::Stylable W3C IDL interface
	public OMSVGStyle getStyle() {
		return svgElement.getStyle();
	}

	public final OMSVGAnimatedString getClassName() {
		return svgElement.getClassName();
	}

	public final void addClassNameBaseVal(String className) {
		svgElement.addClassNameBaseVal(className);
	}

	public final void removeClassNameBaseVal(String className) {
		svgElement.removeClassNameBaseVal(className);
	}

	public final void replaceClassNameBaseVal(String oldClassName, String newClassName) {
		svgElement.replaceClassNameBaseVal(oldClassName, newClassName);
	}

	public final void setClassNameBaseVal(String className) {
		svgElement.setClassNameBaseVal(className);
	}
}
