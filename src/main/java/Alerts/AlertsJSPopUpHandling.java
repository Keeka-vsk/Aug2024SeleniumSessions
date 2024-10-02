package Alerts;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsJSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//Alert : JS Pop Up also called modal dialogue
		
		/**
		 * 1. alert
		 * 2. prompt
		 * 3. confirm
		 */
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		//enter the url
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		Thread.sleep(1000);
		//alert.dismiss();
		
		//2-confirm pop-up:
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert.dismiss();
		Thread.sleep(1000);
		
		//3- prompt:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alert.sendKeys("This is KeerthanaVignesh");
		Thread.sleep(1000);
		alert.accept();
		
		
		

	}

}
