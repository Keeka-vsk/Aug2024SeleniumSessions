package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act = new Actions(driver);
		act.contextClick(rightClickEle).build().perform();
		
		List<WebElement> optionsList = driver.findElements(By.cssSelector("li.context-menu-icon"));
		System.out.println(optionsList.size());
		
		for( WebElement e : optionsList ) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("Quit")) {
				e.click();
				break;
			}
		}
		
		
		
		
	}

}
