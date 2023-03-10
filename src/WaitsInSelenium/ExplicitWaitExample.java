package WaitsInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // WebElement element = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
        // WebElement element = driver.findElement(By.xpath("//u[text()='Forgot Password?']"));

        WebElement signUp = driver.findElement(By.name("proceed"));
        WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(signUp)).click();

       /* JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);*/

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);
        driver.close();
    }
}
