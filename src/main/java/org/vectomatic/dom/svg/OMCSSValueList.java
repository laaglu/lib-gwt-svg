package org.vectomatic.dom.svg;

/**
 * Class for a CSS value list
 * @author laaglu
 */
public class OMCSSValueList extends OMCSSValue {
	protected OMCSSValue[] items;
	/**
	 * Constructor
	 * @param items The items in the value list
	 */
	public OMCSSValueList(OMCSSValue[] items, String cssText) {
		super(CSS_VALUE_LIST);
		this.items = items;
		this.cssText = cssText;
	}
	
	/**
	 * Returns the number of CSSValues in the list. The range of valid 
	 * values of the indices is 0 to length-1 inclusive.
	 * @return
	 * The number of CSSValues in the list.
	 */
	public int getLength() {
		return items != null ? items.length : 0;
	}
	/**
	 * Used to retrieve an {@link OMCSSValue} by ordinal index. 
	 * The order in this collection represents the order of the values 
	 * in the CSS style property. If index is greater than or equal to 
	 * the number of values in the list, this returns null.
	 * @param index Index into the collection.
	 * @return an OMCSSValue
	 */
	public OMCSSValue getItem(int index) {
		return (items != null && index >= 0 && index < items.length) ? items[index] : null;
	}

	@Override
	public String getDescription() {
		StringBuilder builder = new StringBuilder("OMCSSValueList(cssValueType=");
		builder.append(cssValueType);
		builder.append(", cssText=");
		builder.append(cssText);
		builder.append("{");
		if (items != null) {
			for (int i = 0; i < items.length; i ++) {
				if (i > 0) {
					builder.append(",");
				}
				builder.append(items[i].getDescription());
			}
		}
		builder.append("})");
		return builder.toString();
	}
}
