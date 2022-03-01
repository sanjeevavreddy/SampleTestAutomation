package TestNGTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeTest {

WebDriver driver;


    @BeforeClass
    void openChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Test
    void login()
    {
        driver.get("https://conv.rakbankonline.ae/IBRetailUAT/auth");
        driver.findElement(By.xpath("//input[@data-testid='username-input']")).sendKeys("padmajith");
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys("rakbank123");
        driver.findElement(By.xpath("//button[@data-testid='button-login']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-testid='menu-link-overview']"))));
        System.out.println("Logged in Successfully");

        driver.findElement(By.xpath("//*[@data-testid='menu-item-account']")).click();
        driver.findElement(By.xpath("//*[@data-testid='menu-button-logout']")).click();
        driver.findElement(By.xpath("//*[@data-testid='button-back-to-login']")).click();
        System.out.println("Logged Out Successfully");
    }
    @AfterClass
    void TearDownDriver()
    {
        driver.quit();
    }
}
