package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class MutipleBrowserTest {

WebDriver driver;


    @BeforeTest
    @Parameters({"Param","Param1"})
    void openBrowser(String Param, String Param1)
    {
        switch (Param.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                driver = new ChromeDriver();
                System.out.println("Chrome Driver Invoked");
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe");
                driver = new EdgeDriver();
                System.out.println("Edge Driver Invoked");
                break;
            default:
                Assert.fail(Param+" is not available");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        driver.get(Param1);
    }

    @Test(dataProvider = "dataProviderMethod")
    void login(String UserName,String Password)
    {
        driver.findElement(By.xpath("//input[@data-testid='username-input']")).sendKeys(UserName);
        driver.findElement(By.xpath("//input[@data-testid='password-input']")).sendKeys(Password);
        driver.findElement(By.xpath("//button[@data-testid='button-login']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-testid='menu-link-overview']"))));
        System.out.println("Logged in Successfully");
        
        driver.findElement(By.xpath("//*[@data-testid='menu-item-account']")).click();
        driver.findElement(By.xpath("//*[@data-testid='menu-button-logout']")).click();
        driver.findElement(By.xpath("//*[@data-testid='button-back-to-login']")).click();
        System.out.println("Logged Out Successfully");
    }
    @AfterTest
    void TearDownDriver()
    {
        driver.quit();
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] getData()
    {
        Object[][] data={{"padmajith","rakbank123"},{"giridnair","rakbank123"}};
        return data;
    }
}
