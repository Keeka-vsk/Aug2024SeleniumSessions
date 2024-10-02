package SeleniumSessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForBrowserWindow {

	static WebDriver driver;
	
	public static WebElement waitForVisibilityOfElement(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static boolean checkNewWindowExist(int timeOut, int ExpectedNumberOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
		if(wait.until(ExpectedConditions.numberOfWindowsToBe(ExpectedNumberOfWindows))) {
			return true;
		}
		}
		catch(TimeoutException e) {
			System.out.println("Number of windows is different...");
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent window 
		By twitter = By.xpath("//a[contains(@href,'twitter')]");
		
		//waitForVisibilityOfElement(twitter, 5).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//if(wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
		if(checkNewWindowExist(5, 2)) {
			
			Set<String> handles = driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			
			String parentwindow = it.next();
			System.out.println("Parent Window ID:" +parentwindow);
			
			String childwindow = it.next();
			System.out.println("Child Window ID:" +childwindow);
						
			//2.switching work:
			driver.switchTo().window(childwindow);
			System.out.println("Child Window URL :" + driver.getCurrentUrl());
			driver.close();// only child window gets closed.
			
			//3.Back to parent window -> now the driver is lost we need to get back the driver focus to parent window
			driver.switchTo().window(parentwindow);
			System.out.println("Parent Window URL:" + driver.getCurrentUrl());
		}
//		else {
//			System.out.println("Bye");
//		}
		
		
		

	}

}
