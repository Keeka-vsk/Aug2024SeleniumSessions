package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameHandle {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //browser
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/"); //page
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id ='imageTemplateContainer']/img")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("automation");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Vellore");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("08/03/94");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("THERE IS NO DESCRIPTION");
		driver.findElement(By.cssSelector("#RESULT_TextField-8")).sendKeys("Keerthana");
		driver.findElement(By.cssSelector("#RESULT_TextField-9")).sendKeys("Vignesh");
		driver.findElement(By.cssSelector("#RESULT_TextField-10")).sendKeys("Pichnoor, Gudiyattam");
		driver.findElement(By.cssSelector("#RESULT_TextField-11")).sendKeys("Vellore - 632 602");
		driver.findElement(By.cssSelector("#RESULT_TextField-12")).sendKeys("Vellore");
		
		WebElement country = driver.findElement(By.cssSelector("#RESULT_RadioButton-13"));
		Select sel = new Select(country);
		
		sel.selectByVisibleText("Indiana");
		
		driver.findElement(By.cssSelector("#RESULT_TextField-14")).sendKeys("632 602");
		driver.findElement(By.cssSelector("#RESULT_TextField-15")).sendKeys("8124346032");
		driver.findElement(By.cssSelector("#RESULT_TextField-16")).sendKeys("keerthuint@gmail.com");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
				
		String header = driver.findElement(By.cssSelector("h3.details__form-preview-title")).getText();
		System.out.println(header);
		
		
		
		
		
		
		
		
}

}
