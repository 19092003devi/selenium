package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//u[text()='Forgot Password?']")).click();
        Thread.sleep(3000);
        //for going backwards
        driver.navigate().back();
        Thread.sleep(3000);
        //for going forward
        driver.navigate().forward();
        Thread.sleep(3000);
        //to refresh the page
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}
