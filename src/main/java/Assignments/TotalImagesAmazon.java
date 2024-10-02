package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagesAmazon {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//To capture all imges in the webpage
		List<WebElement> allImg = driver.findElements(By.tagName("img"));
		//To get how many total images in the webpage
		System.out.println(allImg.size());
		
//		//To get alt and src value of images and print it on console
//		for( int i=0; i<allImg.size(); i++ ) {
//			String imgAltText = allImg.get(i).getAttribute("alt");
//			String imgSrcText = allImg.get(i).getAttribute("src");
//			System.out.println(imgAltText +" ---- " +imgSrcText);
//		}
		
		//To get alt and src value of images and print it on console using for each loop
		for( WebElement e: allImg ) {
			String imgAltText = e.getAttribute("alt");
			String imgSrcText = e.getAttribute("src");
			System.out.println(imgAltText +" ---- " +imgSrcText);
		}
		
		
		

	}

}
