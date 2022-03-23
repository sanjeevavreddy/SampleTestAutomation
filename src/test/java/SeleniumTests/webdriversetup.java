package SeleniumTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class webdriversetup {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        WebElement webElement = driver.findElement(By.xpath("//*"));
//        webElement.click();
//        int pointX = webElement.getLocation().getX();
//        int x = webElement.getSize().height;
//        driver.manage().window().maximize();
//
//
//        Select select = new Select(webElement);
//        select.selectByIndex(1);
//        select.selectByValue("1");
//        select.selectByVisibleText("1");
//        ((JavascriptExecutor) driver).executeScript("window.open();");
//
//
//        //waits
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(webElement));
//
//        //frame
//        driver.switchTo().defaultContent();
//        driver.switchTo().frame(1);
//        driver.switchTo().frame("NAME");
//        driver.switchTo().frame(webElement);
//
//        //Actions
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(webElement, webElement);
//        actions.dragAndDropBy(webElement, 500, 600);

        driver.switchTo().newWindow(WindowType.TAB);

        driver.switchTo().newWindow(WindowType.WINDOW);
    }
}
