package JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2_BeforeAfterEach {
    WebDriver driver;

    @BeforeEach//Her bir test metodundan önce çalışır.(2 kere tarayıcı ayaga kalkacak)
    public void setup() throws InterruptedException {
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

     @AfterEach
     public void tearDown(){
         driver.close();
     }
}
