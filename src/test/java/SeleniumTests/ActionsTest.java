package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsTest {
    public static void main(String args[]) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://text-compare.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.findElement(By.name("text1")).sendKeys("Welcome");

        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);


        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.perform();


        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.perform();

        actions.sendKeys(Keys.TAB);
        actions.perform();

        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.perform();



//        driver.quit();


    }
}
