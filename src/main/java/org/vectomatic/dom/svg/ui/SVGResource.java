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

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.vectomatic.dev.svg.impl.gen.SVGResourceGenerator;
import org.vectomatic.dom.svg.OMSVGSVGElement;

import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.ext.DefaultExtensions;
import com.google.gwt.resources.ext.ResourceGeneratorType;

/**
 * A resource that contains SVG that should be incorporated into the compiled output. 
 * Note that by default SVG resources are validated against the SVG 1.1 XSD schema.
 * You can opt out of validation by setting the <code>validated="false"</code>
 * attribute on the annotation.
 * @author laaglu
 */
@DefaultExtensions(value = {".svg"})
@ResourceGeneratorType(SVGResourceGenerator.class)
public interface SVGResource extends ResourcePrototype {
	/**
	 * Specifies additional options to control how an SVG is bundled.
	 */
	@Documented
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	public @interface Validated {
		/**
		 * If <code>true</code>, the SVG resource will be validated
		 * against SVG 1.1 schema. Use <code>false</code> value if
		 * you need to disable validation
		 */
	    boolean validated() default true;
	}

	/**
	 * Returns the root element of the SVG resource
	 * @return
	 * the root element of the SVG resource
	 */
	public OMSVGSVGElement getSvg();
}
