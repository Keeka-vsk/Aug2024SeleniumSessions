package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
	
	static WebDriver driver;
	
	public static WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static void waitForFrameByLocator(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}
	
	public static void waitForFrameByIndex(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}
	
	public static void waitForFrameByIDOrName(String IDOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IDOrName));
	}
	
	public static void waitForFrameByElement(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

	public static void main(String[] args)  {
		
		driver = new ChromeDriver(); //browser
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/"); //page
		
		By img = 
		By.xpath("//div[@id ='imageTemplateContainer']/img");
		By frame = 
		By.xpath("//iframe[contains(@id,'frame-one')]");
		By textBox = 
		By.id("RESULT_TextField-1");
		By header = 
		By.cssSelector("h3.details__form-preview-title");

		driver.switchTo().defaultContent();
		
		waitForVisibilityOfElement(img, 5).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
		waitForFrameByLocator(frame, 5);
		waitForVisibilityOfElement(textBox, 5).sendKeys("Keerthana");
		
		driver.switchTo().defaultContent();
		
		String headerValue = waitForVisibilityOfElement(header, 5).getText();
		System.out.println(headerValue);
		
		
		
		
			}

}
