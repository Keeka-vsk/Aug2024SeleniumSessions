package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FreeCRMAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * 1 - add a new contact
		 * 2 - add a new company
		 * 3 - under contacts select one and click drop down 
		 * and choose delete and close the pop up
		 * 4 - in the above cases you can able to 
		 * use pop-ups, frame, window handling, drop downs,
		 * action classes
		 */

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/index.html");
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("selenium@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		//Switch to Frame using name:
		driver.switchTo().frame("mainpanel");
		
		//Move to Contacts and click New Contact
		WebElement contacts = driver.findElement(By.xpath("//div[@id='navmenu']//ul//li//a[text()='Contacts']"));
		/**
		 * Import Actions class as Contacts show the options when the mouse hover.
		 */
		Actions act = new Actions(driver);
		act.moveToElement(contacts).perform();
		driver.findElement(By.xpath("//div[@id='navmenu']//ul//li//a[text()='New Contact']")).click();
		
		//Import Select class to choose your prefix:
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='title']")));
		sel.selectByVisibleText("Mrs.");
		
		//Enter First Name:
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Keerthana");
		//Enter Your Last Name:
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Vignesh");
		
		//Import select class to choose your designation:
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='suffix']")));
		sel1.selectByVisibleText("Jr.");
		//Upload a file
		driver.findElement(By.id("image_file")).sendKeys("C:\\Users\\keert\\OneDrive\\Documents\\How to Learn Selenium and java.txt");
		Thread.sleep(1000);
		//Enter nick name:
		driver.findElement(By.xpath("//input[@name='nickname']")).sendKeys("Keka");
		//Enter company name
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("TCS");
		//Enter position
		driver.findElement(By.xpath("//input[@name='company_position']")).sendKeys("SDET");
		//Enter Department
		driver.findElement(By.xpath("//input[@name='department']")).sendKeys("IT");
		//Choose category:
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@name='category']")));
		sel2.selectByVisibleText("Friend");
		//Enter Mobile Number:
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8124346032");
		//Enter Email ID:
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kee@gmail.com");
		//choose no for allow calls:
		driver.findElement(By.xpath("//input[@type='radio' and @value='N' and @name='allows_call']")).click();
		
		
		
		
		
		
		
		
	}

}
