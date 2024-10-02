package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {
	
	static WebDriver driver;
	
	public static void multiMenuHandle(By parentMenu, By firstChildMenuLocator,
			By secondChildMenuLocator, By thirdChildMenuLocator) throws InterruptedException {
		
		
		Actions act = new Actions(driver);
		
		driver.findElement(parentMenu).click();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(firstChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(secondChildMenuLocator)).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(thirdChildMenuLocator).click();
		Thread.sleep(1000);
		
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {

		/**
		 * Go to Bigbasket.com
		 * click on shop by category
		 * mouse hover to beverages
		 * mouse to tea
		 * and click on green tea
		 */
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		//Actions class:
		//user Actions: 
		
		By parentShopMenu = By.xpath("(//span[text()='Shop by'])[2]");
		By beveragesSecondMenu = By.linkText("Beverages");
		By teaThirdMenu = By.linkText("Tea");
		By greenTeaFourthMenu = By.linkText("Green Tea");
		
//		Actions act = new Actions(driver);
//		
//		driver.findElement(parentShopMenu).click();
//		Thread.sleep(1000);
//		
//		act.moveToElement(driver.findElement(beveragesSecondMenu)).build().perform();
//		Thread.sleep(1000);
//		
//		act.moveToElement(driver.findElement(teaThirdMenu)).build().perform();
//		Thread.sleep(1000);
//		
//		driver.findElement(greenTeaFourthMenu).click();
//		Thread.sleep(1000);
		
		
		multiMenuHandle(parentShopMenu, beveragesSecondMenu, teaThirdMenu, greenTeaFourthMenu);
		
		
		//Scenario 2:
		By parentShopMenu1 = By.xpath("(//span[text()='Shop by'])[2]");
		By fruitsAndVeges = By.linkText("Fruits & Vegetables");
		By freshFruits = By.linkText("Fresh Fruits");
		By mangoes = By.linkText("Mangoes");
		
		multiMenuHandle(parentShopMenu1, fruitsAndVeges, freshFruits, mangoes);
		
		
		/**
		 * Assignment go to shop by category
		 * go to fruits and vegetables
		 * go to cuts and sprouts
		 * get the text of all items under cuts and sprouts
		 */
		Actions act = new Actions(driver);
		
		
		By child3 = By.xpath("//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 cAslOa']//ul[3]");
		
		driver.findElement(parentShopMenu).click();
		
		act.moveToElement(driver.findElement(fruitsAndVeges)).build().perform();
		Thread.sleep(1000);
		
		act.moveToElement(driver.findElement(By.linkText("Cuts & Sprouts"))).build().perform();
		Thread.sleep(1000);
		
		List<WebElement> cutsSprouts = driver.findElements(child3);
		for(WebElement e: cutsSprouts) {
			System.out.println(e.getText());
		}
		
		System.out.println("-------------------------------");
		
		act.moveToElement(driver.findElement(By.linkText("Exotic Fruits & Veggies"))).build().perform();
		Thread.sleep(1000);
		
		List<WebElement> ExoticFruits = driver.findElements(child3);
		for(WebElement e: ExoticFruits) {
			System.out.println(e.getText());
		}
		
		System.out.println("---------------------------------");
		
		act.moveToElement(driver.findElement(By.linkText("Flower Bouquets, Bunches"))).build().perform();
		Thread.sleep(1000);
		
		List<WebElement> flowerBouquets = driver.findElements(child3);
		for(WebElement e: flowerBouquets) {
			System.out.println(e.getText());
		}
		
		System.out.println("----------------------------------");
		
		act.moveToElement(driver.findElement(By.linkText("Fresh Fruits"))).build().perform();
		Thread.sleep(1000);
		
		List<WebElement> freshFruits1 = driver.findElements(child3);
		for(WebElement e: freshFruits1) {
			System.out.println(e.getText());
		}
		
		System.out.println("------------------------------------");
		
	
		
		
		
		
	}

}
