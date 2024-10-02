package Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUP {

	public static void main(String[] args) {
		
				WebDriver driver = new ChromeDriver();
				
				String username = "admin";
				String password = "admin";
				
				//Basic Auth:
//				//Method 1:
//				driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
				//Method 2:
				driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
				
				
				

	}

}
