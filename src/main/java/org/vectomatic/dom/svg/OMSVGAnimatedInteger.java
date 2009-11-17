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
public class OMSVGAnimatedInteger extends com.google.gwt.core.client.JavaScriptObject {
  protected OMSVGAnimatedInteger() {
  }

  // Implementation of the nsIDOMSVGAnimatedInteger XPCOM interface
  public final native int getBaseVal() /*-{
    return this.baseVal;
  }-*/;
  public final native void setBaseVal(int value) /*-{
    this.baseVal = value;
  }-*/;
  public final native int getAnimVal() /*-{
    return this.animVal;
  }-*/;

}
