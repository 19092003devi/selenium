package AlertsAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("software testing user");
        WebElement alertButton = driver.findElement(By.id("confirmbtn"));
        alertButton.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();
        Thread.sleep(2000);
        driver.close();
    }
}
