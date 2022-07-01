package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class OracleSample {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/browser-windows");

        try {
            driver.findElement(By.id("tabButton")).click();
            Set<String> tabs = driver.getWindowHandles();
            List<String> tabsList = new ArrayList<>(tabs);
            driver.switchTo().window(tabsList.get(1));
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();
            driver.switchTo().window(tabsList.get(0));
            driver.findElement(By.id("windowButton")).click();

        } catch (Exception e) {
            System.out.println(e + "New TAB TEst cases is failed");
        }
        try {
            Set<String> tabs1 = driver.getWindowHandles();
            List<String> tabsList1 = new ArrayList<>(tabs1);
            driver.switchTo().window(tabsList1.get(1));
            System.out.println(driver.findElement(By.id("sampleHeading")).getText());
            driver.close();
            driver.switchTo().window(tabsList1.get(0));
        } catch (Exception e) {
            System.out.println(e + "New Window TEst cases is failed");
        }

    }
}
