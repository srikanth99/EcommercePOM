package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends BasePage {
    public WomenPage(){
        PageFactory.initElements(driver,this);}
    @FindBy(xpath = "//*[@id='subcategories']/ul/li[1]/h5/a")
    WebElement tops_link;
    @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
    WebElement womenPageHeader;
    public void goToTopsPage(){
        tops_link.click();
    }
    public boolean isUserOnWomenPage(){
        return Utils.isElementPresent(womenPageHeader);
    }
}
