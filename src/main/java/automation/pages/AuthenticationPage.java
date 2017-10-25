package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='center_column']/h1")
    WebElement authenticationPageHeader;
    @FindBy(id="email")
    WebElement email_AlreadyRegistered;
    @FindBy(id = "passwd")
    WebElement password_AlreadyRegistered;
    @FindBy(id="SubmitLogin")
    WebElement submitLogin;
    public boolean isUserOnAuthenticationPage(){
        return Utils.isElementPresent(authenticationPageHeader);
    }
    public void setEmail_AlreadyRegistered(String emailAlreadyExisting){
        email_AlreadyRegistered.sendKeys(emailAlreadyExisting);

    }
    public void setPassword_AlreadyRegistered(String passwordAlreadyExisting){
        password_AlreadyRegistered.sendKeys(passwordAlreadyExisting);
    }
    public void setSubmitLogin(){
        submitLogin.click();
    }

}
