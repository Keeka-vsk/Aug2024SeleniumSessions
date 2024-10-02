package IntroSession_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsCloseSessionID {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//sid = 123
		
		driver.get("http://www.google.com");//sid = 123
		String actTitle = driver.getTitle();//sid = 123
		System.out.println(actTitle);//sid  = 123
		
		//driver.quit();//quit the browser sid = 123
		//sid = null
		
		driver.close();//NosuchSessionException: Ivalid Session ID
		//driver.quit();//You don't get error or exception
		
//		driver  = new ChromeDriver();//sid = 456
//		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());//NosuchSessionException:Session Id is NULL. Using WebDriver after calling quit()
		
		
		
		
		
		
	}

}
