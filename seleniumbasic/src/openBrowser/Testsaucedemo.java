package openBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsaucedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
		
		//verify URL and Title
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println("Actual URL: "+actualURL);		
		System.out.println("Actual Title: "+actualTitle);
		String expectedURl = "https://www.saucedemo.com/";		
		String expectedTitle = "Swag Labs";		
	
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login validation is passed");
		}else {
			System.out.println("Login validation is failed");
		}
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
		//driver.close();		
		

	}

}
