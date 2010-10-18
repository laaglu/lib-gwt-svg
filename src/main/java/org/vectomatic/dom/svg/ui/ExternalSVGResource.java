package org.vectomatic.dom.svg.ui;

import org.vectomatic.dev.svg.impl.gen.ExternalSVGResourceGenerator;

import com.google.gwt.resources.client.ResourceCallback;
import com.google.gwt.resources.client.ResourceException;
import com.google.gwt.resources.client.ResourcePrototype;
import com.google.gwt.resources.ext.DefaultExtensions;
import com.google.gwt.resources.ext.ResourceGeneratorType;

/**
 * Identical to {@link SVGResource}, except the contents of the resource are
 * not inlined into the compiled output. This is suitable for resources that are
 * not required as part of program initialization.
 */
@DefaultExtensions(value = {".svg"})
@ResourceGeneratorType(ExternalSVGResourceGenerator.class)
public interface ExternalSVGResource extends ResourcePrototype {
	/**
	 * Starts an asynchronous request to retrieve the root element of the SVG resource.
	 * @param callback The callback interface to invoke once the resource has been retrieved
	 */
	 void getSvg(ResourceCallback<SVGResource> callback) throws ResourceException;
}
