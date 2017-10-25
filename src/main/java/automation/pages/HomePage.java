package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class HomePage extends BasePage {
	@FindBy(xpath="//div[6]/ul/li[2]/a")
	WebElement dressesLink;
	@FindBy(xpath="html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a")
	WebElement summerDresesLink;
	@FindBy(xpath="//*[@class='login']")
	WebElement signinbtn;
	@FindBy(xpath="//*[@title='Contact Us']")
	WebElement contactuslink;
	@FindBy(id="search_query_top")
	WebElement searchBox;
	@FindBy(xpath="//*[@name='submit_search']")
	WebElement searchclickbtn;
	@FindBy(xpath="//*[@title='Grid']")
	WebElement GridVeiwImg;
	@FindBy(xpath="//*[@class='icon-th-list']")
	WebElement listveiwimg;
	@FindBy(id="selectProductSort")
	WebElement sortBY;
	@FindBy(xpath="//*[@class='add_to_compare'][@data-id-product='5']")
	WebElement addTocomparebtnForitem5;
	@FindBy(xpath="//*[@class='add_to_compare'][@data-id-product='4']")
	WebElement addTocomparebtnForitem4;
	@FindBy(xpath="html/body/div[1]/div[2]/div/div[3]/div[2]/div[1]/div[2]/form/button")
	WebElement compareBtn;
	public HomePage(){
		PageFactory.initElements(driver,this);
	}


	public void dresses(){
		Utils.waitForElementVisible(dressesLink,5);
		Actions act= new Actions(driver);
		act.moveToElement(dressesLink).perform();
		act.moveToElement(summerDresesLink);
		act.click();
		act.perform();
	}
	public void clickDressesLink(){
		dressesLink.click();
	}
	//for a valid user name and password who already registered
	public void signin() {
	signinbtn.click();	
	}
	
	public void contactUsLinkPresence() {
		contactuslink.isEnabled();
		contactuslink.click();

		}
	public void search(String itemname) {
	searchBox.sendKeys(itemname);
		searchclickbtn.click();
		boolean res1=Utils.isElementPresent(By.xpath("//*[@class='heading-counter']"));
		assertTrue(res1);

	}
	
	public void gridVeiw() {
		GridVeiwImg.click();
		
	}
	public void listveiw() {
		listveiwimg.click();
	}
	public void sortby(String text) throws Exception {
		Thread.sleep(1000);
	Utils.selectFromList(sortBY,text);
	
	}

	public void addToCompare() throws Exception {
		
		addTocomparebtnForitem4.click();
		addTocomparebtnForitem5.click();
		Thread.sleep(1000);
		compareBtn.click();
		boolean res=Utils.isElementPresent(By.xpath("//*[@class='page-heading']"));
		Assert.assertTrue(res);
	
	}
	
	

}
