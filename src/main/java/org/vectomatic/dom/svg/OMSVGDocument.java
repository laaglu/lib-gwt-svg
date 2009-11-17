/**********************************************
 * Copyright (C) 2009 Lukas Laag
 * This file is part of libgwtsvg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with libgwtsvg.  If not, see <http://www.gnu.org/licenses/>
 **********************************************/
package org.vectomatic.dom.svg;
public class OMSVGDocument extends org.vectomatic.dom.OMDocument {
  private static final String NS_SVG = "http://www.w3.org/2000/svg";
  private static final String NS_XLINK = "http://www.w3.org/1999/xlink";
  
  protected OMSVGDocument() {
  }

  // Implementation of the nsIDOMSVGDocument XPCOM interface
  public final native java.lang.String getTitle() /*-{
    return this.title;
  }-*/;
  public final native java.lang.String getReferrer() /*-{
    return this.referrer;
  }-*/;
  public final native java.lang.String getDomain() /*-{
    return this.domain;
  }-*/;
  public final native java.lang.String getURL() /*-{
    return this.URL;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGSVGElement getRootElement() /*-{
    return this.rootElement;
  }-*/;

  // Implementation of the nsIDOMDocumentEvent XPCOM interface
  public final native org.vectomatic.dom.events.OMEvent createEvent(java.lang.String eventType) /*-{
    return this.createEvent(eventType);
  }-*/;
}
