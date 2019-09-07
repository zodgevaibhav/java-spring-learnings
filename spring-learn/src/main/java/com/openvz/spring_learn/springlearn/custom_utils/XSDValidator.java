package com.openvz.spring_learn.springlearn.custom_utils;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XSDValidator {
	
/*	public static void main(String[] args) throws Exception {
		String xmlRequest = "<?xml version=\"1.0\"?>\n" + 
				"<Employee>\n" + 
				"	<name>Pankaj</name>\n" + 
				"	<age>29</age>\n" + 
				"	<role>Java Developer</role>\n" + 
				"	<gender>Male</gender>\n" + 
				"</Employee>";
		
		String employee1 = "<class>  \n" + 
				"   <student rollno = \"393\">\n" + 
				"      <firstname>Vaibhav</firstname>    \n" + 
				"      <lastname>Zodge</lastname>\n" + 
				"      <nickname>VZ</nickname>\n" + 
				"      <marks>99</marks>	 \n" + 
				"   </student>\n" + 
				"</class>";
		System.out.println(validateXMLSchema(employee1));
	}*/
public static boolean validateXMLSchema(String xmlDocumentAsString) throws Exception{
        
        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File("/Users/vaibhavzodge/Documents/ALL_GIT_REPO/java-spring-learnings/spring-learn/src/main/resources/sample.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new StringReader(xmlDocumentAsString)));
        } catch (IOException | SAXException e) {
            throw e;
        }
        return true;
    }

}
