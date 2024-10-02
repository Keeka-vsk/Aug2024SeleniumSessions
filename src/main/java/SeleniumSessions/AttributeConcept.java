package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetElementAtribute(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//webelement + perform action(get attribute)
		
		By email = By.id("input-email");
		By registerlink = By.linkText("Register");
		
//		String place_Holder = driver.findElement(email).getAttribute("placeholder");
//		System.out.println(place_Holder);
//		
//		String regitserHref = driver.findElement(registerlink).getAttribute("href");
//		System.out.println(regitserHref);
//		
//		String regitserClass = driver.findElement(registerlink).getAttribute("class");
//		System.out.println(regitserClass);
		
//		driver.findElement(email).sendKeys("test@gmail.com");
		/*
		 * Value:
		 * you have to capture the value you have entered in sendkeys method 
		 * for this you can use attribute value
		 * String text = driver.findElement(email).getText();
		 * System.out.println(text); //this won't print the text you have entered using sendkeys method.
		 */
		String text = driver.findElement(email).getAttribute("value");
		System.out.println(text);
		
		//now using By option:
		String Placeholdval = doGetElementAtribute(email, "placeholder");
		System.out.println(Placeholdval);
		
		String hrefRegister = doGetElementAtribute(registerlink, "href");
		System.out.println(hrefRegister);
		
		doSendKeys(email, "test@gmail.com");
		String emailValue = doGetElementAtribute(email, "value");
		System.out.println(emailValue);
		
		
		
	}

}
