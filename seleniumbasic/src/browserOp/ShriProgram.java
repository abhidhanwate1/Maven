package browserOp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShriProgram {
	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver",
	    		"C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
	    WebDriver d=new ChromeDriver();
	    d.get("https://www.gsmarena.com/");
	d.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(d,10);
	//wait.until(ExpectedConditions.elementToBeClickable(By))
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//d.findElement(By.cssSelector("body>:nth-child(6)>div>div>div>:nth-child(1)")).click();
	d.findElement(By.cssSelector(".brandmenu-v2>ul>li>a")).click();
	List<WebElement> list =d.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
	System.out.println("size of list: "+list.size());
	int count=1;
	for(int i=0; i<list.size();i++) {
		System.out.println(count+" "+list.get(i).getText());
		count++;
	}
	}
}