package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test
	public void loginTest() {
		System.out.println("login to app");
	}
	

	@Test(dependsOnMethods = "loginTest")
	public void searchHomePageTest() {
		System.out.println("search on the app Home page");
	}


	@Test(dependsOnMethods = "searchTest")
	public void addToCartTest() {
		System.out.println("add to cart");
	}

	//AAA pattern : Arrange, Act and Assert
	//no dependency
	//no priority
	//test case and method should be independent
	
	@Test
	public void searchTest() {
		//login step(un,pwd)
		//search(macbook)
		//assertions: only onr assertion
		//a1 : failed
		//a2
		//a3
		//a4
		//a5
		
	}
	
	//url, title, logo, login, footer 
	//openCartTest() --> its 5 diff functionality so you have to write 5 diff test cases
	

}
