package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage extends BasePage {
    public SummaryPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='cart_title']")
    WebElement summaryPageHeader;
    @FindBy(linkText = "Proceed to checkout")
    WebElement proceedToCheckout;
    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }
    public boolean isUserOnSummaryPage(){
        return Utils.isElementPresent(summaryPageHeader);
    }
    public void waitForProceedToCheckOutInSummaryPage(){
        Utils.waitForElementVisible(proceedToCheckout,3000);
    }
}
