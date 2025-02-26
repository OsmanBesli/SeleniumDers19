package SeleniumDers1_exe;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_Drive_Navigate {
    public static void main(String[] args) {
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        driver.get("https://hepsiburada.com");
        System.out.println("Page Title: " + driver.getTitle());

        driver.navigate().to("https://www.trendyol.com");
        System.out.println("Page Title: " + driver.getTitle());

        driver.navigate().back();
        System.out.println("Page Title: " + driver.getTitle());

        driver.navigate().forward();
        System.out.println("Page Title: " + driver.getTitle());

        driver.navigate().refresh();


    }
}
