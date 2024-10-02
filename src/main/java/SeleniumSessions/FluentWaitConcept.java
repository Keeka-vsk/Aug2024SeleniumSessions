package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;
	
	public static WebElement waitForElementWithFluentWait(By locator, int timeOut, int intervalTime) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(intervalTime))
				.withMessage("Time nout done... Element Not found...")
				.ignoring(NoSuchElementException.class);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		By aboutUsLink = By.linkText("About Us");
		
		//WebDriver wait with fluent wait features:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait
		.pollingEvery(Duration.ofSeconds(2))
		.ignoring(NoSuchElementException.class)
		.withMessage("--time out is done... element isn ot found...");
		
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//								.withTimeout(Duration.ofSeconds(10))
//								.pollingEvery(Duration.ofSeconds(2))
//								.withMessage("Time nout done... Element Not found...")
//								.ignoring(NoSuchElementException.class);
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).sendKeys("test@gmail.com");
//		
		waitForElementWithFluentWait(emailId, 10, 2).sendKeys("test@gmail.com");
		
		
		
		
	}

}
