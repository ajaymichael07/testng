package attribute;

import org.testng.annotations.Test;

public class Priority_enabled {
//	Priority -->it is a attribute which is used to run orderly
//	         -->Default value is '0'
//	         -->DataType is Integer
//	         
//	enabled -->is a condition
//	        -->Default value is false
//	        -->if we give 'false' codition it does not execute
	
	
	@Test(priority=1,enabled=false)
	
    public void createLead() {
		
		System.out.println("Print create lead ");
		
	}
	@Test(priority=0)
	
    public void editLead() {
		
		System.out.println("Print edit lead ");
		
	}
	@Test(priority=2)
    public void deleteLead() {
	
	System.out.println("Print delete lead ");
	
	}
}
