package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
    public static void main(String args[]) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        driver.get("https://conv.rakbankonline.ae/IBRetailTest/auth");
        driver.get("https://text-compare.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();



        driver.quit();


    }
}
