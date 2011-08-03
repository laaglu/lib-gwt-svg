package org.vectomatic.dom.svg.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.vectomatic.dom.svg.OMCSSPrimitiveValue;
import org.vectomatic.dom.svg.OMCSSValue;
import org.vectomatic.dom.svg.OMCSSValueList;

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
		unitToPrimitiveType.put("em", (short)3);
		unitToPrimitiveType.put("ex", (short)4);
		unitToPrimitiveType.put("px", (short)5);
		unitToPrimitiveType.put("in", (short)8);
		unitToPrimitiveType.put("cm", (short)6);
		unitToPrimitiveType.put("mm", (short)7);
		unitToPrimitiveType.put("pt", (short)9);
		unitToPrimitiveType.put("pc", (short)10);
		unitToPrimitiveType.put("%", (short)10);
	}
	
	public OMCSSValueList parse(String cssText) {
		OMCSSValue[] values = null;
		if (cssText != null) {
			List<OMCSSPrimitiveValue> lengths = new ArrayList<OMCSSPrimitiveValue>();
			String[] lengthArray = cssText.split(COMMA);
			for (int i = 0; i < lengthArray.length; i++) {
				if (lengthArray[i].length() > 0) {
					LENGTH.setLastIndex(0);
					String length = lengthArray[i].trim();
					MatchResult result = LENGTH.exec(length);
					if (result != null && result.getGroupCount() == 3) {
						short primitiveType = 5;
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
		}
		return new OMCSSValueList(values, cssText);
	}

}
