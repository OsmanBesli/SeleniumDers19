package Ders1_exe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2_WebDriver_Get {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hepsiburada.com");
        System.out.println("Sayfa Title: " + driver.getTitle());
        System.out.println("Page URL: " + driver.getCurrentUrl());
        // System.out.println("Page URL: " + driver.getPageSource());


        driver.close();


    }
}
