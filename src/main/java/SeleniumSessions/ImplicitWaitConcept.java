package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
		//implcitly wait
		//dynamic wait
		//global wait : its applied for all web elements(only for webElements)
		//applied after the driver initialization
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//e1 --> 10 secs --> 2secs : 8 secs
		//e1 --> 10 secs --> 10 secs : no such element exception
		
		
		//e2
		//e3
		//e4
		//e5
		//e6
		//e50
		
		//homepage: 20 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//e51, e52, e80
		
		//login page: 10 secs :
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//e1: 10 sec
		
		//registration page: 50 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//page : 0 secs : nullification of implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
		
		
		
		
		
		
		
	}

}
