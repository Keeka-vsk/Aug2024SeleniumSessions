package BrowserWindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent window 
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();//child window
		Thread.sleep(3000);
		
		//1.fetch the window ID's:
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentwindow = it.next();
		System.out.println("Parent Window ID:" +parentwindow);
		
		String childwindow = it.next();
		System.out.println("Child Window ID:" +childwindow);
		Thread.sleep(3000);
		
		//2.switching work:
		driver.switchTo().window(childwindow);
		System.out.println("Child Window URL :" + driver.getCurrentUrl());
		driver.close();// only child window gets closed.
		
		//3.Back to parent window -> now the driver is lost we need to get back the driver focus to parent window
		driver.switchTo().window(parentwindow);
		System.out.println("Parent Window URL:" + driver.getCurrentUrl());
		driver.quit();//closes parent window
		
		
		
	}

}
