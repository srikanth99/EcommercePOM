package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends BasePage {
    public ShippingPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="cgv")
    WebElement shippingPageCheckbox;
    @FindBy(xpath = "//*[@id='form']/p/button")
    WebElement proceedToCheckout;
    public void setShippingPageCheckbox(){ shippingPageCheckbox.click();}
    public void setProceedToCheckout(){
        proceedToCheckout.click();
    }

}
