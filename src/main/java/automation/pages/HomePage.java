package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	public HomePage(){PageFactory.initElements(driver,this);}
	
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
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women_Link;
	@FindBy(id = "search_query_top")
	WebElement search;
	@FindBy(xpath = "//*[@id='searchbox']/button")
	WebElement searchButton;
	@FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")
	WebElement product1;
	@FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addToCartProduct1;
	@FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]/span")
	WebElement more1;

	
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
		//boolean res1=Utils.isElementPresent(By.xpath("//*[@class='heading-counter']"));
		//Assert.assertTrue(res1);
			
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
	//	boolean res=Utils.isElementPresent(By.xpath("//*[@class='page-heading']"));
	//	Assert.assertTrue(res);
	
	}
	public void waitForItem(){
		Utils.waitForElementVisible(product1,3000);
	}
	public void setProduct1(){
		Utils.mouseHover(product1);
	}
	public void setAddToCartProduct1(){
		addToCartProduct1.click();

	}
	public void goToWomenPage(){
		women_Link.click();
	}
	public void setMore1(){
		more1.click();
	}
	
	

}
