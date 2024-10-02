package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest{
	
//WebDriver driver;
//	
//	/**
//	 * These are precondition before writting the Test Cases
//	 * so we write it in BeforeTest
//	 * @throws InterruptedException 
//	 */
//	@BeforeTest
//	public void setup() throws InterruptedException {
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(10));
//		
//		Thread.sleep(2000);
//	}
	
	@Test(priority = 2)//(priority = -2)//(priority = 1)
	public void isOpenCartLogoVisibleTest() {
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		boolean flag = driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	
	@Test(priority = 3)//(priority = -3)//(priority = 1)
	public void openCartTitleTest() {
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	@Test(priority = 1)//(priority = -1)//(priority = 1)
	public void openCartURLTest() {
		String actUrl = driver.getCurrentUrl();
		System.out.println(actUrl);
		Assert.assertTrue(actUrl.contains("opencart"));
	}
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}

}
