package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;
	
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String  doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	
		
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
		/*
		 * 1.id : is an attribute . it is always unique and its not mandatory id should be available
		 * but if it there it should be unique 
		 */
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		
		/*
		 * 2. name locator: is also an attribute. if id is not available then we go for name
		 * it can be duplicated.
		 */
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		/*
		 * 3. Class name: is an another attribute and can be duplicated
		 */
		//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
		//c1 c2 c3 c4 .... etc
		
		/*
		 * 4. x path : It is not an attribute. it is address of an HTML DOM
		 * X - means xml so represent xml path of a particular element.
		 */
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
//		This above is the first approach 
		
		//Approach 6 can be used i.e By locator appraoch
		
//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		
//		doSendKeys(eid, "test@gmail.com");
//		doSendKeys(pwd, "test@123");
//		doClick(loginBtn);
		
		/*
		 * 5. Css Selector : it is not an attribute
		 */
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//		
//		By emailid = By.cssSelector("#input-email");
//		By pwd = By.cssSelector("#input-password");
//		By login = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");
//		
//		doSendKeys(emailid, "test@gmail.com");
//		doSendKeys(pwd, "test@123");
//		doClick(login);
		
		
		/*
		 * 6.linkText : applicable only for links and link text is not an attribute
		 * html tag : <a> anchor tag
		 */
//		driver.findElement(By.linkText("Login")).click();
		
//		By loginLink = By.linkText("Login");
//		doClick(loginLink);

		/*
		 * 7. Partial link text : applicable for link and link text for partial
		 * can be duplicated
		 */
//		driver.findElement(By.partialLinkText("Forgotten")).click();
//		By ForgotLink = By.partialLinkText("Forgotten");
//		doClick(ForgotLink);
		
		/*
		 * 8. tag name: html tags
		 */
//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		//uisng by locator
//		By header = By.tagName("h2");
//		String headervalue = doElementGetText(header);
//		if(headervalue.equals("New Customer")) {
//			System.out.println("Headrer is Corect -- PASS");
//		}
//		else {
//			System.out.println("Header is not Correct -- FAIL");
//		}
		
		
		By logo= By.className("img-responsive");
		doClick(logo);
		
		//id - I
		//name - II 
		//classname - III
		
		//xpath
		//css selector
		
		//link text
		//partial link text
		
		//tag name
		
		//id --> #
		//classname --> .
			
		
		
		
		
		
		
		
	}

}
