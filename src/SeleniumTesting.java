import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTesting {

    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "C:\\Program Files\\Java\\IEDriverServer_x64_4.8.1");
        //create chrome instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
        WebElement element;
        element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("abc@gmail.com");
        element = driver.findElement(By.xpath("//input[@name='pass']"));
        element.sendKeys("abcdefg");
        WebElement button = driver.findElement(By.xpath("//input[@name='login']"));
        button.click();
    }
}