package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class webdriversetup1 {


    private static ChromeDriver driver;


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://conv.rakbankonline.ae/corp4/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&__FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=RAK&USER_TYPE=1");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

        driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL")).sendKeys("FASTFLEET");
        driver.findElement(By.name("AuthenticationFG.ACCESS_CODE")).sendKeys("rakbank123");
        driver.findElement(By.name("Action.VALIDATE_CREDENTIALS_UX")).click();
        driver.findElement(By.name("HREF_Overview"));

//        WebElement element = driver.findElement(By.name("HREF_Send_Money"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);

//        driver.findElement(By.name("HREF_Send_Money")).click();
//        driver.findElement(By.id("Fund-Transfer_Fund-Transfer")).click();
//
//        driver.findElement(By.xpath("//input[@title='Counterparty Type']")).click();
//        driver.findElement(By.xpath("//input[@title='Counterparty Type']")).sendKeys("My RAKBANK Account");
//        driver.findElement(By.xpath("//input[@title='Counterparty Type']")).sendKeys(Keys.ENTER);
//
//
//        driver.findElement(By.xpath("//input[@title='Account List']")).click();
//        driver.findElement(By.xpath("//input[@title='Counterparty Type']")).sendKeys("My RAKBANK Account");
//        driver.findElement(By.xpath("//input[@title='Counterparty Type']")).sendKeys(Keys.ENTER);
//
//
//        driver.findElement(By.xpath("//*[@title=' From ']")).click();
//        driver.findElements(By.xpath("//*[contains(text(),'Current Account')]")).get(1).click();


//        driver.findElement(By.xpath("//*[@title='Transfer Amount']")).sendKeys("500");
//
//
//        WebElement webElement=driver.findElement(By.xpath("//*[text()='Next']"));
//
//        JavascriptExecutor je = driver;
//        je.executeScript("arguments[0].scrollIntoView(true);",webElement);
//
//        webElement.click();

        WebElement Country=driver.findElement(By.xpath("//input[contains(@id,'BNF_COUNTRY_comboText')]"));

        JavascriptExecutor js=driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Country);

        Country.click();
        Country.sendKeys("India");



    }


}
