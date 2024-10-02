package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeyswithPause {
	
	static WebDriver driver;

	public static void doActionsSendKeysWithPause(By locator, String value) {
		Actions act = new Actions(driver);
		char[] val = value.toCharArray();
		for(char c: val) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(500).build().perform();
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement username = driver.findElement(By.id("input-email"));
		
//		Actions act = new Actions(driver);
//		
//		String value = "naveen@gmail.com";
//		
//		char[] v1 = value.toCharArray();
//		
//		for(char c: v1) {
//			act.sendKeys(username, String.valueOf(c)).pause(500).build().perform();
//		}
		
		
		
	}

}
