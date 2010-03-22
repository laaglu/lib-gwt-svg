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

import org.vectomatic.dev.svg.impl.gen.SVGResourceGenerator;
import org.vectomatic.dom.svg.OMSVGSVGElement;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.ext.DefaultExtensions;
import com.google.gwt.resources.ext.ResourceGeneratorType;

/**
 * A resource that contains SVG that should be incorporated into the compiled output. 
 * @author laaglu
 */
@DefaultExtensions(value = {".svg"})
@ResourceGeneratorType(SVGResourceGenerator.class)
public interface SVGResource extends ResourcePrototype {
	/**
	 * Returns the root element of the SVG resource
	 * @return
	 * the root element of the SVG resource
	 */
	public OMSVGSVGElement getSvg();
}
