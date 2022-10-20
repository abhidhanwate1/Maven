package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\seleniumbasic\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//verify URL and Title
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println("Actual URL: "+actualURL);
		System.out.println("Actual Title: "+actualTitle);
		
		String expectedURl = "https://www.facebook.com/";
		String expectedTitle = "Facebook – log in or sign up";
		
		System.out.println("URL Validation: "+actualURL.equals(expectedURl));
		System.out.println("Title Validation: "+actualTitle.equals(expectedTitle));
		
		String pagesource = driver.getPageSource();
		System.out.println("Page Source Length: "+pagesource.length());
//		System.out.println("Page Source contain: "+pagesource);
		
		driver.close();
		
		
		
	}

}
