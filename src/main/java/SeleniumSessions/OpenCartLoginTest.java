package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		
		//Importing browserutil class so that we access the methods
		BrowserUtil bUtil = new BrowserUtil();
		WebDriver driver = bUtil.launchBrowser("chrome");
		bUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String title = bUtil.getPageTitle();
		System.out.println(title);
		
		By eid = By.id("input-email");
		By pwd = By.id("input-password");
		
		//Importing Element util class so that we access the methods
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(eid, "test@gmail.com");
		eleutil.doSendKeys(pwd, "test@123");
		
		bUtil.quitBrowser();
		
		
		
		

		
	}

}
