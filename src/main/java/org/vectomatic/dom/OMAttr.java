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
public class OMAttr extends org.vectomatic.dom.OMNode {
  protected OMAttr() {
  }

  // Implementation of the nsIDOMAttr XPCOM interface
  public final native java.lang.String getName() /*-{
    return this.name;
  }-*/;
  public final native boolean getSpecified() /*-{
    return this.specified;
  }-*/;
  public final native java.lang.String getValue() /*-{
    return this.value;
  }-*/;
  public final native void setValue(java.lang.String value) /*-{
    this.value = value;
  }-*/;
  public final native org.vectomatic.dom.OMElement getOwnerElement() /*-{
    return this.ownerElement;
  }-*/;

}
