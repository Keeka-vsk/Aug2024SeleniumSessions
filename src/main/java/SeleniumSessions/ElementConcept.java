package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementConcept {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

	public static void main(String[] args) {

		
		driver = new ChromeDriver();//session id is 123
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//DOM: Document Object Model
		//1st: way of creating the web element
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2nd: approach
		//Creating webElement and store it and sendkeys seperately.
		WebElement emailId = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		
		emailId.sendKeys("test@gmail.com");
		password.sendKeys("test@123");
		
		//3rd: approach
		//break into by locator and webelement and sendkeys
		By eid = By.id("input-email");
		By pwd = By.id("input-password");
		/**
		 * using By locator we are not hitting the server
		 * we just assign the value
		 * we hit the server only by calling driver 
		 */
		WebElement emailId1 = driver.findElement(eid);
		WebElement password1 = driver.findElement(pwd);
		
		emailId1.sendKeys("test@gmail.com");
		password1.sendKeys("test@123");
		
		//4th: approach By locator + generic method for Element
		By eid1 = By.id("input-email");
		By pwd1 = By.id("input-password");
		
		getElement(eid1).sendKeys("test@gmail.com");
		getElement(pwd1).sendKeys("test@123");
		
		//5th approach: By locator + generic method for Element and actions
		By eid2 = By.id("input-email");
		By pwd2 = By.id("input-password");
		
		doSendKeys(eid2, "test@gmail.com");
		doSendKeys(pwd2, "test@123");
		
		/*
		 *6th: approach: By locator + generic method for Element 
		 *and actions in other element util class
		 */
		By eid3 = By.id("input-email");
		By pwd3 = By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);  
		eleutil.doSendKeys(eid3, "test@gmail.com");
		eleutil.doSendKeys(pwd3, "test@123");
		
		/*
		 * 7th approach: Browser Util + Element Util
		 * to understand this apporach we create a proper class
		 * called OpenCartLoginTest
		 */
		
		//8th appr: By locators --> converting it to String locators
		String email_Id = "input-email";
		String pwd_Id = "input-password";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", email_Id, "test@gmail.com");
		eleUtil.doSendKeys("id",pwd_Id, "test@123");
		
		//9th approach is : POM (Page Object Model) + Framework
		
		
		
		
		
	}

}
