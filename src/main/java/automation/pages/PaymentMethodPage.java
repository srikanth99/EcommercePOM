package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage extends BasePage {
    public PaymentMethodPage(){PageFactory.initElements(driver,this);}
    @FindBy(xpath = "//*[@id='center_column']/h1")
    WebElement paymentMethodHeader;
    public boolean isUserOnPaymentMethodPage(){
        return Utils.isElementPresent(paymentMethodHeader);
    }
}
