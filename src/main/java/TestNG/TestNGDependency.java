package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDependency {
    @Test
    public void executSessionOne(){
        //First session of WebDriver
        System.setProperty("web-driver.chrome.driver","C:\\browserDrivers\\IEDriverServer.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.log("The browser is opened now");
        //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        Reporter.log("The demo website guru99 is opened");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
        Reporter.log("The data 'Driver 1' is entered");

    }

    @Test
    public void executeSessionTwo(){
        //Second session of WebDriver
        System.setProperty("web-driver.chrome.driver","C:\\browserDrivers\\IEDriverServer.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.log("The browser is opened now");
        //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        Reporter.log("The demo website guru99 is opened");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        Reporter.log("The data 'Driver 2' is entered");

    }

    @Test
    public void executSessionThree(){
        //Third session of WebDriver
        System.setProperty("web-driver.chrome.driver","C:\\browserDrivers\\IEDriverServer.exe");
        WebDriver driver = new ChromeDriver();
        Reporter.log("The browser is opened now");
        //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        Reporter.log("The demo website guru99 is opened");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        Reporter.log("The data 'Driver 3' is entered");

    }
}
