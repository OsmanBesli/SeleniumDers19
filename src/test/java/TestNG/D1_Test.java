package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D1_Test {
    @Test
    public void test01(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://hepsiburada.com");
        System.out.println("Page Title: " + driver.getTitle());
        driver.close();

    }
    @Test
    public void test02(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.trendyol.com/");
        System.out.println("Page Title: " + driver.getTitle());
        driver.close();
    }

}
