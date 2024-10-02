package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		
		//<tag type='file'> should be there
		//99.9% 
		//if not there:
		//1. ask your developer to add the attribute type=file
		//2. use 3rd party library: AutoIT(only for windows), Robot Class(windows - only on local machine), sikuli(image based)
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\keert\\Downloads\\L11- Someone Anyone Everyone(Talking About People In General).pdf");
		
		

	}

}
