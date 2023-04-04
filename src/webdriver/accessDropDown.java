package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class accessDropDown {
    public static void main(String[] args) {
        /*System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        String baseURL = "https://demo.guru99.com/test/newtours/register.php";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("ANTARCTICA");*/
        //Selecting Items in a Multiple SELECT elements
        //driver.get("http://jsbin.com/osebed/2");
        //Select fruits = new Select(driver.findElement(By.id("fruits")));
        //fruits.selectByVisibleText("Banana");
        //fruits.selectByIndex(1);
            System.setProperty("web- driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.traveloka.com/vi-vn/");

            driver.findElement(By.xpath(".//*[@id='multiSearchContainerTabs']/li[1]/a")).click();
            driver.findElement(By.xpath( ".//*[@id='tvDesktop-flightSearchForm']/div/div/div/div/div/div[1]/div/div/div/ul/li[1]/div/div[1]/div/div[1]/label/div/div/div[2]/div[2]/input")).clear();
            driver.findElement(By.xpath(".//*[@id='tvDesktop-flightSearchForm']/div/div/div/div/div/div[1]/div/div/div/ul/li[1]/div/div[1]/div/div[2]/div/div/div[2]/div[2]/table/tbody/tr[4]/td[1]/a")).click();
    }
}
