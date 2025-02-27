package Ders1_exe;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_Driver_Manage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hepsiburada.com");
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getSize().height);
        System.out.println(driver.manage().window().getSize().width);
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(1200, 800));


        //driver.close();
    }
}
