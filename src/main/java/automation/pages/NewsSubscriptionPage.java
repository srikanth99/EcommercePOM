package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsSubscriptionPage extends BasePage{
    @FindBy(css="#newsletter-input")
    WebElement emailForNews;
    @FindBy(xpath ="//div[@id='newsletter_block_left']/div/form/div/button")
    WebElement submitNewsButton;
    @FindBy(xpath = "//div[@id='columns']/p")
    WebElement newsConfirmationMessage;

    public NewsSubscriptionPage(){
        PageFactory.initElements(driver,this);
    }

    public void setEmailForNews(String news_Email){
        emailForNews.sendKeys(news_Email);
        submitNewsButton.click();
    }
    public String setNewsConfirmationMessage(){
        return newsConfirmationMessage.getText();
    }
}
