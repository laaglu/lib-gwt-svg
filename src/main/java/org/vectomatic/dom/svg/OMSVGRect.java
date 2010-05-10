/**********************************************
 * Copyright (C) 2010 Lukas Laag
 * This file is part of lib-gwt-svg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
package org.vectomatic.dom.svg;

import com.google.gwt.core.client.JavaScriptObject;

public class OMSVGRect extends JavaScriptObject {
  protected OMSVGRect() {
  }

  // Implementation of the svg::SVGRect W3C IDL interface
  public final native float getX() /*-{
    return this.x;
  }-*/;
  public final native void setX(float value) /*-{
    this.x = value;
  }-*/;
  public final native float getY() /*-{
    return this.y;
  }-*/;
  public final native void setY(float value) /*-{
    this.y = value;
  }-*/;
  public final native float getWidth() /*-{
    return this.width;
  }-*/;
  public final native void setWidth(float value) /*-{
    this.width = value;
  }-*/;
  public final native float getHeight() /*-{
    return this.height;
  }-*/;
  public final native void setHeight(float value) /*-{
    this.height = value;
  }-*/;

  // Helper methods
  public final float getCenterX() {
	return getX() + 0.5f * getWidth();
  }
  public final float getCenterY() {
	return getY() + 0.5f * getHeight();
  }
  public final float getMaxX() {
	return getX() + getWidth();
  }
  public final float getMaxY() {
	return getY() + getHeight();
  }
  public final OMSVGRect intersection(OMSVGRect r) {
	  return intersection(r, this);
  }
  public final OMSVGRect intersection(OMSVGRect r, OMSVGRect destination) {
	if (r.getX() <= getX() && r.getX() <= getMaxX()) {
		if (r.getY() <= getY() && r.getY() <= getMaxY()) {
			destination.setWidth(getMaxX() - r.getX());
			destination.setX(r.getX());
			destination.setHeight(getMaxY() - r.getY());
			destination.setY(r.getY());
			return destination;
		} else if (getY() <= r.getY() && getY() <= r.getMaxY()) {
			destination.setWidth(getMaxX() - r.getX());
			destination.setX(r.getX());
			destination.setHeight(r.getMaxY() - getY());
			destination.setY(getY());
			return destination;
		}
	} else if (getX() <= r.getX() && getX() <= r.getMaxX()) {
		if (r.getY() <= getY() && r.getY() <= getMaxY()) {
			destination.setWidth(r.getMaxX() - getX());
			destination.setX(getX());
			destination.setHeight(getMaxY() - r.getY());
			destination.setY(r.getY());
			return destination;
		} else if (getY() <= r.getY() && getY() <= r.getMaxY()) {
			destination.setWidth(r.getMaxX() - getX());
			destination.setX(getX());
			destination.setHeight(r.getMaxY() - getY());
			destination.setY(getY());
			return destination;
		}
	}
	return null;
  }
  public final OMSVGRect union(OMSVGRect r) {
	  return union(r, this);
  }
  public final OMSVGRect union(OMSVGRect r, OMSVGRect destination) {
	  destination.setX(Math.min(getX(), r.getX()));
	  destination.setY(Math.min(getY(), r.getY()));
	  destination.setWidth(Math.max(getMaxX(), r.getMaxX()) - destination.getX());
	  destination.setHeight(Math.max(getMaxY(), r.getMaxY()) - destination.getY());
	  return destination;
  }
  public final boolean contains(OMSVGPoint p) {
	  return p.getX() >= getX() && p.getY() >= getY() && p.getX() <= getMaxX() && p.getY() <= getMaxY();
  }
  public final native OMSVGRect assignTo(OMSVGRect destination) /*-{
	  destination.x = this.x;
	  destination.y = this.y;
	  destination.width = this.width;
	  destination.height = this.height;
	  return destination;
  }-*/;
  public final String getDescription() {
	  StringBuilder builder = new StringBuilder("{");
	  builder.append(getX());
	  builder.append(" ");
	  builder.append(getY());
	  builder.append(" ");
	  builder.append(getWidth());
	  builder.append(" ");
	  builder.append(getHeight());
	  builder.append("}");
	  return builder.toString();
  }
}
