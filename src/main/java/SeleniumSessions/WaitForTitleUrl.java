package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	
	static WebDriver driver;
	
	public static String waitForTitleContains(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
		if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		}
		catch(TimeoutException e){
			System.out.println(titleFraction + "Title is not present");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
		if(wait.until(ExpectedConditions.titleIs(title))) {//it represent actual title
			return driver.getTitle();
		}
		}
		catch(TimeoutException e){
			System.out.println(title + "Title is not present");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForURLContains(String urlFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getTitle();
		}
		}
		catch(TimeoutException e){
			System.out.println(urlFraction + "Title is not present");
			e.printStackTrace();
		}
		return null;
	}
	
	public static String waitForURLIs(String url, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		
		try {
		if(wait.until(ExpectedConditions.urlToBe(url))) {
			return driver.getTitle();
		}
		}
		catch(TimeoutException e){
			System.out.println(url + "Title is not present");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		By aboutUsLink = By.linkText("About Us");
	
		driver.findElement(aboutUsLink).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		
//		if(wait.until(ExpectedConditions.titleContains("About"))) {
//			System.out.println(driver.getTitle());
//		}
//		else
//		{
//			System.out.println("Title was not present...");
//		}
		
		String title = waitForTitleContains("About", 5);
		System.out.println(title);
	
	
	}

}
