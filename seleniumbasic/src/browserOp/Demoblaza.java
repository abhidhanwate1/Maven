package browserOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaza {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com");
		String geturl = driver.getCurrentUrl();
		String GetTitle = driver.getTitle();
		System.out.println("Current Url: "+geturl);
		System.out.println("Title Of page: "+GetTitle);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> mobilelist = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		List<WebElement >Mobilepricelist = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4"));
		
		for (int i=0;i<mobilelist.size();i++) {
			System.out.println(mobilelist.get(i).getText()+"......"+Mobilepricelist.get(i).getText());
		}
		

	}

}
