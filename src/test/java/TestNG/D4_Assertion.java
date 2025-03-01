package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D4_Assertion {
    WebDriver driver;

    @BeforeMethod//Her bir test metodundan önce çalışır.(2 kere tarayıcı ayaga kalkacak)
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        Thread.sleep(2000);
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://hepsiburada.com");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(2000);
        String expectedTitle="Türkiye'nin En Çok Tavsiye Edilen E-ticaret Markası Hepsiburada";
        Assert.assertEquals(expectedTitle, driver.getTitle());

    }

    @Test
    public void test02() throws InterruptedException {
        driver.navigate().to("https://www.trendyol.com/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(2000);
        String expectedTitle="En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";
        Assert.assertEquals(expectedTitle, driver.getTitle());

    }

     @AfterMethod
     public void tearDown(){
         driver.close();
     }
}
