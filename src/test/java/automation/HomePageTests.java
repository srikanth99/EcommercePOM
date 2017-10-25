package automation;

import automation.pages.ContactUsPage;
import automation.pages.HomePage;
import automation.pages.SigninPage;
import automation.pages.Utils;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;



public class HomePageTests extends BaseTests {
	HomePage homepage= new HomePage();
	SigninPage signin=new SigninPage();
	
	@Test
	public void verifyContactUs() {
	//ContactUsPage contactus=PageFactory.initElements(driver,ContactUsPage.class);
	//HomePage homepage=PageFactory.initElements(driver,HomePage.class);
    homepage.contactUsLinkPresence();
	}
	
	@Test
    public void verifySignIn() throws Exception {

	homepage.signin();
	signin.signingIn("daida123adv@gmail.com","sahisunny");
	homepage.search("dresses");
	homepage.gridVeiw();
	homepage.listveiw();
	homepage.sortby("Price: Lowest first");
	homepage.addToCompare();
	}
	 @Test
	public void verifySummerDresses(){
		homepage.dresses();

	 }


	 }
		



