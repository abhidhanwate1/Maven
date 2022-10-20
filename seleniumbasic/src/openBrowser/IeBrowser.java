package openBrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\seleniumbasic\\executables\\IEDriverServer.exe");
		
		InternetExplorerDriver iedriver = new InternetExplorerDriver();
		
		iedriver.get("https://www.facebook.com/");
		
		//verify URL and Title
		String actualURL = iedriver.getCurrentUrl();
		String actualTitle = iedriver.getTitle();
		System.out.println("Actual URL: "+actualURL);
		System.out.println("Actual Title: "+actualTitle);
		
		String expectedURl = "https://www.facebook.com/";
		String expectedTitle = "Facebook – log in or sign up";
		
		System.out.println("URL Validation: "+actualURL.equals(expectedURl));
		System.out.println("Title Validation: "+actualTitle.equals(expectedTitle));
		
		String pagesource = iedriver.getPageSource();
		System.out.println("Page Source Length: "+pagesource.length());
		System.out.println("Page Source contain: "+pagesource);
		
		iedriver.close();
	}

}
