package automation;

import automation.pages.ContactUsPage;
import automation.pages.HomePage;
import automation.pages.SigninPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;



public class HomePageTests extends BaseTests {
	
	@Test
	public void verifyContactUs() {
	ContactUsPage contactus=PageFactory.initElements(driver,ContactUsPage.class);
	HomePage homepage=PageFactory.initElements(driver,HomePage.class);
    homepage.contactUsLinkPresence();
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


