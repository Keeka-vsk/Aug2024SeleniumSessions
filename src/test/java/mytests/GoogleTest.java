package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Whenever you get warnings on import then right click on it 
 * and choose "organise imports"
 */

public class GoogleTest extends BaseTest {
	
//	WebDriver driver;
//	
//	@BeforeTest
//	public void setup() throws InterruptedException {
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
//		
//		Thread.sleep(2000);
//	}
	
	@Test(priority = 1)
	public void googleTitle() {
//		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "Google");
	}
	
	@Test(priority = 2)
	public void googleUrlTest() {
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		Assert.assertTrue(actUrl.contains("google"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
}
