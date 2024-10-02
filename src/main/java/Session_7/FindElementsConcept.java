package Session_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		//find Element : to capture single element + perform action
		//find elements : to capture multiple elements and store it in "List"+ no action 
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textFieldList = driver.findElements(By.className("form-control"));
		
		System.out.println(textFieldList.size());
	}

}
