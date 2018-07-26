/**
 * 
 */
package com.heyjson.validator.utils;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;

/**
 * @author Vamsi
 *
 */
public class SchemaValiator {
	
	public static void validateJSONSchema(String schemafilename, String jsonfilename) throws JSONException, IOException {
       
		JSONObject jsonschema = ParseJSON.parseJSONFile(schemafilename);
		
		JSONObject data = ParseJSON.parseJSONFile(jsonfilename);
		
		Schema schema = SchemaLoader.load(jsonschema);
	    
		schema.validate(data);
		
		if(schema.equals(data)){
			System.out.println("Equals");
		}else{
			System.out.println("Not Equals");
		}
    }
	
	
	public static void validateJSONSchemaGeneric(String schemafilename, String jsonfilename) throws JSONException, IOException, ProcessingException {
	       
		File schemaFile = new File(schemafilename);
		File jsonFile = new File(jsonfilename);
		
		  if (ValidationUtils.isJsonValid(schemaFile, jsonFile)){
		    	System.out.println("Valid JSON");
		    }else{
		    	System.out.println("NOT Valid JSON");
		    }
    }
	
	 public static boolean validateXMLSchema(String xsdPath, String xmlPath){
	        
	        try {
	            SchemaFactory factory = 
	                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	            javax.xml.validation.Schema schema = factory.newSchema(new File(xsdPath));
	            Validator validator = schema.newValidator();
	            validator.validate(new StreamSource(new File(xmlPath)));
	        } catch (Exception e) {
	        	System.out.println("Invalid XML Schema");
	            System.out.println("Exception: "+e.getMessage());
	            return false;
	        }
	        System.out.println("Valid XML Schema");
	        return true;
	    }

}
