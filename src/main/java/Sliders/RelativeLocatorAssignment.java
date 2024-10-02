package Sliders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocatorAssignment {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(2000);
		
		/*
		 * 1 - from yes left side a radio button and right side radio 
		 * button
		 * 2 - right side of privacy policy there is a check box
		 * click on it
		 * 3 - left side of check boc there should be privacy policy
		 * read it  
		 */
		
	}

}
