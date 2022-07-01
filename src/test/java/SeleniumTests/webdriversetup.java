package SeleniumTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class webdriversetup {

    public  void Test() {
        DesiredCapabilities cap = new DesiredCapabilities();

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        WebElement webElement = driver.findElement(By.xpath("//*"));
        webElement.click();

        //location
        int pointX = webElement.getLocation().getX();
        int x = webElement.getSize().height;
        driver.manage().window().maximize();

        int xx = webElement.getRect().getX();
        int width = webElement.getRect().getWidth();


        //Select
        Select select = new Select(webElement);
        select.selectByIndex(1);
        select.selectByValue("1");
        select.selectByVisibleText("1");


        //New Window
        ((JavascriptExecutor) driver).executeScript("window.open();");


        //waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(webElement));
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));

        //frame
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        driver.switchTo().frame("NAME");
        driver.switchTo().frame(webElement);

        //Actions
        Actions actions = new Actions(driver);
        actions.contextClick();
        actions.contextClick(webElement);

        Action action=actions.moveToElement(webElement).build();

        actions.dragAndDrop(webElement, webElement);
        actions.dragAndDropBy(webElement, 500, 600);

        //TABS and Windows
        driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().newWindow(WindowType.WINDOW);



        //Keys
        webElement.sendKeys(Keys.CONTROL);

        //KeysChord
        String CE=Keys.chord(Keys.CONTROL,Keys.ENTER);
        webElement.sendKeys(CE);


        //Assert
        Assert.assertTrue(true,"");



    }

    public static void main(String[] args) {
        StringBuffer a=new StringBuffer();

        String str1 = "Hello";
        String str2 = "Javatpoint";
        String str3 = "Reader";
        // Concatenating one string
        String str4 = str1.concat(str2);
        System.out.println(str4);
        // Concatenating multiple strings
        String str5 = str1.concat(str2).concat(str3);
        System.out.println(str5);
    }
}
