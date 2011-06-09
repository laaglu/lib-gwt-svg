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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.vectomatic.dom.svg.OMRGBColor;
import org.vectomatic.dom.svg.OMSVGICCColor;
import org.vectomatic.dom.svg.OMSVGPaint;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.regexp.shared.MatchResult;
import com.google.gwt.regexp.shared.RegExp;

/**
 * Class to parse SVG paint values. Do not call this class directly,
 * it will be removed when browser provide good native support for it.
 * Following is the BNF grammar of the expression supported.
 * <pre>
 *  paint ::=  none 
 *    | currentColor 
 *    | color [icccolor] 
 *    | funciri [ none | currentColor | color [icccolor] ] 
 *    | inherit
 *    
 *  color ::= "#" hexdigit hexdigit hexdigit (hexdigit hexdigit hexdigit)? 
 *    | "rgb(" wsp* integer comma integer comma integer wsp* ")" 
 *    | "rgb(" wsp* integer "%" comma integer "%" comma integer "%" wsp* ")" 
 *    | color-keyword 
 *  
 *  hexdigit ::= [0-9A-Fa-f] 
 *  
 *  comma ::= wsp* "," wsp* 
 *  
 *  icccolor ::= "icc-color(" name (comma-wsp number)+ ")" 
 *  
 *  name ::= [^,()#x20#x9#xD#xA]* 
 * </pre>
 * @author laaglu
 */
public class SVGPaintParser {
	private static final OMSVGPaint NONE = new OMSVGPaint(OMSVGPaint.SVG_PAINTTYPE_NONE);
	private static final OMSVGPaint CURRENT_COLOR = new OMSVGPaint(OMSVGPaint.SVG_PAINTTYPE_CURRENTCOLOR);
	private static Map<String, String> nameToColor;
	private static final String I255 = "25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9]";
	private static final String I100 = "[0-9]|[1-9][0-9]?|100";
	private static final String WS = "\\s*";
	private static final String COMMA = WS + "," + WS;
	private static final String HEX = "[0-9a-fA-F]";
	private static final String INT = "(?:[1-9][0-9]*|[0-9])";
	private static final String PROFILE = "[^,\\(\\)\\s]+";
	private static final String INTLIST = "(?:" + COMMA + INT + ")*";
	private static final RegExp RGB255 = RegExp.compile("^rgb\\(" + WS + "(" + I255 + ")" + COMMA + "(" + I255 + ")" + COMMA + "(" + I255 + ")" + WS + "\\)\\s*", "g");
	private static final RegExp RGBPCT = RegExp.compile("^rgb\\(" + WS + "(" + I100 + ")%" + COMMA + "(" + I100 + ")%" + COMMA + "(" + I100 + ")%" + WS + "\\)\\s*", "g");
	private static final RegExp RGBHEX = RegExp.compile("^#(" + HEX + "{6}|" + HEX + "{3})\\s*", "g");
	private static final RegExp FUNCIRI = RegExp.compile("^url\\(([^\\)]*)\\)\\s*", "g");
	private static final RegExp COLORNAME = RegExp.compile("^([a-z]{3,})(?!\\()\\s*", "g");
	private static final RegExp ICC = RegExp.compile("icc-color\\(" + WS + "(" + PROFILE + ")(" + INTLIST + ")" + WS + "\\)", "g");

	public static final SVGPaintParser INSTANCE = new SVGPaintParser();

	public OMSVGPaint parse(String cssText) {
		return parse(cssText, null);
	}
	
