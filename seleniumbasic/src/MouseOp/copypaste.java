package MouseOp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copypaste {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Eclipse\\Workspace\\seleniumbasic\\executables\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/reg/");
		WebElement name = d.findElement(By.name("firstname"));
		name.sendKeys("pallavi", Keys.chord(Keys.CONTROL, "a"));
		name.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		WebElement lastname = d.findElement(By.name("lastname"));
		lastname.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		WebElement email = d.findElement(By.name("firstname"));
		email.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		email.sendKeys(Keys.chord(Keys.CONTROL, "x"));
		d.findElement(By.name("reg_email__")).sendKeys((Keys.chord(Keys.CONTROL, "v")));

	}

}
