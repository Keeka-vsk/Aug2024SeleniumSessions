package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement tarEle = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		//Approach 1: for moving a element form source to target:
//		act
//			.clickAndHold(srcEle)
//				.moveToElement(tarEle)
//					.release(tarEle)
//						.build()
//							.perform();
		
		//Approach 2: for moving a element form source to target:
		act.dragAndDrop(srcEle, tarEle).build().perform();
		
		
	}

}
