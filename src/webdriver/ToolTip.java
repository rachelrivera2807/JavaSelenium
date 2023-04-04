package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
    public static void main(String[] args) {

        /*String baseUrl = "https://demo.guru99.com/test/social-icon.html";
        System.setProperty("web-driver.chrome.driver","/browserDrivers/IEDriverServer.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTooltip = "Github";

        // Find the Github icon at the top right of the header
        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

        //get the value of the "title" attribute of the github icon
        String actualTooltip = github.getAttribute("title");

        //Assert the tooltip's value is as expected
        System.out.println("Actual Title of Tool Tip"+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        driver.close();*/
        String baseUrl = "https://demo.guru99.com/test/tooltip.html";
        System.setProperty("web-driver.chrome.driver","/browserDrivers/IEDriverServer.exe");

        WebDriver driver = new ChromeDriver();
        String expectedTooltip = "What's new in 3.2";
        driver.get(baseUrl);

        WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
        Actions builder = new Actions (driver);

        builder.clickAndHold().moveToElement(download);
        builder.moveToElement(download).build().perform();

        WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
        String actualTooltip = toolTipElement.getText();

        System.out.println("Actual Title of Tool Tip  "+actualTooltip);
        if(actualTooltip.equals(expectedTooltip)) {
            System.out.println("Test Case Passed");
        }
        //driver.close();
    }
}
