package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
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
	
	//for a valid user name and password who already registered
	public void signin() {
	signinbtn.click();	
	}
	
	public void contactUsLinkPresence() {
		contactuslink.isEnabled();
		contactuslink.click();
		/*boolean res =contactpage.contactUsPageTitile.isDisplayed();
		assertTrue(res);*/
		}
	public void search(String itemname) {
		searchBox.sendKeys(itemname);
		searchclickbtn.click();
		boolean res1=Utils.isElementPresent(By.xpath("//*[@class='heading-counter']"));
		Assert.assertTrue(res1);
			
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
