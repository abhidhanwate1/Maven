package browserOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.flipkart.com/");
		d.findElement(By.className("_2doB4z")).click();
	
		List<WebElement> list =d.findElements(By.cssSelector("div>div>a>*:nth-child(2).xtXmba"));
		System.out.println(list.size());
		int count = 1;
		for(int i=0;i<list.size();i++) {
			System.out.println(count+" "+list.get(i).getText());
			count++;

	}
	}
}
