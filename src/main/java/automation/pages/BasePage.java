package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BasePage {
	public static WebDriver driver;
	public static String url="http://automationpractice.com/index.php";
	
	public static void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedrivernew.exe");
       driver = new ChromeDriver();
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		
	}
	public static void closebrowser() {
		driver.close();
		driver.quit();
		
	}
	
	

}
