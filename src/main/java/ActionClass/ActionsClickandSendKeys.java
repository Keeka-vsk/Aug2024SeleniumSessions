package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickandSendKeys {
	
	static WebDriver driver;
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionSendKeys(By locator, String Value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), Value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(By.id("input-email")), "keerth@gmail.com").build().perform();
		act.sendKeys(driver.findElement(By.id("input-password")), "abc@123").build().perform();
		act.click(driver.findElement(By.xpath("//input[@value='Login']"))).perform();
		
		//Click: clicks in the middle of the given Element. Equivalent to: Actions.moveToElement(onElement).click()
		
	}

}
