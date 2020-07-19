package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
	    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\exefiles\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
	    Thread.sleep(5000);  // Let the user actually see something!
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("ChromeDriver");
	    searchBox.submit();
	    Thread.sleep(5000);  // Let the user actually see something!
	    driver.quit();
	  }
}
