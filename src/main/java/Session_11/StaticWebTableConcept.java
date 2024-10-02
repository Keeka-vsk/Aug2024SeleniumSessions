package Session_11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableConcept {
	
	static WebDriver driver;
	
	

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr")).size();
		
		//Web Table Traversing:
		
		//table[@id='customers']/tbody/tr[2]/td[1] -- Alfreds Futterkiste	
		//table[@id='customers']/tbody/tr[3]/td[1] -- Centro comercial Moctezuma
		//table[@id='customers']/tbody/tr[4]/td[1] -- Ernst Handel
		
		/*
		 * Capture a column value : Approach 1
		 */
		
		String beforexpath = "//table[@id='customers']/tbody/tr[";
		String afterxpath = "]/td[1]";
		
		//table[@id='customers']//tbody//tr -- row count
		
		for(int row=2; row<=rowCount; row++) {
			String actxpath = beforexpath+row+afterxpath;
			//System.out.println(actxpath);
			String companyName = driver.findElement(By.xpath(actxpath)).getText();
			System.out.println(companyName);
		}
		System.out.println("-------------------------");
		
		////table[@id='customers']/tbody/tr[2]/td[2] -- contact info
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[2]";	
		
		for(int rows=2;rows<=rowCount;rows++) {
			String actXpath = beforeXpath+rows+afterXpath;
			System.out.println(actXpath);
			String contextInfo = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(contextInfo);
		}
		System.out.println("---------------------------------------------");
		
		/*
		 *Capture the column value : Approach 2 
		 */
		List<WebElement> colValues = driver.findElements(By.xpath("//th[text()='Company']//parent::tr//following-sibling::tr/td[1]"));
		for(WebElement e: colValues) {
			String companyNames = e.getText();
			System.out.println(companyNames);
		}
		
		
		//approach 1:
		//table[@id='customers']/tbody/tr[2]/td[1]//ancestor::tbody//th[1]
		
		//approach 2:
		//td[text()='Alfreds Futterkiste']//parent::tr//preceding-sibling::tr//th[text()='Company']

	}

}
