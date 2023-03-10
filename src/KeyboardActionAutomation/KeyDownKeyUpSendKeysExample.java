package KeyboardActionAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUpSendKeysExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement userName = driver.findElement(By.id("login1"));
        Actions actions = new Actions(driver);
        actions.moveToElement(userName);
        actions.keyDown(Keys.SHIFT).sendKeys("software testing").keyUp(Keys.SHIFT).build().perform();
        Thread.sleep(5000);
        driver.close();
    }
}
