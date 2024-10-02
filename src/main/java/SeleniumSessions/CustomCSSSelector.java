package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCSSSelector {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//Cascaded Style Sheet or CSS - is a locator approach
		//id --> #id
		//calss --> .class
		
		// #input-firstname
		// .form-control
		
		// .form-control#input-firstname
		
		//.form-control.input-lg - if you have two classes in the same attribute write this
		
		//https://app.hubspot.com/login
		// .form-control.private-form__control.login-email
		
		//for other attributes
		/*
		 * Formaula
		 * HtmlTag[attr='value'] -- css
		 * 
		 */
		//By.cssSelector("input[name='email']")
		
		//  htmltag[attr1='value'][attr2='value']
		//  input[name='email'][placeholder='E-Mail Address']
		
		//  htmltag[attr1][attr2][attr3]
		//  input[name][placeholder][type]
		
		//  htmltag[attr='value']#id
		//  input[name='email']#input-email
		
		
		//driver.findElement(By.className("form-control private-form__control login-email"));
		//Invalid selector Exception: compound class name not peritted
		/*
		 * bceause only one class name is allowed 
		 */
		
		//this will work
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com); -- it will work
		
		//this will work
		//driver.findElement(By.xpath("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		
		//this will work
		//driver.findElement(By.cssSelector(".form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
		
		//text is not applicable in css selector
		
		//htmltag[atrr *= 'value'] --> contains
		//htmltag[attr ^= 'value'] --> starts-with
		//htmltag[attr $= 'value'] --> ends-with
		
		//parent to child relationship: represented by >
		//htmltag[attr='value'] > htmltag
		//select[id='Form_getForm_Country'] > option -- direct child
		
		//htmltag[atrr='value'] htmltag ---> space for indirect child
		// div#content input
		
		//child to parent: not allowd
		//ancestor and preceding and following : not allowed
		
		//siblings:
		//htmltag[attr='value'] + htmltag --> immediate sibling
		//htmltag[attr = 'value'] ~ htmltag --> following sibling
		 
		//comma in css
		//  htmltag#id,htmltag.class,htmltag#id -- 
		//  input#username,input#password,button#loginBtn
//		int loginEle = driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn")).size();
//		System.out.println(loginEle);
//		
//		if(loginEle == 4) {
//			System.out.println("All Important links are present in the login page");
//		}
//		else
//		{
//			System.out.println("FAIL");
//		}
//		
//		//not in css:
//		div[class='form-group'] > input:not(#input-password)
//		div[class='form-group'] > input:not(input[type='password'])
//		
//		//indexing in css:
		
//		
	}

}
