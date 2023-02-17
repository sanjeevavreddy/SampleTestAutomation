package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ChiranjeeviSongsDownload {
    static String S = "";

    public static void main(String args[]) throws InterruptedException, IOException {

//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://sensongsmp3.tv/chiranjeevi-songs/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> MovieNames = driver.findElements(By.xpath("//*[@class='lttplist']/li/a"));
        int TotalMovies=MovieNames.size();

        for(int i=0;i<TotalMovies;i++)
        {
            driver.findElements(By.xpath("//*[@class='lttplist']/li/a")).get(i).click();
            DownloadSongs(driver);
            driver.navigate().back();
            driver.findElement(By.xpath("//*[@class='lttplist']/li/a")).isDisplayed();
        }

    }
    public static void DownloadSongs(WebDriver driver) throws IOException {
        try {
            driver.findElement(By.xpath("//a[@data-wpel-link='external']"));
            List<WebElement> Songs = driver.findElements(By.xpath("//a[@data-wpel-link='external']"));
            for(WebElement song:Songs)
            {
//                System.out.println(song.getAttribute("href"));
                ChiranjeeviSongsDownload.S = ChiranjeeviSongsDownload.S + song.getAttribute("href") + "\n";
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void writeFile(String text) throws IOException {
        File myObj = new File("filename.txt");
        FileWriter myWriter = new FileWriter("filename.txt");
        myWriter.write(text);
        myWriter.close();
    }
}
