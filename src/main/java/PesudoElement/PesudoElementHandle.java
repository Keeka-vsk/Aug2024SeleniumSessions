package PesudoElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content');";
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		String mand_Text = jse.executeScript(script).toString();
		
		System.out.println(mand_Text);
		
		if(mand_Text.contains("*")) {
			System.out.println("First name is mandatory");
		}
		

	}

}
