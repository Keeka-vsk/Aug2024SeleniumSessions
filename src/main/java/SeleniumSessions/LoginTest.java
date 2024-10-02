package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//WebElement:
		//Create the WebElement + Perform the action(Click, sendKeys, getText, isDisplayed) 
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String email_id = "input-email";
		String pwd_id = "input-password";
		String login_xpath = "//input[@value='Login']";
		String register_linkText = "Register";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", email_id, "test@gmail.com");
		eleUtil.doSendKeys("id", pwd_id, "test@123");
		eleUtil.doClick("xpath", login_xpath);
		
		String registerValue = eleUtil.doElementGetText("linktext", register_linkText);
		System.out.println(registerValue);
		

	}

}
