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
package org.vectomatic.dev.svg.impl.gen;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.SAXParseException;

import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.uibinder.rebind.UiBinderWriter;

/**
 * Class to validate an SVG file against the SVG 1.1 XSD schema
 * @author laaglu
 */
public class SVGValidator {
	private static Validator validator;
	
	/**
	 * Constructor (block instantiation)
	 */
	private SVGValidator() {
	}
	/**
	 * Validates the specified SVG input
	 * @param rawSvg The SVG input to validate 
	 * @param systemId The URL of the resource being validated
	 * @param logger A logger to report validation errors (if the method is invoked
	 * to validate an {@link org.vectomatic.dom.svg.ui.SVGResource} or an
	 * {@link org.vectomatic.dom.svg.ui.ExternalSVGResource})
	 * @param writer A writer to report validation errors (if the method is
	 * invoked to validate a UiBinder template)
	 * @throws UnableToCompleteException If validation error occur
	 */
	public static void validate(String rawSvg, String systemId, final TreeLogger logger, final UiBinderWriter writer) throws UnableToCompleteException {
	    try {
	    	if (validator == null) {
	    		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	    		URL svgSchemaURL = SVGValidator.class.getResource("SVG.xsd");
	    	    Source schemaFile = new StreamSource(svgSchemaURL.openStream(), svgSchemaURL.toExternalForm());
	    	    Schema schema = factory.newSchema(schemaFile);
	    	    validator = schema.newValidator();
	    	    validator.setResourceResolver(new LSResourceResolver() {
					@Override
					public LSInput resolveResource(String type, String namespaceURI,
							final String publicId, final String systemId, final String baseURI) {
						if (logger != null) {
				    		logger.log(TreeLogger.INFO, "resolveResource(" + type + ", " + namespaceURI + ", " + publicId + ", " + systemId + ", " + baseURI + ")");
				    	}
						return new LSInput() {

							@Override
							public Reader getCharacterStream() {
								return new StringReader("");
							}

							@Override
							public void setCharacterStream(
									Reader characterStream) {
							}

							@Override
							public InputStream getByteStream() {
								return new ByteArrayInputStream(new byte[0]);
							}

							@Override
							public void setByteStream(InputStream byteStream) {
							}

							@Override
							public String getStringData() {
								return "";
							}

							@Override
							public void setStringData(String stringData) {							
							}

							@Override
							public String getSystemId() {
								return systemId;
							}

							@Override
							public void setSystemId(String systemId) {
							}

							@Override
							public String getPublicId() {
								return publicId;
							}

							@Override
							public void setPublicId(String publicId) {
							}

							@Override
							public String getBaseURI() {
								return baseURI;
							}

							@Override
							public void setBaseURI(String baseURI) {
							}

							@Override
							public String getEncoding() {
								return null;
							}

							@Override
							public void setEncoding(String encoding) {
							}

							@Override
							public boolean getCertifiedText() {
								return false;
							}

							@Override
							public void setCertifiedText(boolean certifiedText) {
							}
							
						};
					}
				});
	    	}
	        validator.validate(new StreamSource(new StringReader(rawSvg), systemId));
	    } catch (SAXParseException e) {
	    	if (writer != null) {
	    		writer.die(e.getMessage() + " @" + e.getSystemId() + " L:" + e.getLineNumber() + ",C:" + e.getColumnNumber());
	    	} else if (logger != null) {
	    		logger.log(TreeLogger.ERROR, "Invalid SVG input @" + e.getSystemId() + " L:" + e.getLineNumber() + ",C:" + e.getColumnNumber(), e);
				throw new UnableToCompleteException();
	    	}
	    } catch (Throwable t) {
	    	if (writer != null) {
	    		writer.die(t.getMessage());
	    	} else if (logger != null) {
	    		logger.log(TreeLogger.ERROR, "Invalid SVG input", t);
				throw new UnableToCompleteException();
	    	}
	    }
	}
}
