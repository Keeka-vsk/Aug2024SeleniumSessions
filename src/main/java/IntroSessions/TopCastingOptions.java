  package IntroSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//Option 1:
		/* This is individual object creation and here i create individual object 
		 * creation	- run on local machine only on specific browser	
		 */
		ChromeDriver driver = new ChromeDriver();
		 
		//Option 2:
		/*
		 * You can't create object for an Interface
		 */
//		WebDriver driver1 = new WebDriver();
		
		//Option 3:
		/* Here i do top casting
		 * this is valid and recommended - works on local machine and for cross browser
		 * Local machine + cross browser
		 */
		WebDriver driver2 = new ChromeDriver();
		
		//Option 4:
		/*
		 * You can't create object for an Interface
		 */
//		SearchContect driver3 = new SearchContect();
		
		//Option 5:
		/* Valid and not recommended - bcs here i 
		 * can access only 2 method findElement(); and findElements();
		 */ 
		SearchContext driver4 = new ChromeDriver();
//		driver4.findElement(null);
//		driver4.findElements(null);
		
		//Option 6:
		/* Valid and recommended but the only problem is if in future if any class doesn't 
		 * want to connect with RemoteWebDriver and directly connect with 
		 * WebDriver Interface so method in that class can't be used
		 */
		RemoteWebDriver driver5 = new ChromeDriver();
		
		//Option 7:
		/* Valid and recommended - but  we use this only during when we use 
		 * remote machine or in Selenium grid or in the cloud
		 */
		//WebDriver driver6 = new RemoteWebDriver(remoteAddress, capabilities);
		
		//Option 8:
		/* Valid and not recommended - only applicable for chrome and edge browser only
		 */
		ChromiumDriver driver7 = new ChromeDriver();
		
		 
		
	}

}
