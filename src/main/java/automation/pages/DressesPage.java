package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressesPage extends BasePage {
    @FindBy(css="#list")
    WebElement select_List;
    @FindBy(xpath = "//div[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[3]/div[2]/a")
    WebElement orangeSkirt_Compare;
    @FindBy(xpath = "//div[@id='center_column']/ul/li[2]/div/div/div[3]/div/div[3]/div[2]/a")
    WebElement blackDress_Compare;
    @FindBy(xpath = "//div[@id='center_column']/ul/li[3]/div/div/div[3]/div/div[3]/div[2]/a")
    WebElement yellowDress_Compare;
    @FindBy(xpath = "//*[@id='center_column']/div[3]/div[2]/form/button")
    WebElement compare;
    @FindBy(xpath = "//*[text()='Discover our stores']")
    WebElement discoverStores;

    public  DressesPage(){
        PageFactory.initElements(driver,this);
    }
    public void setList(){
        select_List.click();
    }
    public void setOrangeSkirt_Compare(){
        orangeSkirt_Compare.click();
    }
    public void setBlackDress_Compare(){
        blackDress_Compare.click();
    }
    public void setYellowDress_Compare(){
        yellowDress_Compare.click();
    }
    public void setCompare(){
        compare.click();
    }
    public void setDiscoverStores(){
        discoverStores.click();
    }

}
