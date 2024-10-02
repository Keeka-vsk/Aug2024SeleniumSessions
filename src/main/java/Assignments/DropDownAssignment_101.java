package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAssignment_101 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@id='files-button']")).click();
		List<WebElement> files = driver.findElements(By.xpath("//ul[@id='files-menu']//li//div"));
		for(WebElement e: files) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Some unknown file")) {
				e.click();
			}
		}
		Thread.sleep(3000);
		System.out.println("====================");
		
		driver.findElement(By.xpath("//span[@id='salutation-button']")).click();
		
		List<WebElement> title = driver.findElements(By.cssSelector("ul#salutation-menu > li >div"));
		for(WebElement e1: title) {
			String text1 = e1.getText();
			System.out.println(text1);
		}
		
		

	}

}
