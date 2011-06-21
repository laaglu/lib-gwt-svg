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
	public static final OMSVGPaint NONE = new OMSVGPaint(OMSVGPaint.SVG_PAINTTYPE_NONE);
	public static final OMSVGPaint CURRENT_COLOR = new OMSVGPaint(OMSVGPaint.SVG_PAINTTYPE_CURRENTCOLOR);
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
	private static final RegExp FUNCIRI = RegExp.compile("^url\\(['\"]?([^\\)'\"]*)['\"]?\\)\\s*", "g");
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
			nameToColor.put(SVGConstants.CSS_ALICEBLUE_VALUE, "240,248,255");
			nameToColor.put(SVGConstants.CSS_ANTIQUEWHITE_VALUE, "250,235,215");
			nameToColor.put(SVGConstants.CSS_AQUA_VALUE, " 0,255,255");
			nameToColor.put(SVGConstants.CSS_AQUAMARINE_VALUE, "127,255,212");
			nameToColor.put(SVGConstants.CSS_AZURE_VALUE, "240,255,255");
			nameToColor.put(SVGConstants.CSS_BEIGE_VALUE, "245,245,220");
			nameToColor.put(SVGConstants.CSS_BISQUE_VALUE, "255,228,196");
			nameToColor.put(SVGConstants.CSS_BLACK_VALUE, " 0,0,0");
			nameToColor.put(SVGConstants.CSS_BLANCHEDALMOND_VALUE, "255,235,205");
			nameToColor.put(SVGConstants.CSS_BLUE_VALUE, " 0,0,255");
			nameToColor.put(SVGConstants.CSS_BLUEVIOLET_VALUE, "138,43,226");
			nameToColor.put(SVGConstants.CSS_BROWN_VALUE, "165,42,42");
			nameToColor.put(SVGConstants.CSS_BURLYWOOD_VALUE, "222,184,135");
			nameToColor.put(SVGConstants.CSS_CADETBLUE_VALUE, " 95,158,160");
			nameToColor.put(SVGConstants.CSS_CHARTREUSE_VALUE, "127,255,0");
			nameToColor.put(SVGConstants.CSS_CHOCOLATE_VALUE, "210,105,30");
			nameToColor.put(SVGConstants.CSS_CORAL_VALUE, "255,127,80");
			nameToColor.put(SVGConstants.CSS_CORNFLOWERBLUE_VALUE, "100,149,237");
			nameToColor.put(SVGConstants.CSS_CORNSILK_VALUE, "255,248,220");
			nameToColor.put(SVGConstants.CSS_CRIMSON_VALUE, "220,20,60");
			nameToColor.put(SVGConstants.CSS_CYAN_VALUE, " 0,255,255");
			nameToColor.put(SVGConstants.CSS_DARKBLUE_VALUE, " 0,0,139");
			nameToColor.put(SVGConstants.CSS_DARKCYAN_VALUE, " 0,139,139");
			nameToColor.put(SVGConstants.CSS_DARKGOLDENROD_VALUE, "184,134,11");
			nameToColor.put(SVGConstants.CSS_DARKGRAY_VALUE, "169,169,169");
			nameToColor.put(SVGConstants.CSS_DARKGREEN_VALUE, " 0,100,0");
			nameToColor.put(SVGConstants.CSS_DARKGREY_VALUE, "169,169,169");
			nameToColor.put(SVGConstants.CSS_DARKKHAKI_VALUE, "189,183,107");
			nameToColor.put(SVGConstants.CSS_DARKMAGENTA_VALUE, "139,0,139");
			nameToColor.put(SVGConstants.CSS_DARKOLIVEGREEN_VALUE, " 85,107,47");
			nameToColor.put(SVGConstants.CSS_DARKORANGE_VALUE, "255,140,0");
			nameToColor.put(SVGConstants.CSS_DARKORCHID_VALUE, "153,50,204");
			nameToColor.put(SVGConstants.CSS_DARKRED_VALUE, "139,0,0");
			nameToColor.put(SVGConstants.CSS_DARKSALMON_VALUE, "233,150,122");
			nameToColor.put(SVGConstants.CSS_DARKSEAGREEN_VALUE, "143,188,143");
			nameToColor.put(SVGConstants.CSS_DARKSLATEBLUE_VALUE, " 72,61,139");
			nameToColor.put(SVGConstants.CSS_DARKSLATEGRAY_VALUE, " 47,79,79");
			nameToColor.put(SVGConstants.CSS_DARKSLATEGREY_VALUE, " 47,79,79");
			nameToColor.put(SVGConstants.CSS_DARKTURQUOISE_VALUE, " 0,206,209");
			nameToColor.put(SVGConstants.CSS_DARKVIOLET_VALUE, "148,0,211");
			nameToColor.put(SVGConstants.CSS_DEEPPINK_VALUE, "255,20,147");
			nameToColor.put(SVGConstants.CSS_DEEPSKYBLUE_VALUE, " 0,191,255");
			nameToColor.put(SVGConstants.CSS_DIMGRAY_VALUE, "105,105,105");
			nameToColor.put(SVGConstants.CSS_DIMGREY_VALUE, "105,105,105");
			nameToColor.put(SVGConstants.CSS_DODGERBLUE_VALUE, " 30,144,255");
			nameToColor.put(SVGConstants.CSS_FIREBRICK_VALUE, "178,34,34");
			nameToColor.put(SVGConstants.CSS_FLORALWHITE_VALUE, "255,250,240");
			nameToColor.put(SVGConstants.CSS_FORESTGREEN_VALUE, " 34,139,34");
			nameToColor.put(SVGConstants.CSS_FUCHSIA_VALUE, "255,0,255");
			nameToColor.put(SVGConstants.CSS_GAINSBORO_VALUE, "220,220,220");
			nameToColor.put(SVGConstants.CSS_GHOSTWHITE_VALUE, "248,248,255");
			nameToColor.put(SVGConstants.CSS_GOLD_VALUE, "255,215,0");
			nameToColor.put(SVGConstants.CSS_GOLDENROD_VALUE, "218,165,32");
			nameToColor.put(SVGConstants.CSS_GRAY_VALUE, "128,128,128");
			nameToColor.put(SVGConstants.CSS_GREY_VALUE, "128,128,128");
			nameToColor.put(SVGConstants.CSS_GREEN_VALUE, " 0,128,0");
			nameToColor.put(SVGConstants.CSS_GREENYELLOW_VALUE, "173,255,47");
			nameToColor.put(SVGConstants.CSS_HONEYDEW_VALUE, "240,255,240");
			nameToColor.put(SVGConstants.CSS_HOTPINK_VALUE, "255,105,180");
			nameToColor.put(SVGConstants.CSS_INDIANRED_VALUE, "205,92,92");
			nameToColor.put(SVGConstants.CSS_INDIGO_VALUE, " 75,0,130");
			nameToColor.put(SVGConstants.CSS_IVORY_VALUE, "255,255,240");
			nameToColor.put(SVGConstants.CSS_KHAKI_VALUE, "240,230,140");
			nameToColor.put(SVGConstants.CSS_LAVENDER_VALUE, "230,230,250");
			nameToColor.put(SVGConstants.CSS_LAVENDERBLUSH_VALUE, "255,240,245");
			nameToColor.put(SVGConstants.CSS_LAWNGREEN_VALUE, "124,252,0");
			nameToColor.put(SVGConstants.CSS_LEMONCHIFFON_VALUE, "255,250,205");
			nameToColor.put(SVGConstants.CSS_LIGHTBLUE_VALUE, "173,216,230");
			nameToColor.put(SVGConstants.CSS_LIGHTCORAL_VALUE, "240,128,128");
			nameToColor.put(SVGConstants.CSS_LIGHTCYAN_VALUE, "224,255,255");
			nameToColor.put(SVGConstants.CSS_LIGHTGOLDENRODYELLOW_VALUE, "250,250,210");
			nameToColor.put(SVGConstants.CSS_LIGHTGRAY_VALUE, "211,211,211");
			nameToColor.put(SVGConstants.CSS_LIGHTGREEN_VALUE, "144,238,144");
			nameToColor.put(SVGConstants.CSS_LIGHTGREY_VALUE, "211,211,211) ");
			nameToColor.put(SVGConstants.CSS_LIGHTPINK_VALUE, "255,182,193");
			nameToColor.put(SVGConstants.CSS_LIGHTSALMON_VALUE, "255,160,122");
			nameToColor.put(SVGConstants.CSS_LIGHTSEAGREEN_VALUE, " 32,178,170");
			nameToColor.put(SVGConstants.CSS_LIGHTSKYBLUE_VALUE, "135,206,250");
			nameToColor.put(SVGConstants.CSS_LIGHTSLATEGRAY_VALUE, "119,136,153");
			nameToColor.put(SVGConstants.CSS_LIGHTSLATEGREY_VALUE, "119,136,153");
			nameToColor.put(SVGConstants.CSS_LIGHTSTEELBLUE_VALUE, "176,196,222");
			nameToColor.put(SVGConstants.CSS_LIGHTYELLOW_VALUE, "255,255,224");
			nameToColor.put(SVGConstants.CSS_LIME_VALUE, " 0,255,0");
			nameToColor.put(SVGConstants.CSS_LIMEGREEN_VALUE, " 50,205,50");
			nameToColor.put(SVGConstants.CSS_LINEN_VALUE, "250,240,230");
			nameToColor.put(SVGConstants.CSS_MAGENTA_VALUE, "255,0,255");
			nameToColor.put(SVGConstants.CSS_MAROON_VALUE, "128,0,0");
			nameToColor.put(SVGConstants.CSS_MEDIUMAQUAMARINE_VALUE, "102,205,170");
			nameToColor.put(SVGConstants.CSS_MEDIUMBLUE_VALUE, " 0,0,205");
			nameToColor.put(SVGConstants.CSS_MEDIUMORCHID_VALUE, "186,85,211");
			nameToColor.put(SVGConstants.CSS_MEDIUMPURPLE_VALUE, "147,112,219");
			nameToColor.put(SVGConstants.CSS_MEDIUMSEAGREEN_VALUE, " 60,179,113");
			nameToColor.put(SVGConstants.CSS_MEDIUMSLATEBLUE_VALUE, "123,104,238");
			nameToColor.put(SVGConstants.CSS_MEDIUMSPRINGGREEN_VALUE, " 0,250,154");
			nameToColor.put(SVGConstants.CSS_MEDIUMTURQUOISE_VALUE, " 72,209,204");
			nameToColor.put(SVGConstants.CSS_MEDIUMVIOLETRED_VALUE, "199,21,133");
			nameToColor.put(SVGConstants.CSS_MIDNIGHTBLUE_VALUE, " 25,25,112");
			nameToColor.put(SVGConstants.CSS_MINTCREAM_VALUE, "245,255,250");
			nameToColor.put(SVGConstants.CSS_MISTYROSE_VALUE, "255,228,225");
			nameToColor.put(SVGConstants.CSS_MOCCASIN_VALUE, "255,228,181");
			nameToColor.put(SVGConstants.CSS_NAVAJOWHITE_VALUE, "255,222,173");
			nameToColor.put(SVGConstants.CSS_NAVY_VALUE, " 0,0,128");
			nameToColor.put(SVGConstants.CSS_OLDLACE_VALUE, "253,245,230");
			nameToColor.put(SVGConstants.CSS_OLIVE_VALUE, "128,128,0");
			nameToColor.put(SVGConstants.CSS_OLIVEDRAB_VALUE, "107,142,35");
			nameToColor.put(SVGConstants.CSS_ORANGE_VALUE, "255,165,0");
			nameToColor.put(SVGConstants.CSS_ORANGERED_VALUE, "255,69,0");
			nameToColor.put(SVGConstants.CSS_ORCHID_VALUE, "218,112,214");
			nameToColor.put(SVGConstants.CSS_PALEGOLDENROD_VALUE, "238,232,170");
			nameToColor.put(SVGConstants.CSS_PALEGREEN_VALUE, "152,251,152");
			nameToColor.put(SVGConstants.CSS_PALETURQUOISE_VALUE, "175,238,238");
			nameToColor.put(SVGConstants.CSS_PALEVIOLETRED_VALUE, "219,112,147");
			nameToColor.put(SVGConstants.CSS_PAPAYAWHIP_VALUE, "255,239,213");
			nameToColor.put(SVGConstants.CSS_PEACHPUFF_VALUE, "255,218,185");
			nameToColor.put(SVGConstants.CSS_PERU_VALUE, "205,133,63");
			nameToColor.put(SVGConstants.CSS_PINK_VALUE, "255,192,203");
			nameToColor.put(SVGConstants.CSS_PLUM_VALUE, "221,160,221");
			nameToColor.put(SVGConstants.CSS_POWDERBLUE_VALUE, "176,224,230");
			nameToColor.put(SVGConstants.CSS_PURPLE_VALUE, "128,0,128");
			nameToColor.put(SVGConstants.CSS_RED_VALUE, "255,0,0");
			nameToColor.put(SVGConstants.CSS_ROSYBROWN_VALUE, "188,143,143");
			nameToColor.put(SVGConstants.CSS_ROYALBLUE_VALUE, " 65,105,225");
			nameToColor.put(SVGConstants.CSS_SADDLEBROWN_VALUE, "139,69,19");
			nameToColor.put(SVGConstants.CSS_SALMON_VALUE, "250,128,114");
			nameToColor.put(SVGConstants.CSS_SANDYBROWN_VALUE, "244,164,96");
			nameToColor.put(SVGConstants.CSS_SEAGREEN_VALUE, " 46,139,87");
			nameToColor.put(SVGConstants.CSS_SEASHELL_VALUE, "255,245,238");
			nameToColor.put(SVGConstants.CSS_SIENNA_VALUE, "160,82,45");
			nameToColor.put(SVGConstants.CSS_SILVER_VALUE, "192,192,192");
			nameToColor.put(SVGConstants.CSS_SKYBLUE_VALUE, "135,206,235");
			nameToColor.put(SVGConstants.CSS_SLATEBLUE_VALUE, "106,90,205");
			nameToColor.put(SVGConstants.CSS_SLATEGRAY_VALUE, "112,128,144");
			nameToColor.put(SVGConstants.CSS_SLATEGREY_VALUE, "112,128,144");
			nameToColor.put(SVGConstants.CSS_SNOW_VALUE, "255,250,250");
			nameToColor.put(SVGConstants.CSS_SPRINGGREEN_VALUE, " 0,255,127");
			nameToColor.put(SVGConstants.CSS_STEELBLUE_VALUE, " 70,130,180");
			nameToColor.put(SVGConstants.CSS_TAN_VALUE, "210,180,140");
			nameToColor.put(SVGConstants.CSS_TEAL_VALUE, " 0,128,128");
			nameToColor.put(SVGConstants.CSS_THISTLE_VALUE, "216,191,216");
			nameToColor.put(SVGConstants.CSS_TOMATO_VALUE, "255,99,71");
			nameToColor.put(SVGConstants.CSS_TURQUOISE_VALUE, " 64,224,208");
			nameToColor.put(SVGConstants.CSS_VIOLET_VALUE, "238,130,238");
			nameToColor.put(SVGConstants.CSS_WHEAT_VALUE, "245,222,179");
			nameToColor.put(SVGConstants.CSS_WHITE_VALUE, "255,255,255");
			nameToColor.put(SVGConstants.CSS_WHITESMOKE_VALUE, "245,245,245");
			nameToColor.put(SVGConstants.CSS_YELLOW_VALUE, "255,255,0");
			nameToColor.put(SVGConstants.CSS_YELLOWGREEN_VALUE, "154,205,50");
		}
//		GWT.log("getNamedColor(" + str + ")");
		String color = nameToColor.get(str);
		return color != null ? "rgb(" + color + ")" : null;
	}
}
