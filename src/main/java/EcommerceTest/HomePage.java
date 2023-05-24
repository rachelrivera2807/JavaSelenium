package EcommerceTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class HomePage {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test
    public void testHomepage() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Perform assertions
        Assert.assertEquals(driver.getTitle(), "LARQ | Self-cleaning Water Bottle | As Seen on Shark Tank");

        WebElement headerElement = driver.findElement(By.cssSelector("header"));
        Assert.assertTrue(headerElement.isDisplayed());

        WebElement buyNowButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        Assert.assertTrue(buyNowButton.isEnabled());
    }
    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
        // driver.quit();
    }
}