package openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCromeBrowser {

	public static void main(String[] args) {
		
		//step1 : using system.setProperty(key.value) set to path for CromeDriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\seleniumbasic\\executables\\chromedriver.exe");
		
		//step2 : create an instance of ChromeDriver class
		ChromeDriver cdrive = new ChromeDriver();
		
	}

}
