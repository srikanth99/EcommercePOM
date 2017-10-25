package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckOutPage extends BasePage {
    public ProceedToCheckOutPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Proceed to checkout")
    WebElement proceedToCheckout;
    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }
    public void waitForProceedToCheckoutElement(){
        Utils.waitForElementVisible(proceedToCheckout,3000);
    }

}
