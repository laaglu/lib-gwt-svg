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

/**
 * Class to represent a CSS RGB color
 * @author laaglu
 */
public class OMRGBColor {
  private OMCSSPrimitiveValue red;
  private OMCSSPrimitiveValue green;
  private OMCSSPrimitiveValue blue;
  public OMRGBColor(float r, float g, float b) {
	red = new OMCSSPrimitiveValue(r);
	green = new OMCSSPrimitiveValue(g);
	blue = new OMCSSPrimitiveValue(b);
  }

  // Implementation of the css::RGBColor W3C IDL interface
  public final OMCSSPrimitiveValue getRed() {
    return this.red;
  }
  public final OMCSSPrimitiveValue getGreen() {
    return this.green;
  }
  public final OMCSSPrimitiveValue getBlue() {
    return this.blue;
  }
  @Override
  public String toString() {
	StringBuilder builder = new StringBuilder("OMRGBColor(r=");
	builder.append(red);
	builder.append(", g=");
	builder.append(green);
	builder.append(", b=");
	builder.append(blue);
	builder.append(")");
	return builder.toString();
  }

}
