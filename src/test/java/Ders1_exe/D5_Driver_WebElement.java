package Ders1_exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class D5_Driver_WebElement {
     public static void main(String[] args) {
        org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //driver.get("https://hepsiburada.com");
        driver.get("https://amazon.com.tr");
        System.out.println("Page Title: " + driver.getTitle());
        driver.manage().window().maximize();

         WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
         searchBox.clear();
         searchBox.click();
         searchBox.sendKeys("Dell");

         //Bir yeri tıklatmak için birinci yol
         driver.findElement(By.id("nav-search-submit-button")).click();


         //Bir yeri tıklatmak için ikinci yol
         //searchBox.submit();

         //Bir yeri tıklatmak için üçüncü yol
         /*WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
         searchBox.click();*/

         driver.close();



    }
}
