package org.vectomatic.dev.svg.impl.gen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.vectomatic.dom.svg.ui.SVGResource;
import org.vectomatic.dom.svg.ui.SVGButtonBase.SVGFace;
import org.vectomatic.dom.svg.ui.SVGButtonBase.SVGFaceName;
import org.vectomatic.dom.svg.ui.SVGButtonBase.SVGStyleChange;
import org.vectomatic.dom.svg.utils.OMSVGParser;
import org.vectomatic.dom.svg.utils.SVGConstants;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.elementparsers.ElementParser;
import com.google.gwt.uibinder.elementparsers.SvgInterpreter;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;

public class SVGButtonBaseParser implements ElementParser {
	protected static final String ATTR_RESOURCE = "resource";
	protected static final String ATTR_CLASS_NAME_BASE_VAL = "classNameBaseVal";
	protected static final String ATTR_CLASS_NAMES = "classNames";
	protected static final String TAG_ELEMENT = "element";
	protected static final String TAG_UP = "upFace";
	protected static final String TAG_UP_HOVERING = "upHoveringFace";
	protected static final String TAG_UP_DISABLED = "upDisabledFace";
	protected static final String TAG_DOWN = "downFace";
	protected static final String TAG_DOWN_HOVERING = "downHoveringFace";
	protected static final String TAG_DOWN_DISABLED = "downDisabledFace";
	protected static final String TAG_STYLE_CHANGE = "styleChange";
	protected static final String URI_VECTOMATIC = "urn:import:org.vectomatic.dom.svg.ui";
	
