package TestNGSessions;

import org.testng.annotations.Test;

public class ExceptedException {
	
	String name;
	
	
	@Test(expectedExceptions = {ArithmeticException.class , NullPointerException.class})
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0;
		
		ExceptedException obj = null;
		System.out.println(obj.name);
		System.out.println("Byeeeeeeee");
		
		
	}
	
	
	
	

}
