package Sliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(3000);
		
		
		WebElement ele = driver.findElement(By.linkText("Colwood, Canada"));
		
		//right of ele:
		String rightIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightIndex);
		
		//left of ele:
		String leftIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);
		
		//above of ele:
		String aboveIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveIndex);
		
		//below of ele:
		String belowIndex = driver.findElement(RelativeLocator.with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowIndex);
		
		//near of ele:
		String nearIndex = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearIndex);
		
		//using find Elements:
		List<WebElement> belowelements = driver.findElements(with(By.xpath("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
		System.out.println(belowelements.size());
		
		for(WebElement e: belowelements) {
			String country = e.getText();
			System.out.println(country);
		}
		
		
	}

}
