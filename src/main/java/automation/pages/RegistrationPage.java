package automation.pages;


    import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {
        @FindBy(id="email_create")
        WebElement enterEmail;
        @FindBy(id="SubmitCreate")
        WebElement createEmailBtn;
        @FindBy(css="#id_gender2")
        WebElement genderBtn;
        @FindBy(css="#customer_firstname")
        WebElement firstName;
        @FindBy(css="#email")
        WebElement email;
        @FindBy(css="#customer_lastname")
        WebElement secondName;
        @FindBy(css="#passwd")
        WebElement password;
        @FindBy(css="#days")
        WebElement Selectingday;
        @FindBy(css="#months")
        WebElement Selectingmonth;
        @FindBy(css="#years")
        WebElement Selectingyear;
        @FindBy(css="#firstname")
        WebElement FirstnameForaddress;
        @FindBy(css="#lastname")
        WebElement lastnameForaddress;
        @FindBy(css="#address1")
        WebElement address1;
        @FindBy(css="#city")
        WebElement city;
        @FindBy(css="#id_state")
        WebElement state;
        @FindBy(css="#postcode")
        WebElement postcode;
        @FindBy(css="#id_country")
        WebElement country;
        @FindBy(css="#phone_mobile")
        WebElement phoneNum;
        @FindBy(css="#alias")
        WebElement alias;
        @FindBy(css="#submitAccount")
        WebElement submitBtn;
        @FindBy(xpath="//*[@name='processAddress']")
        WebElement processbtn;
        @FindBy(xpath="//input[@type='checkbox'][@id='cgv']")
        WebElement chechBoxBtn;
        @FindBy(xpath="//button[@name='processCarrier']")
        WebElement ProcessCarrier;
        @FindBy(xpath="//*[@class='bankwire'][@title='Pay by bank wire']")
        WebElement PaymentBankWire;
        @FindBy(xpath="//*[@class='button btn btn-default button-medium'][@type='submit']")
        WebElement LastsubmitButton;

        public RegistrationPage(){
            PageFactory.initElements(driver,this);
        }

    public void setEnterEmail(String email){
            enterEmail.sendKeys(email);
    }

    public void setCreateEmailBtn() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+createEmailBtn.getLocation().y+")");
        createEmailBtn.click();
    }
    public void setGenderBtn(){
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        genderBtn.click();
    }

    public void setFirstName(String firstName1) {
        firstName.sendKeys(firstName1);

    }

    public void setEmail(String email2) {
        email.clear();
        email.sendKeys(email2);
    }
    public void setSecondName(String secndName){
        secondName.sendKeys(secndName);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }
    public void setSelectingDayMonthYear(String dateTxt,String monthTxt,String yearTxt ){
        /*Utils.selectFromList(Selectingday,dateTxt);
        Utils.selectFromList(Selectingmonth,MonthTxt);
        Utils.selectFromList(Selectingyear,YearTxt);*/
        /*Utils.selectFromList2(By.id("days"),dateTxt);
        Utils.selectFromList2(By.id("months"),monthTxt);
        Utils.selectFromList2(By.id("years"),yearTxt);*/
        Utils.selectFromListByValue(Selectingday,dateTxt);
        Utils.selectFromListByValue(Selectingmonth,monthTxt);
        Utils.selectFromListByValue(Selectingyear,yearTxt);

    }

    public void setFirstnameForaddress(String firstNameForaddress) {
        //Utils.scrollbyY(FirstnameForaddress);
        FirstnameForaddress.sendKeys(firstNameForaddress);
    }
    public void setLastnameForaddress(String lastnameForAddress){
        lastnameForaddress.sendKeys(lastnameForAddress);
    }

    public void setAddress1(String addressTxt) {
        address1.sendKeys(addressTxt);
    }
    public void setCity(String cityText){
        city.sendKeys(cityText);
    }
    public void setState(String stateText){
        Utils.selectFromList(state,stateText);
    }
    public void setPostcode(String postcodeTxt){
        postcode.sendKeys(postcodeTxt);
    }
    public void setCountry(String countryTxt){
        country.sendKeys(countryTxt);
    }
    public void setPhoneNum(String phoneNumber){
        phoneNum.sendKeys(phoneNumber);
    }
    public void setAlias(String myAddress){
        alias.clear();
        alias.sendKeys(myAddress);
    }
    public void setSubmitBtn() {
        submitBtn.click();
    }
    public void setProcessbtn(){
        processbtn.click();
    }
    public void setChechBoxBtn(){
        chechBoxBtn.click();
    }
    public void setProcessCarrier(){
        ProcessCarrier.click();

    }

    public void setPaymentBankWire(){
       // Utils.scrollbyY(PaymentBankWire);
        PaymentBankWire.click();
    }
    public void setLastsubmitButton(){
        LastsubmitButton.click();
    }



    /*public void registering() throws Exception {



		*

            postcode.sendKeys("12378");
            Utils.selectFromList(country, "United States");
            phoneNum.sendKeys("00445678937896");
            alias.clear();;
            alias.sendKeys("My Address");
            Thread.sleep(1000);
            submitBtn.click();
            processbtn.click();
            chechBoxBtn.click();
            ProcessCarrier.click();

            ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+PaymentBankWire.getLocation().y+")");

            PaymentBankWire.click();

            ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+LastsubmitButton.getLocation().y+")");

            LastsubmitButton.click();
*/
        }




