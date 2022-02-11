import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
    public static void main(String args[])
    {

//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://conv.rakbankonline.ae/IBRetailTest/auth");
        System.out.println(driver.getTitle());



        driver.quit();


    }
}
