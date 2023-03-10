package FileUploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileUpload = driver.findElement(By.id("file-upload"));
       fileUpload.sendKeys("C:\\Users\\LENOVO\\Desktop\\st\\Test.txt");
        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();
        Thread.sleep(3000);
        WebElement fileUploaded = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if(fileUploaded.getText().equals("File Uploaded!")){
            System.out.println("file uploaded successfully");
        }else {
            System.out.println("file is not uploaded");
        }
        driver.close();
    }
}
