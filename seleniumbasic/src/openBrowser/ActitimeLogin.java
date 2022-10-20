package openBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) {
//		open chorme browser
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		enter URL
		driver.get("https://demo.actitime.com/");
		
		//verify URL and Title
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println("Actual URL: "+actualURL);
		System.out.println("Actual Title: "+actualTitle);
		
		String expectedURl = "https://demo.actitime.com/login.do";
		String expectedTitle = "actiTIME - Login";
		
		System.out.println("URL Validation: "+actualURL.equals(expectedURl));
		System.out.println("Title Validation: "+actualTitle.equals(expectedTitle));
						
				
//		enter username as admin
		
		WebElement usernameip = driver.findElement(By.name("username"));
		
		usernameip.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		
		password.sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
//		driver.close();

	}

}
