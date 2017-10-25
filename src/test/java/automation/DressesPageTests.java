package automation;

import automation.pages.DressesPage;
import automation.pages.HomePage;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class DressesPageTests extends BaseTests {

    HomePage homepage = new HomePage();
    DressesPage dressesPage = new DressesPage();

    @Test
    public void verifyFilterByColor() {
        homepage.clickDressesLink();
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        dressesPage.setFilterByColor();

    }
    @Test
    public void verifyFilterBySizeShort(){
        homepage.clickDressesLink();
        dressesPage.setFilterBySizeShort();
    }
    @Test
    public void verifyFilterByStyleMax(){
        homepage.clickDressesLink();
        dressesPage.setFilterByStyleMax();
    }
    @Test
    public void verifyFilterByStyleMid(){
        homepage.clickDressesLink();
        dressesPage.setFilterByStyleMid();
    }
    @Test
    public void verifyFilterByPrice(){
        homepage.clickDressesLink();
        ((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
        dressesPage.setFilterByPrice(50);

    }

}
