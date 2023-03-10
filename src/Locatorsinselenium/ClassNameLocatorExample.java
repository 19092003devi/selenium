package Locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassNameLocatorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement redifflink = driver.findElement(By.className("f12"));
        redifflink.click();

        List<WebElement> createNewAccount = driver.findElements(By.className("create-new-account"));
        for(WebElement e : createNewAccount){
            System.out.println(e);
        }

        Thread.sleep(3000);
        driver.close();
    }
}
