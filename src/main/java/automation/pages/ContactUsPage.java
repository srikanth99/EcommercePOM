package automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
	@FindBy(xpath="//*[@class='page-heading bottom-indent']")
	WebElement contactUsPageTitile;
	@FindBy(xpath="//div[@id='center_column']/h1")
	WebElement contactPageHeader;

	@FindBy(xpath="//*[@id='id_contact']")
	WebElement subjectHeading;

	@FindBy(id="email")
	WebElement mail;

	@FindBy(id="id_order")
	WebElement orderReference;

	@FindBy(id="fileUpload")
	WebElement fileUpload;

	@FindBy(id="submitMessage")
	WebElement submitMessage;

	@FindBy(id="message")
	WebElement message;

	@FindBy(xpath = "//div[@id='center_column']/p")
	WebElement confirmationMessage;

	public ContactUsPage(){ PageFactory.initElements(driver,this); }

	public void setSubjectHeading(){
		Utils.selectFromList(subjectHeading,"Customer service");
	}

	public boolean isUserOnContactPage(){
		return contactPageHeader.isDisplayed();
	}

	public void setMail(String email){
		mail.sendKeys(email);
	}

	public void setOrderReference(){
		orderReference.sendKeys("KYJUXWFXQ - 10/09/2017");
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
