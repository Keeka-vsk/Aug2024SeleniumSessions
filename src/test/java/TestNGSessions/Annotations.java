package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	
//	[RemoteTestNG] detected TestNG version 7.0.0
//	BS -- Connect With DB
//	BT -- Create User
//	BC -- launchBrowser
//	
	//	BM -- loginToApp
	//	T -- CheckOuttest
	//	AM -- logout
//	
	//	BM -- loginToApp
	//	T -- searchTest
	//	AM -- logout
//	
//	AC -- Close the Browser
//	AT -- User Deleted
//	PASSED: checkOutTest
//	PASSED: searchTest
//	AS -- Disconnected With DB

	
		//1
		@BeforeSuite
		public void connectWithDB() {
			System.out.println("BS -- Connect With DB");
		}
		
		//2
		@BeforeTest
		public void createUser() {
			System.out.println("BT -- Create User");
		}
		
		//3
		@BeforeClass
		public void launchBrowser() {
			System.out.println("BT -- launchBrowser");
		}
		
		//4//7//10
		@BeforeMethod
		public void loginToApp() {
			System.out.println("BM -- loginToApp");
		}
		
		//11
		@Test
		public void searchTest() {
			System.out.println("T -- searchTest");
		}
		
		//5
		@Test
		public void addToCartTest() {
			System.out.println("T -- addToCart");
		}
		
		//8
		@Test
		public void checkOutTest() {
			System.out.println("T -- CheckOuttest");
		}
		
		
		//6//9//12
		@AfterMethod
		public void logout() {
			System.out.println("AM -- logout");
		}
		
		//13
		@AfterClass
		public void closeBrowser() {
			System.out.println("AC -- Close the Browser");
		}
		
		//14
		@AfterTest
		public void deleteUser() {
			System.out.println("AT -- User Deleted");
		}
		
		//15
		@AfterSuite
		public void disConnetWithDB() {
			System.out.println("AS -- Disconnected With DB");
		}
		
		

	

	
}
