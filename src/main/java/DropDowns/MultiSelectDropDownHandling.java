package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownHandling {
	
	static WebDriver driver;
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**
	 * this method is used to select values from the drop down. It can select;
	 * 1. Single selection
	 * 2. Multiple selection
	 * 3. All Selection: please pass "all" as a value to select all the values	
	 * @param locator
	 * @param value
	 */
	public static void selectMultipleDropdownValues(By locator,By optionsLocator, String... value) {
		Select select = new Select(getElement(locator));
		if(isDropdownMultiple(locator)) {
			if(value[0].equalsIgnoreCase("all")) {
//				List<WebElement> opt = select.getOptions();
//				for(WebElement e1: opt) {
//					e1.click();
//				}
				List<WebElement> captureOptions = driver.findElements(optionsLocator);
				for(WebElement e : captureOptions) {
					e.click();
				}
			}
			else {
				for(String val: value) {
					select.selectByVisibleText(val);
				}
			}
			
		}
	}
		
	public static boolean isDropdownMultiple(By locator) {
		Select select = new Select(getElement(locator));
		return select.isMultiple() ? true : false ;		
	}
		
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		
		
		
		By dropDownOptions = By.xpath("//select[@multiple]");
		By optionslocator = By.xpath("//select/option");
		
		//1) TC 1: Select multiple values
//		selectMultipleDropdownValues(dropDownOptions,optionslocator, "American flamingo","Greater flamingo","Lesser flamingo");
		
//		//TC 2: Select one value:
//		selectMultipleDropdownValues(dropDownOptions,optionslocator, "American flamingo");
//		
//		//TC 3: Select all options:
		selectMultipleDropdownValues(dropDownOptions,optionslocator, "all");
		
		
//		Select select = new Select(driver.findElement(By.xpath("//select")));
//		if(select.isMultiple()) {
//			System.out.println("yes, it has multiple selection");
//			select.selectByVisibleText("American flamingo");
//			select.selectByVisibleText("Greater flamingo");
//			select.selectByVisibleText("Lesser flamingo");
//		}
//		Thread.sleep(1000);
		
		
//		int slectedCount = select.getAllSelectedOptions().size();
//		System.out.println(slectedCount);
//		Thread.sleep(1000);
//		select.deselectByVisibleText("Lesser flamingo");
//		
//		select.deselectAll();
//		
//		List<WebElement> seleOptions = select.getAllSelectedOptions();
//		System.out.println(seleOptions.size());
//		
//		for(WebElement e: seleOptions) {
//			String optionsselected = e.getText();
//			System.out.println(optionsselected);
//		}
//		
//		
		
		
	}

}
