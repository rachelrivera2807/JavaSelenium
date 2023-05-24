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
public class AddToCart {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver instance
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testAddToCart_TC_001() {
        // Update quantity
        driver.get("https://www.livelarq.com/");
        WebElement shopLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        shopLink.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[2]/article/a/img"));
        addProduct.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAddToCart_TC_002() {
        // Update quantity
        driver.get("https://www.livelarq.com/");
        WebElement shopLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        shopLink.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[1]/article/div[1]/footer/a"));
        addProduct.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button"));
        addToCart.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement nameProductInCar = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/span/a"));
        Assert.assertEquals(nameProductInCar.getAttribute("title"), "LARQ Pitcher PureVis");
    }

    @Test
    public void testAddToCart_TC_003() {
        // Update quantity
        driver.get("https://www.livelarq.com/");
        WebElement shopLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        shopLink.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[4]/article/div[1]/footer/a"));
        addProduct.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[6]/button"));
        addToCart.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement removeProduct1ToCart = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/button"));
        removeProduct1ToCart.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement headerTitle = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/div[1]/h1"));
        Assert.assertEquals(headerTitle.getText(), "LARQ Bottle PureVis™");
    }

    @Test
    public void testAddToCart_TC_004() {
        // Update quantity
        driver.get("https://www.livelarq.com/");
        WebElement shopLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        shopLink.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[4]/article/div[1]/footer/a"));
        addProduct1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addtocart1 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[6]/button"));
        addtocart1.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closecart1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/button"));
        closecart1.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[1]/article/div[1]/footer/a"));
        addProduct2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addtocart2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button"));
        addtocart2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closecart2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/button"));
        closecart2.click();
        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct3 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[6]/article/div[1]/footer/a"));
        addProduct3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addtocart3 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[7]/button"));
        addtocart3.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closecart3 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/button"));
        closecart3.click();

    }

    @Test
    public void testAddToCart_TC_005() {
        // Update quantity
        driver.get("https://www.livelarq.com/");
        WebElement shopLink = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div[2]/div/div/div/a"));
        shopLink.click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.livelarq.com/shop");
        WebElement addProduct = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[1]/article/div[1]/footer/a"));
        addProduct.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[4]/button"));
        addToCart.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement closecart1 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/button"));
        closecart1.click();
        driver.get("https://www.livelarq.com/shop");

        WebElement addProduct2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[3]/div/div/div/div[4]/article/div[1]/footer/a"));
        addProduct2.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement addToCart2 = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div/div[1]/div/div[2]/div/div[1]/div[6]/button"));
        addToCart2.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement removeProduct1ToCart = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[1]/button"));
        removeProduct1ToCart.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement closeCart2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/button"));
        closeCart2.click();

//        WebElement totalPrice = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/header/button/span"));
//        Assert.assertEquals(totalPrice.getText(), "1");
    }
    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
        // driver.quit();
    }
}