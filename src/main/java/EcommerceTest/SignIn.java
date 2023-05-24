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
public class SignIn {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test(priority = 1)
    public void testSignIn_TC_001() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 11)
    public void testSignIn_TC_002() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Fill in the Sign In form
        WebElement emailField = driver.findElement(By.id("login_email"));
        emailField.sendKeys("thuyhiendoremi@gmail.com");

        WebElement passwordField = driver.findElement(By.id("login_pass"));
        passwordField.sendKeys("Rachelrivera@2807");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement accountInfo = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/div/div/div[2]/div/div[1]"));
        Assert.assertEquals(accountInfo.getText(), "Hien Thuy, TMA Solutions");
        WebElement Account = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span"));
        Account.click();
        WebElement signout = driver.findElement(By.xpath("//*[@id=\"account\"]/li[7]/span/a"));
        signout.click();
    }

    @Test(priority = 2)
    public void testSignIn_TC_003() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement missEmail = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        Assert.assertEquals(missEmail.getText(), "You must enter an email.");
        WebElement missPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[2]/div[2]"));
        Assert.assertEquals(missPassword.getText(), "Please enter password.");
    }

    @Test(priority = 3)
    public void testSignIn_TC_004() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        WebElement passwordField = driver.findElement(By.id("login_pass"));
        passwordField.sendKeys("Rachelrivera@2807");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement missEmail = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        Assert.assertEquals(missEmail.getText(), "You must enter an email.");

    }
    @Test(priority = 4)
    public void testSignIn_TC_005() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        WebElement emailField = driver.findElement(By.id("login_email"));
        emailField.sendKeys("thuyhiendoremi@gmail.com");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement missPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[2]/div[2]"));
        Assert.assertEquals(missPassword.getText(), "Please enter password.");
    }
    @Test(priority = 5)
    public void testSignIn_TC_006() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Fill in the Sign In form
        WebElement emailField = driver.findElement(By.id("login_email"));
        emailField.sendKeys("thuyhiendoremi@gmail.com");

        WebElement passwordField = driver.findElement(By.id("login_pass"));
        passwordField.sendKeys("Rlbma");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement InvalidPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[2]/div[2]"));
        Assert.assertEquals(InvalidPassword.getText(), "Incorrect password.");

    }
    @Test(priority = 6)
    public void testSignIn_TC_007() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Fill in the Sign In form
        WebElement passwordField = driver.findElement(By.id("login_pass"));
        passwordField.sendKeys("Rachelrivera@2807");

        WebElement emailField = driver.findElement(By.id("login_email"));
        emailField.sendKeys("thuyhiendoremigmail.com");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement InvalidEmail = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        Assert.assertEquals(InvalidEmail.getText(), "Please enter correct email, such as user@example.com.");
    }
    @Test(priority = 7)
    public void testSignIn_TC_008() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Fill in the Sign In form
        WebElement passwordField = driver.findElement(By.id("login_pass"));
        passwordField.sendKeys("Rachelrivera@2807");
        WebElement emailField = driver.findElement(By.id("login_email"));
        emailField.sendKeys("thuyhiendore@gmail.com");

        // Submit the Sign In form
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/button"));
        signInButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement UnregisteredEmail = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[1]/div[2]"));
        Assert.assertEquals(UnregisteredEmail.getText(), "Customer was not found.");
    }
    @Test(priority = 8)
    public void testSignIn_TC_009() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Fill in the Sign In form
        WebElement emailField = driver.findElement(By.id("login_email"));
        emailField.sendKeys("thuyhiendoremi@gmail.com");
        WebElement passwordField = driver.findElement(By.id("login_pass"));
        passwordField.sendKeys("Rachelrivera@2807");
        WebElement isHiddenPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[2]/div/div[2]/button"));
        isHiddenPassword.click();
        WebElement typeInputPassword = driver.findElement(By.xpath("//*[@id=\"login_pass\"]"));
        Assert.assertEquals(typeInputPassword.getAttribute("type"), "text");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        isHiddenPassword.click();
        Assert.assertEquals(typeInputPassword.getAttribute("type"), "password");

    }
    @Test(priority = 9)
    public void testSignIn_TC_010() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");

        // Submit the Sign In form
        WebElement forgotPassButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[1]/form/div[3]/a"));
        forgotPassButton.click();
        // Perform assertions
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement labelResetPass = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/h1"));
        Assert.assertEquals(labelResetPass.getText(), "Reset Password");

    }
    @Test(priority = 10)
    public void testSignIn_TC_011() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");

        // Submit the Sign In form
        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateAccountButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        // Perform assertions

        WebElement labelCreateAccount = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/h1"));
        Assert.assertEquals(labelCreateAccount.getText(), "New Account");

    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
         driver.quit();
    }
}