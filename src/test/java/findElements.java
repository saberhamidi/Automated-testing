import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElements {

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

    @Test
    public void elementsTest() {

        driver.get(url);

        System.out.println("testing");

        List<WebElement> listOfWebElements = driver.findElements(By.xpath("//*[@id=\"create-account_form\"]/h3"));

        for (WebElement element : listOfWebElements) {

            System.out.println("The text for the element is " + element.getText() + ".");

        }

    }

}
