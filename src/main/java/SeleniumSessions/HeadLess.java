package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLess {
	

	public static void main(String[] args) {
		
		/*
		 * Headless browser testing: Means no active browser window and no active UI.
		 * Testing is happening behind the scene.
		 * Faster than UI mode.
		 * but might not interact with some complex applications -> bcs some components or webelements 
		 * which require some user actions like mouse drag an drop or some other mouse actions
		 * When to Use:
		 * - we have to use when ever we are running the test in CI/CD.
		 * - or in the cloud
		 * Cloud - AWS - Linus - jenkins
		 */
		
		/*
		 * Chrome Options => These are called browser options
		 */
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--Headless");
		co.addArguments("--icognito");
		
		WebDriver driver = new ChromeDriver(co);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.google.co.uk/");
		System.out.println(driver.getTitle());
		
		
		
	}

}
