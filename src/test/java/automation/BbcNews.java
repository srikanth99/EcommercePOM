package automation;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Sudhakar on 19/01/2018.
 */
public class BbcNews {
    WebDriver driver;
    @Test
    public void bbc(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bbc.co.uk");//https://www.bbc.co.uk/
        String title=driver.getTitle();
        System.out.println("this is page tille "+title);
        driver.close();
        System.out.println("closing this website");

    }
}
