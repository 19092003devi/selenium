package Locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocatorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        for (WebElement element : inputTags){
            System.out.println(element);
        }

        List<WebElement> divTags = driver.findElements(By.tagName("div"));
        for (WebElement element : divTags){
            System.out.println(element);
        }

        Thread.sleep(3000);
        driver.close();
    }
}
