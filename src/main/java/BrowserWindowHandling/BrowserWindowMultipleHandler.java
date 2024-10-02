package BrowserWindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowMultipleHandler {
	
	
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent window
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();//child window
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();//child window
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child window
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();//child window
		
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
			
			if(!windowId.equals(parentWindowId)) {
			driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window URL:" + driver.getCurrentUrl());
		
		
		
		
		
		
		
		
	}

}
