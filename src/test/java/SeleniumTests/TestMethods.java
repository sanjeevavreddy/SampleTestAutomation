package SeleniumTests;

import com.google.common.cache.CacheBuilder;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestMethods {

    private static WebDriver driver;

    public static void main(String args[]) throws InterruptedException, AWTException {



        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        Actions action = new Actions(driver);
        Robot robot = new Robot();



        driver.get("https://conv.rakbankonline.ae/IBRetailTest/auth");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[@data-testid='username-input']")).sendKeys("mortallman");
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys("rakbank123");
        driver.findElement(By.xpath("//button[@data-testid='button-login']")).click();


        setImplicitTimeout(120);
        driver.findElement(By.xpath("//button[@data-testid='menu-expand-pay-bills']")).click();

        setImplicitTimeout(60);
        driver.findElement(By.xpath("//a[@data-testid='menu-link-pay-bill-payees']")).click();

        setImplicitTimeout(120);
        driver.findElement(By.xpath("//input[@data-testid='payto-input' and @value='2']//parent::label")).click();

        setImplicitTimeout(60);
        driver.findElement(By.xpath("//label[@data-testid='from-label']/..//input")).sendKeys("Current");

        Thread.sleep(5000);
        writeSource(driver.getPageSource());

    }


    public static void writeSource(String source) {
        try {
            File myObj = new File("C:\\Users\\SANJEEV\\Desktop\\source.xml");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\SANJEEV\\Desktop\\source.xml");
            myWriter.write(source);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void setImplicitTimeout(int Seconds)
    {
        driver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
    }
}
