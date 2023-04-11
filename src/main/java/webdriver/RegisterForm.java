package main.java.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "/browserDrivers/IEDriverServer.exe");
        String baseURL = "https://demo.automationtesting.in/Register.html";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        WebElement first_name = driver.findElement(By.cssSelector("[type='text'][placeholder='First Name']"));
        first_name.sendKeys( "Thuy");
        WebElement last_name = driver.findElement(By.cssSelector("[type='text'][placeholder='Last Name']"));
        last_name.sendKeys("Hien");
        WebElement address = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea"));
        address.sendKeys("149 Hà Huy Tập");
        WebElement email = driver.findElement(By.cssSelector("#eid > input"));
        email.sendKeys("thuyhiendoremi@gmail.com");
        WebElement phone = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
        phone.sendKeys("0376763365");
        WebElement gender = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
        gender.click();
        WebElement hobbies = driver.findElement((By.xpath("//*[@id=\"checkbox2\"]")));
        hobbies.click();
        WebElement languages = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
        Actions action = new Actions(driver);
        action.click(languages).build().perform();
        Select dropdown = new Select(languages);
        dropdown.selectByVisibleText("English");
    }
}