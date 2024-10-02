package Session_7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//get the total of all links:
		//capture text of each link
		//but ignore the blank text links
		//get the href value for each link
		
		//links --> tagname 'a':
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + links.size() );
		
//		for (int i=0; i<links.size(); i++) {
//			String linktext = links.get(i).getText();
//			if(linktext.length())!=0) {
//				System.out.println(i+ " :" + linktext);	
//			}
//		}
		
		//using for each loop
//		for(WebElement e: links ) {
//			String linktext = e.getText();
//			if(linktext.length()!=0) {
//				String hrefvalue = e.getAttribute("href");				
//				System.out.println(linktext + " ===== " + hrefvalue);
//			}
//		}
		
		//capturing images in amazon page assignment:
		//tell me how many images are in the page
		//and give the alt value and src value and print it on the console..
		//check the assignment package and TotalImagesAmazon class
		
		
		
		
		
	}

}
