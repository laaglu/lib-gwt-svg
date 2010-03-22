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
package org.vectomatic.dev.svg.impl.gen;

import java.net.URL;

import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.ui.SVGResource;
import org.vectomatic.dom.svg.utils.OMSVGParser;

import com.google.gwt.core.ext.Generator;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JMethod;
import com.google.gwt.dev.util.Util;
import com.google.gwt.resources.ext.AbstractResourceGenerator;
import com.google.gwt.resources.ext.ResourceContext;
import com.google.gwt.resources.ext.ResourceGeneratorUtil;
import com.google.gwt.user.rebind.SourceWriter;
import com.google.gwt.user.rebind.StringSourceWriter;

/**
 * Provides implementations of SVGResource.
 */
public class SVGResourceGenerator extends AbstractResourceGenerator {

	@Override
	public String createAssignment(
		TreeLogger logger, 
		ResourceContext context,
		JMethod method) throws UnableToCompleteException {

		// Extract the SVG name from the @Source annotation
	    URL[] resources = ResourceGeneratorUtil.findResources(logger, context, method);
		if (resources.length != 1) {
			logger.log(TreeLogger.ERROR, "Exactly one resource must be specified", null);
			throw new UnableToCompleteException();
		}
		URL resource = resources[0];

		// The SVGResource is implemented as an anonymous inner class
		// xxx = new SVGResource() {
		//   public OMSVGSVGElement getSvg() {
		//     return OMSVGParser.parse("...");
		//   }
		// };
		SourceWriter sw = new StringSourceWriter();
		sw.println("new " + SVGResource.class.getName() + "() {");
		sw.indent();

		// Convenience when examining the generated code.
		sw.println("// " + resource.toExternalForm());

		sw.println("public " + OMSVGSVGElement.class.getName() + " getSvg() {");
		sw.indent();
		String toWrite = Util.readURLAsString(resource);
		sw.println("return " + OMSVGParser.class.getName() + ".parse(\"" + Generator.escape(toWrite) + "\");");
		sw.outdent();
		sw.println("}");

	    sw.println("public String getName() {");
	    sw.indent();
	    sw.println("return \"" + method.getName() + "\";");
	    sw.outdent();
	    sw.println("}");

		sw.outdent();
		sw.println("}");

		return sw.toString();
	}

}
