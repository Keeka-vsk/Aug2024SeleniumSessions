package PesudoElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		Thread.sleep(2000);
		
		//it was written under shadow root(open)
//		driver.findElement(By.id("pizza")).sendKeys("cheese");
		
		String pizza_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement pizza = (WebElement)js.executeScript(pizza_script);
		pizza.sendKeys("cheese pizza");
		
		
		//use this site as well
		//https://books-pwakit.appspot.com/
		
	}

}
