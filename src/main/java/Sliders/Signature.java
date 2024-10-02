package Sliders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Signature {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		
		Thread.sleep(3000);
		
		WebElement canvas = driver.findElement(By.id("signature-pad"));
		
		Actions act = new Actions(driver);
		
		Action signature = act.click(canvas).moveToElement(canvas, 30, 10)
		.clickAndHold(canvas)
		.moveToElement(canvas, -200, -50)
		.moveByOffset(50, -50)
		.moveByOffset(50, -50)
		.moveByOffset(30, 80)
		.moveByOffset(20, 90)
		.moveByOffset(78, 34)
		.moveByOffset(3, 3)
		.release(canvas)
		.build();
		
		signature.perform();
		
	}

}
