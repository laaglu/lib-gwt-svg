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
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom;
public class OMNode extends com.google.gwt.core.client.JavaScriptObject {
  protected OMNode() {
  }

  // Implementation of the nsIDOMNode XPCOM interface
  public final native java.lang.String getNodeName() /*-{
    return this.nodeName;
  }-*/;
  public final native java.lang.String getNodeValue() /*-{
    return this.nodeValue;
  }-*/;
  public final native void setNodeValue(java.lang.String value) /*-{
    this.nodeValue = value;
  }-*/;
  public final native short getNodeType() /*-{
    return this.nodeType;
  }-*/;
  public final native org.vectomatic.dom.OMNode getParentNode() /*-{
    return this.parentNode;
  }-*/;
  public final native org.vectomatic.dom.OMNodeList getChildNodes() /*-{
    return this.childNodes;
  }-*/;
  public final native org.vectomatic.dom.OMNode getFirstChild() /*-{
    return this.firstChild;
  }-*/;
  public final native org.vectomatic.dom.OMNode getLastChild() /*-{
    return this.lastChild;
  }-*/;
  public final native org.vectomatic.dom.OMNode getPreviousSibling() /*-{
    return this.previousSibling;
  }-*/;
  public final native org.vectomatic.dom.OMNode getNextSibling() /*-{
    return this.nextSibling;
  }-*/;
  public final native org.vectomatic.dom.OMNamedNodeMap getAttributes() /*-{
    return this.attributes;
  }-*/;
  public final native org.vectomatic.dom.OMDocument getOwnerDocument() /*-{
    return this.ownerDocument;
  }-*/;
  public final native java.lang.String getNamespaceURI() /*-{
    return this.namespaceURI;
  }-*/;
  public final native java.lang.String getPrefix() /*-{
    return this.prefix;
  }-*/;
  public final native void setPrefix(java.lang.String value) /*-{
    this.prefix = value;
  }-*/;
  public final native java.lang.String getLocalName() /*-{
    return this.localName;
  }-*/;
  public final native org.vectomatic.dom.OMNode insertBefore(org.vectomatic.dom.OMNode newChild, org.vectomatic.dom.OMNode refChild) /*-{
    return this.insertBefore(newChild, refChild);
  }-*/;
  public final native org.vectomatic.dom.OMNode replaceChild(org.vectomatic.dom.OMNode newChild, org.vectomatic.dom.OMNode oldChild) /*-{
    return this.replaceChild(newChild, oldChild);
  }-*/;
  public final native org.vectomatic.dom.OMNode removeChild(org.vectomatic.dom.OMNode oldChild) /*-{
    return this.removeChild(oldChild);
  }-*/;
  public final native org.vectomatic.dom.OMNode appendChild(org.vectomatic.dom.OMNode newChild) /*-{
    return this.appendChild(newChild);
  }-*/;
  public final native boolean hasChildNodes() /*-{
    return this.hasChildNodes();
  }-*/;
  public final native org.vectomatic.dom.OMNode cloneNode(boolean deep) /*-{
    return this.cloneNode(deep);
  }-*/;
  public final native void normalize() /*-{
    this.normalize();
  }-*/;
  public final native boolean isSupported(java.lang.String feature, java.lang.String version) /*-{
    return this.isSupported(feature, version);
  }-*/;
  public final native boolean hasAttributes() /*-{
    return this.hasAttributes();
  }-*/;

}
