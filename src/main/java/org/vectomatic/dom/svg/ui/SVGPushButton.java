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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseDownEvent;
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
 * the <em>svgui:up</em>, <em>svgui:upDisabled</em>, <em>svgui:upHovering</em>
 * <em>svgui:down</em>, <em>svgui:downDisabled</em>, <em>svgui:downHovering</em>
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
	private MouseDownEvent mouseDownEvent;
	private CustomerTimer timer;
	private class CustomerTimer extends Timer {
		@Override
		public void run() {
			if (mouseDownEvent != null) {
				svgElement.fireEvent(mouseDownEvent);
			}
		}
	}
	public SVGPushButton() {
	}
	public SVGPushButton(OMSVGSVGElement svgElement, Map<SVGFaceName, SVGFace> faces) {
		super(svgElement, faces);
	}
	public SVGPushButton(SVGResource resource, Map<SVGFaceName, SVGFace> faces) {
		this(resource.getSvg(), faces);
	}
	
	@Override
	public void setSvgElement(OMSVGSVGElement svgElement) {
		super.setSvgElement(svgElement);
		showFace(SVGFaceName.UP);
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		if (enabled != isEnabled()) {
			if (enabled) {
				showFace(SVGFaceName.UP);
			} else {
				if (timer != null) {
					mouseDownEvent = null;
					timer.cancel();
					timer = null;
				}
				showFace(SVGFaceName.UP_DISABLED);
			}
		}
	}
	public void onMouseDown(MouseDownEvent event) {
//		GWT.log("onMouseDown");
		if (isEnabled()) {
			if (timer == null && repeatDelayMillis > 0) {
				mouseDownEvent = event;
				timer = new CustomerTimer();
				timer.scheduleRepeating(repeatDelayMillis);
			}
			showFace(SVGFaceName.DOWN_HOVERING);
		}
		event.stopPropagation();
		event.preventDefault();
	}
	public void onMouseUp(MouseUpEvent event) {
//		GWT.log("onMouseUp");
		if (isEnabled()) {
			if (timer != null) {
				mouseDownEvent = null;
				timer.cancel();
				timer = null;
			}
			showFace(SVGFaceName.UP_HOVERING);
		}
		event.stopPropagation();
		event.preventDefault();
	}
	public void onMouseOver(MouseOverEvent event) {
//		GWT.log("onMouseOver");
		if (isEnabled()) {
			if (timer == null && repeatDelayMillis > 0 && mouseDownEvent != null) {
				timer = new CustomerTimer();
				timer.scheduleRepeating(repeatDelayMillis);
			}
			switch(currentFaceName) {
				case UP:
					showFace(SVGFaceName.UP_HOVERING);
					break;
				case DOWN:
					showFace(SVGFaceName.DOWN_HOVERING);
					break;
			}
		}
	}
	public void onMouseOut(MouseOutEvent event) {
//		GWT.log("onMouseOut");
		if (isEnabled()) {
			if (timer != null) {
				timer.cancel();
				timer = null;
			}
			switch(currentFaceName) {
				case UP_HOVERING:
					showFace(SVGFaceName.UP);
					break;
				case DOWN_HOVERING:
					showFace(SVGFaceName.DOWN);
					break;
			}
		}
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
}
