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

import org.vectomatic.dom.svg.impl.SVGParserImpl;
import org.vectomatic.dom.svg.utils.DOMHelper;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;


/**
 * Implementation of the AsyncXmlLoader based on RequestBuilder.
 */
public class HttpRequestXmlLoader implements AsyncXmlLoader {

	@Override
	public void loadResource(final String resourceUrl, final AsyncXmlLoaderCallback callback) {
		String currentResourceUrl = resourceUrl + ((resourceUrl.indexOf("?") == -1) ? ("?ts=" + System.currentTimeMillis()) : ("&ts=" + + System.currentTimeMillis()));
		RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET, currentResourceUrl);
		requestBuilder.setCallback(new RequestCallback() {
			public void onError(Request request, Throwable exception) {
				callback.onError(resourceUrl, exception);
			}

			private void onSuccess(Request request, Response response) {
				SVGParserImpl impl = GWT.create(SVGParserImpl.class);
				Element root = impl.parse(response.getText());
				callback.onSuccess(resourceUrl, root);
			}
			
			public void onResponseReceived(Request request, Response response) {
				if (response.getStatusCode() == Response.SC_OK) {
					onSuccess(request, response);
				} else {
					onError(request, null);
				}
			}
		});
		try {
			requestBuilder.send();
		} catch (RequestException e) {
			GWT.log("Cannot fetch " + resourceUrl, e);
		}
	}
}
