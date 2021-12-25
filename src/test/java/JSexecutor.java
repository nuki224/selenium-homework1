import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSexecutor {
    WebDriver driver;
    Actions builder;
    JavascriptExecutor js;
    public void main (String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        builder = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }
}
