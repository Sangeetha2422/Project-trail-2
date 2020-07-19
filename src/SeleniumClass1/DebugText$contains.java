package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DebugText$contains {

public static void main(String[] args) throws InterruptedException {
		
		// configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\exefiles\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
	///// How to use text and contains in xpath /////
		
			//Using text (using redbus link)
			
			//WebElement textUserName2 = driver.findElement(By.xpath("(//a[text()='India'])[1]"));
			//textUserName2.click();
			
			//WebElement textUserName3 = driver.findElement(By.xpath("(//div[text()='Yes take me to redBus India'])[1]"));
			//textUserName3.click();
			
			
		//using contains (using flipkart link)
			
			WebElement textUserName4 = driver.findElement(By.xpath("(//a[contains(@id, 'click-target')])[1]"));
			textUserName4.click();
			
			
}
}
