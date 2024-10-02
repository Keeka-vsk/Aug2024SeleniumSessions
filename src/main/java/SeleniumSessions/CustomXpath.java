package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
	
	static WebDriver driver;
	
	

	public static void main(String[] args) {

		
		driver = new ChromeDriver();//session id is 123
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		//xpath : address of the element in HTML DOM
		//1.absolute xpath:
		//2.relative xpath:
		
		/*
		 * Formula for Relative X-Path:
		 * 
		 * approach 1: using single attribute in xpath
		 * //htmltag[@attrName = 'Value']
		 * //input[@name='search']
		 * //input[@placeholder = 'search']
		 * //input[@id='input-email'] -- xpath vs id
		 * 
		 * approach 2: using more than 1 attribute attribue in xpath
		 * 
		 * //htmltag[@attr1='value' and @attr2='value']
		 * //input[@type='text' and @name='search'] == 1 of 1
		 * 
		 * approach 3: using multiple attribute
		 * 
		 * //input[@type='text' and @name='search' and @placeholder= 'search']
		 * 
		 * appraoch 4: using no attribute in xpath
		 * 
		 * //input[@id] -- 6 --> FEs
		 * //a -- 81  --> FEs
		 * //img  -- 64 -->FEs
		*/
		
		////input[@type='text' or @type='email' or @type='password'
		////input[@id or @type]
		
		
		
//		int linksCount = driver.findElements(By.xpath("//a")).size();
//		System.out.println(linksCount);
//		
//		//input[@id and @type]
//		//a[@class='list-group-item'] -- 13 -- FEs
//		//driver.findElemets(By.className("list-group-item));
//		
//		List<WebElement> linksList = driver.findElements(By.xpath("//a[@class='list-group-item']"));
//		
//		System.out.println(linksList.size());
//		
//		for(WebElement e: linksList) {
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		//*[@attrName = 'Value']
		//htmltag[@attrName = 'Value']
		
		//* -- total element on the page * represent total no of element on the page
		
		//*[@class = 'form-control'] -- 6  out of 322 all element - its time taking
		
		//input[@class = 'form-control'] -- 6 out of 14 input element - hence performance wise this id better
		
		//input[@value]
		
//		String headerName = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(headerName);
		
		//text in xpath : header,links,span,paragraphs
		//html[text()='value']
		//h2[text()='Returning Customer']
		//a[text()='Recurring payments']
		//a[text()='Forgotten Password'] -- 2of2 -- FEs -- size() -- 2 ==2 -- PASS
		
		//text() and attribute
		//htmltag[text()='value' and @attr='value']
		//a[text()='My Account' and @class='list-group-item']
		//a[@class='list-group-item' and text()='My Account']
		//a[text()='Forgottcfren Password' and @class='list-group-item']
		
		//htmltag[text()='value' and @attr1='value' and @attr2='value']
		
		//contains() in xpath:
		//contains with attribute
		//html[contains(@attr, 'value')]
		//input[contains(@placeholder, 'E-Mail')]
		//input[contains(@placeholder, 'Address')]
		//input[contains(@id, 'email')]
		//input[contains(@id, 'email') and @type='text']
		//input[contains(@id, 'email') and @type='text' and contains(@placeholder, 'E-Mail')]
		
		//when to use contains
		//when we have long text
		
		//contains with text():
		//htmltag[contains(text(),'value')]
		//h2[contains(text(),'Returning')]
		//p[contains(text(),'By creating an account')]
		
		//contains with text and attr value:
		
		//htmltag[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Register') and contains(@class,'list-group-item')]
		
		//contains used for dynamic attribute:
		//<input id = firstName_123>
		//<input id = firstName_125>
		//<input id = firstName_2342>
		//driver.findElement(By.id("firstName_123")).sendKeys("test123"); -- invalid if id changes
		
		//input[contains(@id,'firstName_')]
		
		//starts-with in xpath:
		//htmltag[starts-with(text(),'value')]
		//p[starts-with(text(),'By creating an account')]
		
		//htmltag[starts-with(@attr,'value')]
		//<input[starts-with(@id,'firstName')] >
		
		
		
		
		//ends-with() in xpath: deprecated -- not valid now
		
		//space with text:
		//htmltag[normalize-space()='value']
		//label[normalize-space()='Yes']
		
		//Index Concept:
		//   (//htmltag[@attr='value])[index value]
		//(//input[@class='form-control'])[1]
		//ex:
		//driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("keerthana");
		
		//Index with last value: also called capture group
		//(//htmltag[@attr='value'][last()]) -- which represent the last element out of element you captured
		//  (//input[@class='form-control'])[last()]
		//  (//input[@class='form-control'])[last()-1] -- which represent 2nd last element
		//  (//input[@class='form-control'])[last()-2] -- which represent 3rd last element
		//  (//label[@class='radio-inline'])[1]/input[@type='radio']
		
		//Index with position method:
		// (//htmltag[@attr='value'])[position()=1] -- position number may vary 
		//  (//input[@class='form-control'])[position()=1]
		
		/*
		 * Go to google 
		 * you have to check help link is available or not in the bottom of the page
		 */
//		String googtext = driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
//		System.out.println(googtext);
//		if(googtext.equals("help"))
//		{
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		//Parent to child concept:
		//form[@id='form-currency']//ul[@class='dropdown-menu']//button
		
		
		//Child to parent:
		/*
		 *   //htmltag[@attr='value']/..
		 * backward traversing:
		//input[@name='email']/../../../../../../../../..
		 * Example of child to parent and then to child
		 * //input[@name='email']/../label -- child to parent and then to child
		 *  //input[@name='firstname']/../../label[text()='First Name']
		
		 */
		
		//child --> parent --> then again to child
		/*
		 *  //input[@name='email']/parent::div/label
		 *  //input[@name='email']/parent::div/child::label[@for='input-email']
		 *  //input[@name='firstname']/parent::div/parent::div/child::label
		 *  //input[@name='firstname']/parent::div/parent::div/child::label[@for='input-firstname']
		 *  //input[@name='firstname']//ancestor::div[@class='form-group required']//child::label[@for='input-firstname']
		 */
		
		//Sibling concept
		/*
		 * Preceding siblings: html tag which present before the target html tag
		 *  //input[@name='firstname']//parent::div/preceding-sibling::label[@for='input-firstname']
		 *  //input[@name='email']//preceding-sibling::label[@for='input-email']
		 *  example from amazon:
		 *  //a[text()='Careers']//parent::li[@class='nav_first']//parent::ul//preceding-sibling::div[@class='navFooterColHead']
		 *  //a[text()='Careers']//ancestor::ul//preceding-sibling::div[@class='navFooterColHead']
		 *  //a[text()='Careers']//ancestor::ul//preceding-sibling::div
		 * 
		 * Following Sinlings: html tag which present after the target html tag
		 * 	//label[text()='Password']//following-sibling::input[@id='input-password']
		 *  //div[text()='Get to Know Us']/parent::div//a
		 *  
		 */
		
//		driver.get("https://selectorshub.com/xpath-practice-page/");
//		List<WebElement> allCheckBox = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord')]"));
//		System.out.println(allCheckBox.size());
//		for(WebElement e:allCheckBox) {
//			e.click();
//		}
		
		
		
	}

}
	