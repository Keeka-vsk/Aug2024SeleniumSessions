package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.JavaScriptUtil;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://classic.crmpro.com/");
		
		//java script executor
		
//		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		//sel+java/py/ruby
		//JavascriptExecutor --> is an Interface
		//RemoteWebDriver implements java script executor
		//JavaScriptExecutor --> executeScript(Script)
		//Script --> executeScript(script) --> it will be executed on the browser
		
//		JavascriptExecutor js =  (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJs();
//		System.out.println(title);
		
		
//		jsUtil.generateJSAlert("Hello keerthana");
		
//		String pageText = js.executeScript("return document.documentElement.innerText").toString();
//		System.out.println(pageText);
//		if(pageText.contains("Returning Customer")) {
//			System.out.println("PASS - ITS WORKING");
//		}
		
//		jsUtil.scrollPageDownWithJS();
//		Thread.sleep(1000);
//		jsUtil.scrollPageUpWithJS();
		
		WebElement ele = driver.findElement(By.xpath("//h3[normalize-space()='Calls & Voice']"));
//		jsUtil.scrollIntoView(ele);
		
		jsUtil.drawBorder(ele);
		
		
		
		
		
		
		
		
	}

}
