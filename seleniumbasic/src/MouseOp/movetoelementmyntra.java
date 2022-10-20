package MouseOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetoelementmyntra {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\\\Eclipse\\\\Workspace\\\\seleniumbasic\\\\executables\\\\chromedriver.exe");
	 WebDriver d =  new ChromeDriver();
	 d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 d.get("https://www.myntra.com/");
	 List<WebElement> mainmenu =d.findElements(By.xpath("//a[@class='desktop-main']"));
	 Actions act = new Actions(d);
	 System.out.println("size:"+mainmenu.size());
	 act.moveToElement(mainmenu.get(2)).perform();
	 for(int i=0;i<mainmenu.size();i++) {
		 act.moveToElement(mainmenu.get(i)).perform();
		 Thread.sleep(1500);
	 }

	}

}
