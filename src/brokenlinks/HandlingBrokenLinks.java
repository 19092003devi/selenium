package brokenlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HandlingBrokenLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        List<String> urlList = new ArrayList<>();
        for (WebElement e : links){
            String url = e.getAttribute("href");
            urlList.add(url);
           // checkBrokenLink(url);
        }
        urlList.parallelStream().forEach(e-> {
            try {
                checkBrokenLink(e);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        Thread.sleep(3000);
        driver.close();
    }

    public static void checkBrokenLink(String linkUrl) throws IOException {
        URL url = new URL(linkUrl);
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.connect();
        if(httpURLConnection.getResponseCode()>=400){
            System.out.println(linkUrl+"---------"+httpURLConnection.getResponseMessage()+"link is broken");
        }else {
            System.out.println(linkUrl+"---------"+httpURLConnection.getResponseMessage());
        }
    }
}
