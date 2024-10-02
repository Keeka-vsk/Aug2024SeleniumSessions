package IntroSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverBasics {

		static WebDriver driver;
		/*
		 * 
		 */
	
	public static void main(String[] args) {

	//1.open the browser: chrome
	//2.Enter the Url
	//3.Get the title of the page
	//4.Verify the title : act vs exp
	//5.close the browser
		
		//automation steps
		//ChromeDriver driver = new ChromeDriver(); //it lauch chrome broswer
		//FirefoxDriver driver = new FirefoxDriver();// it launch firefox browser
		//EdgeDriver driver = new EdgeDriver(); // it launch edge browser
		
		String browser = "chrome";
		/*
		 * cross browser logic with top casting - using 
		 * this i don't need to do any comment and uncomment on the code.
		 * through this we can achieve parallel testing.
		 */
		switch (browser.toLowerCase().trim()) {
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
			System.out.println("Please pass the right browser...");
			break;
		}
		
		//WebDriver driver = new ChromeDriver();//top casting 
		
		/*
		 * If you don't pass the right browser it will give you NULL POINTER EXEPTION
		 * while launching the URL bcs the browser was not launched.
		 */
		driver.get("http://google.com");//NPE
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//verification point or check point or testing
		if(title.equals("Google"))//actual.equals(Expected)
		{
			System.out.println("Title is correct and my test is pass");
		}
		else
		{
			System.out.println("Title is not correct and my test is fail");
		}
		
		/*
		 * when you add you automation steps with your 
		 * verification point is called "Automation Testing"
		 */
		
		String appUrl = driver.getCurrentUrl();
		System.out.println(appUrl);
		if(appUrl.contains("google"))
		{
			System.out.println("URL is CORRECT - PASS");
		}
		else
		{
			System.out.println("URL is NOT CORRECT");
		}
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
//		if(pageSource.contains("google apps"))
//		{
//			System.out.println("PASSSSSSSSSSSSSS");
//		}
//			
//		else
//		{
//			System.out.println("FAILLLLLLLLLLLLLlllll");
//		}
			
		
		
		driver.quit();
		
		
		
		
		
	}

}
