package CookieHandling;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        //for adding cookies :-
        Cookie cookie = new Cookie("software","testing");
        driver.manage().addCookie(cookie);

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Object o : allCookies){
            System.out.println(o); //printing all cookies
        }
        System.out.println("------------------------------------------------");

        Cookie getCookieByName = driver.manage().getCookieNamed("software");
        //System.out.println("cookie--------- "+getCookieByName);
        driver.manage().deleteCookie(getCookieByName);

        Set<Cookie> allCookiess = driver.manage().getCookies();
        for (Object o : allCookiess){
            System.out.println(o); //printing all cookies
        }
        System.out.println("------------------------------------------------");

        driver.manage().deleteAllCookies();
        Set<Cookie> allCookiesss = driver.manage().getCookies();
        for (Object o : allCookiesss){
            System.out.println(o); //printing all cookies
        }
        System.out.println("------------------------------------------------");

        Thread.sleep(3000);
        driver.close();
    }
}
