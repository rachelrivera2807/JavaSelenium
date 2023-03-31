package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Check_Environment {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        //create chrome instance
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com/");
        WebElement element;
        element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("abc@gmail.com");
        element = driver.findElement(By.xpath("//input[@name='pass']"));
        element.sendKeys("bcdedit");
        WebElement button = driver.findElement(By.xpath("//input[@name='login']"));
        button.click();

        /*WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        WebElement element =driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button =driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();*/
    }
}
