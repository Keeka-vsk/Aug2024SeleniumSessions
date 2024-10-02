package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class WaitWithIntervalTime {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		By aboutUsLink = By.linkText("About Us");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@gmail.com");
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(3));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@gmail.com");
		
		/**
		 * Interview Question:
		 * What is the default pooling time in selenium?
		 * 500 milliseconds
		 */
	
		
		
		
		
		

	}

}
