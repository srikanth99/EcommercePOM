package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindStoresPage extends BasePage{
@FindBy(css="#addressInput")
WebElement location_search1;
@FindBy(css="#radiusSelect")
WebElement radius;
@FindBy(xpath = "//div[@id='center_column']/div[2]/div[3]/button")
WebElement location_Search_Button;

public FindStoresPage(){
    PageFactory.initElements(driver,this);
}

public void setLocation_search(String location1){
    location_search1.sendKeys(location1);
}
public void setLocation_Search_Button(){
    location_Search_Button.click();
}
    public void setRadius(String radius_set){
    Utils.selectFromList(radius,radius_set);
    }
}

