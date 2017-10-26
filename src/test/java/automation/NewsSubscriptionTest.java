package automation;

import automation.pages.HomePage;
import automation.pages.NewsSubscriptionPage;
import org.junit.Assert;
import org.junit.Test;

public class NewsSubscriptionTest extends BaseTests {
    //Test Data
    String news_Email="harsh11@gmail.com";
    String news_Email_Empty="";
    String newsConfirmationMsg="Newsletter : You have successfully subscribed to this newsletter.";
    String newsAlreadyRegisteredMsg="Newsletter : This email address is already registered.";
    String invalidEmailMsg="Newsletter : Invalid email address.";


    //Object Creation
    HomePage homePage=new HomePage();
    NewsSubscriptionPage newsSubscriptionPage=new NewsSubscriptionPage();

    @Test
    public void verifyUserSubscribedToNewsLetter(){
        //For New Email
        newsSubscriptionPage.setEmailForNews(news_Email);
        Assert.assertEquals(newsSubscriptionPage.setNewsConfirmationMessage(),newsConfirmationMsg);
        //For Already Existed Email
        newsSubscriptionPage.setEmailForNews(news_Email);
        Assert.assertEquals(newsSubscriptionPage.setNewsConfirmationMessage(),newsAlreadyRegisteredMsg);
        //By leaving email Field empty and click on button
        newsSubscriptionPage.setEmailForNews(news_Email_Empty);
        Assert.assertEquals(newsSubscriptionPage.setNewsConfirmationMessage(),invalidEmailMsg);
    }

}
