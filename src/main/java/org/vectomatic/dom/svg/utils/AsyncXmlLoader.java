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
package org.vectomatic.dom.svg.utils;

/**
 * Interface to define an API to load XML resources asynchronously.
 * <p>If you want to develop a GWT application which runs as a
 * regular web application, you do not need this level of
 * abstraction and can use the {@link HttpRequestXmlLoader} class
 * directly with no specific configuration.</p>
 * <p>If you want to develop a GWT application which can be run
 * either as a regular web application or as a plasmoid / opera control,
 * you will create instances of this type by calling:
 * <pre>AsyncXmlLoader loader = GWT.create(AsyncXmlLoader.class)</pre>
 * then use the proper GWT configuration to control which implementation
 * gets instantiated.
 * </p>
 * <p>For regular web application, use {@link HttpRequestXmlLoader}:</p>
 * <pre>
 * &lt;replace-with class="org.vectomatic.dom.svg.utils.HttpRequestXmlLoader"&gt;
 *  &lt;when-type-is class="org.vectomatic.dom.svg.utils.AsyncXmlLoader" /&gt;
 * &lt;/replace-with&gt;
 * </pre>
 * <p>For plasmoids / opera controls, use {@link IFrameXmlLoader}:</p>
 * <pre>
 * &lt;replace-with class="org.vectomatic.dom.svg.utils.IFrameXmlLoader"&gt;
 *  &lt;when-type-is class="org.vectomatic.dom.svg.utils.AsyncXmlLoader" /&gt;
 * &lt;/replace-with&gt;
 * </pre>
 * <p>For instance, if you want to load an SVG image located
 * in the <b>public</b> directory of your GWT
 * application, you should make the following call:</p>
 * <pre>
 * AsyncXmlLoader loader = ...;
 * String resourceName = "foo.svg";
 * loader.loadResource(GWT.getModuleBaseURL() + "/" + resourceName, new AsyncXmlLoaderCallback() {
 *	public void onSuccess(String resourceName, Element root) {
 *	 RootPanel.get().add(new SVGImage(OMNode.&lt;OMSVGSVGElement&gt;convert(root)));
 *	}
 *	public void onError(String resourceName, Throwable error) {
 *	 GWT.log("Cannot load " + resourceName, error);
 *	}
 * });
 * </pre>
 */
public interface AsyncXmlLoader {
	/**
	 * Initiates a request to load an XML resource
	 * @param resourceUrl
	 * The resource to load
	 * @param callback
	 * A callback invoked to process the resource once it is loaded
	 */
	public void loadResource(String resourceUrl, AsyncXmlLoaderCallback callback);
}
