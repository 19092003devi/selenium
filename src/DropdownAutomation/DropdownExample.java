package DropdownAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement dropDown = driver.findElement(By.id("carselect"));
        Select select = new Select(dropDown);
        //Select select1 = new Select(driver.findElement(By.id("carselect")));
        select.selectByVisibleText("Benz");
        select.selectByValue("honda");
        select.selectByIndex(1);
        Thread.sleep(3000);
        driver.close();
    }
}
