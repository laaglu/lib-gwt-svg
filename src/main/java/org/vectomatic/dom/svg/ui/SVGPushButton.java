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

import java.util.Map;

import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.ui.SVGButtonBase.SVGFaceName;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.EventTarget;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.LoseCaptureEvent;
import com.google.gwt.event.dom.client.LoseCaptureHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseEvent;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.uibinder.client.ElementParserToUse;
import com.google.gwt.user.client.Timer;

/**
 * SVG push button class.
 * <p>An SVG push button typically defines at least the following two faces:</p>
 * <ul>
 * <li>UP</li>
 * <li>DOWN_HOVERING</li>
 * </ul>
 * <p>You can define an SVG push button using UiBinder templates. Use
 * the <em>svgui:upFace</em>, <em>svgui:upDisabledFace</em>, <em>svgui:upHoveringFace</em>
 * <em>svgui:downFace</em>, <em>svgui:downDisabledFace</em>, <em>svgui:downHoveringFace</em>
 * tags to defined faces.</p>
 * <p>Depending on your needs, you can either define the SVG inline with
 * the <em>svgui:element</em> tag. This can be convenient if you want to 
 * localize the button label, or use styles defined in the template. 
 * Or you can use an {@link org.vectomatic.dom.svg.ui.SVGResource SVGResource} with the <em>resource</em> attribute,
 * if your SVG is large or if you want to keep your template more readable.</p>
 * <p>Each face contains one or more <em>svgui:styleChange</em> tags.
 * The <em>classNames</em> attribute specifies the name of the
 * CSS class selectors to be applied to the SVG element when the face
 * is activated.</p>
 * <p>The following section shows a sample UiBinder template:</p>
 * <pre>
 * &lt;svgui:SVGPushButton ui:field="clickMeButton"&gt;
 *   &lt;svgui:element&gt;
 *     &lt;svg viewBox="0 0 200 60" width="200" height="60" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"&gt;
 *       &lt;rect class="btn-shape" x="3" y="3" width="194" height="54" rx="10" ry="10" /&gt;
 *       &lt;text class="btn-text" x="16" y="43"&gt;Click me !&lt;/text&gt;
 *      &lt;/svg&gt;
 *   &lt;/svgui:element&gt;
 *   &lt;svgui:upFace&gt;&lt;svgui:styleChange classNames="{style.btn1} {style.btn1-up}"/&gt;&lt;/svgui:upFace&gt;
 *   &lt;svgui:downHoveringFace&gt;&lt;svgui:styleChange classNames="{style.btn1} {style.btn1-down-hovering}"/&gt;&lt;/svgui:downHoveringFace&gt;
 * &lt;/svgui:SVGPushButton&gt;
 * </pre>
 * Note that by default the inline SVG in SVGPushButtons is validated against the SVG 1.1 XSD schema.
 * You can opt out of validation by setting the <code>validated="false"</code>
 * attribute on the <em>svgui:element</em> tag.
 * @author laaglu
 */
@ElementParserToUse(className = "org.vectomatic.dev.svg.impl.gen.SVGButtonBaseParser")
public class SVGPushButton extends SVGButtonBase {
	private int repeatDelayMillis;
	private CustomerTimer timer;
	private class CustomerTimer extends Timer {
		private EventClone mouseDownEvent;
		public CustomerTimer(EventClone mouseDownEvent) {
			this.mouseDownEvent = mouseDownEvent;
		}
		@Override
		public void run() {
			mouseDownEvent.fireEvent(svgElement.getElement());
		}
	}
	private static class EventClone {
		private String type;
		private int canBubbleArg;
		private int cancelableArg;
		private int screenX;
		private int screenY;
		private int clientX;
		private int clientY;
		private boolean ctrlKey;
		private boolean altKey;
		private boolean shiftKey;
		private boolean metaKey;
		private int button;
		private EventTarget relatedEventTarget;
		public EventClone(MouseEvent<?> mouseEvent) {
			NativeEvent evt = mouseEvent.getNativeEvent();
			type = evt.getType();
			screenX = evt.getScreenX();
			screenY = evt.getScreenY();
			clientX = evt.getClientX();
			clientY = evt.getClientY();
			ctrlKey = evt.getCtrlKey();
			altKey = evt.getAltKey();
			shiftKey = evt.getShiftKey();
			metaKey = evt.getMetaKey();
			button = evt.getButton();
			relatedEventTarget = evt.getRelatedEventTarget();
		}

