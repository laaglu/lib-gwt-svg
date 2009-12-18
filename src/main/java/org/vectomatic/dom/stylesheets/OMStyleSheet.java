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
package org.vectomatic.dom.stylesheets;
public class OMStyleSheet extends com.google.gwt.core.client.JavaScriptObject {
  protected OMStyleSheet() {
  }

  // Implementation of the nsIDOMStyleSheet XPCOM interface
  public final native java.lang.String getType() /*-{
    return this.type;
  }-*/;
  public final native boolean getDisabled() /*-{
    return this.disabled;
  }-*/;
  public final native void setDisabled(boolean value) /*-{
    this.disabled = value;
  }-*/;
  public final native org.vectomatic.dom.OMNode getOwnerNode() /*-{
    return this.ownerNode;
  }-*/;
  public final native org.vectomatic.dom.stylesheets.OMStyleSheet getParentStyleSheet() /*-{
    return this.parentStyleSheet;
  }-*/;
  public final native java.lang.String getHref() /*-{
    return this.href;
  }-*/;
  public final native java.lang.String getTitle() /*-{
    return this.title;
  }-*/;
  public final native org.vectomatic.dom.stylesheets.OMMediaList getMedia() /*-{
    return this.media;
  }-*/;

}
