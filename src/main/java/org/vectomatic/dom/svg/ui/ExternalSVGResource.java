package org.vectomatic.dom.svg.ui;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
 * Note that by default SVG resources are validated against the SVG 1.1 XSD schema.
 * You can opt out of validation by setting the <code>validated="false"</code>
 * attribute on the annotation.
 */
@DefaultExtensions(value = {".svg"})
@ResourceGeneratorType(ExternalSVGResourceGenerator.class)
public interface ExternalSVGResource extends ResourcePrototype {
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
	 * Starts an asynchronous request to retrieve the root element of the SVG resource.
	 * @param callback The callback interface to invoke once the resource has been retrieved
	 */
	 void getSvg(ResourceCallback<SVGResource> callback) throws ResourceException;
}
