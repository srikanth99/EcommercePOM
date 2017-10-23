package automation;

import automation.pages.ContactUsPage;
import automation.pages.HomePage;
import automation.pages.SigninPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;



public class HomePageTests extends BaseTests {
	//TestData
	String email="anugu.archana@gmail.com";
	String filePath="C:\\Users\\sridhar\\Desktop\\mon.jpg";
	@Test
	public void verifyContactUs() {
	ContactUsPage contactus=PageFactory.initElements(driver,ContactUsPage.class);
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
    homepage.contactUsLinkPresence();
		Assert.assertTrue(contactus.isUserOnContactPage());
		contactus.setSubjectHeading();
		contactus.setMail(email);
		contactus.setOrderReference();
		contactus.setFileUpload(filePath);
		contactus.setMessage();
		contactus.setSubmitMessage();
		Assert.assertEquals(contactus.getConfirmationMessage(),"Your message has been successfully sent to our team.");

	}
	
	@Test
    public void verifySignIn() throws Exception {
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
	SigninPage signin=PageFactory.initElements(driver,SigninPage.class);
	homepage.signin();
	signin.signingIn("daida123adv@gmail.com","sahisunny");
	homepage.search("dresses");
	homepage.gridVeiw();
	homepage.listveiw();
	homepage.sortby("Price: Lowest first");
	homepage.addToCompare();
	}  
	    
		
	}


