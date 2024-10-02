package DropDowns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;
	
	public static void getSelectDropDownOption(By locator, String DropDownValue) {
			
		Select select = new Select(getElement(locator));
		
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement e: allOptions ) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(DropDownValue))
			{
				e.click();
				break;
			}
		}
		
	}
	
	public static int getDropdownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
				return select.getOptions().size();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<String> getDropdownOptionsText(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> allOptions = select.getOptions();
		List<String> optionsText = new ArrayList<String>();
		System.out.println(allOptions.size());
		
		for(WebElement e: allOptions ) {
			String text = e.getText();
			optionsText.add(text);
		}
		return optionsText;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		
		By country = By.id("Form_getForm_Country");
		WebElement country_ele= driver.findElement(country);
		
		getSelectDropDownOption(country, "India");
		
		if(getDropdownOptionsText(country).contains("India")) {
			System.out.println("India -- PASSSSSSSSSS");
		}
		
		//Assignment: Check of more than one values are present in the drop down.
		List<String> expCountry = Arrays.asList("India", "Japan", "Kenya", "United Arab Emirates");
		if(getDropdownOptionsText(country).containsAll(expCountry)) {
			System.out.println("The List contains all the Expected Countries -- PASS");
		}
		else
		{
			System.out.println("SORRYY ---- :-) ");
		}
		
		int countryCount = getDropdownOptionsCount(country) -1;
		if(countryCount == 232) {
			System.out.println("The Country count is PASS");
		}
		else
			System.out.println("Count mismatch -- FAIL");
		

		
		
		
	}

}
