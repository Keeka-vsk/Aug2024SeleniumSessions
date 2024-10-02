package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//Selenium 4: introduced this
		
		Actions act = new Actions(driver); 
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(1000);
		
		
		
		//CMD/CNTRL + ARROW KEYS DOWN/UP
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		Thread.sleep(1000);
		
		
		//Scroll to Element:
		act.scrollToElement(driver.findElement(By.linkText("My Account")))
					.click(driver.findElement(By.linkText("My Account"))).build().perform();
		Thread.sleep(1000);
		
		//refresh the page : CNTRL +f5
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
		
	}

}
