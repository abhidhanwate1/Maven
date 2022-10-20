package dropDown;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Source = d.findElement(By.id("src"));
		Source.sendKeys("Pune");
		d.findElement(By.cssSelector(".autoFill.homeSearch>:nth-child(2)")).click();
		
		WebElement Dest = d.findElement(By.id("dest"));
		Dest.sendKeys("Goa");
		d.findElement(By.cssSelector("ul.autoFill.homeSearch>:nth-child(2)")).click();
		
		d.findElement(By.id("onward_cal")).click();
		d.findElement(By.className("next")).click();
		d.findElement(By.cssSelector("tbody>:nth-child(4)>:nth-child(7)")).click();
		d.findElement(By.id("search_btn")).click();
		d.findElement(By.cssSelector("div.filter-details.f-12.d-color>div.details>ul.dept-time.dt-time-filter>li.checkbox>label")).click();
		d.findElement(By.cssSelector("li.checkbox>label[for=bt_AC]")).c
		WebElement list = d.findElement(By.cssSelector("li.row-sec.clearfix>div>div>div>div>div.travels.lh-24.f-bold.d-color"));
		List B = List
//		List<WebElement> company = driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
//		
//		List<WebElement> B  = name.getOptions();
//		System.out.println("size: "+B.size());
		
		
	}

}
