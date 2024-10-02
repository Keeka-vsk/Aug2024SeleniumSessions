package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCodingChallenge_Naveen_22Nov2023 {

	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void multipleDropDownValues(By locator, String... value) {
		List<WebElement> optionsList  = driver.findElements(locator);
		List<String> text = new ArrayList<String>();
		for(WebElement e: optionsList) {
			String optionsText = e.getText();
			text.add(optionsText);
			List<String> expval = Arrays.asList(value);
			if(text.containsAll(expval)) {
				e.click();
				break;
			}

		}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/tablets");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//create a generic function for below
		//deals --> select any one option
		//operating system --> ipod, tablet i.e: multiple selection
		//brands --> select all
		//
		
		//go to wallmart site --> search for laptop --> select anyone processor type --> storage capacity
		
//		By deals = By.xpath("//legend[normalize-space()='Deals']");
//		getElement(deals).click();
//		Thread.sleep(1000);
		
//		By dealsOpt = By.xpath("//span[@class='filter-display-name']");
//		List<WebElement> dealsOptList  = driver.findElements(dealsOpt);
//		List<String> text = new ArrayList<String>();
//		for(WebElement e: dealsOptList) {
//			String dealstext = e.getText();
//			System.out.println(dealstext);
//			text.add(dealstext);
//			List<String> expval = Arrays.asList("New","Special offer");
//			if(text.containsAll(expval)) {
//				e.click();
//			}
//
//		}
		
		By brands = By.xpath("//legend[normalize-space()='Brands']");
		getElement(brands).click();
		Thread.sleep(1000);
		
		By bransOpt = By.xpath("//span[@class='mat-checkbox-label']//child::span[@class='filter-display-name']");
		List<WebElement> brandsOptList = driver.findElements(bransOpt);
		List<String> text = new ArrayList<String>();
		for(WebElement e: brandsOptList) {
			String brandsText = e.getText();
			System.out.println(brandsText);
			text.add(brandsText);
			List<String> expval = Arrays.asList("Apple", "Alcatel", "Samsung");
			if(text.containsAll(expval)) {
				e.click();
			}
		}
		
		
		
			
		
		
		
		
		
		
		
	}

}
