package StatusMethodsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");
        WebElement checkBox = driver.findElement(By.id("bmwcheck"));
        System.out.println("Before Selection "+checkBox.isSelected());
        checkBox.click();
        System.out.println("After Selection "+checkBox.isSelected());
        Thread.sleep(3000);
        driver.close();
    }
}
