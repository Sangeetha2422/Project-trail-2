package SeleniumClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		// configure the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\exefiles\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// browser launch
		driver.get("https://www.facebook.com/");
		
	//////Locators using sendkeys////////
		
		// fill the user name text box
		WebElement textUserName = driver.findElement(By.id("email"));
		textUserName.sendKeys("callmesan58@gmail.com");
		
		// fill the password text box
		//WebElement textPassword = driver.findElement(By.name("pass"));
		//textPassword.sendKeys("daretolive");
		
		
		// click the login button
	    //WebElement loginButton = driver.findElement(By.id("loginbutton"));
		//loginButton.click();
		
		
		////// to find Webelement by using xpath ////// 
		
		
		// fill the user name text box
		WebElement textUserName1 = driver.findElement(By.xpath("(//input[@class=\"inputtext login_form_input_box\"])[1]"));
		textUserName1.sendKeys("callmesan58@gmail.com");
		
		// fill the password text box
		WebElement textPassword1 = driver.findElement(By.xpath("(//input[@name=\"pass\"])[1]"));
		textPassword1.sendKeys("daretolive");
		
		//click the login button
		WebElement loginButton1 = driver.findElement(By.xpath("(//input[@id=\"u_0_b\"])[1]"));
		loginButton1.click();
		
		
		
		
	}
	
	}

