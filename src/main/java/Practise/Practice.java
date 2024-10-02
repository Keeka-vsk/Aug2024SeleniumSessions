package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		//DropDown Handling:
		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();
		
		//Scenario 1: Select the apple using visible text
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select sel = new Select(fruits);
		sel.selectByVisibleText("Apple");
		Thread.sleep(2000);
		
		//Scenario 2: Get all options and print it on the console.
		List<WebElement> optionsList = sel.getOptions();
		System.out.println(optionsList.size());
		for( WebElement e: optionsList ) {
			System.out.println(e.getText());
		}
		for(int i=1; i<=optionsList.size(); i++) {
			System.out.println(optionsList.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
