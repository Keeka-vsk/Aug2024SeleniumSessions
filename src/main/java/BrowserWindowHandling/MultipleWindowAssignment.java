package BrowserWindowHandling;

import java.util.Iterator;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleWindowAssignment {

	public static void main(String[] args) throws InterruptedException {

		//to open browser	
		WebDriver driver = new ChromeDriver();
		//to open naukri website
		driver.get("https://www.naukri.com/");//parent window
		//it will maximize the window
		driver.manage().window().maximize();
		//to get parent window handle or id
		String mainWindow = driver.getWindowHandle();
		System.out.println("Parent Window ID is : "+ mainWindow);
		Thread.sleep(2000);
		
		//this will open a new tab in the same window from naukri site
		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		
		//will store the all window handles or ID's of all windows opened in the browser
		Set<String> handles = driver.getWindowHandles();
		//System.out.println(handles);
		//this will iterate the values stored in Set<String>
		Iterator<String> it = handles.iterator();
		
//		String parentwindowId = it.next();
//		System.out.println(parentwindowId);
		
		
		while(it.hasNext()) {
			String windowIds = it.next();
			driver.switchTo().window(windowIds);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(!windowIds.equals(mainWindow)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		
		System.out.println("---------------------------------");
		
		driver.findElement(By.xpath("//span[text()='HR']")).click();
		
		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();
		while(it1.hasNext()) {
			String windowIds1 = it1.next();
			driver.switchTo().window(windowIds1);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(!windowIds1.equals(mainWindow)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		
		System.out.println("-----------------------------------");
		
		driver.findElement(By.xpath("//span[text()='MNC']")).click();
		
		Set<String> handles2 = driver.getWindowHandles();
		Iterator<String> it2 = handles2.iterator();
		while(it2.hasNext()) {
			String windowIds2 = it2.next();
			driver.switchTo().window(windowIds2);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			if(!windowIds2.equals(mainWindow)) {
				driver.close();
			}
		}
		
		
		
		
       
				
		
		
		
		
		
		
		
		
		
	}

}
