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

import org.vectomatic.dom.svg.OMSVGPathSegList;

  /**
   * <p>The SVGAnimatedPathData interface supports elements which have a <span
   * class='attr-name'>'d'</span> attribute which holds SVG path data, and supports
   * the ability to animate that attribute.</p> <p>The {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData}
   * interface provides two lists to access and modify the base (i.e., static)
   * contents of the <span class='attr-name'>'d'</span> attribute:</p> <ul>
   * <li>DOM attribute {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}
   * provides access to the static/base   contents of the <span class='attr-name'>'d'</span>
   * attribute in a form which matches one-for-one   with SVG's syntax.</li>
   * <li>DOM attribute {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getNormalizedPathSegList()}
   * provides normalized access   to the static/base contents of the <span class='attr-name'>'d'</span>
   * attribute where all path   data commands are expressed in terms of the
   * following subset of   {@link org.vectomatic.dom.svg.OMSVGPathSeg} types:
   * SVG_PATHSEG_MOVETO_ABS (M),   SVG_PATHSEG_LINETO_ABS (L),   SVG_PATHSEG_CURVETO_CUBIC_ABS
   * (C) and   SVG_PATHSEG_CLOSEPATH (z).</li> </ul> <p>and two lists to access
   * the current animated values of the <span class='attr-name'>'d'</span> attribute:</p>
   * <ul>   <li>DOM attribute {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getAnimatedPathSegList()}
   * provides access to the current   animated contents of the <span class='attr-name'>'d'</span>
   * attribute in a form which matches   one-for-one with SVG's syntax.</li>
   * <li>DOM attribute {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getAnimatedNormalizedPathSegList()}
   * provides   normalized access to the current animated contents of the <span
   * class='attr-name'>'d'</span>   attribute where all path data commands are
   * expressed in terms of the   following subset of {@link org.vectomatic.dom.svg.OMSVGPathSeg}
   * types:   SVG_PATHSEG_MOVETO_ABS (M),   SVG_PATHSEG_LINETO_ABS (L),   SVG_PATHSEG_CURVETO_CUBIC_ABS
   * (C) and   SVG_PATHSEG_CLOSEPATH (z).</li> </ul> <p>Each of the two lists
   * are always kept synchronized. Modifications to one list will immediately
   * cause the corresponding list to be modified. Modifications to {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getNormalizedPathSegList()}
   * might cause entries in {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}
   * to be broken into a set of normalized path segments.</p> <p>Additionally,
   * the <code>path/d</code> attribute on the <a href='http://www.w3.org/TR/SVG11/paths.html#PathElement'
   * title='path element specification'>path</a> element accessed via the XML
   * DOM (e.g., using the <code>getAttribute()</code> method call) will reflect
   * any changes made to {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}
   * or {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getNormalizedPathSegList()}.</p>
   */
public interface ISVGAnimatedPathData {
  /**
   * Provides access to the base (i.e., static) contents of the <span class='attr-name'>'d'</span>
   * attribute in a form which matches one-for-one with SVG's syntax. Thus,
   * if the <span class='attr-name'>'d'</span> attribute has an "absolute moveto
   * (M)" and an "absolute arcto (A)" command, then {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}
   * will have two entries: a SVG_PATHSEG_MOVETO_ABS and a SVG_PATHSEG_ARC_ABS.
   */
  public OMSVGPathSegList getPathSegList();
  /**
   * <p>Provides access to the base (i.e., static) contents of the <span class='attr-name'>'d'</span>
   * attribute in a form where all path data commands are expressed in terms
   * of the following subset of {@link org.vectomatic.dom.svg.OMSVGPathSeg}
   * types: SVG_PATHSEG_MOVETO_ABS (M), SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS
   * (C) and SVG_PATHSEG_CLOSEPATH (z). Thus, if the <span class='attr-name'>'d'</span>
   * attribute has an "absolute moveto (M)" and an "absolute arcto (A)" command,
   * then pathSegList will have one SVG_PATHSEG_MOVETO_ABS entry followed by
   * a series of SVG_PATHSEG_LINETO_ABS entries which approximate the arc. This
   * alternate representation is available to provide a simpler interface to
   * developers who would benefit from a more limited set of commands.</p> <p>The
   * only valid {@link org.vectomatic.dom.svg.OMSVGPathSeg} types are SVG_PATHSEG_MOVETO_ABS
   * (M), SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS (C) and
   * SVG_PATHSEG_CLOSEPATH (z).</p>
   */
  public OMSVGPathSegList getNormalizedPathSegList();
  /**
   * Provides access to the current animated contents of the <span class='attr-name'>'d'</span>
   * attribute in a form which matches one-for-one with SVG's syntax. If the
   * given attribute or property is being animated, contains the current animated
   * value of the attribute or property, and both the object itself and its
   * contents are read only. If the given attribute or property is not currently
   * being animated, contains the same value as {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getPathSegList()}.
   */
  public OMSVGPathSegList getAnimatedPathSegList();
  /**
   * Provides access to the current animated contents of the <span class='attr-name'>'d'</span>
   * attribute in a form where all path data commands are expressed in terms
   * of the following subset of {@link org.vectomatic.dom.svg.OMSVGPathSeg}
   * types: SVG_PATHSEG_MOVETO_ABS (M), SVG_PATHSEG_LINETO_ABS (L), SVG_PATHSEG_CURVETO_CUBIC_ABS
   * (C) and SVG_PATHSEG_CLOSEPATH (z). If the given attribute or property is
   * being animated, contains the current animated value of the attribute or
   * property, and both the object itself and its contents are read only. If
   * the given attribute or property is not currently being animated, contains
   * the same value as {@link org.vectomatic.dom.svg.itf.ISVGAnimatedPathData#getNormalizedPathSegList()}.
   */
  public OMSVGPathSegList getAnimatedNormalizedPathSegList();
}
