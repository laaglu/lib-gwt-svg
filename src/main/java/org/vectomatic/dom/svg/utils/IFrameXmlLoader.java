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

import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.IFrameElement;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Implementation of the AsyncXmlLoader based on iframes.
 */
public class IFrameXmlLoader implements AsyncXmlLoader {
	
	public IFrameXmlLoader() {
	}

	public void loadResource(String resourceName, AsyncXmlLoaderCallback callback) {
		IFrameElement iframe = Document.get().createIFrameElement();
		iframe.setAttribute("tabIndex", "-1");
		iframe.setAttribute("style", "position: absolute; width: 0; height: 0; border: 0");
		iframe.setAttribute("src", "javascript:''");
		Element body = RootPanel.get().getElement();
		body.appendChild(iframe);
		setFrameLocation(resourceName, iframe, callback);
	}
	
	@SuppressWarnings("unused")
	private void dispatch(NativeEvent event, AsyncXmlLoaderCallback callback) {
		IFrameElement iframe = event.getCurrentEventTarget().cast();
		if (iframe != null) {
			String href = getHref(iframe);
			if (!"about:blank".equals(href)) {
				Element root = iframe.getContentDocument().getDocumentElement();
				Element localRoot = DOMHelper.importNode(DOMHelper.getCurrentDocument(), root, true).cast();
				callback.onSuccess(href, localRoot);
			}
			Element body = RootPanel.get().getElement();
			body.removeChild(iframe);
		}
	}
	
	private native String getHref(IFrameElement iframe) /*-{
		return iframe.contentDocument.location.href;
	}-*/;
	
	private native void setFrameLocation(String resourceName, IFrameElement iframe, AsyncXmlLoaderCallback callback) /*-{
		var gwtThis = this;
		iframe.onload = function(evt) {
		  gwtThis.@org.vectomatic.dom.svg.utils.IFrameXmlLoader::dispatch(Lcom/google/gwt/dom/client/NativeEvent;Lorg/vectomatic/dom/svg/utils/AsyncXmlLoaderCallback;)(evt,callback);
		}
		iframe.contentDocument.location.href = resourceName;
	}-*/;
}
