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
package org.vectomatic.dom.css;
public class OMRect extends com.google.gwt.core.client.JavaScriptObject {
  protected OMRect() {
  }

  // Implementation of the nsIDOMRect XPCOM interface
  public final native org.vectomatic.dom.css.OMPrimitiveValue getTop() /*-{
    return this.top;
  }-*/;
  public final native org.vectomatic.dom.css.OMPrimitiveValue getRight() /*-{
    return this.right;
  }-*/;
  public final native org.vectomatic.dom.css.OMPrimitiveValue getBottom() /*-{
    return this.bottom;
  }-*/;
  public final native org.vectomatic.dom.css.OMPrimitiveValue getLeft() /*-{
    return this.left;
  }-*/;

}
