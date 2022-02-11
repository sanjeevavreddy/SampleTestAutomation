import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {


    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        ((JavascriptExecutor)driver).executeScript("window.open('https://www.bing.com');");

        System.out.println(driver.getTitle());

        Set<String> windowIDSet = driver.getWindowHandles();
        List<String> windowIDList = new ArrayList<>(windowIDSet);

        for (String windowID : windowIDList)
            System.out.println(driver.switchTo().window(windowID).getTitle());


    }
    public static int Karthik(int karthik)
    {
        return karthik;
    }


}
