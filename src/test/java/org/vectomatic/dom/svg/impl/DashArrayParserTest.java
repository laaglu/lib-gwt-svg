package org.vectomatic.dom.svg.impl;

import junit.framework.TestCase;

import org.vectomatic.dom.svg.OMCSSPrimitiveValue;
import org.vectomatic.dom.svg.OMCSSValue;
import org.vectomatic.dom.svg.OMCSSValueList;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;

public class DashArrayParserTest extends TestCase {
	public void testDashArray() {
		String cssText = "1em, 2EX , 3px,+4in,5cm,6mm,7.7pt,0.8pc,9%,10  ";
		OMCSSValue dashArray = DashArrayParser.INSTANCE.parse(cssText);
		assertNotNull(dashArray);
		assertTrue(dashArray instanceof OMCSSValueList);
		assertEquals(cssText, dashArray.getCssText());
		assertEquals(OMCSSValue.CSS_VALUE_LIST, dashArray.getCssValueType());
		assertEquals(10, ((OMCSSValueList)dashArray).getLength());
		short[] types = {
				OMCSSPrimitiveValue.CSS_EMS,
				OMCSSPrimitiveValue.CSS_EXS,
				OMCSSPrimitiveValue.CSS_PX,
				OMCSSPrimitiveValue.CSS_IN,
				OMCSSPrimitiveValue.CSS_CM,
				OMCSSPrimitiveValue.CSS_MM,
				OMCSSPrimitiveValue.CSS_PT,
				OMCSSPrimitiveValue.CSS_PC,
				OMCSSPrimitiveValue.CSS_PERCENTAGE,
				OMCSSPrimitiveValue.CSS_NUMBER};
		float[] values = {1, 2, 3, 4, 5, 6, 7.7f, 0.8f, 9, 10};
		for (int i = 0; i < ((OMCSSValueList)dashArray).getLength(); i++) {
			OMCSSValue item = ((OMCSSValueList)dashArray).getItem(i);
			assertNotNull(item);
			assertEquals(OMCSSValue.CSS_PRIMITIVE_VALUE, item.getCssValueType());
			assertTrue(item instanceof OMCSSPrimitiveValue);
			OMCSSPrimitiveValue length = (OMCSSPrimitiveValue)item;
			assertEquals(types[i], length.getPrimitiveType());
			assertEquals(values[i], length.getFloatValue(length.getPrimitiveType()));
		}
	}

	public void testBadDashArray() {
		try {
			DashArrayParser.INSTANCE.parse("1em, 2aa");
			fail();
		} catch(JavaScriptException e) {
			assertTrue(e.getMessage().contains("Invalid length spec: 2aa"));
		}
	}

	public void testNoneDashArray() {
		String cssText = SVGConstants.CSS_NONE_VALUE;
		OMCSSValue dashArray = DashArrayParser.INSTANCE.parse(cssText);
		assertNotNull(dashArray);
		assertTrue(dashArray instanceof OMCSSPrimitiveValue);
		assertEquals(cssText, dashArray.getCssText());
		assertEquals(OMCSSValue.CSS_PRIMITIVE_VALUE, dashArray.getCssValueType());
		assertEquals(SVGConstants.CSS_NONE_VALUE, ((OMCSSPrimitiveValue)dashArray).getStringValue());
		assertEquals(OMCSSPrimitiveValue.CSS_IDENT, ((OMCSSPrimitiveValue)dashArray).getPrimitiveType());
	}

	public void testInheritDashArray() {
		String cssText = SVGConstants.CSS_INHERIT_VALUE;
		OMCSSValue dashArray = DashArrayParser.INSTANCE.parse(cssText);
		assertNotNull(dashArray);
		assertTrue(dashArray instanceof OMCSSPrimitiveValue);
		assertEquals(cssText, dashArray.getCssText());
		assertEquals(OMCSSValue.CSS_PRIMITIVE_VALUE, dashArray.getCssValueType());
		assertEquals(SVGConstants.CSS_INHERIT_VALUE, ((OMCSSPrimitiveValue)dashArray).getStringValue());
		assertEquals(OMCSSPrimitiveValue.CSS_IDENT, ((OMCSSPrimitiveValue)dashArray).getPrimitiveType());
	}
}
