package Ders2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D1_SeleniumWait {
    public static void main(String[] args) throws InterruptedException {
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //driver.get("https://hepsiburada.com");
        driver.get("https://amazon.com.tr");

        //İstediğimiz kod satırını yani Static beklemek için kullanılır.
        //Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println("Page Title: " + driver.getTitle());

        //Selenium3 wait
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Selenium2 wait metodu
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys("Dell");

        //ExplictWAit
        /*Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d -> revealed.isDisplayed());*/
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));

        //Bir yeri tıklatmak için birinci yol
        driver.findElement(By.id("nav-search-submit-button")).click();


        //Bir arama alanına tıklatmak için ikinci yol
        //searchBox.submit();

        //Bir yeri tıklatmak için üçüncü yol
         //*WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
         //searchBox.click();

        driver.close();

    }
}
