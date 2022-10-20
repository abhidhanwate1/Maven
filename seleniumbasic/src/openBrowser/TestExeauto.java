package openBrowser;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestExeauto {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\seleniumbasic\\executables\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		String actualUrl = driver.getCurrentUrl();
		String acttitle = driver.getTitle();
		System.out.println("ActualUrl: "+actualUrl);
		System.out.println("Actual Title: "+acttitle);
		String ExpURL = "https://demosite.executeautomation.com/Login.html";
		String expTitle = "Execute Automation";
		
		System.out.println("URL Validation: "+actualUrl.equals(ExpURL));
		System.out.println("Title Validaion: "+acttitle.equals(expTitle));
		
		WebElement username = driver.findElement(By.name("UserName"));
		username.sendKeys("execution");
		
		WebElement pwd = driver.findElement(By.name("Password"));
		pwd.sendKeys("admin");
		
		driver.findElement(By.name("Login"));
		
		driver.close();

	}

}
