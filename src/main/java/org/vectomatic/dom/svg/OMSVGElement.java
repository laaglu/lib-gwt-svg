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
package org.vectomatic.dom.svg;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DomEvent;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;

public class OMSVGElement extends org.vectomatic.dom.OMElement {
  protected OMSVGElement() {
  }

  // Implementation of the nsIDOMSVGElement XPCOM interface
  public final native java.lang.String getId() /*-{
    return this.id;
  }-*/;
  public final native void setId(java.lang.String value) /*-{
    this.id = value;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGSVGElement getOwnerSVGElement() /*-{
    return this.ownerSVGElement;
  }-*/;
  public final native org.vectomatic.dom.svg.OMSVGElement getViewportElement() /*-{
    return this.viewportElement;
  }-*/;


// 
//  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
//	return new EventBridge((Element)this.cast()).addDomHandler(handler, MouseOutEvent.getType());
//  }
//
//  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
//		return new EventBridge((Element)this.cast()).addDomHandler(handler, MouseOverEvent.getType());
//  }
//
//
//  
//  private static class EventBridge implements EventListener,
//			HasMouseOutHandlers, HasMouseOverHandlers {
//		HandlerManager handlerManager;
//
//		Element element;
//		public EventBridge(Element element) {
//			this.element = element;
//			DOM.setEventListener(element, this);
//		}
//		public void onBrowserEvent(Event event) {
//		    switch (DOM.eventGetType(event)) {
//		      case Event.ONMOUSEOVER:
//		        // Only fire the mouse over event if it's coming from outside this
//		        // widget.
//		      case Event.ONMOUSEOUT:
//		        // Only fire the mouse out event if it's leaving this
//		        // widget.
//		        com.google.gwt.dom.client.Element related = event.getRelatedTarget();
//		        if (related != null && element.isOrHasChild(related)) {
//		          return;
//		        }
//		        break;
//		    }
//		    DomEvent.fireNativeEvent(event, this, element);
//		}
//
//
//		public void fireEvent(GwtEvent<?> event) {
//		    if (handlerManager != null) {
//		        handlerManager.fireEvent(event);
//		      }
//		}
//		
//		public HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
//			return addDomHandler(handler, MouseOutEvent.getType());
//		}
//
//		public HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
//			return addDomHandler(handler, MouseOverEvent.getType());
//		}
//
//		HandlerManager ensureHandlers() {
//			return handlerManager == null ? handlerManager = new HandlerManager(
//					this)
//					: handlerManager;
//		}
//
//  	    protected final <H extends EventHandler> HandlerRegistration addDomHandler(
//			      final H handler, DomEvent.Type<H> type) {
//		    assert handler != null : "handler must not be null";
//		    assert type != null : "type must not be null";
//		    sinkEvents(Event.getTypeInt(type.getName()));
//		    return ensureHandlers().addHandler(type, handler);
//		}
//  	    
//  	  public final void sinkEvents(int eventBitsToAdd) {
//  	    DOM.sinkEvents(element, eventBitsToAdd | DOM.getEventsSunk(element));
//  	  } 
//	}
//
//  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
//	return attach().addDomHandler(handler, MouseOutEvent.getType(), (Element)this.cast());
//  }
//
//  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
//	return attach().addDomHandler(handler, MouseOverEvent.getType(), (Element)this.cast());
//  }
//  public final EventBridge attach() {
//	EventBridge bridge = getEventBridge();
//	if (bridge == null) {
//	  bridge = new EventBridge();
//	  DOM.setEventListener((Element)this.cast(), bridge);
//	  setEventBridge(bridge);
//	}
//	return bridge;
//  }
//  public final void detach() {
//    setEventBridge(null);
//  }
//  
//  private final native EventBridge getEventBridge() /*-{
//    return this.bridge;
//  }-*/;
//  private final native void setEventBridge(EventBridge value) /*-{
//    this.bridge = value;
//  }-*/;
//
//  
//  private static class EventBridge implements EventListener,
//			HasHandlers {
//		HandlerManager handlerManager;
//
//		public EventBridge() {
//		}
//		public void onBrowserEvent(Event event) {
//		    switch (DOM.eventGetType(event)) {
//		      case Event.ONMOUSEOVER:
//		        // Only fire the mouse over event if it's coming from outside this
//		        // widget.
//		      case Event.ONMOUSEOUT:
//		        // Only fire the mouse out event if it's leaving this
//		        // widget.
//		        com.google.gwt.dom.client.Element related = event.getRelatedTarget();
//		        if (related != null && event.getTarget().isOrHasChild(related)) {
//		          return;
//		        }
//		        break;
//		    }
//		    DomEvent.fireNativeEvent(event, this, event.getTarget());
//		}
//
//
//		public void fireEvent(GwtEvent<?> event) {
//		    if (handlerManager != null) {
//		        handlerManager.fireEvent(event);
//		      }
//		}
//		
//		public HandlerRegistration addMouseOutHandler(MouseOutHandler handler, final Element element) {
//			return addDomHandler(handler, MouseOutEvent.getType(), element);
//		}
//
//		public HandlerRegistration addMouseOverHandler(MouseOverHandler handler, final Element element) {
//			return addDomHandler(handler, MouseOverEvent.getType(), element);
//		}
//
//		HandlerManager ensureHandlers() {
//			return handlerManager == null ? handlerManager = new HandlerManager(
//					this)
//					: handlerManager;
//		}
//
//  	    protected final <H extends EventHandler> HandlerRegistration addDomHandler(
//			      final H handler, DomEvent.Type<H> type,
//			      final Element element) {
//		    assert handler != null : "handler must not be null";
//		    assert type != null : "type must not be null";
//	  	    DOM.sinkEvents(element, Event.getTypeInt(type.getName()) | DOM.getEventsSunk(element));
//		    return ensureHandlers().addHandler(type, handler);
//		}
//  
//	}

