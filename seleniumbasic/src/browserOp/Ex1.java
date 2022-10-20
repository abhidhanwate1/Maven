package browserOp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// set browser window size
		driver.manage().window().setSize(new Dimension(500, 800));
		// explicit wait(static wait)
		Thread.sleep(2000);
		// maximize browser window
		driver.manage().window().maximize();
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// identify and click on login button
		driver.findElement(By.className("orangehrm-login-forgot")).click();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// come back to the previous page
		driver.navigate().back();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// come back to the next page
		driver.navigate().forward();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// to reload the current page
		driver.navigate().refresh();
		// explicit wait(static wait)
		Thread.sleep(2000);
		// to move to different URL
		driver.navigate().to("https://www.google.com");
	}

}