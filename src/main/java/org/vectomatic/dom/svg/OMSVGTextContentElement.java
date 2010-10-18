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

package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.events.ActivateEvent;
import org.vectomatic.dom.svg.events.ActivateHandler;
import org.vectomatic.dom.svg.events.FocusInEvent;
import org.vectomatic.dom.svg.events.FocusInHandler;
import org.vectomatic.dom.svg.events.FocusOutEvent;
import org.vectomatic.dom.svg.events.FocusOutHandler;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.impl.SVGTextContentElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * <p>The {@link org.vectomatic.dom.svg.OMSVGTextContentElement} is inherited
 * by various text-related interfaces, such as {@link org.vectomatic.dom.svg.OMSVGTextElement},
 * {@link org.vectomatic.dom.svg.OMSVGTSpanElement}, {@link org.vectomatic.dom.svg.OMSVGTRefElement},
 * {@link org.vectomatic.dom.svg.OMSVGAltGlyphElement} and {@link org.vectomatic.dom.svg.OMSVGTextPathElement}.</p>
 * <p>For the methods on this interface that refer to an index to a character
 * or a number of characters, these references are to be interpreted as an
 * index to a UTF-16 code unit or a number of UTF-16 code units, respectively.
 * This is for consistency with DOM Level 2 Core, where methods on the <code>CharacterData</code>
 * interface use UTF-16 code units as indexes and counts within the character
 * data. Thus for example, if the text content of a <a href='http://www.w3.org/TR/SVG11/text.html#TextElement'
 * title='text element specification'>text</a> element is a single non-BMP
 * character, such as U+10000, then invoking {@link org.vectomatic.dom.svg.OMSVGTextContentElement#getNumberOfChars()}
 * on that element will return 2 since there are two UTF-16 code units (the
 * surrogate pair) used to represent that one character.</p>
 */
public abstract class OMSVGTextContentElement extends OMSVGElement implements HasGraphicalHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable {
  /**
   * The enumeration was set to a value that is not one of predefined types.
   * It is invalid to attempt to define a new value of this type or to attempt
   * to switch an existing value to this type.
   */
  public static final short LENGTHADJUST_UNKNOWN = 0;
  /**
   * Corresponds to value <span class='attr-value'>'spacing'</span>.
   */
  public static final short LENGTHADJUST_SPACING = 1;
  /**
   * Corresponds to value <span class='attr-value'>'spacingAndGlyphs'</span>.
   */
  public static final short LENGTHADJUST_SPACINGANDGLYPHS = 2;
  protected OMSVGTextContentElement(SVGTextContentElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGTextContentElement W3C IDL interface
  /**
   * Corresponds to attribute <span class='attr-name'>'textLength'</span> on
   * the given element.
   */
  public final OMSVGAnimatedLength getTextLength() {
    return ((SVGTextContentElement)ot).getTextLength();
  }
  /**
   * Corresponds to attribute <span class='attr-name'>'lengthAdjust'</span>
   * on the given element.  The value must be one of the length adjust constants
   * defined on this interface.
   */
  public final OMSVGAnimatedEnumeration getLengthAdjust() {
    return ((SVGTextContentElement)ot).getLengthAdjust();
  }
  /**
   * Returns the total number of characters available for rendering within the
   * current element, which includes referenced characters from <a href='http://www.w3.org/TR/SVG11/text.html#TRefElement'
   * title='tref element specification'>tref</a> reference, regardless of whether
   * they will be rendered. Effectively, this is equivalent to the length of
   * the <a href="http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407/core.html#Node3-textContent">Node::textContent</a>
   * attribute from DOM Level 3 Core ([<a href="refs.html#ref-DOM3">DOM3</a>],
   * section 1.4), if that attribute also expanded <a href='http://www.w3.org/TR/SVG11/text.html#TRefElement'
   * title='tref element specification'>tref</a> elements.
   * @return Total number of characters.
   */
  public final int getNumberOfChars() {
    return ((SVGTextContentElement)ot).getNumberOfChars();
  }
  /**
   * The total sum of all of the advance values from rendering all of the characters
   * within this element, including the advance value on the glyphs (horizontal
   * or vertical), the effect of properties <code>kerning</code>, <code>letter-spacing</code>
   * and <code>word-spacing</code> and adjustments due to attributes <code>tspan/dx</code>
   * and <code>tspan/dy</code> on <a href='http://www.w3.org/TR/SVG11/text.html#TSpanElement'
   * title='tspan element specification'>tspan</a> elements. For non-rendering
   * environments, the user agent shall make reasonable assumptions about glyph
   * metrics.
   * @return The text advance distance.
   */
  public final float getComputedTextLength() {
    return ((SVGTextContentElement)ot).getComputedTextLength();
  }
  /**
   * The total sum of all of the advance values from rendering the specified
   * substring of the characters, including the advance value on the glyphs
   * (horizontal or vertical), the effect of properties <code>kerning</code>,
   * <code>letter-spacing</code> and <code>word-spacing</code> and adjustments
   * due to attributes <code>tspan/dx</code> and <code>tspan/dy</code> on <a
   * href='http://www.w3.org/TR/SVG11/text.html#TSpanElement' title='tspan element
   * specification'>tspan</a> elements. For non-rendering environments, the
   * user agent shall make reasonable assumptions about glyph metrics.  If multiple
   * consecutive characters are rendered inseparably (e.g., as a single glyph
   * or a sequence of glyphs, or because the range encompasses half of a surrogate
   * pair), and nchars is greater than 0 then the measured range shall be expanded
   * so that each of the inseparable characters are included.
   * @param charnum The index of the first character in the substring, where
   * the first character has an index of 0.
   * @param nchars The number of characters in the substring. If nchars   specifies
   * more characters than are available, then the substring will   consist of
   * all characters starting with charnum until the end of the   list of characters.
   * @return The text advance distance.
   * @throws DOMException(INDEX_SIZE_ERR) Raised if <var>charnum</var> or  
   * <var>nchars</var> is negative or if <var>charnum</var> is greater than
   * or equal to the number of characters at this node.
   */
  public final float getSubStringLength(int charnum, int nchars) throws JavaScriptException {
    return ((SVGTextContentElement)ot).getSubStringLength(charnum, nchars);
  }
  /**
   * Returns the current text position before rendering the character in the
   * user coordinate system for rendering the glyph(s) that correspond to the
   * specified character. The current text position has already taken into account
   * the effects of any inter-character adjustments due to properties <code>kerning</code>,
   * <code>letter-spacing</code> and <code>word-spacing</code> and adjustments
   * due to attributes <span class='attr-name'>'x'</span>, <span class='attr-name'>'y'</span>,
   * <span class='attr-name'>'dx'</span> and <span class='attr-name'>'dy'</span>.
   * If multiple consecutive characters are rendered inseparably (e.g., as a
   * single glyph or a sequence of glyphs), then each of the inseparable characters
   * will return the start position for the first glyph.
   * @param charnum The index of the character, where the first character has
   * an index of 0.
   * @return The character's start position.
   * @throws DOMException(INDEX_SIZE_ERR) Raised if the <var>charnum</var> is
   * negative or if <var>charnum</var> is greater than or equal to the   number
   * of characters at this node.
   */
  public final OMSVGPoint getStartPositionOfChar(int charnum) throws JavaScriptException {
    return ((SVGTextContentElement)ot).getStartPositionOfChar(charnum);
  }
  /**
   * Returns the current text position after rendering the character in the
   * user coordinate system for rendering the glyph(s) that correspond to the
   * specified character. This current text position does <em>not</em> take
   * into account the effects of any inter-character adjustments to prepare
   * for the next character, such as properties <code>kerning</code>, <code>letter-spacing</code>
   * and <code>word-spacing</code> and adjustments due to attributes <span class='attr-name'>'x'</span>,
   * <span class='attr-name'>'y'</span>, <span class='attr-name'>'dx'</span>
   * and <span class='attr-name'>'dy'</span>. If multiple consecutive characters
   * are rendered inseparably (e.g., as a single glyph or a sequence of glyphs),
   * then each of the inseparable characters will return the end position for
   * the last glyph.
   * @param charnum The index of the character, where the first character has
   * an index of 0.
   * @return The character's end position.
   * @throws DOMException(INDEX_SIZE_ERR) Raised if the <var>charnum</var> is
   * negative or if <var>charnum</var> is greater than or equal to the   number
   * of characters at this node.
   */
  public final OMSVGPoint getEndPositionOfChar(int charnum) throws JavaScriptException {
    return ((SVGTextContentElement)ot).getEndPositionOfChar(charnum);
  }
  /**
   * Returns a tightest rectangle which defines the minimum and maximum X and
   * Y values in the user coordinate system for rendering the glyph(s) that
   * correspond to the specified character. The calculations assume that all
   * glyphs occupy the full standard glyph cell for the font. If multiple consecutive
   * characters are rendered inseparably (e.g., as a single glyph or a sequence
   * of glyphs), then each of the inseparable characters will return the same
   * extent.
   * @param charnum The index of the character, where the first character has
   * an index of 0.
   * @return The rectangle which encloses all of the rendered glyph(s).
   * @throws DOMException(INDEX_SIZE_ERR) Raised if the <var>charnum</var> is
   * negative or if <var>charnum</var> is greater than or equal to the   number
   * of characters at this node.
   */
  public final OMSVGRect getExtentOfChar(int charnum) throws JavaScriptException {
    return ((SVGTextContentElement)ot).getExtentOfChar(charnum);
  }
  /**
   * Returns the rotation value relative to the current user coordinate system
   * used to render the glyph(s) corresponding to the specified character. If
   * multiple glyph(s) are used to render the given character and the glyphs
   * each have different rotations (e.g., due to text-on-a-path), the user agent
   * shall return an average value (e.g., the rotation angle at the midpoint
   * along the path for all glyphs used to render this character). The rotation
   * value represents the rotation that is supplemental to any rotation due
   * to properties <code>glyph-orientation-horizontal</code> and <code>glyph-orientation-vertical</code>;
   * thus, any glyph rotations due to these properties are not included into
   * the returned rotation value. If multiple consecutive characters are rendered
   * inseparably (e.g., as a single glyph or a sequence of glyphs), then each
   * of the inseparable characters will return the same rotation value.
   * @param charnum The index of the character, where the first character has
   * an index of 0.
   * @return The rotation angle.
   * @throws DOMException(INDEX_SIZE_ERR) Raised if the <var>charnum</var> is
   * negative or if <var>charnum</var> is greater than or equal to the   number
   * of characters at this node.
   */
  public final float getRotationOfChar(int charnum) throws JavaScriptException {
    return ((SVGTextContentElement)ot).getRotationOfChar(charnum);
  }
  /**
   * Returns the index of the character whose corresponding glyph cell bounding
   * box contains the specified point. The calculations assume that all glyphs
   * occupy the full standard glyph cell for the font. If no such character
   * exists, a value of -1 is returned. If multiple such characters exist, the
   * character within the element whose glyphs were rendered last (i.e., take
   * into account any reordering such as for bidirectional text) is used. If
   * multiple consecutive characters are rendered inseparably (e.g., as a single
   * glyph or a sequence of glyphs), then the user agent shall allocate an equal
   * percentage of the text advance amount to each of the contributing characters
   * in determining which of the characters is chosen.
   * @param point A point in user space.
   * @return The index of the character which is at the given point, where 
   * the first character has an index of 0.
   */
  public final int getCharNumAtPosition(OMSVGPoint point) {
    return ((SVGTextContentElement)ot).getCharNumAtPosition(point);
  }
  /**
   * Causes the specified substring to be selected just as if the user selected
   * the substring interactively.
   * @param charnum The index of the start character which is at the given 
   * point, where the first character has an index of 0.
   * @param nchars The number of characters in the substring. If nchars   specifies
   * more characters than are available, then the substring   will consist of
   * all characters starting with charnum until the end   of the list of characters.
   * @throws DOMException(INDEX_SIZE_ERR) Raised if <var>charnum</var> or  
   * <var>nchars</var> is negative or if <var>charnum</var> is greater   than
   * or equal to the number of characters at this node.
   */
  public final void selectSubString(int charnum, int nchars) throws JavaScriptException {
    ((SVGTextContentElement)ot).selectSubString(charnum, nchars);
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * on the given element. Note that the SVG DOM defines the attribute {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * as being of type {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean}, whereas
   * the SVG language definition says that {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * is not animated. Because the SVG language definition states that {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * cannot be animated, the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getAnimVal()}
   * will always be the same as the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getBaseVal()}.
   */
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGTextContentElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final String getXmllang() {
    return ((SVGTextContentElement)ot).getXmllang();
  }
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmllang(java.lang.String value) throws JavaScriptException {
    ((SVGTextContentElement)ot).setXmllang(value);
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final String getXmlspace() {
    return ((SVGTextContentElement)ot).getXmlspace();
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmlspace(java.lang.String value) throws JavaScriptException {
    ((SVGTextContentElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredFeatures()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGTextContentElement)ot).getRequiredFeatures();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredExtensions()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGTextContentElement)ot).getRequiredExtensions();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getSystemLanguage()}
   * on the given element.
   */
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGTextContentElement)ot).getSystemLanguage();
  }
  /**
   * Returns true if the user agent supports the given extension, specified
   * by a URI.
   * @param extension The name of the extension, expressed as a URI.
   * @return True or false, depending on whether the given extension is   supported.
   */
  public final boolean hasExtension(String extension) {
    return ((SVGTextContentElement)ot).hasExtension(extension);
  }

  @Override
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }
  @Override
  public final HandlerRegistration addLoadHandler(LoadHandler handler) {
    return addDomHandler(handler, LoadEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
    return addDomHandler(handler, MouseDownEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
    return addDomHandler(handler, MouseMoveEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
    return addDomHandler(handler, MouseOutEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
    return addDomHandler(handler, MouseOverEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
    return addDomHandler(handler, MouseUpEvent.getType());
  }
  @Override
  public final HandlerRegistration addActivateHandler(ActivateHandler handler) {
    return addDomHandler(handler, ActivateEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusInHandler(FocusInHandler handler) {
    return addDomHandler(handler, FocusInEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusOutHandler(FocusOutHandler handler) {
    return addDomHandler(handler, FocusOutEvent.getType());
  }
}
