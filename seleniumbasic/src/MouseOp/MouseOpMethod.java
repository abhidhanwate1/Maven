package MouseOp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MouseOpMethod {
	static WebDriver d = null;

	public static void main(String[] args) {
		
		setup("chrome", "https://www.google.com");
		System.out.println(d.getTitle());

	}
	static WebDriver setup(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		d = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\geckodriver.exe");
				d = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\IEDriverServer.exe");
			d = new InternetExplorerDriver();
		}
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get(url);
		return d;
	}
static void cleanup() {
	d.close();
}}
