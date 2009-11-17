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
public class OMDocumentType extends org.vectomatic.dom.OMNode {
  protected OMDocumentType() {
  }

  // Implementation of the nsIDOMDocumentType XPCOM interface
  public final native java.lang.String getName() /*-{
    return this.name;
  }-*/;
  public final native org.vectomatic.dom.OMNamedNodeMap getEntities() /*-{
    return this.entities;
  }-*/;
  public final native org.vectomatic.dom.OMNamedNodeMap getNotations() /*-{
    return this.notations;
  }-*/;
  public final native java.lang.String getPublicId() /*-{
    return this.publicId;
  }-*/;
  public final native java.lang.String getSystemId() /*-{
    return this.systemId;
  }-*/;
  public final native java.lang.String getInternalSubset() /*-{
    return this.internalSubset;
  }-*/;

}