		public final native void fireEvent(Element element) /*-{
		   var evt = element.ownerDocument.createEvent("MouseEvents");
		   evt.initMouseEvent(
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::type, 
				  true, 
				  true, 
				  $wnd,
				  0, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::screenX, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::screenY, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::clientX, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::clientY, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::ctrlKey, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::altKey, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::shiftKey,
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::metaKey,
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::button, 
				  this.@org.vectomatic.dom.svg.ui.SVGPushButton.EventClone::relatedEventTarget);
			element.dispatchEvent(evt);
		}-*/;
	}
	public SVGPushButton() {
	}
	public SVGPushButton(OMSVGSVGElement svgElement, Map<SVGFaceName, SVGFace> faces) {
		super(svgElement, faces);
		showFace(SVGFaceName.UP);
	}
	public SVGPushButton(SVGResource resource, Map<SVGFaceName, SVGFace> faces) {
		this(resource.getSvg(), faces);
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		if (enabled != isEnabled()) {
			if (enabled) {
				showFace(SVGFaceName.UP);
			} else {
				cancelTimer();
				showFace(SVGFaceName.UP_DISABLED);
			}
		}
	}
	public void onMouseDown(MouseDownEvent event) {
//		GWT.log("onMouseDown");
		if (isEnabled()) {
			DOMHelper.setCaptureElement(svgElement, new LoseCaptureHandler() {
				@Override
				public void onLoseCapture(LoseCaptureEvent event) {
					cancelTimer();
				}
			});
			if (repeatDelayMillis > 0 && timer == null) {
				timer = new CustomerTimer(new EventClone(event));
				timer.scheduleRepeating(repeatDelayMillis);
			}
			showFace(SVGFaceName.DOWN_HOVERING);
		}
		event.stopPropagation();
		event.preventDefault();
	}
	public void onMouseUp(MouseUpEvent event) {
//		GWT.log("onMouseUp");
		cancelTimer();
		DOMHelper.releaseCaptureElement();
		if (isEnabled()) {
			switch(currentFaceName) {
				case DOWN:
					showFace(SVGFaceName.UP);
					break;
				case DOWN_HOVERING:
					showFace(SVGFaceName.UP_HOVERING);
					break;
			}
		}
		event.stopPropagation();
		event.preventDefault();
	}
	public void onMouseOver(MouseOverEvent event) {
//		GWT.log("onMouseOver");
		if (isEnabled()) {
			switch(currentFaceName) {
				case UP:
					showFace(SVGFaceName.UP_HOVERING);
					break;
				case DOWN:
					showFace(SVGFaceName.DOWN_HOVERING);
					break;
			}
		}
		event.stopPropagation();
		event.preventDefault();
	}
	public void onMouseOut(MouseOutEvent event) {
//		GWT.log("onMouseOut");
		if (isEnabled()) {
			switch(currentFaceName) {
				case UP_HOVERING:
					showFace(SVGFaceName.UP);
					break;
				case DOWN_HOVERING:
					showFace(SVGFaceName.DOWN);
					break;
			}
		}
		event.stopPropagation();
		event.preventDefault();
	}
	
	@Override
	public SVGFace getFace(SVGFaceName faceName) {
		if (!faces.containsKey(faceName)) {
			switch (faceName) {
				case UP_HOVERING:
				case UP_DISABLED:
				case DOWN:
					faceName = SVGFaceName.UP;
					break;
				case DOWN_HOVERING:
				case DOWN_DISABLED:
					faceName = SVGFaceName.DOWN;
					break;
			}
		}
		return super.getFace(faceName);
	}
	public void setRepeatDelay(int repeatDelayMillis) {
		this.repeatDelayMillis = repeatDelayMillis;
	}
	public int getRepeatDelay() {
		return repeatDelayMillis;
	}
	private void cancelTimer() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
	}
}
