package service;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class RequestUnMarshaller<E> {
	
  private Class<E> type;
  
  public RequestUnMarshaller(Class<E> type) {
      this.type = type;
  }
	
  public Object getRequestObjectFromXML(String requestBodyInput){
	  Object result=null;
	  try{
		  JAXBContext jaxbContext = JAXBContext.newInstance(type);
		  Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	
		  StringReader reader = new StringReader(requestBodyInput);
		  result =  unmarshaller.unmarshal(reader);
	  }catch (JAXBException e) {  
	        e.printStackTrace();  
	  }
	return result;  
  }
  
  public Object getRequestObjectFromXML(File file){
	  Object result=null;
	  try{
		  JAXBContext jaxbContext = JAXBContext.newInstance(type);
		  Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		  result =  unmarshaller.unmarshal(file);
	  }catch (JAXBException e) {  
	        e.printStackTrace();  
	  }
	return result;  
  }
}
