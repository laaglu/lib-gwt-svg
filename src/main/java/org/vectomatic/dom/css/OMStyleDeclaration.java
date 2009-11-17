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
package org.vectomatic.dom.css;
public class OMStyleDeclaration extends com.google.gwt.core.client.JavaScriptObject {
  protected OMStyleDeclaration() {
  }

  // Implementation of the nsIDOMCSSStyleDeclaration XPCOM interface
  public final native java.lang.String getCssText() /*-{
    return this.cssText;
  }-*/;
  public final native void setCssText(java.lang.String value) /*-{
    this.cssText = value;
  }-*/;
  public final native int getLength() /*-{
    return this.length;
  }-*/;
  public final native org.vectomatic.dom.css.OMRule getParentRule() /*-{
    return this.parentRule;
  }-*/;
  public final native java.lang.String getPropertyValue(java.lang.String propertyName) /*-{
    return this.getPropertyValue(propertyName);
  }-*/;
  public final native org.vectomatic.dom.css.OMValue getPropertyCSSValue(java.lang.String propertyName) /*-{
    return this.getPropertyCSSValue(propertyName);
  }-*/;
  public final native java.lang.String removeProperty(java.lang.String propertyName) /*-{
    return this.removeProperty(propertyName);
  }-*/;
  public final native java.lang.String getPropertyPriority(java.lang.String propertyName) /*-{
    return this.getPropertyPriority(propertyName);
  }-*/;
  public final native void setProperty(java.lang.String propertyName, java.lang.String value, java.lang.String priority) /*-{
    this.setProperty(propertyName, value, priority);
  }-*/;
  public final native java.lang.String item(int index) /*-{
    return this.item(index);
  }-*/;

}
