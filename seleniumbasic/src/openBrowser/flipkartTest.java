package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Eclipse\\seleniumbasic\\executables\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		String Actualurl = driver.getCurrentUrl();
		String ActualTitle = driver.getTitle();
		System.out.println("Actual URL"+Actualurl);
		System.out.println("Actual Title: "+ActualTitle);
		
		String pagesource = driver.getPageSource();
		System.out.println("Pagesource Count: "+pagesource.length());
		//System.out.println("Pagesource Contain: "+pagesource);
		
		driver.close();
		
		
		

	}

}
