package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColour {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/");
		
		WebElement element = driver.findElement(By.xpath("//input[@value='Login']"));
		
		String BgColor = element.getCssValue("backgroundColor");
		System.out.println(BgColor);
		
		Rectangle rect = element.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		System.out.println(rect.getX());//it says what is the position on particular element coordinates of x
		System.out.println(rect.getY());//it says what is the position on particular element coordinates of y
		
		
		int x = element.getLocation().x;
		int y = element.getLocation().y;
	}

}
