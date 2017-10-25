package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends BasePage {
    public AddressPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='center_column']/form/p/button")
    WebElement proceedToCheckout;
    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }

}