	private OMSVGPaint parse(String cssText, String uri) {
		if (uri == null) {
			// begins with a funciri
			FUNCIRI.setLastIndex(0);
			MatchResult result = FUNCIRI.exec(cssText);
			if (result != null && result.getGroupCount() == 2) {
//				GWT.log("matched funciri: '" + cssText.substring(FUNCIRI.getLastIndex()) + "' '" + result.getGroup(1) + "'");
				String str = FUNCIRI.getLastIndex() == cssText.length() ? null : cssText.substring(FUNCIRI.getLastIndex());
				return parse(str, result.getGroup(1));
			}
		}
		String rgbColor = null;
		String iccColor = null;
		if (cssText != null) {
			if (SVGConstants.CSS_NONE_VALUE.equals(cssText)) {
				// none
				if (uri == null) {
					return NONE;
				}
				OMSVGPaint paint = new OMSVGPaint(OMSVGPaint.SVG_PAINTTYPE_URI_NONE);
				paint.setPaint(OMSVGPaint.SVG_PAINTTYPE_URI_NONE, uri, null, null);
				return paint;
			} else if (SVGConstants.CSS_CURRENTCOLOR_VALUE.equals(cssText)) {
				// currentColor
				if (uri == null) {
					return CURRENT_COLOR;
				}
				OMSVGPaint paint = new OMSVGPaint(OMSVGPaint.SVG_PAINTTYPE_URI_CURRENTCOLOR);
				paint.setPaint(OMSVGPaint.SVG_PAINTTYPE_URI_CURRENTCOLOR, uri, null, null);
				return paint;
			}
	
			COLORNAME.setLastIndex(0);
			MatchResult result = COLORNAME.exec(cssText);
			if (result != null && result.getGroupCount() == 2) {
				// color name
				rgbColor = getNamedColor(result.getGroup(1));
				if (rgbColor == null) {
					throw new JavaScriptException("Unknown color keyword: " + cssText);	
				}
				iccColor = COLORNAME.getLastIndex() == cssText.length() ? null : cssText.substring(COLORNAME.getLastIndex());
			}
			
			if (rgbColor == null) {
				RGB255.setLastIndex(0);
				result = RGB255.exec(cssText);
				if (result != null && result.getGroupCount() == 4) {
					rgbColor = result.getGroup(0);
					iccColor = RGB255.getLastIndex() == cssText.length() ? null : cssText.substring(RGB255.getLastIndex());
				}
			}
			if (rgbColor == null) {
				RGBPCT.setLastIndex(0);
				result = RGBPCT.exec(cssText);
				if (result != null && result.getGroupCount() == 4) {
					rgbColor = result.getGroup(0);
					iccColor = RGBPCT.getLastIndex() == cssText.length() ? null : cssText.substring(RGBPCT.getLastIndex());
				}
			}
			if (rgbColor == null) {
				RGBHEX.setLastIndex(0);
				result = RGBHEX.exec(cssText);
				if (result != null && result.getGroupCount() == 2) {
					rgbColor = result.getGroup(0);
					iccColor = RGBHEX.getLastIndex() == cssText.length() ? null : cssText.substring(RGBHEX.getLastIndex());
				}
			}
		}

		short paintType;
		if (rgbColor != null) {
			if (uri != null) {
				paintType = iccColor == null ? OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR : OMSVGPaint.SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR; 
			} else {
				paintType = iccColor == null ? OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR : OMSVGPaint.SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR; 
			}
		} else {
			if (uri != null) {
				paintType = OMSVGPaint.SVG_PAINTTYPE_URI;
			} else {
				throw new JavaScriptException("Invalid paint spec: " + cssText);
			}
		}
		OMSVGPaint paint = new OMSVGPaint(paintType);
		paint.setPaint(paintType, uri, rgbColor, iccColor);
		return paint;
	}

