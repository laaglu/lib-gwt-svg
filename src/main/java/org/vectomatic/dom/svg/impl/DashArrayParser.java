package org.vectomatic.dom.svg.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.vectomatic.dom.svg.OMCSSPrimitiveValue;
import org.vectomatic.dom.svg.OMCSSValue;
import org.vectomatic.dom.svg.OMCSSValueList;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;

/**
 * Class to parse SVG dash arrays. Do not call this class directly,
 * it will be removed when browser provide good native support for it.
 * Following is the BNF grammar of the expression supported.
 * <pre>
 * dasharray ::= (length | percentage) (comma-wsp dasharray)?
 * length ::= number (~"em" | ~"ex" | ~"px" | ~"in" | ~"cm" | ~"mm" | ~"pt" | ~"pc")?
 * length ::= number ("em" | "ex" | "px" | "in" | "cm" | "mm" | "pt" | "pc" | "%")?
 * number ::= integer | [+-]? [0-9]* "." [0-9]+
 * </pre>
 * @author laaglu
 */
public class DashArrayParser {
	private static final String WS = "\\s*";
	private static final String COMMA = WS + "," + WS;
	private static final RegExp LENGTH = RegExp.compile("^[+-]?((?:0|[1-9][0-9]*)(?:\\.[0-9]+)?)(em|ex|px|in|cm|mm|pt|pc|%)?$", "i");
	public static final DashArrayParser INSTANCE = new DashArrayParser();
	private Map<String, Short> unitToPrimitiveType;

	private DashArrayParser() {
		unitToPrimitiveType = new HashMap<String, Short>();
		unitToPrimitiveType.put("em", OMCSSPrimitiveValue.CSS_EMS);
		unitToPrimitiveType.put("ex", OMCSSPrimitiveValue.CSS_EXS);
		unitToPrimitiveType.put("px", OMCSSPrimitiveValue.CSS_PX);
		unitToPrimitiveType.put("in", OMCSSPrimitiveValue.CSS_IN);
		unitToPrimitiveType.put("cm", OMCSSPrimitiveValue.CSS_CM);
		unitToPrimitiveType.put("mm", OMCSSPrimitiveValue.CSS_MM);
		unitToPrimitiveType.put("pt", OMCSSPrimitiveValue.CSS_PT);
		unitToPrimitiveType.put("pc", OMCSSPrimitiveValue.CSS_PC);
		unitToPrimitiveType.put("%", OMCSSPrimitiveValue.CSS_PERCENTAGE);
	}
	
	public OMCSSValue parse(String cssText) {
		OMCSSValue[] values = null;
		if (SVGConstants.CSS_NONE_VALUE.equals(cssText) || cssText == null || cssText.length() == 0) {
			return new OMCSSPrimitiveValue(cssText, OMCSSPrimitiveValue.CSS_IDENT);
		} else if (SVGConstants.CSS_INHERIT_VALUE.equals(cssText)) {
			return new OMCSSPrimitiveValue(cssText, OMCSSPrimitiveValue.CSS_IDENT);
		}
		
		List<OMCSSPrimitiveValue> lengths = new ArrayList<OMCSSPrimitiveValue>();
		String[] lengthArray = cssText.split(COMMA);
		for (int i = 0; i < lengthArray.length; i++) {
			if (lengthArray[i].length() > 0) {
				LENGTH.setLastIndex(0);
				String length = lengthArray[i].trim();
				MatchResult result = LENGTH.exec(length);
				if (result != null && result.getGroupCount() == 3) {
					short primitiveType = OMCSSPrimitiveValue.CSS_NUMBER;
					String unit = result.getGroup(2);
					if (unit != null) {
						primitiveType = unitToPrimitiveType.get(unit.toLowerCase());
					}
					float value = Float.parseFloat(result.getGroup(1));
					lengths.add(new OMCSSPrimitiveValue(value, primitiveType));
				} else {
					throw new JavaScriptException("Invalid length spec: " + length);
				}
			}
		}
		values = lengths.toArray(new OMCSSValue[lengths.size()]);
		return new OMCSSValueList(values, cssText);
	}
}
