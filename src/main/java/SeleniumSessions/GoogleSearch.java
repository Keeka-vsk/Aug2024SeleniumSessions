package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	
	public static void Search(By searchField,By suggestions, String searchKey, String suggName) throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchKey);
		Thread.sleep(3000);
		
		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println(suggList.size());
		
		for(WebElement e:suggList) {
			String suggListText = e.getText();
			System.out.println(suggListText);
			if(suggListText.contains(suggName)) {
				e.click();
				break;
			}
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//Approach 1 = using raw data
//		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//		Thread.sleep(3000);
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//		System.out.println(suggList.size());
//		for(WebElement e: suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("testing courses")) {
//				e.click();
//				break;
//			}
//		}
		
				
		//Approach 2 = using generic methods
		By searchField = By.name("q");
		By suggesions = By.xpath("//div[@class='wM6W7d']/span");
		
		Search(searchField, suggesions, "Selenium Automation", "testing courses");
		
		System.out.println("------------------------------");
		
		Search(searchField, suggesions, "Global Warming", "wikipedia");
		
	}

}
