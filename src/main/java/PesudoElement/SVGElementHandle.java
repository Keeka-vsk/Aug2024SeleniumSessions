package PesudoElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementHandle {

	public static void main(String[] args) throws InterruptedException {
				
		//SVG - Scaler Vector Graphics
		
		//cann't use css for svg
		//only xpath is applicable : specail xpth syntax
		
		
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(5000);
//		driver.findElement(By.name("q")).sendKeys("mac book");
//		driver.findElement(By.xpath("//button//*[local-name()='svg' and @fill='none']")).click();
		
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(5000);
		//browser - webpage - iframe - svg
		
		String stateXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id ='regions']//*[name()='g' and @class='region']";
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		
		List<WebElement> stateList = driver.findElements(By.xpath(stateXpath));
		System.out.println(stateList.size());
		
		Actions act = new Actions(driver);

		for(WebElement e: stateList) {
			act.moveToElement(e).perform();
			Thread.sleep(1000);
			String attrVal = e.getAttribute("id");
			System.out.println(attrVal);
			if(attrVal.contains("wisconsin")) {
				e.click();
				System.out.println("-----------------------------");
				Thread.sleep(3000);
				List<WebElement> wisconcity = driver.findElements(By.xpath("//*[local-name()='g' and @id='wisconsin']//*[name()='g' and @class='subregion']//*[name()='path']"));
				System.out.println("Here is the list of Wisconsin Cities:");
				for(WebElement e1: wisconcity) {
					String cityname = e1.getAttribute("name");
					System.out.println(cityname);
				}
				break;
			}
		}
		

	}

}
