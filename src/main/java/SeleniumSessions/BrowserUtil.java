package SeleniumSessions;

import java.net.URL;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


/**
 * 
 * @author keerthana vignesh
 *BrowserUtil is having multiple generic method  to handle the various browser actions 
 */
public class BrowserUtil {

	private WebDriver driver;
	/*
	 * Initially the value of WebDriver is NULL
	 * bcs WebDriver is a non-primitive data type
	 * for non-primitive data type the value is NULL
	 */
	
	/**
	 * This method is used to launch the browser on the basis of given browsername
	 * @param browserName
	 * @return this returns driver instance
	 */
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Browser Name is: " +browserName);
		
		switch(browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass a valid browser");
			throw new AutomationException("INVALID BROWSER");
		}
		
		return driver;
	}
	
	/**
	 * the method is used to launch the url or the webpage..
	 * @param url
	 */
	public void launchUrl(String url) {
		
		if(url == null) {
			System.out.println("URL IS NULL");
			throw new AutomationException("NULL URL");
		}
		
		//http://www.google.com
		if(url.indexOf("http") == 0) {
			driver.get(url);
		}
		else {
			throw new AutomationException("HTTP IS MISSING");
		}
	}
	
	/**
	 * This method is used to launch url or webpage using another method of selenium..
	 * @param url
	 */
	public void launchUrl(URL url) {
		
		if(url == null) {
			System.out.println("URL IS NULL");
			throw new AutomationException("NULL URL");
		}
		
		driver.navigate().to(url);
		
		//http://www.google.com
//		if(url.indexOf("http") == 0) {
//			driver.get(url);
//		}
//		else {
//			throw new AutomationException("HTTP IS MISSING");
//		}
	}
	
	
	/**
	 * this method is used to get the title of current webpage 
	 * @return
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		//System.out.println("Your title is : " + title);
		return "Your title is:" +title;
	}
	
	/**
	 * This method is used to print the currentURL of webpage on the console
	 * @return
	 */
	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("The url is : " + url);
		return url;
	}
	
	/**
	 * this is used to get source of current webpage
	 * @param value
	 * @return
	 */
	public boolean getpageSource(String value) {
		String pagesource = driver.getPageSource();
		if(pagesource.contains(value)) {
			return true;
		}
		return false;	
	}
	
	/**
	 * this is used to close the webpage where the driver is focused
	 * or it will close the browser if contains one webpage
	 */
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}
	
	/**
	 * user to quit the browser 
	 */
	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser is closed");
	}
	
	
	
	
	
	
	
	
	
	
}
