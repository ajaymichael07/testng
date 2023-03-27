package attribute;

import java.security.InvalidAlgorithmParameterException;

import org.testng.annotations.Test;

public class dependsOnMethod {
	
//	dependsOnMethod -->if the parent failed to pass it doesn't allow child to pass
//	                -->Default value is String of Array and Array[]
	
@Test()
	
    public void createLead() throws InvalidAlgorithmParameterException {
		
		System.out.println("Print create lead ");
//		throw new InvalidAlgorithmParameterException();
	}
	@Test(dependsOnMethods="createLead")
	
    public void editLead() {
		
		System.out.println("Print edit lead ");
		
	}
	@Test(dependsOnMethods={"editLead","createLead"})
    public void deleteLead() {
	
	System.out.println("Print delete lead ");
	
	}

}