	public OMSVGICCColor iccColor(String str) {
//		GWT.log("iccColor(" + str + ")");
		ICC.setLastIndex(0);
		MatchResult result = ICC.exec(str);
		if (result != null && result.getGroupCount() == 3) {
			String[] intArray = result.getGroup(2).split(COMMA);
			List<Integer> intList = new ArrayList<Integer>();
			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i].length() > 0) {
					intList.add(Integer.parseInt(intArray[i]));
				}
			}
			return new OMSVGICCColor(result.getGroup(1), intList);
		}
		throw new JavaScriptException("Invalid icc-color spec: " + str);
	}

	public OMRGBColor rgbColor(String str) {
//		GWT.log("rgbColor(" + str + ")");
		RGB255.setLastIndex(0);
		MatchResult result = RGB255.exec(str);
		if (result != null && result.getGroupCount() == 4) {
			return new OMRGBColor(
				Integer.parseInt(result.getGroup(1)),
				Integer.parseInt(result.getGroup(2)),
				Integer.parseInt(result.getGroup(3)));
		}
		RGBPCT.setLastIndex(0);
		result = RGBPCT.exec(str);
		if (result != null && result.getGroupCount() == 4) {
			return new OMRGBColor(
				255 * Integer.parseInt(result.getGroup(1)) / 100,
				255 * Integer.parseInt(result.getGroup(2)) / 100,
				255 * Integer.parseInt(result.getGroup(3)) / 100);
		}
		RGBHEX.setLastIndex(0);
		result = RGBHEX.exec(str);
		if (result != null && result.getGroupCount() == 2) {
			String hex = result.getGroup(1);
			if (hex.length() == 3) {
				return new OMRGBColor(
					Integer.parseInt(hex.substring(0, 1), 16),
					Integer.parseInt(hex.substring(1, 2), 16),
					Integer.parseInt(hex.substring(2, 3), 16));
			} else {
				return new OMRGBColor(
					Integer.parseInt(hex.substring(0, 2), 16),
					Integer.parseInt(hex.substring(2, 4), 16),
					Integer.parseInt(hex.substring(4, 6), 16));
			}
		}
		throw new JavaScriptException("Invalid color spec: " + str);
	}
	
	public String getNamedColor(String str) {
		if (nameToColor == null) {
			nameToColor = new HashMap<String,String>();
			nameToColor.put("aliceblue", "240,248,255");
			nameToColor.put("antiquewhite", "250,235,215");
			nameToColor.put("aqua", " 0,255,255");
			nameToColor.put("aquamarine", "127,255,212");
			nameToColor.put("azure", "240,255,255");
			nameToColor.put("beige", "245,245,220");
			nameToColor.put("bisque", "255,228,196");
			nameToColor.put("black", " 0,0,0");
			nameToColor.put("blanchedalmond", "255,235,205");
			nameToColor.put("blue", " 0,0,255");
			nameToColor.put("blueviolet", "138,43,226");
			nameToColor.put("brown", "165,42,42");
			nameToColor.put("burlywood", "222,184,135");
			nameToColor.put("cadetblue", " 95,158,160");
			nameToColor.put("chartreuse", "127,255,0");
			nameToColor.put("chocolate", "210,105,30");
			nameToColor.put("coral", "255,127,80");
			nameToColor.put("cornflowerblue", "100,149,237");
			nameToColor.put("cornsilk", "255,248,220");
			nameToColor.put("crimson", "220,20,60");
			nameToColor.put("cyan", " 0,255,255");
			nameToColor.put("darkblue", " 0,0,139");
			nameToColor.put("darkcyan", " 0,139,139");
			nameToColor.put("darkgoldenrod", "184,134,11");
			nameToColor.put("darkgray", "169,169,169");
			nameToColor.put("darkgreen", " 0,100,0");
			nameToColor.put("darkgrey", "169,169,169");
			nameToColor.put("darkkhaki", "189,183,107");
			nameToColor.put("darkmagenta", "139,0,139");
			nameToColor.put("darkolivegreen", " 85,107,47");
			nameToColor.put("darkorange", "255,140,0");
			nameToColor.put("darkorchid", "153,50,204");
			nameToColor.put("darkred", "139,0,0");
			nameToColor.put("darksalmon", "233,150,122");
			nameToColor.put("darkseagreen", "143,188,143");
			nameToColor.put("darkslateblue", " 72,61,139");
			nameToColor.put("darkslategray", " 47,79,79");
			nameToColor.put("darkslategrey", " 47,79,79");
			nameToColor.put("darkturquoise", " 0,206,209");
			nameToColor.put("darkviolet", "148,0,211");
			nameToColor.put("deeppink", "255,20,147");
			nameToColor.put("deepskyblue", " 0,191,255");
			nameToColor.put("dimgray", "105,105,105");
			nameToColor.put("dimgrey", "105,105,105");
			nameToColor.put("dodgerblue", " 30,144,255");
			nameToColor.put("firebrick", "178,34,34");
			nameToColor.put("floralwhite", "255,250,240");
			nameToColor.put("forestgreen", " 34,139,34");
			nameToColor.put("fuchsia", "255,0,255");
			nameToColor.put("gainsboro", "220,220,220");
			nameToColor.put("ghostwhite", "248,248,255");
			nameToColor.put("gold", "255,215,0");
			nameToColor.put("goldenrod", "218,165,32");
			nameToColor.put("gray", "128,128,128");
			nameToColor.put("grey", "128,128,128");
			nameToColor.put("green", " 0,128,0");
			nameToColor.put("greenyellow", "173,255,47");
			nameToColor.put("honeydew", "240,255,240");
			nameToColor.put("hotpink", "255,105,180");
			nameToColor.put("indianred", "205,92,92");
			nameToColor.put("indigo", " 75,0,130");
			nameToColor.put("ivory", "255,255,240");
			nameToColor.put("khaki", "240,230,140");
			nameToColor.put("lavender", "230,230,250");
			nameToColor.put("lavenderblush", "255,240,245");
			nameToColor.put("lawngreen", "124,252,0");
			nameToColor.put("lemonchiffon", "255,250,205");
			nameToColor.put("lightblue", "173,216,230");
			nameToColor.put("lightcoral", "240,128,128");
			nameToColor.put("lightcyan", "224,255,255");
			nameToColor.put("lightgoldenrodyellow", "250,250,210");
			nameToColor.put("lightgray", "211,211,211");
			nameToColor.put("lightgreen", "144,238,144");
			nameToColor.put("lightgrey", "211,211,211) ");
			nameToColor.put("lightpink", "255,182,193");
			nameToColor.put("lightsalmon", "255,160,122");
			nameToColor.put("lightseagreen", " 32,178,170");
			nameToColor.put("lightskyblue", "135,206,250");
			nameToColor.put("lightslategray", "119,136,153");
			nameToColor.put("lightslategrey", "119,136,153");
			nameToColor.put("lightsteelblue", "176,196,222");
			nameToColor.put("lightyellow", "255,255,224");
			nameToColor.put("lime", " 0,255,0");
			nameToColor.put("limegreen", " 50,205,50");
			nameToColor.put("linen", "250,240,230");
			nameToColor.put("magenta", "255,0,255");
			nameToColor.put("maroon", "128,0,0");
			nameToColor.put("mediumaquamarine", "102,205,170");
			nameToColor.put("mediumblue", " 0,0,205");
			nameToColor.put("mediumorchid", "186,85,211");
			nameToColor.put("mediumpurple", "147,112,219");
			nameToColor.put("mediumseagreen", " 60,179,113");
			nameToColor.put("mediumslateblue", "123,104,238");
			nameToColor.put("mediumspringgreen", " 0,250,154");
			nameToColor.put("mediumturquoise", " 72,209,204");
			nameToColor.put("mediumvioletred", "199,21,133");
			nameToColor.put("midnightblue", " 25,25,112");
			nameToColor.put("mintcream", "245,255,250");
			nameToColor.put("mistyrose", "255,228,225");
			nameToColor.put("moccasin", "255,228,181");
			nameToColor.put("navajowhite", "255,222,173");
			nameToColor.put("navy", " 0,0,128");
			nameToColor.put("oldlace", "253,245,230");
			nameToColor.put("olive", "128,128,0");
			nameToColor.put("olivedrab", "107,142,35");
			nameToColor.put("orange", "255,165,0");
			nameToColor.put("orangered", "255,69,0");
			nameToColor.put("orchid", "218,112,214");
			nameToColor.put("palegoldenrod", "238,232,170");
			nameToColor.put("palegreen", "152,251,152");
			nameToColor.put("paleturquoise", "175,238,238");
			nameToColor.put("palevioletred", "219,112,147");
			nameToColor.put("papayawhip", "255,239,213");
			nameToColor.put("peachpuff", "255,218,185");
			nameToColor.put("peru", "205,133,63");
			nameToColor.put("pink", "255,192,203");
			nameToColor.put("plum", "221,160,221");
			nameToColor.put("powderblue", "176,224,230");
			nameToColor.put("purple", "128,0,128");
			nameToColor.put("red", "255,0,0");
			nameToColor.put("rosybrown", "188,143,143");
			nameToColor.put("royalblue", " 65,105,225");
			nameToColor.put("saddlebrown", "139,69,19");
			nameToColor.put("salmon", "250,128,114");
			nameToColor.put("sandybrown", "244,164,96");
			nameToColor.put("seagreen", " 46,139,87");
			nameToColor.put("seashell", "255,245,238");
			nameToColor.put("sienna", "160,82,45");
			nameToColor.put("silver", "192,192,192");
			nameToColor.put("skyblue", "135,206,235");
			nameToColor.put("slateblue", "106,90,205");
			nameToColor.put("slategray", "112,128,144");
			nameToColor.put("slategrey", "112,128,144");
			nameToColor.put("snow", "255,250,250");
			nameToColor.put("springgreen", " 0,255,127");
			nameToColor.put("steelblue", " 70,130,180");
			nameToColor.put("tan", "210,180,140");
			nameToColor.put("teal", " 0,128,128");
			nameToColor.put("thistle", "216,191,216");
			nameToColor.put("tomato", "255,99,71");
			nameToColor.put("turquoise", " 64,224,208");
			nameToColor.put("violet", "238,130,238");
			nameToColor.put("wheat", "245,222,179");
			nameToColor.put("white", "255,255,255");
			nameToColor.put("whitesmoke", "245,245,245");
			nameToColor.put("yellow", "255,255,0");
			nameToColor.put("yellowgreen", "154,205,50");
		}
//		GWT.log("getNamedColor(" + str + ")");
		String color = nameToColor.get(str);
		return color != null ? "rgb(" + color + ")" : null;
	}
}
