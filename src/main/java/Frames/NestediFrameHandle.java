package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); //browser
		
		driver.get("https://selectorshub.com/iframe-scenario/"); 
		Thread.sleep(5000);
		
		//iframe 1: f1
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("MY First CRUSH");
		
		//iframe 2: f2
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("MY Second CRUSH");
		
		//iframe 3: f3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destiny");
		
//		//from f3 go to f1: Not Valid and Not possible 
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("First CRUSH 2");
		
//		//f3 to f1 --> not valid
//		//f3 --> f2 --> f1 : not valid
//		driver.switchTo().frame("pact2");
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.id("inp_val")).sendKeys("First CRUSH 2");
		
		//parent frame concept:
		//f3 to f2
		driver.switchTo().parentFrame();
		//driver.findElement(By.id("inp_val")).sendKeys("First CRUSH 2");//this is in f1. shows exception.
		driver.findElement(By.id("jex")).sendKeys("Second CRUSH 2");
		
		//f2 to f1
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("First CRUSH 2");
		
		//Now driver is in f1.
		//driver.switchTo().parentFrame();
		//to move driver from child to main doc 
		driver.switchTo().defaultContent();
		
		//this is in main doc
		String headerpart = driver.findElement(By.tagName("h3")).getText();
		System.out.println(headerpart);
		
	}

}
