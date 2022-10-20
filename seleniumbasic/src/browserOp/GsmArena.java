package browserOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		String GetURL = driver.getCurrentUrl();
		String GetTitle = driver.getTitle();
		System.out.println("Actual URL: "+GetURL);
		System.out.println("Actual Title: "+GetTitle);
		
		List<WebElement> company = driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println("Count: "+company.size());
		
		int count = 1;
		for(int i=0;i<company.size();i++) {
			System.out.println(count+" "+company.get(i).getText());
			count++;
		}
		}

}
