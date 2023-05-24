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
public class Registration {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}
    @Test(priority = 1)
    public void testCreateAccount_TC_001() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement label = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/h1"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passField = driver.findElement(By.id("password"));
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        Select drpCountry = new Select(driver.findElement(By.id("country")));
        WebElement fNameField = driver.findElement(By.id("firstName"));
        WebElement lNameField = driver.findElement(By.id("lastName"));
        WebElement addressl1Field = driver.findElement(By.id("addressLineOne"));
        WebElement addressl2Field = driver.findElement(By.id("addressLineTwo"));
        WebElement companyField = driver.findElement(By.id("company"));
        WebElement cityField = driver.findElement(By.id("suburbCity"));
        WebElement stateField = driver.findElement(By.id("stateProvince"));
        WebElement zipField = driver.findElement(By.id("zipPostcode"));
        WebElement phoneField = driver.findElement(By.id("phoneNumber"));
        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        Assert.assertEquals(label.getText(), "New Account");
        Assert.assertEquals(CreateAccountButton.getText(), "Create Account");

    }

    @Test(priority = 13)
    public void testCreateAccount_TC_002() {
        // Open the website
        driver.get("https://www.livelarq.com/");
        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("bnvchb1vhe@gmail.com");
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

        WebElement account = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/nav/ul/a[3]"));
        account.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement accountInfo = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/div/div/div[2]/div/div[1]"));
        Assert.assertEquals(accountInfo.getText(), "Thuy Hien, TMA Solutions");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Account = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span"));
        Account.click();
        WebElement signout = driver.findElement(By.xpath("//*[@id=\"account\"]/li[7]/span/a"));
        signout.click();

    }

    @Test(priority = 14)
    public void testCreateAccount_TC_003() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hie1dntq22f8h0l5v@gmail.com");
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
        WebElement cityField = driver.findElement(By.id("suburbCity"));
        cityField.sendKeys("Buon Ma Thuot");
        WebElement stateField = driver.findElement(By.id("stateProvince"));
        stateField.sendKeys("Dak Lak");
        WebElement zipField = driver.findElement(By.id("zipPostcode"));
        zipField.sendKeys("02623");
        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement account = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/nav/ul/a[3]"));
        account.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement accountInfo = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/div/div/div[2]/div/div[1]"));
        Assert.assertEquals(accountInfo.getText(), "Thuy Hien");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Account = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span"));
        Account.click();
        WebElement signout = driver.findElement(By.xpath("//*[@id=\"account\"]/li[7]/span/a"));
        signout.click();

    }
    @Test(priority = 2)
    public void testCreateAccount_TC_004() {
        // Open the website
        driver.get("https://www.livelarq.com/");
        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement missEmail = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div/div[2]"));
        Assert.assertEquals(missEmail.getText(), "You must enter an email.");
        WebElement missPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div[2]"));
        Assert.assertEquals(missPassword.getText(), "Please enter password.");
        WebElement missCountry = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[4]/div/div"));
        Assert.assertEquals(missCountry.getText(), "The 'Country' field cannot be blank.");
        WebElement missFirstName = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[5]/div/div[2]"));
        Assert.assertEquals(missFirstName.getText(), "You must enter a first name.");
        WebElement missLastName = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[6]/div/div[2]"));
        Assert.assertEquals(missLastName.getText(), "You must enter a last name.");
        WebElement missAddress = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[7]/div/div[2]"));
        Assert.assertEquals(missAddress.getText(), "You must enter your address.");
        WebElement missCity = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[10]/div/div[2]"));
        Assert.assertEquals(missCity.getText(), "You must enter city.");
        WebElement missZip = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[12]/div/div[2]"));
        Assert.assertEquals(missZip.getText(), "You must enter ZIP or postal code.");
    }

    @Test(priority = 3)
    public void testCreateAccount_TC_005() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement addressl2Field = driver.findElement(By.id("addressLineTwo"));
        addressl2Field.sendKeys("Buon Ma Thuot City, Dak Lak Province, Viet Nam");
        WebElement companyField = driver.findElement(By.id("company"));
        companyField.sendKeys("TMA Solutions");
        WebElement phoneField = driver.findElement(By.id("phoneNumber"));
        phoneField.sendKeys("0376763365");
        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement missEmail = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div/div/div[2]"));
        Assert.assertEquals(missEmail.getText(), "You must enter an email.");
        WebElement missPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div[2]"));
        Assert.assertEquals(missPassword.getText(), "Please enter password.");
        WebElement missCountry = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[4]/div/div"));
        Assert.assertEquals(missCountry.getText(), "The 'Country' field cannot be blank.");
        WebElement missFirstName = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[5]/div/div[2]"));
        Assert.assertEquals(missFirstName.getText(), "You must enter a first name.");
        WebElement missLastName = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[6]/div/div[2]"));
        Assert.assertEquals(missLastName.getText(), "You must enter a last name.");
        WebElement missAddress = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[7]/div/div[2]"));
        Assert.assertEquals(missAddress.getText(), "You must enter your address.");
        WebElement missCity = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[10]/div/div[2]"));
        Assert.assertEquals(missCity.getText(), "You must enter city.");
        WebElement missZip = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[12]/div/div[2]"));
        Assert.assertEquals(missZip.getText(), "You must enter ZIP or postal code.");
    }

    @Test(priority = 4)
    public void testCreateAccount_TC_006() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("his1eng4o128p05@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Ra@28");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Ra@28");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Passwords must be at least 7 characters and contain both alphabetic and numeric characters.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement messageError = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[14]/div/div/div[2]"));
        Assert.assertEquals(messageError.getText(), "Something went wrong. Try again later.");
    }

    @Test(priority = 5)
    public void testCreateAccount_TC_007() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hig1eln51u28i05@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("1234567@");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("1234567@");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Passwords must be at least 7 characters and contain both alphabetic and numeric characters.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement messageError = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[14]/div/div/div[2]"));
        Assert.assertEquals(messageError.getText(), "Something went wrong. Try again later.");
    }

    @Test(priority = 6)
    public void testCreateAccount_TC_008() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hie1y61lj28m05@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Passwords must be at least 7 characters and contain both alphabetic and numeric characters.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement messageError = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[14]/div/div/div[2]"));
        Assert.assertEquals(messageError.getText(), "Something went wrong. Try again later.");
    }

    @Test(priority = 15)
    public void testCreateAccount_TC_009() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("2thien1tsksfdc71@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("hgyf@12");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[3]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Your passwords do not match.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement account = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/nav/ul/a[3]"));
        account.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(passwordInvalid.getText(), "Your passwords do not match.");
        //WebElement accountInfo = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/div/div/div[2]/div/div[1]"));
        //Assert.assertEquals(accountInfo.getText(), "Thuy Hien, TMA Solutions");

    }

    @Test(priority = 7)
    public void testCreateAccount_TC_010() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hien18gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@1");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[1]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");
    }

    @Test(priority = 8)
    public void testCreateAccount_TC_011() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hien 15@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@1");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[1]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");
    }

    @Test(priority = 9)
    public void testCreateAccount_TC_012() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hien19@gmailcom");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@1");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[1]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");
    }

    @Test(priority = 10)
    public void testCreateAccount_TC_013() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("hient1@gmail..com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@1");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[1]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");
    }

    @Test(priority = 11)
    public void testCreateAccount_TC_014() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("tranthithuyhien");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@1");
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

        WebElement passwordInvalid = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[1]/div/div[2]"));
        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");

        WebElement CreateAccountButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[15]/div/button"));
        CreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(passwordInvalid.getText(), "Please enter correct email, such as user@example.com.");
    }

    @Test(priority = 12)
    public void testCreateAccount_TC_015() {
        // Open the website
        driver.get("https://www.livelarq.com/");

        // Click on the Sign In link
        WebElement signInLink = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/div/nav/ul/li[3]/span/a"));
        signInLink.click();
        driver.get("https://www.livelarq.com/user/sign-in");
        // Create New Account
        WebElement CreateButton = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div[2]/div/div[2]/a"));
        CreateButton.click();
        driver.get("https://www.livelarq.com/user/registration");
        //Fill information
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("thuyhien1@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Thuyhien@1");
        WebElement passConfirmField = driver.findElement(By.id("passwordConfirm"));
        passConfirmField.sendKeys("Thuyhien@1");

        WebElement isHiddenPassword = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[2]/div/div/div[2]/button"));
        isHiddenPassword.click();

        WebElement typeInputPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        Assert.assertEquals(typeInputPassword.getAttribute("type"), "text");
        isHiddenPassword.click();
        Assert.assertEquals(typeInputPassword.getAttribute("type"), "password");

        WebElement isHiddenPasswordConfirm = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/div[3]/div/div/div[2]/button"));
        isHiddenPassword.click();

        WebElement typeInputPasswordConfirm = driver.findElement(By.xpath("//*[@id=\"passwordConfirm\"]"));
        Assert.assertEquals(typeInputPassword.getAttribute("type"), "text");
        isHiddenPassword.click();
        Assert.assertEquals(typeInputPassword.getAttribute("type"), "password");
    }
    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
         driver.quit();
    }
}