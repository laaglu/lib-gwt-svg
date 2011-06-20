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
package org.vectomatic.dom.svg.impl;

import java.util.Arrays;

import junit.framework.TestCase;

import org.vectomatic.dom.svg.OMCSSPrimitiveValue;
import org.vectomatic.dom.svg.OMCSSValue;
import org.vectomatic.dom.svg.OMRGBColor;
import org.vectomatic.dom.svg.OMSVGColor;
import org.vectomatic.dom.svg.OMSVGICCColor;
import org.vectomatic.dom.svg.OMSVGPaint;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;

public class SVGPaintParserTest extends TestCase {
	public void testPrimitiveValue(OMCSSPrimitiveValue value, float f) {
		assertNotNull(value);
		assertEquals(OMCSSValue.CSS_PRIMITIVE_VALUE, value.getCssValueType());
		assertEquals(Float.toString(f), value.getCssText());
		assertEquals(OMCSSPrimitiveValue.CSS_NUMBER, value.getPrimitiveType());
		assertEquals(f, value.getFloatValue(OMCSSPrimitiveValue.CSS_NUMBER));
	}
	
	public void checkRgbColor(OMRGBColor rgbColor, float r, float g, float b) {
		assertNotNull(rgbColor);
		testPrimitiveValue(rgbColor.getRed(), r);
		testPrimitiveValue(rgbColor.getGreen(), g);
		testPrimitiveValue(rgbColor.getBlue(), b);
	}
	
	public void testHex6Color() {
		String cssText = "#abcDe3";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 171, 205, 227);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR, p.getPaintType());
		assertNull(p.getUri());
	}
	
	public void testHex3Color() {
		String cssText = "#93a";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 9, 3, 10);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR, p.getPaintType());
		assertNull(p.getUri());
	}
	
	public void testRgbColor() {
		String cssText = "rgb(255, 12, 133)";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 255, 12, 133);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR, p.getPaintType());
		assertNull(p.getUri());
	}

	public void testNamedColor() {
		String cssText = "slateblue";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals("rgb(106,90,205)", p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 106, 90, 205);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR, p.getPaintType());
		assertNull(p.getUri());
	}
	
	public void testNoneColor() {
		String cssText = SVGConstants.CSS_NONE_VALUE;
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(SVGConstants.CSS_NONE_VALUE, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_UNKNOWN, p.getColorType());
		assertNull(p.getIccColor());
		assertNull(p.getRgbColor());
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_NONE, p.getPaintType());
		assertNull(p.getUri());
	}

	public void testCurrentColor() {
		String cssText = SVGConstants.CSS_CURRENTCOLOR_VALUE;
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(SVGConstants.CSS_CURRENTCOLOR_VALUE, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_CURRENTCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		assertNull(p.getRgbColor());
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_CURRENTCOLOR, p.getPaintType());
		assertNull(p.getUri());
	}
	
	public void testRgbIccColor() {
		String cssText = "rgb(255, 12, 133) icc-color( bar, 3,45,22,4)";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR_ICCCOLOR, p.getColorType());
		checkRgbColor(p.getRgbColor(), 255, 12, 133);
		OMSVGICCColor iccColor = p.getIccColor();
		assertNotNull(iccColor);
		assertEquals("bar", iccColor.getColorProfile());
		assertEquals(Arrays.asList(new Integer[] {3,45,22,4}), iccColor.colors);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR, p.getPaintType());
		assertNull(p.getUri());
	}

	public void testUriColor() {
		String cssText = "url(#foo)";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_UNKNOWN, p.getColorType());
		assertNull(p.getIccColor());
		assertNull(p.getRgbColor());
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}
	
	
	public void testUriHex6Color() {
		String cssText = "url(#foo) #abcDe3";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 171, 205, 227);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}
	
	public void testUriHex3Color() {
		String cssText = "url(#foo) #93a";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 9, 3, 10);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}
	
	public void testUriRgbColor() {
		String cssText = "url(#foo) rgb(255, 12, 133)";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 255, 12, 133);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}

	public void testUriNamedColor() {
		String cssText = "url(#foo) slateblue";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals("url(#foo) rgb(106,90,205)", p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		checkRgbColor(p.getRgbColor(), 106, 90, 205);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}
	
	public void testUriNoneColor() {
		String cssText = "url(#foo) " + SVGConstants.CSS_NONE_VALUE;
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_UNKNOWN, p.getColorType());
		assertNull(p.getIccColor());
		assertNull(p.getRgbColor());
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_NONE, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}

	public void testUriCurrentColor() {
		String cssText = "url(#foo) " + SVGConstants.CSS_CURRENTCOLOR_VALUE;
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_CURRENTCOLOR, p.getColorType());
		assertNull(p.getIccColor());
		assertNull(p.getRgbColor());
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_CURRENTCOLOR, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}
	
	public void testUriRgbIccColor() {
		String cssText = "url(#foo) rgb(255, 12, 133) icc-color( bar, 3,45,22,4)";
		OMSVGPaint p = SVGPaintParser.INSTANCE.parse(cssText);
		assertNotNull(p);
		assertEquals(OMCSSValue.CSS_CUSTOM, p.getCssValueType());
		assertEquals(cssText, p.getCssText());
		assertEquals(OMSVGColor.SVG_COLORTYPE_RGBCOLOR_ICCCOLOR, p.getColorType());
		checkRgbColor(p.getRgbColor(), 255, 12, 133);
		OMSVGICCColor iccColor = p.getIccColor();
		assertNotNull(iccColor);
		assertEquals("bar", iccColor.getColorProfile());
		assertEquals(Arrays.asList(new Integer[] {3,45,22,4}), iccColor.colors);
		assertEquals(OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR, p.getPaintType());
		assertEquals("#foo", p.getUri());
	}
	
	public void testNonColorKeywordError() {
		try {
			SVGPaintParser.INSTANCE.parse("abcd");
			fail();
		} catch(JavaScriptException e) {
			assertTrue(e.getMessage().contains("Unknown color keyword: abcd"));
		}
	}

	public void testBadRbgError() {
		try {
			SVGPaintParser.INSTANCE.parse("rgb(255, 12, 333)");
			fail();
		} catch(JavaScriptException e) {
			assertTrue(e.getMessage().contains("Invalid paint spec: rgb(255, 12, 333)"));
		}
	}

	public void testBadIccError() {
		try {
			SVGPaintParser.INSTANCE.parse("rgb(255, 12, 133) icc-color( bar,,)");
			fail();
		} catch(JavaScriptException e) {
			assertTrue(e.getMessage().contains("Invalid icc-color spec: icc-color( bar,,)"));
		}
	}
	
	public void testEquals() {
		OMSVGPaint p1 = SVGPaintParser.INSTANCE.parse("rgb(0, 0, 0)");
		OMSVGPaint p2 = SVGPaintParser.INSTANCE.parse(SVGConstants.CSS_BLACK_VALUE);
		OMSVGPaint p3 = SVGPaintParser.INSTANCE.parse(SVGConstants.CSS_RED_VALUE);
		assertEquals(p2, p1);
		assertFalse(p2.equals(p3));
		assertEquals(p2.hashCode(), p1.hashCode());
		assertFalse(p3.hashCode() == p1.hashCode());
	}
}
