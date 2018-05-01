import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLandingTest {
    private String url;
    private WebDriver driver;

    @Before
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "../chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

    }

    @After
    public void teardown() throws InterruptedException {

        Thread.sleep(10000);
        driver.quit();
    }

//    @Test
//    public void loginTest() {
//
//        driver.get(url);
//
//        MyStoreLanding storeLanding = PageFactory.initElements(driver, MyStoreLanding.class);
//        storeLanding.login("sarban_ashk@hotmail.co.uk", "testing12");
//    }

    @Test
    public void addItemToBasket() {

        driver.get("http://automationpractice.com/index.php");

        MyStoreLanding storeLanding = PageFactory.initElements(driver, MyStoreLanding.class);
        storeLanding.addItemsToBasket();
    }
}
