package automation;

import automation.pages.ContactUsPage;
import automation.pages.HomePage;
import automation.pages.SigninPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;



public class HomePageTests extends BaseTests {
	//TestData
    String selectSubjectHeading="Customer service";
	String email="anugu.archana@gmail.com";
	String settingorderReference="KYJUXWFXQ - 10/09/2017";
	String filePath="C:\\Users\\sridhar\\Desktop\\mon.jpg";
	String message="Your message has been successfully sent to our team.";

    //Creating object for Reusable function classes
    HomePage homePage=new HomePage();
    ContactUsPage contactUsPage=new ContactUsPage();

	@Test
	public void verifyContactUs() {
        homePage.navigateToContactUsPage();
        Assert.assertTrue(contactUsPage.isUserOnContactPage());
        contactUsPage.setSubjectHeading(selectSubjectHeading);
        contactUsPage.setMail(email);
        contactUsPage.setOrderReference(settingorderReference);
        contactUsPage.setFileUpload(filePath);
        contactUsPage.setMessage();
        contactUsPage.setSubmitMessage();
        Assert.assertEquals(contactUsPage.getConfirmationMessage(),message);
	}
	
	/*@Test
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
	 */
		
	}


