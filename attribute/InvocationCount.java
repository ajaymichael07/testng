package attribute;

import org.testng.annotations.Test;

public class InvocationCount {
	
	//invocationCount -->it is a method which is use to run a testcases n no of times
	//                -->default value is '1'
	//	              -->Use to run testcases sequencly
	
//	threadPoolSize --> it is used to run testcases parallely in multiple browser
//	               -->it's dataType is integer
//	               -->Default value is '1'
	
	@Test(threadPoolSize=5,invocationCount=5)
	
      public void createLead() {
		
		System.out.println("Print create lead ");
		
	}
	@Test(invocationCount=5)
	
      public void editLead() {
		
		System.out.println("Print edit lead ");
		
	}
	@Test(invocationCount=2)
      public void deleteLead() {
	
	System.out.println("Print delete lead ");
	
}
      

}
