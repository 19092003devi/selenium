package com.company;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;
import java.util.logging.FileHandler;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //  FileHandler.generate(screenshot,new File("C:\\Users\\LENOVO\\Desktop\\st\\images\\screenshot.jpeg"));
        driver.close();
    }
}
