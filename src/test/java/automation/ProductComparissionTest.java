package automation;

import automation.pages.DressesPage;
import automation.pages.HomePage;
import automation.pages.ProductComparissionPage;
import org.junit.Test;

public class ProductComparissionTest extends BaseTests {
    //Object Creation
    HomePage homePage=new HomePage();
    DressesPage dressesPage=new DressesPage();
    ProductComparissionPage productComparissionPage=new ProductComparissionPage();

    @Test
    public void verifyUserCompareDresses(){
        homePage.setNavigateToDressesPage();
        dressesPage.setList();
        dressesPage.setOrangeSkirt_Compare();
       // dressesPage.setBlackDress_Compare();
        //dressesPage.setYellowDress_Compare();
        dressesPage.setCompare();

    }
}
