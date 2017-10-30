package automation;

import automation.pages.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;



public class HomePageTests extends BaseTests {
	//Test Data
	String sortByData="Price: Lowest first";
	int timetowait=3000;
	String emailExisting="mona123@gmail.com";
	String passwordExisting="secret123";
	String friendName="Archana";
	String friendEmail="Archana123@gmail.com";
	String expectedMsg="Your e-mail has been sent successfully";
    //Creating objects
	HomePage homePage=new HomePage();
	ProceedToCheckOutPage proceedToCheckOutPage=new ProceedToCheckOutPage();
	SummaryPage summaryPage=new SummaryPage();
	AuthenticationPage authenticationPage=new AuthenticationPage();
	AddressPage addressPage=new AddressPage();
	ShippingPage shippingPage=new ShippingPage();
	PaymentMethodPage paymentMethodPage=new PaymentMethodPage();
	WomenPage womenPage=new WomenPage();
	TopsPage topsPage=new TopsPage();
	MorePage morePage=new MorePage();
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

	@Test
	 public void verifyUserCanAddAnItemAndProceedToCheckOutSuccessfully(){
		homePage.waitForItem();
		homePage.setProduct1();
		homePage.setAddToCartProduct1();
		proceedToCheckOutPage.waitForProceedToCheckoutElement();
		proceedToCheckOutPage.setProceedToCheckout();
		System.out.println(summaryPage.isUserOnSummaryPage());
		Assert.assertTrue(summaryPage.isUserOnSummaryPage());
		summaryPage.waitForProceedToCheckOutInSummaryPage();
		summaryPage.setProceedToCheckout();
		Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
		authenticationPage.setEmail_AlreadyRegistered(emailExisting);
		authenticationPage.setPassword_AlreadyRegistered(passwordExisting);
		authenticationPage.setSubmitLogin();
		Utils.implicitlyWait(timetowait);
		addressPage.setProceedToCheckout();
		Utils.implicitlyWait(timetowait);
		shippingPage.setShippingPageCheckbox();
		shippingPage.setProceedToCheckout();
		Assert.assertTrue(paymentMethodPage.isUserOnPaymentMethodPage());

	}
	@Test
	public void verifyUserCanReferAnItemToFriend(){
		homePage.waitForItem();
		homePage.setProduct1();
		homePage.setMore1();
		morePage.setSendToAFriend();
		morePage.isUserOnSendToFriendPage();
		morePage.setFriendName(friendName);
		morePage.setFriendEmail(friendEmail);
		morePage.setSend_button();
		morePage.waitForActualConfirmationMsg();
		System.out.println(morePage.getActualMsg());
		Assert.assertEquals(morePage.getActualMsg(),expectedMsg);
		morePage.setOkButton();


	}
	@Test
	public void verifyUserCanNavigateToTopsPageFromHomePage(){
		homePage.goToWomenPage();
		System.out.println(womenPage.isUserOnWomenPage());
		Assert.assertTrue(womenPage.isUserOnWomenPage());
		womenPage.goToTopsPage();
		System.out.println(topsPage.isUserOnTopsPage());
		Assert.assertTrue(topsPage.isUserOnTopsPage());
	}


	}