  public final HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
    return attach().addDomHandler(handler, MouseDownEvent.getType(), (Element)this.cast());
  }
  public final HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
	return attach().addDomHandler(handler, MouseMoveEvent.getType(), (Element)this.cast());
  }
  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
	return attach().addDomHandler(handler, MouseOutEvent.getType(), (Element)this.cast());
  }
  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
	return attach().addDomHandler(handler, MouseOverEvent.getType(), (Element)this.cast());
  }
  public final HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
	return attach().addDomHandler(handler, MouseUpEvent.getType(), (Element)this.cast());
  }
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
	return attach().addDomHandler(handler, ClickEvent.getType(), (Element)this.cast());
  }
  public final HandlerRegistration addLoadHandler(LoadHandler handler) {
	return attach().addDomHandler(handler, LoadEvent.getType(), (Element)this.cast());
  }

  public final EventBridge attach() {
	EventBridge bridge = (EventBridge) DOM.getEventListener((Element)this.cast());
	if (bridge == null) {
	  bridge = new EventBridge();
	  DOM.setEventListener((Element)this.cast(), bridge);
	}
	return bridge;
  }
  
  private static class EventBridge implements EventListener,
			HasHandlers {
		HandlerManager handlerManager;

		public EventBridge() {
		}
		public void onBrowserEvent(Event event) {
		    switch (DOM.eventGetType(event)) {
		      case Event.ONMOUSEOVER:
		        // Only fire the mouse over event if it's coming from outside this
		        // widget.
		      case Event.ONMOUSEOUT:
		        // Only fire the mouse out event if it's leaving this
		        // widget.
		        com.google.gwt.dom.client.Element related = event.getRelatedTarget();
		        if (related != null && event.getTarget().isOrHasChild(related)) {
		          return;
		        }
		        break;
		    }
		    DomEvent.fireNativeEvent(event, this, event.getTarget());
		}


		public void fireEvent(GwtEvent<?> event) {
		    if (handlerManager != null) {
		        handlerManager.fireEvent(event);
		      }
		}

		HandlerManager ensureHandlers() {
			return handlerManager == null ? handlerManager = new HandlerManager(
					this)
					: handlerManager;
		}

  	    protected final <H extends EventHandler> HandlerRegistration addDomHandler(
			      final H handler, DomEvent.Type<H> type,
			      final Element element) {
		    assert handler != null : "handler must not be null";
		    assert type != null : "type must not be null";
	  	    DOM.sinkEvents(element, Event.getTypeInt(type.getName()) | DOM.getEventsSunk(element));
		    return ensureHandlers().addHandler(type, handler);
		}
  
	}
}
