package DemoExample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo2 {
    public static void main(String[] args)
    {
        System.setProperty(
                "web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://auth.geeksforgeeks.org/");
        driver.manage().window().maximize();

        driver.findElement(By.id("luser"))
                .sendKeys("ttthien2807@gmail.com");

        driver.findElement(By.id("password"))
                .sendKeys("Rachelrivera@1");

        driver.findElement(By.className("signin-button"))
                .click();
    }
}
