package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
	@FindBy(xpath="//*[@class='page-heading bottom-indent']")
	WebElement contactUsPageTitile;

}
