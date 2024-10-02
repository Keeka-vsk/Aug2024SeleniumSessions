package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WairForAlertConcept {
	
	static WebDriver driver;
	
	public static Alert waitForJSAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void acceptJSAlert(int timeOut) {
		waitForJSAlert(timeOut).accept();
	}
	
	public static void dismissJSAlert(int timeOut) {
		waitForJSAlert(timeOut).dismiss();
	}
	
	public static void getJSAlertText(int timeOut) {
		waitForJSAlert(timeOut).getText();
	}
	
	public static void enterValueOnJSAlert(int timeOut, String value) {
		waitForJSAlert(timeOut).sendKeys(value);
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.alert:
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alt.getText());
		alt.accept();
		
		
		
	}

}
