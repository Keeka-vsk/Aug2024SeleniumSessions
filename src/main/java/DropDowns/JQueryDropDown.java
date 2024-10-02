package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown {
	
	static WebDriver driver;
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		Thread.sleep(2000);
		
		//45 span --> 15 span
		List<WebElement> choicesList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		
		for(WebElement e: choicesList) {
//			String text = e.getText();
			
//			System.out.println(text);
//			if(text.contains("choice 2")) {
//				e.click();
//			break;
//			}
			try {
			e.click();//after 15th element we got Element not interactable exceptiom
			}
			catch(ElementNotInteractableException ex) {
				System.out.println("Element not able to Interact");
				break;
			}
		}
		
		//Assignment: line no 24 is the culprit because it has 45 spans
		//which is related to all dropdown in the page
		//so make it as 15 options which is related to first dropdown only
		//then you won't get exception - write a code for this
		//check below code:
		
		System.out.println("----------------");
		
		List<WebElement> firstChoice = driver.findElements(By.xpath("//h3[text()='Multi Selection']//following-sibling::div//div[2]//ul//li//span"));
		for(WebElement e1: firstChoice) {
			String text = e1.getText();
			System.out.println(text);
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='justAnInputBox']//following-sibling::button//span")).click();
		
		System.out.println("============================");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox1']")).click();
		Thread.sleep(1000);
		List<WebElement> secondOptions = driver.findElements(By.xpath("//h3[text()='Multi Selection With Cascade Option Select']//following-sibling::div//div[2]//ul//li//span"));
		for(WebElement e2: secondOptions) {
			String text2 = e2.getText();
			System.out.println(text2);
			if(text2.equals("choice 6")) {
				e2.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='justAnInputBox1']//following-sibling::button//span")).click();
		System.out.println("===============================");
		
		driver.findElement(By.xpath("//input[@id='justAnotherInputBox']")).click();
		Thread.sleep(1000);
		List<WebElement> thirdOption = driver.findElements(By.xpath("//h3[text()='Single Selection']//following-sibling::div//div[2]//ul//li//span"));
		for(WebElement e3 : thirdOption) {
			String text3 = e3.getText();
			System.out.println(text3);
		}
		
		
		
		
		
		

	}

}
