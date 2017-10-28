package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
	public static void implicitlyWait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS);
	}
    static WebDriverWait wait;
	public static boolean isElementPresent(WebElement element) {
		return element.isDisplayed();
		
	}
	public static void selectFromList(WebElement element,String text) {
		Select select = new Select(element);
	select.selectByVisibleText(text);;
	}
	
public static void scrollbyY(WebElement elementlocator) {
	WebElement ele=driver.findElement((By) elementlocator);
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0," + ele.getLocation().y + ")");
	
}
	public static void waitForElementVisible(WebElement element, int time) {
		wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void waitForElementClickable(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
