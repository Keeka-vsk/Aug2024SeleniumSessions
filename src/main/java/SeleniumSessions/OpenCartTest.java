	package SeleniumSessions;

public class OpenCartTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/");
		
		String acttitle = brUtil.getPageTitle();
		if(acttitle.equals("Your Store")) {
			System.out.println("Title is CORRECT");
		}
		else {
			System.out.println("Title is WRONG");
		}
		
		String actUrl = brUtil.getPageUrl();
		if(actUrl.contains("opencart")) {
			System.out.println("URL is CORRECT");
		}
		else {
			System.out.println("URL is WRONG");
		}
		
		brUtil.closeBrowser();
		
	}

}
