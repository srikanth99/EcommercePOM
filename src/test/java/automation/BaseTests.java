package automation;

import automation.pages.BasePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class BaseTests extends BasePage {

	@BeforeClass
	public static void openbrowser() {
		BasePage.startBrowser();
		
		}
	@AfterClass
	public static void closedown() throws InterruptedException {
		Thread.sleep(10000);
		BasePage.closebrowser();
	}
	

}
