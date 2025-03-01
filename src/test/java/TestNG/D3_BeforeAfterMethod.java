package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D3_BeforeAfterMethod {
    static WebDriver driver;

    @BeforeMethod//Bütün test metodundan önce çalışır.(Sadece 1 kere tarayıcı ayaga kalkacak)

    public static void setup() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(2000);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://hepsiburada.com");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(2000);


    }

    @Test
    public void test02() throws InterruptedException {
        driver.navigate().to("https://www.trendyol.com/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(2000);

    }

     @AfterMethod
     public static void tearDown(){
        driver.close();
     }
}
