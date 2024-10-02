package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunction {
	
	static WebDriver driver;

	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	//WAF : capture the text of all the web page links and return List<String>
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e: eleList) {
			String text = e.getText();
			if(text.length()!=0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	//WAF: capture specific attribute from the list
	public static List<String> getElementsAttributeList(By locator,String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();
		for(WebElement e: eleList) {
			String attrValue = e.getAttribute(attrName);
			eleAttrList.add(attrValue);
		}
		return eleAttrList;
	}
		
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		By allLinks = By.tagName("a");
		By allImages = By.tagName("img");
		
		//Links approach 1
//		List<WebElement> Flinks = getElements(allLinks);
		
		getElements(allLinks);
		int linksCount = getElementsCount(allLinks);
		System.out.println(linksCount);
		
		System.out.println("-----------------------------");
		
		getElements(allImages);
		int imagesCount = getElementsCount(allImages);
		System.out.println(imagesCount);
		
		System.out.println("-----------------------------");
		
		
		//WAF : capture the text of all the page links and return
		//Links approach 2: using generic methods
		List<String> actualLinkTextList = getElementTextList(allLinks);
		//using default syntax to print the value
		//System.out.println(actualLinkTextList);
		System.out.println("==========");
		//using for each loop to print the value
		for( String s : actualLinkTextList ) {
			System.out.println(s);
		}
		System.out.println("==========");
		//using for loop to print the value
		for(int i=0; i<actualLinkTextList.size() ; i++) {
			String actlinksText = actualLinkTextList.get(i);
			System.out.println(actlinksText);
		}
		if(actualLinkTextList.contains("My Account")) {
			System.out.println("YES IT IS THERE...");
		}
		else {
			System.out.println("NO IT IS NOT PRESENT....");
		}
		
		
		System.out.println("-----------------------------");
		
		List<String> attrHrefList = getElementsAttributeList(allLinks, "href");
		for(String e1: attrHrefList) {
			System.out.println(e1);
		}
		
		
	}

}
