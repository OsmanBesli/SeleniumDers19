package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class D2_BeforeAfterClass {
    static WebDriver driver;

    @BeforeClass//test metodlarınd önce çalışır.(Sadece 1 kere tarayıcı ayaga kalkacak)

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

     @AfterClass
     public static void tearDown(){
        driver.close();
     }
}
