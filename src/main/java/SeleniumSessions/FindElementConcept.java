package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Create the WebElement + Perform the Action(sendKeys, Click, getText, etc...)
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//deliberately passing wrong id in the By locator
		//driver.findElement(By.id("input-email111")).sendKeys("test@gmail.com");
		// NoSuchElementException: no such element: Unable to locate element:

		//driver.findElement(By.id("input-email")).sendKeys(123);
		/*
		 * You can pass interger value in  send keys you have to
		 * convert integer to string then only you can pass the value
		 */
//		int totalBill = 123;
//		String totalBillAmt = String.valueOf(totalBill);
//		driver.findElement(By.id("input-email")).sendKeys(totalBillAmt);
		
		//handling null values:
		//driver.findElement(By.id("input-email")).sendKeys(null);
		// IllegalArgumentException: Keys to send should be a not null CharSequence
		
		//driver.findElement(By.id(null)).sendKeys("test@123");

		//sendkeys: will work with String, StringBuilder and StringBuffer
		//StringBuilder sb = new StringBuilder("test@gmail.com");
		//driver.findElement(By.id("input-email")).sendKeys(sb);
		
		//driver.findElement(By.id("input-email")).sendKeys(sb+"automation");
		
		//empty values:
		//driver.findElement(By.id("")).sendKeys(sb+"automation");
		//InvalidSelectorException: invalid selector: An invalid or illegal selector was specified
		driver.findElement(By.id("input-email")).sendKeys("");
		
		
		
		//CharSequence(I) <----- String , String Buffer ,  String Builder => these 3 classes internally implementing char sequence
		
		
		
		
	}

}
