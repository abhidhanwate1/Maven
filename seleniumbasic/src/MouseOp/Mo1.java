package MouseOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\seleniumbasic\\executables\\chromedriver.exe");
		 
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		 //frame handling
//		 WebElement frame = d.findElement(By.cssSelector(".demo-frame.lazyloaded"));
//		 d.switchTo().frame(frame);
		 WebElement frame = d.findElement(By.cssSelector(".demo-frame.lazyloaded"));
			d.switchTo().frame(frame);
			
		 Actions act = new Actions(d);
//		 List<WebElement> sourceElement = d.findElement(By.cssSelector("ul#gallery>li"));
		 WebElement target = d.findElement(By.id("trash"));
		 act.dragAndDrop(sourceElement.get(0), target).build().perform();
		 Thread.sleep(2000);
		 
		 
		 

	}

}
