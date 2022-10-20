package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\seleniumbasic\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//Verify URL and Title
		String ActualURL = driver.getCurrentUrl();
		String ActualTitle = driver.getTitle();
		System.out.println("Actual URL: "+ActualURL);
		System.out.println("Actual Title: "+ActualTitle);
		
		String ExpURL = "https://www.google.com/";
		String ExpTitle = "Google";
		
		System.out.println("URL Validation: "+ActualURL.equals(ExpURL));
		System.out.println("Title Validation: "+ActualTitle.equals(ExpTitle));
		
		String pagesource = driver.getPageSource();
		System.out.println("Page Source Length: "+pagesource.length());
//		System.out.println("Page source Contain: "+pagesource);
		driver.cl
		driver.close();
		
		
		

	}

}
