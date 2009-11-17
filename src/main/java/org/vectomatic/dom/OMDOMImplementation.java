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
package org.vectomatic.dom;
public class OMDOMImplementation extends com.google.gwt.core.client.JavaScriptObject {
  protected OMDOMImplementation() {
  }

  // Implementation of the nsIDOMDOMImplementation XPCOM interface
  public final native boolean hasFeature(java.lang.String feature, java.lang.String version) /*-{
    return this.hasFeature(feature, version);
  }-*/;
  public final native org.vectomatic.dom.OMDocumentType createDocumentType(java.lang.String qualifiedName, java.lang.String publicId, java.lang.String systemId) /*-{
    return this.createDocumentType(qualifiedName, publicId, systemId);
  }-*/;
  public final native org.vectomatic.dom.OMDocument createDocument(java.lang.String namespaceURI, java.lang.String qualifiedName, org.vectomatic.dom.OMDocumentType doctype) /*-{
    return this.createDocument(namespaceURI, qualifiedName, doctype);
  }-*/;

}
