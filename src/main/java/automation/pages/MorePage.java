package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage extends BasePage {
   public MorePage(){
        PageFactory.initElements(driver,this);}
        @FindBy(id = "send_friend_button")
    WebElement sendToAFriend;
   @FindBy(id="friend_name")
   WebElement friendName;
   @FindBy(id = "friend_email")
   WebElement friendEmail;
   @FindBy(id="sendEmail")
   WebElement send_button;
   @FindBy(id="send_friend_form")
   WebElement sendFriendHeader;
   @FindBy(xpath = "//*[@id='product']/div[2]/div/div/div/p[1]")
   WebElement actualMsg;
   @FindBy(xpath ="//input[@value=\"OK\"]")
   WebElement okButton;

    public void setSendToAFriend(){
        sendToAFriend.click();
    }
    public void setFriendName(String friendNameText){
        friendName.sendKeys(friendNameText);
    }
    public void setFriendEmail(String friendEmailText){
        friendEmail.sendKeys(friendEmailText);
    }
    public void setSend_button(){
        send_button.click();
    }
    public boolean isUserOnSendToFriendPage(){
        return Utils.isElementPresent(sendFriendHeader);
    }
    public String getActualMsg(){
        return actualMsg.getText();
    }
    public void setOkButton()
    {
        okButton.click();
    }

}
