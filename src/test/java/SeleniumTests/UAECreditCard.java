package SeleniumTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.time.Duration;

public class UAECreditCard {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ccgen.datagemba.com/generate-visa-card-number");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        File fout = new File("C:\\Users\\SANJEEV\\Desktop\\CREDIT_CARD.txt");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            bw.write(driver.findElement(By.id("inputiRandomCardNumber")).getText());
            bw.newLine();
            driver.findElement(By.id("visaSingleGenerate")).click();
        }
        bw.close();
        driver.quit();
    }

}
