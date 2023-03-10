package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/LENOVO/Downloads/chromedriver_win32 (2)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("source")).sendKeys("Pune");
        List<WebElement> listOfSourceCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
        for (WebElement city : listOfSourceCities){
            if(city.getText().equals("Pune")){
                city.click();
                break;
            }
        }

        driver.findElement(By.id("destination")).sendKeys("Mumbai");
        List<WebElement> listOfDestinationCities = driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        for (WebElement city : listOfDestinationCities){
            if(city.getText().equals("Mumbai")){
                city.click();
                break;
            }
        }

        String selDate = "7";
        String selMonth = "January";
        String selYear = "2023";

        driver.findElement(By.id("datepicker1")).click();
        String liMonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText();
        String liYear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();

        System.out.println(liMonth);
        System.out.println(liYear);

        if (liMonth.equals(selMonth)&&liYear.equals(selYear)){
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
            for (WebElement date : allDates){
                if (date.getText().equals(selDate)){
                    date.click();
                    break;
                }
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }

}
