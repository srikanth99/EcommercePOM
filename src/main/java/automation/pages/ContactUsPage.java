package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
	@FindBy(xpath="//h1[@class='page-heading bottom-indent']")
	WebElement contactUsPageTitile;
	@FindBy(xpath="//div[@id='center_column']/h1")
	WebElement contactPageHeader;

	@FindBy(css="#id_contact")
	WebElement subjectHeading;

	@FindBy(css="#email")
	WebElement mail;

	@FindBy(css="#id_order")
	WebElement orderReference;

	@FindBy(css="#fileUpload")
	WebElement fileUpload;

	@FindBy(css="#submitMessage")
	WebElement submitMessage;

	@FindBy(css="#message")
	WebElement message;

	@FindBy(xpath = "//div[@id='center_column']/p")
	WebElement confirmationMessage;

	public ContactUsPage(){ PageFactory.initElements(driver,this); }

	public void setSubjectHeading(String selectSubjectHeading){
		Utils.selectFromList(subjectHeading,selectSubjectHeading);
	}

	public boolean isUserOnContactPage(){
		return contactPageHeader.isDisplayed();
	}

	public void setMail(String email){
		mail.sendKeys(email);
	}

	public void setOrderReference(String settingOrderReference){
		orderReference.sendKeys(settingOrderReference);
	}
	public void setFileUpload(String filePath){

		fileUpload.sendKeys(filePath);
	}
	public void setSubmitMessage(){
		submitMessage.click();
	}
	public void setMessage(){
		message.sendKeys("Product is not Yet Delivered");
	}
	public String getConfirmationMessage(){
		return confirmationMessage.getText();
	}
}
