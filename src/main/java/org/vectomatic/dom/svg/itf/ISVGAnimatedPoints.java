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
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg.itf;

import org.vectomatic.dom.svg.OMSVGPointList;

  /**
   * <p>The {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPoints} interface
   * supports elements which have a <span class='attr-name'>'points'</span>
   * attribute which holds a list of coordinate values and which support the
   * ability to animate that attribute.</p> <p>Additionally, the <span class='attr-name'>'points'</span>
   * attribute on the original element accessed via the XML DOM (e.g., using
   * the <code>getAttribute()</code> method call) will reflect any changes made
   * to {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPoints#getPoints()}.</p>
   */
public interface ISVGAnimatedPoints {
  /**
   * Provides access to the base (i.e., static) contents of the <span class='attr-name'>'points'</span>
   * attribute.
   */
  public OMSVGPointList getPoints();
  /**
   * Provides access to the current animated contents of the <span class='attr-name'>'points'</span>
   * attribute. If the given attribute or property is being animated, contains
   * the current animated value of the attribute or property. If the given attribute
   * or property is not currently being animated, contains the same value as
   * {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPoints#getPoints()}.
   */
  public OMSVGPointList getAnimatedPoints();
}
