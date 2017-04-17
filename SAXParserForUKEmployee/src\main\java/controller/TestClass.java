package controller;	

import java.io.File;

import entity.UKRequest.Request;
import service.RequestUnMarshaller;

public class TestClass {
	public static void main(String argv[]) {
		try{
			File fXmlFile = new File("original.xml");
			RequestUnMarshaller<Request> marshal=new RequestUnMarshaller<Request>(Request.class);
			Request result=(Request)marshal.getRequestObjectFromXML(fXmlFile);
			System.out.println(result.toString());
		} catch (Exception e) {
		e.printStackTrace();
	    }
		
	}
	
}