package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class EdgeTest {

WebDriver driver;


    @BeforeClass
    void openEdgeBrowser()
    {
        System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Test
    void login()
    {
        driver.get("https://conv.rakbankonline.ae/IBRetailUAT/auth");
        driver.findElement(By.xpath("//input[@data-testid='username-input']")).sendKeys("giridnair");
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys("rakbank123");
        driver.findElement(By.xpath("//button[@data-testid='button-login']")).click();
        System.out.println(driver.getTitle());

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
