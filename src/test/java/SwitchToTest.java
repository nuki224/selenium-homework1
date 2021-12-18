import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.xpath;

public class SwitchToTest {
    public static void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Navigate to the URL
        driver.get("http://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        // Write text "Here goes" in text field
        WebElement heregoes = (WebElement) xpath("//*[@id=\"tinymce\"]").findElements(driver);
        heregoes.sendKeys("Here goes");
        heregoes.clear();

        /* Click on 'Align center' icon */
        driver.switchTo().parentFrame();
        xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]").findElement(driver).click();

        driver.close();

        // Navigate to the URL
        driver.get("https://demoqa.com/alerts");
        driver.switchTo().alert().accept();
        driver.quit();

    }
}
