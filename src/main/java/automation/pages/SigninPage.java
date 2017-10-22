package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage extends BasePage {
	@FindBy(id="email") WebElement EnterEmailAddress;
	@FindBy(id="passwd")WebElement EnterPassword;
	@FindBy(id="SubmitLogin")WebElement submitbtn;
	/*public SigninPage() {
        PageFactory.initElements(driver,this);
    }*/
	
	public void  signingIn(String registeredemail,String password) {
		EnterEmailAddress.sendKeys(registeredemail);
		EnterPassword.sendKeys(password);
		submitbtn.click();
		
		
	}
}
