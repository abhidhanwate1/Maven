package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\seleniumbasic\\executables\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");//open url
		
		//verify url and title
		String actualUrl = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println("Actual URL is:"+actualUrl);
		System.out.println("Actual Title is:"+actualTitle); 
		
		String expectedUrl = "https://demo.actitime.com/login.do";
		String expectedTitle = "actiTIME - Login";
		
		System.out.println("URL Validation: "+actualUrl.equals(expectedUrl));
		System.out.println("Title Validadation: "+actualTitle.equals(expectedTitle));
		
		
		String pagesource = driver.getPageSource();
		System.out.println("Page source length: "+pagesource.length());
		System.out.println("Page source contain: "+pagesource);
		//close current browser
		driver.close();
	}

}


// open chrome browser
// enter application url as https://demo.actitime.com
// verify following component in the login paage
// -title
// -url 
// close browser
// 
