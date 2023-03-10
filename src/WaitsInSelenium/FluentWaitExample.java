package WaitsInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaitExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement signUp = driver.findElement(By.name("proceed"));
        Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(50))
                .pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);

        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.close();
    }
}
