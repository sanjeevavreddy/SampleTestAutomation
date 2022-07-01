package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.time.Duration;

public class IbanGen {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://randomiban.com/?country=UK");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        File fout = new File("C:\\Users\\SANJEEV\\Desktop\\IBAN.txt");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            bw.write(driver.findElement(By.className("ibandisplay")).getText());
            bw.newLine();
            driver.findElement(By.className("generate_button")).click();
        }

        bw.close();
        driver.quit();
    }

}
