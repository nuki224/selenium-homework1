import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();
        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys(System.getProperty("user.dir"), "/src/setUp/resources/forbidden_treasure.jfif");
        driver.findElement(By.id("file-submit")).click();

        try {
            upload.click();
        }
        catch (StaleElementReferenceException e){
            System.out.println(" Stale Element Reference Exception ");
        }
        driver.quit();
    }
}