	/**
	 * Validates the widget structure 
	 * @param writer
	 * The UiBinder writer
	 * @param container
	 * The SVG widget top-level tag
	 * @return
	 * true if the container has inline-svg, false otherwise
	 * @throws UnableToCompleteException 
	 */
	protected boolean validate(UiBinderWriter writer, Element container) throws UnableToCompleteException {
		// TODO: improve validation with a real XML validation (including SVG validation)
		boolean hasInlineSvg = false;
		NodeList childNodes = container.getChildNodes();
		Set<SVGFaceName> faces = new HashSet<SVGFaceName>();
		for (int i = 0, size = childNodes.getLength(); i < size; i++) {
			Node childNode = childNodes.item(i);
			if (childNode.getNodeType() == Node.ELEMENT_NODE) {
				Element childElem = (Element)childNode;
				if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_ELEMENT.equals(childElem.getLocalName())) {
					if (hasInlineSvg) {
						writer.die("Only one nested SVG element is allowed for %s", container.getTagName());	
					} else {
						hasInlineSvg = true;
					}
				} else if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_UP.equals(childElem.getLocalName())) {
					if (faces.contains(SVGFaceName.UP)) {
						writer.die("Multiple definitions for face %s", childElem.getTagName());	
					} else {
						faces.add(SVGFaceName.UP);
					}
				} else if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_UP_HOVERING.equals(childElem.getLocalName())) {
					if (faces.contains(SVGFaceName.UP_HOVERING)) {
						writer.die("Multiple definitions for face %s", childElem.getTagName());	
					} else {
						faces.add(SVGFaceName.UP_HOVERING);
					}
				} else if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_UP_DISABLED.equals(childElem.getLocalName())) {
					if (faces.contains(SVGFaceName.UP_DISABLED)) {
						writer.die("Multiple definitions for face %s", childElem.getTagName());	
					} else {
						faces.add(SVGFaceName.UP_DISABLED);
					}
				} else if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_DOWN.equals(childElem.getLocalName())) {
					if (faces.contains(SVGFaceName.DOWN)) {
						writer.die("Multiple definitions for face %s", childElem.getTagName());	
					} else {
						faces.add(SVGFaceName.DOWN);
					}
				} else if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_DOWN_HOVERING.equals(childElem.getLocalName())) {
					if (faces.contains(SVGFaceName.DOWN_HOVERING)) {
						writer.die("Multiple definitions for face %s", childElem.getTagName());	
					} else {
						faces.add(SVGFaceName.DOWN_HOVERING);
					}
				} else if (URI_VECTOMATIC.equals(childElem.getNamespaceURI()) && TAG_DOWN_DISABLED.equals(childElem.getLocalName())) {
					if (faces.contains(SVGFaceName.DOWN_DISABLED)) {
						writer.die("Multiple definitions for face %s", childElem.getTagName());	
					} else {
						faces.add(SVGFaceName.DOWN_DISABLED);
					}					
				} else {
					writer.die("Element %s cannot be nested under %s", childElem.getTagName(), container.getTagName());	
				}
			}
		}
		return hasInlineSvg;
	}
	

	protected void parseFace(XMLElement elem, UiBinderWriter writer, String fieldName,
			XMLElement childElem, SVGFaceName faceName) throws UnableToCompleteException {
	    for (XMLElement child : childElem.consumeChildElements()) {
	    	List<String[]> styleChanges = new ArrayList<String[]>();
	    	if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_STYLE_CHANGE.equals(child.getLocalName())) {
	    		styleChanges.add((child.hasAttribute(ATTR_CLASS_NAMES))
	    		 ? child.consumeStringArrayAttribute(ATTR_CLASS_NAMES)
	    		 : new String[0]);
			} else {
				writer.die("Unsupported element %s in face definition", child.getElement().getTagName());
			}
    		StringBuilder builder = new StringBuilder();
    		builder.append("new ");
    		builder.append(SVGFace.class.getCanonicalName());
    		builder.append("(");
    		builder.append("new ");
    		builder.append(SVGStyleChange.class.getCanonicalName());
    		builder.append("[] {");
	    	for (String[] styleChange : styleChanges) {
	    		builder.append("new ");
	    		builder.append(SVGStyleChange.class.getCanonicalName());
	    		builder.append("(new ");
	    		builder.append(String.class.getCanonicalName());
	    		builder.append("[] {");
		    	for (int i = 0; i< styleChange.length; i++) {
		    		if (i > 0) {
			    		builder.append(", ");
		    		}
		    		builder.append(styleChange[i]);
		    	}
	    		builder.append("})");
	    	}
    		builder.append("}");
    		builder.append(")");
    		writer.addStatement("%s.addFace(%s.%s, %s);", fieldName, SVGFaceName.class.getCanonicalName(), faceName, builder.toString());		
	    }
	}

	protected void parseSvg(XMLElement elem, UiBinderWriter writer, String fieldName,
			XMLElement childElem) throws UnableToCompleteException {
		
		Element container = childElem.getElement();
		NodeList childNodes = container.getChildNodes();
		Element root = null;
		for (int i = 0, length = childNodes.getLength(); i < length; i++) {
			Node node = childNodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				if (root == null 
				&& SVGConstants.SVG_NAMESPACE_URI.equals(node.getNamespaceURI()) 
				&& SVGConstants.SVG_SVG_TAG.equals(node.getLocalName())) {
					root = (Element)node;
				} else {
					writer.die("%s must contain inline svg", elem);
				}
			}
		}
		if (root == null) {
			writer.die("%s must contain inline svg", elem);
		}
	    writer.beginAttachedSection(fieldName + ".getElement()");
        SvgInterpreter interpreter = SvgInterpreter.newInterpreterForUiObject(writer, fieldName, root);
        String rawSvg = childElem.consumeInnerHtml(interpreter);
        String omSvgParser = OMSVGParser.class.getCanonicalName();
		writer.addStatement("%s.setSvgElement(%s.parse(\"%s\"));", fieldName, omSvgParser, rawSvg);		
		writer.endAttachedSection();
	}
	
	@Override
	public void parse(XMLElement elem, String fieldName, JClassType type,
			UiBinderWriter writer) throws UnableToCompleteException {

		Element container = elem.getElement();
		boolean hasInlineSvg = validate(writer, container);
		if (elem.hasAttribute(ATTR_RESOURCE) && hasInlineSvg) {
			writer.die("In %s, attribute \"%s\" and inline svg are mutually exclusive", elem, ATTR_RESOURCE);
		}
		if (!(elem.hasAttribute(ATTR_RESOURCE) || hasInlineSvg)) {
			writer.die("In %s, attribute \"%s\" or inline svg must be present", elem, ATTR_RESOURCE);
		}
		if (elem.hasAttribute(ATTR_RESOURCE)) {
		    JClassType svgResourceType = writer.getOracle().findType(SVGResource.class.getCanonicalName());
			String resource = elem.consumeAttribute(ATTR_RESOURCE, svgResourceType); 
			writer.addStatement("%s.setResource(%s);", fieldName, resource);		
		}
		if (elem.hasAttribute(ATTR_CLASS_NAME_BASE_VAL)) {
		    JClassType stringResourceType = writer.getOracle().findType(String.class.getCanonicalName());
			String resource = elem.consumeAttribute(ATTR_CLASS_NAME_BASE_VAL, stringResourceType); 
			writer.addStatement("%s.setClassNameBaseVal(%s);", fieldName, resource);		
		}
	    for (XMLElement child : elem.consumeChildElements()) {
			if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_ELEMENT.equals(child.getLocalName())) {
				parseSvg(elem, writer, fieldName, child);
			} else if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_UP.equals(child.getLocalName())) {
				parseFace(elem, writer, fieldName, child, SVGFaceName.UP);
			} else if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_UP_HOVERING.equals(child.getLocalName())) {
				parseFace(elem, writer, fieldName, child, SVGFaceName.UP_HOVERING);
			} else if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_UP_DISABLED.equals(child.getLocalName())) {
				parseFace(elem, writer, fieldName, child, SVGFaceName.UP_DISABLED);
			} else if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_DOWN.equals(child.getLocalName())) {
				parseFace(elem, writer, fieldName, child, SVGFaceName.DOWN);
			} else if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_DOWN_HOVERING.equals(child.getLocalName())) {
				parseFace(elem, writer, fieldName, child, SVGFaceName.DOWN_HOVERING);
			} else if (URI_VECTOMATIC.equals(child.getNamespaceUri()) && TAG_DOWN_DISABLED.equals(child.getLocalName())) {
				parseFace(elem, writer, fieldName, child, SVGFaceName.DOWN_DISABLED);
			}
		}
		writer.addStatement("%s.showFace(%s.%s);", fieldName, SVGFaceName.class.getCanonicalName(), SVGFaceName.UP.name());		
	}

}
