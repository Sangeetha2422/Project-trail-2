import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Selenium_test {
	WebDriver driver;
	public void launchbrowser() {
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://www.amazon.com/");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Selenium_test obj=new Selenium_test();
		obj.launchbrowser();
	}

}
