package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		for(int i=0;i<images.size();i++) {
			String imgAltVal = images.get(i).getAttribute("alt");
			String imgSrcVal = images.get(i).getAttribute("src");
			//System.out.println(imgAltVal+ " === " + imgSrcVal);
			System.out.println(imgAltVal);
			System.out.println(imgSrcVal);
		}
		
		System.out.println("==================================================");
		
//		for(WebElement e: images) {
//			String altval = e.getAttribute("alt");
//			String srcval = e.getAttribute("src");
//			System.out.println(altval +"===" + srcval);
//		}

	}

}
