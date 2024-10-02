package ElementVisibility.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDisableElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://classic.freecrm.com/register/");
//		
//		Thread.sleep(2000);
//		
//		
//		WebElement submit = driver.findElement(By.id("submitButton"));
//		
//		//submit.click();//it will give you exception ElementClickInterruptExeption
//		
//		Actions act = new Actions(driver);
//		act.click(submit).perform();
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.cssSelector("#pass"));
		
//		text.sendKeys("abc@123");//ElementNotInteractableException
		
		Actions act = new Actions(driver);
		act.sendKeys("abc@123").perform();
		
		//null usinf sendkeys
		driver.findElement(By.id("fname")).sendKeys(null);//IllegalArgumentException
		
		
	}

}
