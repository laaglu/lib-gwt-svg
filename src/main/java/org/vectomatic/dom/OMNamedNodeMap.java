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
public class OMNamedNodeMap extends com.google.gwt.core.client.JavaScriptObject {
  protected OMNamedNodeMap() {
  }

  // Implementation of the nsIDOMNamedNodeMap XPCOM interface
  public final native int getLength() /*-{
    return this.length;
  }-*/;
  public final native org.vectomatic.dom.OMNode getNamedItem(java.lang.String name) /*-{
    return this.getNamedItem(name);
  }-*/;
  public final native org.vectomatic.dom.OMNode setNamedItem(org.vectomatic.dom.OMNode arg) /*-{
    return this.setNamedItem(arg);
  }-*/;
  public final native org.vectomatic.dom.OMNode removeNamedItem(java.lang.String name) /*-{
    return this.removeNamedItem(name);
  }-*/;
  public final native org.vectomatic.dom.OMNode item(int index) /*-{
    return this.item(index);
  }-*/;
  public final native org.vectomatic.dom.OMNode getNamedItemNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.getNamedItemNS(namespaceURI, localName);
  }-*/;
  public final native org.vectomatic.dom.OMNode setNamedItemNS(org.vectomatic.dom.OMNode arg) /*-{
    return this.setNamedItemNS(arg);
  }-*/;
  public final native org.vectomatic.dom.OMNode removeNamedItemNS(java.lang.String namespaceURI, java.lang.String localName) /*-{
    return this.removeNamedItemNS(namespaceURI, localName);
  }-*/;

}
