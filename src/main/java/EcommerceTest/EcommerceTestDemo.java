package EcommerceTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class EcommerceTestDemo {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSignIn() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.linkText("Sign In"));
        signInLink.click();

        // Fill in the Sign In form
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("your-email@example.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("your-password");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.cssSelector(".sign-in-button"));
        signInButton.click();

        // Perform assertions
        Assert.assertEquals(driver.getTitle(), "My Account");
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.livelarq.com/my-account"));
        Assert.assertTrue(driver.findElement(By.cssSelector(".welcome-message")).getText().contains("Welcome back!"));
    }
    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
        driver.quit();
    }
}
