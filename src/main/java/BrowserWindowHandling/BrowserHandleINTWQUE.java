package BrowserWindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandleINTWQUE {
	
	static WebDriver driver;
	
	/**
	 * Lets say if you opened 100 window or tab from parent window. how would you move
	 * to one particular window and how will you know that you have moved the driver focus 
	 * to that one particular tab. 
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static boolean switchToWindow(String windowTitle, List<String> hList) {
		
		for(String e: hList) {
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("Found the Right Window...");
				return true;
			}
			
		}
		
		return false;
		
	}
	
	public static void switchToParentWindow(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}
	
	public static void closeAllWindow(String parentWindowId, List<String> hList) {
		for(String e: hList) {
			if(!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();
			}
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		
		

		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent window
		String mainWindow = driver.getWindowHandle();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();//child window
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();//child window
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child window
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();//child window
		
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> hList = new ArrayList<String>(handles);
		
		if(switchToWindow("Facebook", hList)) {
			System.out.println(driver.getCurrentUrl()+ " : " + driver.getTitle());
		}
		
		Thread.sleep(3000);
		closeAllWindow(mainWindow, hList);
		switchToParentWindow(mainWindow);
		System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
		
		
		
		
		
		
		
		
	}

}
