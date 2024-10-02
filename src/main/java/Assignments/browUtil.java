package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browUtil {
	
	private WebDriver driver;
	
	
	public WebDriver launchBrowser(String browserName) {
		
		System.out.println("The browser was:" +browserName);
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver();
			break;
		default:
				System.out.println("Please pass right browser name...");
				throw new AppExceptions("INVALID BROWSER NAME");
		}
		return driver;
	}
	
	
	public void launchUrl(String url) {
		
		if(url == null) {
			System.out.println("NULL URL");
			throw new AppExceptions("INVALID IS NULL");
		}
		
		if(url.indexOf("http") == 0) {
			driver.get(url);
		}
		else {
			System.out.println("URL was not launched without HTTP");
			throw new AppExceptions("HTTP IS MISSING");
		}
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public String getCurrentPageUrl() {
		String cpageUrl = driver.getCurrentUrl();
		return cpageUrl;
		
	}
	
	public String getPageSource() {
		String pSource = driver.getPageSource();
		return pSource;
	}
	
	public void close() {
		driver.close();
	}
	
	public void quit() {
		driver.quit();
	}

}
