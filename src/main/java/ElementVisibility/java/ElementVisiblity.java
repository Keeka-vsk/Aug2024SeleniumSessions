package ElementVisibility.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ElementVisiblity {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.cssSelector(".img-responsive"));
		
		System.out.println(logo.isDisplayed());
		
		System.out.println(logo.isEnabled());
		
		WebElement submitButton = driver.findElement(By.id("submitButton"));
		System.out.println(submitButton.isDisplayed()); //true
		System.out.println(submitButton.isEnabled()); //false
		
		WebElement terms = driver.findElement(By.name("agreeTerms"));
		System.out.println(terms.isSelected());//false
		
		terms.click();
		Thread.sleep(2000);
		
		System.out.println(terms.isSelected());//true
		
		System.out.println(submitButton.isDisplayed()); //true
		System.out.println(submitButton.isEnabled()); //true
		
		
		
	}

}
