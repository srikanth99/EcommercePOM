package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReusableFunctions extends BasePage {
    public ReusableFunctions(){
        PageFactory.initElements(driver,this);}
    @FindBy(id = "selectProductSort")
    WebElement selectProductSort;
    public void setSelectProductSort(String text){
        Utils.selectFromList(selectProductSort,text);
    }

}
