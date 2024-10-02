package PesudoElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMElementHandle {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("chrome://settings/");
//		driver.findElement(By.id("searchInput")).sendKeys("notification");
//		//NoSuchElementException ShadowDOMElementHandle  
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\");";
		//html element
		
		//convert html element to ----> selenium webelement
		WebElement search = (WebElement)js.executeScript(search_script);
		search.sendKeys("notification");	
		
		
		
	}

}
