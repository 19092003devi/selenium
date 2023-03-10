package Locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSelectorLocatorExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        WebElement userName = driver.findElement(By.cssSelector("input[id=\"login1\"]"));
        userName.sendKeys("devashreemahangade");

        List<WebElement> divTags = driver.findElements(By.cssSelector("div.cell"));
        for (WebElement element : divTags){
            System.out.println(element);
        }
        System.out.println("size of list: "+divTags.size());

        Thread.sleep(3000);
        driver.close();
    }
}
