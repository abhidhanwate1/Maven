package openBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireBrowser {

	public static void main(String[] args) {
		
		//step1 : using system.setProperty(key.value) set to path for Geckodriver.exe
				System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\seleniumbasic\\executables\\geckodriver.exe");
				
				//step2 : create an instance of ChromeDriver class
				FirefoxDriver cdrive = new FirefoxDriver();

	}

}
