package automation;


import automation.pages.HomePage;
import automation.pages.RegistrationPage;
import automation.pages.SigninPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;



    public class RegistrationTest extends BaseTests {
        //testData
        String email="sahi123456@gmail.com";
        String firstName1="sahi";
        String secondTimeEmail="sahi123456@gmail.com";
        String secndName="sunny";
        String pwd="sahisunny";
        String dateText="5";
        String monthText="4";
        String yearTxt="2016";
        String firstNameForAddress="sahiti";
        String lastNameForAddress="daida";
        String addressLine="1234 melton rd";
        String cityTxt="London";
        String stateText="Texas";
        String countryTxt="United States";
        String pstCode="12345";
        String phnum="0044568899323";
        String aliastxt="MyAddress";

        //object Creation
        HomePage homePage=new HomePage();
        RegistrationPage registrationPage=new RegistrationPage();


        @Test
        public void verifyRegistrationPage(){
            homePage.signin();
            registrationPage.setEnterEmail(email);
            registrationPage.setCreateEmailBtn();
            registrationPage.setGenderBtn();
            registrationPage.setFirstName(firstName1);
            registrationPage.setEmail(secondTimeEmail);
            registrationPage.setSecondName(secndName);
            registrationPage.setPassword(pwd);
            registrationPage.setSelectingDayMonthYear(dateText,monthText,yearTxt);
            registrationPage.setFirstnameForaddress(firstNameForAddress);
            registrationPage.setLastnameForaddress(lastNameForAddress);
            registrationPage.setAddress1(addressLine);
            registrationPage.setCity(cityTxt);
            registrationPage.setState(stateText);
            registrationPage.setPostcode(pstCode);
            registrationPage.setCountry(countryTxt);
            registrationPage.setPhoneNum(phnum);
            registrationPage.setAlias(aliastxt);
            registrationPage.setSubmitBtn();
            registrationPage.setProcessbtn();
            registrationPage.setChechBoxBtn();
            registrationPage.setProcessCarrier();
            registrationPage.setPaymentBankWire();
            registrationPage.setLastsubmitButton();

        }






        /*public void resgistrationTest() throws Exception {
            HomePage homepage=PageFactory.initElements(driver,HomePage.class);
            SigninPage signin=PageFactory.initElements(driver,SigninPage.class);
            RegistrationPage registration=PageFactory.initElements(driver,RegistrationPage.class);

            homepage.signin();
            registration.registering();

        }*/


    }

