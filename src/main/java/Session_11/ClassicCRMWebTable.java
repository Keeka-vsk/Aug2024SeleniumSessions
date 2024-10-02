package Session_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {
	static WebDriver driver;
	
	public static void selectUserCheckBox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
	}
	
	public static String getUserCompanyName(String userName) {
		String companyname =driver.findElement(By.xpath("//a[text()='"+userName+"']//parent::td//following-sibling::td//child::a[@context='company']")).getText();
		return companyname;
	}
	

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[text()='Ali khan']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
		selectUserCheckBox("Ali khan");
		
//		String rakeshcompany = driver.findElement(By.xpath("//a[text()='Ali khan']//parent::td//following-sibling::td//child::a[@context='company']")).getText();
//		System.out.println(rakeshcompany);
		String companyname = getUserCompanyName("Ali khan");
		System.out.println(companyname);
	
		
		
		
		
	}

}
