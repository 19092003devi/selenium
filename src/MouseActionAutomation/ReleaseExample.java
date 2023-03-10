package MouseActionAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReleaseExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        WebElement aButton = driver.findElement(By.xpath("//li[text()='A']"));
        WebElement lButton = driver.findElement(By.xpath("//li[text()='L']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",aButton);
        Actions actions = new Actions(driver);
        actions.clickAndHold(aButton).moveToElement(lButton).build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
