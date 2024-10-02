package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * this doesn't mean that the element is visible
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForPresenceOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking an element is present on the DOM of a page and visible
	 * Visibility means that the element is not only displayed but also has a height and width 
	 * that is greater than 0
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that all elements present on the webpage that match the 
	 * locator is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForVisibilityOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

	public static void doClickWithWait(By locator,int timeOut) {
		waitForVisibilityOfElement(locator, timeOut).click();
	}
	
	public static void doSendKeysWithWait(By locator, String value, int timeOut) {
		waitForVisibilityOfElement(locator, timeOut).click();
	}
	
	/**
	 * An expectation for checking that there is at least one element present on the WebPage 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForPresenceOfElements(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	
	
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/*
		 *Concept of dynamic wait for the specific element/non webelement
		 *on the basis of some expected conditions.	 
		 */
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		emailEle.sendKeys("test@gmail.com");
		
		waitForPresenceOfElement(emailId, 5).sendKeys("test@gmail.com");
		//10 secs
		//2 secs
		//ignored : 8 secs
		//after secs also element is not present: TimeOutException + NosuchElementException
		driver.findElement(password).sendKeys("test@123");
		driver.findElement(loginBtn).click();
				
		By aboutUslink = By.linkText("About Us");
		waitForPresenceOfElement(aboutUslink, 5);
		waitForVisibilityOfElement(aboutUslink, 5);
		
		
		
	}

}
