package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestMethods {

    private static WebDriver driver;

    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://conv.rakbankonline.ae/IBRetailUAT/auth");

        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[@data-testid='username-input']")).sendKeys("padmajith");
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys("rakbank123");
        driver.findElement(By.xpath("//button[@data-testid='button-login']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        waitForElementAndClick("//button[@data-testid='menu-expand-pay-bills']",30);

        setImplicitTimeout(60);
        driver.findElement(By.xpath("//a[@data-testid='menu-link-pay-bill-payees']")).click();

        setImplicitTimeout(120);
        driver.findElement(By.xpath("//input[@data-testid='payto-input' and @value='2']//parent::label")).click();

        setImplicitTimeout(60);
        driver.findElement(By.xpath("//label[@data-testid='from-label']/..//input")).sendKeys("Current");


    }

    public static void setImplicitTimeout(int Seconds)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Seconds));
    }
    public static void waitForElement(String elementLocator,int Seconds)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Seconds));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementLocator))));
    }
    public static void waitForElementAndClick(String elementLocator,int Seconds)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Seconds));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementLocator)))).click();
    }



}


