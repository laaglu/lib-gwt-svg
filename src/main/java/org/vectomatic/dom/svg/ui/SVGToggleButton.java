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

import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.uibinder.client.ElementParserToUse;

/**
 * SVG toggle button class
 * <p>An SVG push toggle typically defines at least the following two faces:</p>
 * <ul>
 * <li>UP</li>
 * <li>DOWN</li>
 * </ul>
 * <p>You can define an SVG toggle button using UiBinder templates. Use
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
 * &lt;svgui:SVGToggleButton resource="{resources.led}"&gt;
 *  &lt;svgui:upFace&gt;&lt;svgui:styleChange classNames="{style.led-up}"/&gt;&lt;/svgui:upFace&gt;
 *  &lt;svgui:downFace&gt;&lt;svgui:styleChange classNames="{style.led-down}"/&gt;&lt;/svgui:downFace&gt;
 * &lt;/svgui:SVGToggleButton&gt;
 * </pre>
 * Note that by default the inline SVG in SVGToggleButtons is validated against the SVG 1.1 XSD schema.
 * You can opt out of validation by setting the <code>validated="false"</code>
 * attribute on the <em>svgui:element</em> tag.
 * @author laaglu
 */
@ElementParserToUse(className = "org.vectomatic.dev.svg.impl.gen.SVGButtonBaseParser")
public class SVGToggleButton extends SVGButtonBase {
	public SVGToggleButton() {
	}
	public SVGToggleButton(OMSVGSVGElement svgElement, Map<SVGFaceName, SVGFace> faces) {
		super(svgElement, faces);
		showFace(SVGFaceName.UP);
	}
	public SVGToggleButton(SVGResource resource, Map<SVGFaceName, SVGFace> faces) {
		this(resource.getSvg(), faces);
	}

	/**
	 * Returns whether this button is down
	 * @return
	 * true if it is down, false if it is up
	 */
	public boolean isDown() {
		return currentFaceName == SVGFaceName.DOWN || currentFaceName == SVGFaceName.DOWN_DISABLED || currentFaceName == SVGFaceName.DOWN_HOVERING;
	}
	/**
	 * Sets whether this button is down.
	 * @param isDown
	 * true to force the button down, false to force the button up
	 */
	public void setDown(boolean isDown) {
		if (isDown) {
			showFace(SVGFaceName.DOWN);
		} else {
			showFace(SVGFaceName.UP);
		}
	}
	@Override
	public void onMouseDown(MouseDownEvent event) {
//		GWT.log("onMouseDown");
		if (isEnabled()) {
			switch(currentFaceName) {
				case UP_HOVERING:
				case UP:
					showFace(SVGFaceName.DOWN_HOVERING);
					break;
				case DOWN_HOVERING:
				case DOWN:
					showFace(SVGFaceName.UP_HOVERING);
					break;
			}
		}
		event.stopPropagation();
		event.preventDefault();
	}
	@Override
	public void onMouseUp(MouseUpEvent event) {
//		GWT.log("onMouseUp");
		if (isEnabled()) {
			if (currentFaceName == SVGFaceName.DOWN_HOVERING) {
				showFace(SVGFaceName.DOWN);
			} else if (currentFaceName == SVGFaceName.UP_HOVERING) {
				showFace(SVGFaceName.UP);
			}
		}
		event.stopPropagation();
		event.preventDefault();
	}
	@Override
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
	}
	@Override
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
	}
	
	@Override
	public SVGFace getFace(SVGFaceName faceName) {
		if (!faces.containsKey(faceName)) {
			switch (faceName) {
				case UP_HOVERING:
				case UP_DISABLED:
					faceName = SVGFaceName.UP;
					break;
				case DOWN:
				case DOWN_HOVERING:
				case DOWN_DISABLED:
					faceName = SVGFaceName.DOWN;
					break;
			}
		}
		return super.getFace(faceName);
	}

}
