package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductComparissionPage extends BasePage{
    @FindBy(css="#center_column")
    WebElement productCompare_Confirmation;
    public ProductComparissionPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnProductComparision(){
       return Utils.isElementPresent(productCompare_Confirmation);
    }
}
