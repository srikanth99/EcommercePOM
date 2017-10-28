package automation;

import automation.pages.DressesPage;
import automation.pages.HomePage;
import automation.pages.ProductComparissionPage;
import automation.pages.Utils;
import org.junit.Assert;
import org.junit.Test;

public class ProductComparissionTest extends BaseTests {
    //Test Data
    int timeToWait=3000;
    //Object Creation
    HomePage homePage=new HomePage();
    DressesPage dressesPage=new DressesPage();
    ProductComparissionPage productComparissionPage=new ProductComparissionPage();

    @Test
    public void verifyUserCompareDresses(){
        homePage.setNavigateToDressesPage();
        dressesPage.setList();
        Utils.implicitlyWait(timeToWait);
        dressesPage.setOrangeSkirt_Compare();
        dressesPage.setBlackDress_Compare();
        dressesPage.setYellowDress_Compare();
        dressesPage.setExplicitWaitClickableToCompare();
        dressesPage.setCompare();
        Assert.assertTrue(productComparissionPage.isUserOnProductComparision());
    }
}
