package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	
	//dropdown : html <select> --> options
	//use select class
	//single selection or multiple selection
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int idex) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(idex);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By country = By.id("Form_getForm_Country");
//		WebElement country_ele = driver.findElement(country);
//		
//		Select select = new Select(country_ele);
//		select.selectByIndex(5); //can be used in month drop down
//		Thread.sleep(1000);
//		select.selectByVisibleText("Brazil");
//		Thread.sleep(1000);
//		select.selectByValue("India");
		
		doSelectDropDownByIndex(country, 5);
		Thread.sleep(1000);
		doSelectDropDownByVisibleText(country, "Brazil");
		Thread.sleep(1000);
		doSelectDropDownByValue(country, "India");
		
		
		
		
		
	}

}
