package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static automation.pages.BasePage.driver;
import static org.junit.Assert.assertTrue;

public class DressesPage extends BasePage {
    @FindBy(xpath = "//input[@value='18_7']")
    WebElement FilterByColor;
    @FindBy(xpath = "//input[@value='21_7']")
    WebElement FilterByStyleMax;
    @FindBy(xpath = "//input[@value='20_7']")
    WebElement FilterByStyleMid;
    @FindBy(xpath = "//input[@value='19_7']")
    WebElement FilterBySizeShort;
    @FindBy(xpath = "//form/div/div[10]/ul/div/div/a[1]")
    WebElement FilterByPriceSlider;


    public DressesPage(){
        PageFactory.initElements(driver,this);
    }

    public void setFilterByColor()

    {
        FilterByColor.click();
        boolean res=Utils.isElementPresent(By.xpath("//div[text()='Showing 1 - 1 of 1 items']"));
        assertTrue(res);

    }
    public void setFilterBySizeShort(){
        FilterBySizeShort.click();
        boolean res=Utils.isElementPresent(By.xpath("Showing 1 - 2 of 2 items"));
        assertTrue(res);


    }
    public void setFilterByStyleMax(){
        FilterByStyleMax.click();
        boolean res=Utils.isElementPresent(By.xpath("//div[text()='Showing 1 - 1 of 1 items']"));
        assertTrue(res);

    }

    public void setFilterByStyleMid() {
        FilterByStyleMid.click();
        boolean res=Utils.isElementPresent(By.xpath("//div[text()='Showing 1 - 1 of 1 items']"));
        assertTrue(res);
    }
    public void setFilterByPrice(int xval){

        Actions a=new Actions(driver);
        Action drag =a.clickAndHold(FilterByPriceSlider).moveByOffset(xval,0).release().build();
        drag.perform();

    }
}
