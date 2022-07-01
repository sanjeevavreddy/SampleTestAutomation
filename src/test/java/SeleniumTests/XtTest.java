package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class XtTest {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        WebElement a=null;
        WebElement b;

        a.sendKeys();


        WebElement dropDown = null;

        Select sel = new Select(dropDown);

        sel.selectByVisibleText("Hyderabad");

        List<WebElement> allset = sel.getAllSelectedOptions();


        for(WebElement webElement:allset)
        {
            webElement.click();
        }

    }
}
