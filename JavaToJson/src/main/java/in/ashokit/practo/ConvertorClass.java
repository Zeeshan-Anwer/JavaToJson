package in.ashokit.practo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertorClass {
	
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Consumer c=new Consumer();
		c.setDesg("Software Engineer");
		c.setId(1);
		c.setName("Zeeshan");
		
		ObjectMapper om=new ObjectMapper();
		om.writeValue(new File("consumers.json"), c);
		System.out.println("Json File Created");
		
		File f=new File("consumers.json");
		Consumer cr=om.readValue(f, Consumer.class);
		
		System.out.println(cr);
	}
	
	
	

}
