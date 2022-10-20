package MouseOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cricinfomovetoelement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Eclipse\\\\Workspace\\\\seleniumbasic\\\\executables\\\\chromedriver.exe");
 WebDriver d =  new ChromeDriver();
 d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 d.get("https://www.espncricinfo.com/");
 List<WebElement> menu =d.findElements(By.xpath("//a[@class='ci-nav-item ci-nav-text ci-nav-hover ds-cursor-pointer']"));
 System.out.println("size:"+menu.size());
 Actions act= new Actions(d);
 for(int i=0;i<menu.size();i++) {
	 act.moveToElement(menu.get(i)).perform();
	 Thread.sleep(1500);
 }

	}

}
