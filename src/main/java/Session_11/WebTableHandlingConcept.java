package Session_11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingConcept {
	
	static WebDriver driver;
	
	
	public static void selectUserCheckBox(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
	}
	
	public static List<String> getUserInfo(String userName) {
		List<WebElement> colEle =driver.findElements(By.xpath("//a[text()='"+userName+"']//parent::td//following-sibling::td[@class='left']"));
		List<String> colValues = new ArrayList<String>();
		for(WebElement e: colEle ) {
			String text = e.getText();
			colValues.add(text);
		}
		return colValues;
	}

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(4000);
		
		//Select all the Check boxes of user table
//		List<WebElement> allUsers = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord_')]"));
//		System.out.println(allUsers.size());
//		for(WebElement e: allUsers) {
//			e.click();
//		}
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//a[text()='John.Smith']//parent::td//preceding-sibling::td//child::input[@type='checkbox']")).click();
				
		selectUserCheckBox("Joe.Root");
		selectUserCheckBox("John.Smith");
		
		List<String> joeDetails = getUserInfo("Joe.Root");
		System.out.println(joeDetails);
		
		// (//a[text()='Joe.Root']//parent::td//following-sibling::td)[3]
		//a[text()='Joe.Root']//parent::td//following-sibling::td[@class='left']
		
		//https://classic.freecrm.com/index.html
		
		//Classic CRM page:
		//a[text()='Robby Sing']//parent::td//preceding-sibling::td//child::input[@type='checkbox']
		//a[text()='Rakesh King']//parent::td//following-sibling::td//child::a[@context='company']
	}

}
