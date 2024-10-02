package SeleniumSessions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footerLinks = By.xpath("//footer//a");
		
		ElementUtil eutil = new ElementUtil(driver);
		
//		List<WebElement> footerLinksList =  driver.findElements(footerLinks);
//		System.out.println(footerLinksList.size());
//		
//		for(WebElement e: footerLinksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
//		System.out.println("========================");
//		for(int i=0; i<footerLinksList.size();i++) {
//			String text1 = footerLinksList.get(i).getText();
//			System.out.println(text1);
//		}
		
		
		
		int count = eutil.getElementsCount(footerLinks);
		System.out.println(count);
		
		List<String> footerLinksText = eutil.getElementTextList(footerLinks);
		System.out.println(footerLinksText);
		
		List<String> expFooter = Arrays.asList("About Us", "Returns", "Specials", "Wish List");
		if(footerLinksText.containsAll(expFooter)) {
			System.out.println("IMP footer links ---- PASS -- YESSSS");
		}
		
		//Assignment : Get all the links which is under right side of this Naveen automation labs page
		//Check below code
		By headerLinks = By.className("list-group-item");
		int headerLinksCount = eutil.getElementsCount(headerLinks);
		System.out.println(headerLinksCount);
		
		List<String> headerLinksText =  eutil.getElementTextList(headerLinks);
		System.out.println(headerLinksText);
		//using for each loop
		for(String s : headerLinksText) {
			System.out.println(s);
		}
		
		
		
	}

}
