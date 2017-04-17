package controller;	

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import entity.DPSretrieveResponse;
import service.RequestUnMarshaller;

public class TestClass {
	@SuppressWarnings("unchecked")
	public static void main(String argv[]) {
		try{
			File fXmlFile = new File("jigs.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			RequestUnMarshaller marsha=new RequestUnMarshaller(DPSretrieveResponse.class);
			DPSretrieveResponse result=(DPSretrieveResponse)marsha.getRequestObjectFromXML(fXmlFile);
			System.out.println(result.getXmlns());
		} catch (Exception e) {
		e.printStackTrace();
	    }
		
	}
	
}