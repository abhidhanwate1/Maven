package openBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testorangehrmlive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//verify URL and Title
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		System.out.println("Actual URL: "+actualURL);		
		System.out.println("Actual Title: "+actualTitle);
		String expectedURl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";		
		String expectedTitle = "OrangeHRM";		
		System.out.println("URL Validation: "+actualURL.equals(expectedURl));		
		System.out.println("Title Validation: "+actualTitle.equals(expectedTitle));
		
		//enter username as admin
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
	
		password.sendKeys("admin123");
		
		driver.findElement(By.className("oxd-button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-userdropdown-link")));
		
		
		//driver.close();

	}

}
