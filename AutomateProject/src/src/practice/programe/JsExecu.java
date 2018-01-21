package src.practice.programe;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsExecu {

	public static void main(String[] args) {
		
		WebDriver driver ;
		System.setProperty("webdriver.gecko.driver","./exes/geckodriver.exe");
		driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("console.log('Hello This is Umesh through Executor');");
	}
}
