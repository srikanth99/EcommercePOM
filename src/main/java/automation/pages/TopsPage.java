package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopsPage extends BasePage {
    public TopsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='center_column']/h1/span[1]")
    WebElement topsPageHeader;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
    WebElement product1;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement addToCart_prd1;
    @FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[3]/a[2]/span")
    WebElement more1;
    public boolean isUserOnTopsPage(){
        return Utils.isElementPresent(topsPageHeader);
    }
    public void setProduct1(){
        Utils.mouseHover(product1);
    }
    public void setMore1(){
        more1.click();
    }
    public void setAddToCart_prd1(){
        addToCart_prd1.click();
    }
}
