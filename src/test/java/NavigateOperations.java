import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NavigateOperations {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();

        driver.get("www.google.com");
        driver.get("www.bing.com");
        driver.navigate().back();
        driver.navigate().forward();


    }
}
