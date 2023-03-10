package IFramesInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class iframeExample2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        List<WebElement> iFrameElement = driver.findElements(By.tagName("iframe"));
        System.out.println(iFrameElement.size());
        //driver.switchTo().frame(4);
       // driver.switchTo().frame("frame1");
      //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
       WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame);
       String s = driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText();
        System.out.println(s);
        Thread.sleep(3000);
        driver.close();
    }
}
