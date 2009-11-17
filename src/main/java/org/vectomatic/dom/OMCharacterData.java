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
public class OMCharacterData extends org.vectomatic.dom.OMNode {
  protected OMCharacterData() {
  }

  // Implementation of the nsIDOMCharacterData XPCOM interface
  public final native java.lang.String getData() /*-{
    return this.data;
  }-*/;
  public final native void setData(java.lang.String value) /*-{
    this.data = value;
  }-*/;
  public final native int getLength() /*-{
    return this.length;
  }-*/;
  public final native java.lang.String substringData(int offset, int count) /*-{
    return this.substringData(offset, count);
  }-*/;
  public final native void appendData(java.lang.String arg) /*-{
    this.appendData(arg);
  }-*/;
  public final native void insertData(int offset, java.lang.String arg) /*-{
    this.insertData(offset, arg);
  }-*/;
  public final native void deleteData(int offset, int count) /*-{
    this.deleteData(offset, count);
  }-*/;
  public final native void replaceData(int offset, int count, java.lang.String arg) /*-{
    this.replaceData(offset, count, arg);
  }-*/;

}
