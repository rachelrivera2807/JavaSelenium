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
    @Test
    public void testSignIn() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/header/div/nav/ul/li[3]/span/a"));
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
       // driver.get("https://www.livelarq.com/user/account");
    }

    @Test
    public void testCreateAccount() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("ttthien2805@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Rachelrivera@2807");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Rachelrivera@2807");
        Select drpCountry = new Select(driver.findElement(By.id("country")));
        drpCountry.selectByVisibleText("Viet Nam");
        WebElement fNameField = driver.findElement(By.id("firstName"));
        fNameField.sendKeys("Thuy");
        WebElement lNameField = driver.findElement(By.id("lastName"));
        lNameField.sendKeys("Hien");
        WebElement addressl1Field = driver.findElement(By.id("addressLineOne"));
        addressl1Field.sendKeys("149 Ha Huy Tap Street");
        WebElement addressl2Field = driver.findElement(By.id("addressLineTwo"));
        addressl2Field.sendKeys("Buon Ma Thuot City, Dak Lak Province, Viet Nam");
        WebElement companyField = driver.findElement(By.id("company"));
        companyField.sendKeys("TMA Solutions");
        WebElement cityField = driver.findElement(By.id("suburbCity"));
        cityField.sendKeys("Buon Ma Thuot");
        WebElement stateField = driver.findElement(By.id("stateProvince"));
        stateField.sendKeys("Dak Lak");
        WebElement zipField = driver.findElement(By.id("zipPostcode"));
        zipField.sendKeys("02623");
        WebElement phoneField = driver.findElement(By.id("phoneNumber"));
        phoneField.sendKeys("0376763365");
        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAddToCart() {
        // Update quantity
        driver.get("https://www.livelarq.com/");
        WebElement shopLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        shopLink.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[4]/article/div[1]/footer/a"));
        addProduct1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addtocart1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[6]/button"));
        addtocart1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closecart1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div[1]/button"));
        closecart1.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[1]/article/div[1]/footer/a"));
        addProduct2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addtocart2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button"));
        addtocart2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closecart2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div[1]/button"));
        closecart2.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct3 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[6]/article/div[1]/footer/a"));
        addProduct3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addtocart3 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[7]/button"));
        addtocart3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closecart3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div/div/div[1]/button"));
        closecart3.click();
    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
       // driver.quit();
    }
}
