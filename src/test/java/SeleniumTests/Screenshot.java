package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String args[]) throws InterruptedException, IOException {

//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();

        driver.get("https://conv.rakbankonline.ae/IBRetailTest/auth");


        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        takescreenshot(driver,"Capture1");

        WebElement element=driver.findElement(By.xpath("//*[contains(@class,\"Logo\")]"));

        takescreenshotOfElement(driver,element,"CaptureLogo");

        Actions actions=new Actions(driver);

        actions.sendKeys(Keys.BACK_SPACE);


        driver.getWindowHandle();

        driver.navigate().to("");
        driver.quit();

    }
    public static void takescreenshot(RemoteWebDriver driver,String filename) throws IOException {
        TakesScreenshot takesScreenshot = driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\Screenshots\\"+filename+".png");
        FileUtils.copyFile(src,trg);
    }
    public static void takescreenshotOfElement(RemoteWebDriver driver,WebElement Element,String filename) throws IOException {
        File src =  Element.getScreenshotAs(OutputType.FILE);
        File trg = new File(".\\Screenshots\\"+filename+".png");
        FileUtils.copyFile(src,trg);
    }

}
