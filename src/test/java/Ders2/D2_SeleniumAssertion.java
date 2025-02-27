package Ders2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D2_SeleniumAssertion {
    public static void main(String[] args)  {
        WebDriver driver =new ChromeDriver();

        driver.get("https://amazon.com.tr");
        System.out.println("Page Title: " + driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys("Dell");

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));

        WebElement searchButton =driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();

        String expectedText="10.000 üzeri sonuç arasından 1-48 arası gösteriliyor. Aranan ürün:'Dell'";

        WebElement outputText = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/h2/span[1]"));
        String actualText=outputText.getText();
        System.out.println(actualText);

        if (expectedText.contains(actualText)){
            System.out.println("Dogrulama tamamlandı");
        }
        else {
            System.out.println("Dogrulama yapılamadı");
        }


        driver.close();

    }

}
