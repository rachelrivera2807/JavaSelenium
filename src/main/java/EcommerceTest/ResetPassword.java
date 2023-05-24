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
public class ResetPassword {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test
    public void testResetPassword_TC_001() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");

        WebElement forgotPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/a"));
        forgotPassButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement labelResetPass = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/h1"));
        Assert.assertEquals(labelResetPass.getText(), "Reset Password");

    }
    @Test
    public void testResetPassword_TC_004() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");

        // Click on the Forgot Your Password? link
        WebElement forgotPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/a"));
        forgotPassButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Fill in the Reset Password form
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.sendKeys("thuyhien12345gmail.com");

        WebElement resetPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[2]/button"));
        resetPassButton.click();

        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement messageError = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[1]/div[2]"));
        Assert.assertEquals(messageError.getText(), "Please enter correct email, such as user@example.com.");
    }
    @Test
    public void testResetPassword_TC_005() {
        // Open the website
        driver.get("https://www.livelarq.com/");
        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Click on the Forgot Your Password? link
        WebElement forgotPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/a"));
        forgotPassButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Fill in the Reset Password form
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.sendKeys("thuyhien12345@gmail.com");
        WebElement resetPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[2]/button"));
        resetPassButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement messageError = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[1]/div[2]"));
        Assert.assertEquals(messageError.getText(), "Customer was not found.");
    }

    @Test
    public void testResetPassword_TC_006() {
        // Open the website
        driver.get("https://www.livelarq.com/");
        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Click on the Forgot Your Password? link
        WebElement forgotPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/a"));
        forgotPassButton.click();
        WebElement emailField = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        emailField.sendKeys("ttthien2807@gmail.com");
        WebElement resetPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div[2]/button"));
        resetPassButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        Email.sendKeys("ttthien2807@gmail.com");
        WebElement NextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        NextButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
         driver.quit();
    }
}