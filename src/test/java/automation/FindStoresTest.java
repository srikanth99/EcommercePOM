package automation;

import automation.pages.DressesPage;
import automation.pages.FindStoresPage;
import automation.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class FindStoresTest extends BaseTests{
    //Test Data
    String location1="FL 33304";
    String set_radius="25";


    //Object Creation
    HomePage homePage=new HomePage();
    DressesPage dressesPage=new DressesPage();
    FindStoresPage findStoresPage=new FindStoresPage();

    @Test
    public void setFindStoresPage() {
       homePage.setNavigateToDressesPage();
       dressesPage.setDiscoverStores();
       findStoresPage.setLocation_search(location1);
       findStoresPage.setRadius(set_radius);
       findStoresPage.setLocation_Search_Button();

    }



}
