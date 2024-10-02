package BrowserWindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//parent window
		String parentWindowId = driver.getWindowHandle();
		Thread.sleep(5000);
		
		//newwindow is selenium 4 feature
		driver.switchTo().newWindow(WindowType.TAB);//it will open a new tab in the same window
		//driver.switchTo().newWindow(WindowType.WINDOW);// it will open a new window
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		
		
	}

}
