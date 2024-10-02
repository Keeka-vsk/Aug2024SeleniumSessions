package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;
	
	public static void clickOnElement(By locator,String eleText) {
		List<WebElement> lanLinks = driver.findElements(locator);
		System.out.println(lanLinks.size());
		for(WebElement e: lanLinks) {
			String languages = e.getText();
			System.out.println(languages);
			if(languages.equals(eleText)) {
				e.click();
				break;
			}
		}
	}
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		List<WebElement> gLangLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(gLangLinks.size());
//		for(WebElement e: gLangLinks) {
//			String allgoogleLinks =  e.getText();
//			System.out.println(allgoogleLinks);
//		}
//		System.out.println("===================");
//		for(int i=0; i<gLangLinks.size(); i++) {
//			String allGLinks = gLangLinks.get(i).getText();
//			System.out.println(allGLinks);
//		}
//		System.out.println("===================");
//		for(WebElement e1: gLangLinks) {
//			String text =  e1.getText();
//			System.out.println(text);
//			if(text.contains("मराठी")) {
//				e1.click();
//				break;
//			}
//		}
		
		
		By langLinks= By.xpath("//div[@id='SIvCob']/a");
		clickOnElement(langLinks, "मराठी");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
