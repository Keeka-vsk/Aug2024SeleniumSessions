package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandleWithoutSelect {

	static WebDriver driver;
	
	public static void getDropDownValues(By locator,String Value) {
		List<WebElement> allOptionsList = driver.findElements(locator);
		for(WebElement e: allOptionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(Value)) {
				e.click();
				break;
			}
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By countryList = By.xpath("//select[@id='Form_getForm_Country']//option");
		//using css : By.cssSelector("select#Form_getForm_Country > option")		
		getDropDownValues(countryList, "Angola");
		
		
	}

}
