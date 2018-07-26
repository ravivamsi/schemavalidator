package com.heyjson.validator;

import java.io.File;
import java.io.IOException;

import org.json.JSONException;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.heyjson.validator.utils.SchemaValiator;


public class App 
{
    public static void main( String[] args ) throws JSONException, IOException, ProcessingException
    {
        System.out.println( "Welcome to JSON Schema Validator" );
        
        SchemaValiator.validateJSONSchemaGeneric(System.getProperty("user.dir")+File.separator+"resources"+File.separator+"schemas"+File.separator+"json"+File.separator+"sampleschema.json", System.getProperty("user.dir")+File.separator+"resources"+File.separator+"json"+File.separator+"sample.json");
        SchemaValiator.validateJSONSchemaGeneric(System.getProperty("user.dir")+File.separator+"resources"+File.separator+"schemas"+File.separator+"json"+File.separator+"sampleschema.json", System.getProperty("user.dir")+File.separator+"resources"+File.separator+"json"+File.separator+"invalidsample.json");
        SchemaValiator.validateXMLSchema(System.getProperty("user.dir")+File.separator+"resources"+File.separator+"schemas"+File.separator+"xml"+File.separator+"employees.xsd", System.getProperty("user.dir")+File.separator+"resources"+File.separator+"xml"+File.separator+"Employees.xml");
        SchemaValiator.validateXMLSchema(System.getProperty("user.dir")+File.separator+"resources"+File.separator+"schemas"+File.separator+"xml"+File.separator+"employees.xsd", System.getProperty("user.dir")+File.separator+"resources"+File.separator+"xml"+File.separator+"Employee.xml");
    }
}
