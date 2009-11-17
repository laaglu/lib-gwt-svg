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
public class OMElement extends org.vectomatic.dom.OMNode {
  protected OMElement() {
  }

  // Implementation of the nsIDOMElement XPCOM interface
  public final native java.lang.String getTagName() /*-{
    return this.tagName;
  }-*/;
  public final native java.lang.String getAttribute(java.lang.String name) /*-{
    return this.getAttribute(name);
  }-*/;
  public final native void setAttribute(java.lang.String name, java.lang.String value) /*-{
    this.setAttribute(name, value);
  }-*/;
  public final native void removeAttribute(java.lang.String name) /*-{
    this.removeAttribute(name);
  }-*/;
  public final native org.vectomatic.dom.OMAttr getAttributeNode(java.lang.String name) /*-{
    return this.getAttributeNode(name);
  }-*/;
  public final native org.vectomatic.dom.OMAttr setAttributeNode(org.vectomatic.dom.OMAttr newAttr) /*-{
    return this.setAttributeNode(newAttr);
  }-*/;
  public final native org.vectomatic.dom.OMAttr removeAttributeNode(org.vectomatic.dom.OMAttr oldAttr) /*-{
    return this.removeAttributeNode(oldAttr);
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getElementsByTagName(java.lang.String name) /*-{
    return this.getElementsByTagName(name);
  }-*/;
  public final native java.lang.String getAttributeNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.getAttributeNS(namespaceURI, localName);
  }-*/;
  public final native void setAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName, java.lang.String value) /*-{
    this.setAttributeNS(namespaceURI, qualifiedName, value);
  }-*/;
  public final native void removeAttributeNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    this.removeAttributeNS(namespaceURI, localName);
  }-*/;
  public final native org.vectomatic.dom.OMAttr getAttributeNodeNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.getAttributeNodeNS(namespaceURI, localName);
  }-*/;
  public final native org.vectomatic.dom.OMAttr setAttributeNodeNS(org.vectomatic.dom.OMAttr newAttr) /*-{
    return this.setAttributeNodeNS(newAttr);
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.getElementsByTagNameNS(namespaceURI, localName);
  }-*/;
  public final native boolean hasAttribute(java.lang.String name) /*-{
    return this.hasAttribute(name);
  }-*/;
  public final native boolean hasAttributeNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.hasAttributeNS(namespaceURI, localName);
  }-*/;

}
