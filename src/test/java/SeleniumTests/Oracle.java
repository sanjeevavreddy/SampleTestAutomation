package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Oracle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.w3schools.com/");

        driver.findElement(By.id("w3loginbtn")).click();
        driver.findElement(By.name("email")).sendKeys("SAMPLEUSER");
        driver.findElement(By.name("current-password")).sendKeys("SAMPLEPASSWORD");
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
//        driver.quit();
    }
}
