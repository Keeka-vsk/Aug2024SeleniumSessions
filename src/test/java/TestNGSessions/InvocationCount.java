package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	
	@Test(invocationCount = 10)
	public void searchProductTest() {
		System.out.println("search product Test");
	}

}
