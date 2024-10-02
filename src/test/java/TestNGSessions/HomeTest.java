package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest {
	
	
	//Python : PyTest/unitTest
	//.Net : Nunit
	//Java : Junit/TestNG
	//JS : Mocha/Jasmine
	
	//feature: method : API's : WS
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	//test - Unit test + Assertion
	@Test
	public void test1() {
		Assert.assertEquals(sum(10,20), 30);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(sum(0,20), 20);
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(sum(-10,20), 10);
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(sum(-10,-20), -30);
	}
	

}
