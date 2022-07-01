package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class JioBrowserTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        driver.get("https://www.makemytrip.com/");

        driver.findElement(By.id("fromCity")).click();

        driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Pune");
        driver.findElement(By.xpath("//*[text()='Pune, India']")).click();

        Thread.sleep(3000);

//        driver.findElement(By.id("toCity")).click();
        Actions actions= new Actions(driver);
        actions.sendKeys(Keys.TAB);

        driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("Delhi");
        driver.findElement(By.xpath("//*[text()='Delhi, India']")).click();

        driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

        driver.findElement(By.xpath("//p[text()='17']")).click();

        driver.findElement(By.xpath("//a[text()='Search']")).click();

    }


}
