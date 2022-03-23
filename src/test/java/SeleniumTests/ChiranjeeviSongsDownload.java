package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ChiranjeeviSongsDownload {
    public static void main(String args[]) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);

        driver.get("https://sensongsmp3.tv/chiranjeevi-songs/");
//        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> MovieNames = driver.findElements(By.xpath("//*[@class='lttplist']/li/a"));
        int TotalMovies=MovieNames.size();


        for(int i=0;i<TotalMovies;i++)
        {
//            System.out.println(driver.findElements(By.xpath("//*[@class='lttplist']/li/a")).get(i).getText());
            driver.findElements(By.xpath("//*[@class='lttplist']/li/a")).get(i).click();
//            System.out.println(movie.getText());
//            actions.keyDown(Keys.CONTROL).perform();
//            movie.click();
//            actions.keyUp(Keys.CONTROL).perform();
//            Set<String> Windows=driver.getWindowHandles();
//            List<String> windows = new ArrayList<>(Windows);
//            driver.switchTo().window(windows.get(1));
            DownloadSongs(driver);
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@class='lttplist']/li/a")).isDisplayed();
//            driver.close();
//            driver.switchTo().window(windows.get(0));
        }


//        driver.quit();


    }
    public static void DownloadSongs(WebDriver driver)
    {
        try {
            driver.findElement(By.xpath("//*[@rel='nofollow']"));
            List<WebElement> Songs = driver.findElements(By.xpath("//*[@rel='nofollow']"));
            for(WebElement song:Songs)
            {
//                System.out.println(song.getAttribute("href"));
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
