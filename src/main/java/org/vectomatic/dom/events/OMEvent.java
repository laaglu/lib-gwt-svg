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
package org.vectomatic.dom.events;
public class OMEvent extends com.google.gwt.core.client.JavaScriptObject {
  protected OMEvent() {
  }

  // Implementation of the nsIDOMEvent XPCOM interface
  public final native java.lang.String getType() /*-{
    return this.type;
  }-*/;
  public final native org.vectomatic.dom.events.OMEventTarget getTarget() /*-{
    return this.target;
  }-*/;
  public final native org.vectomatic.dom.events.OMEventTarget getCurrentTarget() /*-{
    return this.currentTarget;
  }-*/;
  public final native short getEventPhase() /*-{
    return this.eventPhase;
  }-*/;
  public final native boolean getBubbles() /*-{
    return this.bubbles;
  }-*/;
  public final native boolean getCancelable() /*-{
    return this.cancelable;
  }-*/;
  public final native double getTimeStamp() /*-{
    return this.timeStamp;
  }-*/;
  public final native void stopPropagation() /*-{
    this.stopPropagation();
  }-*/;
  public final native void preventDefault() /*-{
    this.preventDefault();
  }-*/;
  public final native void initEvent(java.lang.String eventTypeArg, boolean canBubbleArg, boolean cancelableArg) /*-{
    this.initEvent(eventTypeArg, canBubbleArg, cancelableArg);
  }-*/;

}
