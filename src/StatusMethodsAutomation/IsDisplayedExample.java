package StatusMethodsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        /*WebElement showButton = driver.findElement(By.id("show-textbox"));
        showButton.click();*/
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println(textBox.isDisplayed());
        WebElement hideButton = driver.findElement(By.id("hide-textbox"));
        hideButton.click();
        Thread.sleep(3000);
        System.out.println(textBox.isDisplayed());
        driver.close();
    }
}
