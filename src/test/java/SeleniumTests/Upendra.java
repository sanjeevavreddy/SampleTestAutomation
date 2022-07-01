package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Upendra {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://conv.rakbankonline.ae/IBRetailTest/auth");




        WebElement element = webDriver.findElement(By.xpath("//*[@name='username']"));

        element.sendKeys("UPENDRA");

        WebElement accountNumberElement = webDriver.findElement(By.xpath("//"));


        String accountNumber=element.getText();

        element.sendKeys(accountNumber);


    }
}
