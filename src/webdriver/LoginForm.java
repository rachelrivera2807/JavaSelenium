package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginForm {
    private WebDriver driver;
    private String baseUrl = "https://example.com/";

    @BeforeTest
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test(priority = 0)
    public void testValidLogin() {
        // enter valid credentials
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("0946013899");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("rachelrivera");
        driver.findElement(By.xpath("//*[@id=\"u_0_5_+B\"]")).click();

        // verify that login is successful
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login test failed: Invalid URL");
    }

    @Test(priority = 1)
    public void testInvalidLogin() {
        // enter invalid credentials
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("0946013899");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("rachelrivera");
        driver.findElement(By.xpath("//*[@id=\"u_0_5_+B\"]")).click();


        // verify that login fails
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Login test failed: Invalid URL");

        // verify that error message is displayed
        String expectedErrorMsg = "Invalid username or password";
        String actualErrorMsg = driver.findElement(By.id("errorMsg")).getText();
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg, "Login test failed: Invalid error message");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}