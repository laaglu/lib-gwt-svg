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
public class OMDocument extends org.vectomatic.dom.OMNode {
  protected OMDocument() {
  }

  // Implementation of the nsIDOMDocument XPCOM interface
  public final native org.vectomatic.dom.OMDocumentType getDoctype() /*-{
    return this.doctype;
  }-*/;
  public final native org.vectomatic.dom.OMDOMImplementation getImplementation() /*-{
    return this.implementation;
  }-*/;
  public final native org.vectomatic.dom.OMElement getDocumentElement() /*-{
    return this.documentElement;
  }-*/;
  public final native org.vectomatic.dom.OMElement createElement(java.lang.String tagName) /*-{
    return this.createElement(tagName);
  }-*/;
  public final native org.vectomatic.dom.OMDocumentFragment createDocumentFragment() /*-{
    return this.createDocumentFragment();
  }-*/;
  public final native org.vectomatic.dom.OMText createTextNode(java.lang.String data) /*-{
    return this.createTextNode(data);
  }-*/;
  public final native org.vectomatic.dom.OMComment createComment(java.lang.String data) /*-{
    return this.createComment(data);
  }-*/;
  public final native org.vectomatic.dom.OMCDATASection createCDATASection(java.lang.String data) /*-{
    return this.createCDATASection(data);
  }-*/;
  public final native org.vectomatic.dom.OMProcessingInstruction createProcessingInstruction(java.lang.String target, java.lang.String data) /*-{
    return this.createProcessingInstruction(target, data);
  }-*/;
  public final native org.vectomatic.dom.OMAttr createAttribute(java.lang.String name) /*-{
    return this.createAttribute(name);
  }-*/;
  public final native org.vectomatic.dom.OMEntityReference createEntityReference(java.lang.String name) /*-{
    return this.createEntityReference(name);
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getElementsByTagName(java.lang.String tagname) /*-{
    return this.getElementsByTagName(tagname);
  }-*/;
  public final native org.vectomatic.dom.OMNode importNode(org.vectomatic.dom.OMNode importedNode, boolean deep) /*-{
    return this.importNode(importedNode, deep);
  }-*/;
  public final native org.vectomatic.dom.OMElement createElementNS(java.lang.String namespaceURI, java.lang.String qualifiedName) /*-{
    return this.createElementNS(namespaceURI, qualifiedName);
  }-*/;
  public final native org.vectomatic.dom.OMAttr createAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName) /*-{
    return this.createAttributeNS(namespaceURI, qualifiedName);
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.getElementsByTagNameNS(namespaceURI, localName);
  }-*/;
  public final native org.vectomatic.dom.OMElement getElementById(java.lang.String elementId) /*-{
    return this.getElementById(elementId);
  }-*/;

}
