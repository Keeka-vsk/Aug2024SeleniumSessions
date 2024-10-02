package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //browser
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html"); //page
		Thread.sleep(5000);
		
		//driver.switchTo().frame(2);//using index of frame
		//driver.switchTo().frame("main");//using name of frame
		driver.findElement(By.xpath("//frame[@src='top.html']"));//using webElement of frame
		
		String titleText = driver.findElement(By.tagName("h2")).getText();
		System.out.println(titleText);
		
		
		

	
	
	}

}
