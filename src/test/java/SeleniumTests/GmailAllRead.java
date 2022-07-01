package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class GmailAllRead {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();



        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get("https://mail.google.com/mail/u/0/#inbox");

//        waitingForElementSendingKey(driver, By.id("identifierId"), "sanjeevavreddy@gmail.com");
//        waitingForElementForClickOnly(driver, By.id("identifierNext"));
//        waitingForElementSendingKey(driver,By.name("password"), "Aveejnas1@");
//        waitingForElementForClickOnly(driver, By.id("passwordNext"));
//

    }

    private static void waitingForElementForClickOnly(WebDriver driver, By identifierNext) {
        driver.findElement(identifierNext).click();
    }

    private static void waitingForElementSendingKey(WebDriver driver, By identifierId, String s) {
        driver.findElement(identifierId).sendKeys(s);
    }

}
