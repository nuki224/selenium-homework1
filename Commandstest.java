mvn package
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CommandsTest {
    public static void main(String[] args) {
        System.setProperty ('webdriver.chrome.driver', 'C:\\Users\\User\\Downloads\\org\\openqa\\selenium\\chrome\\ChromeDriver.class\chromedriver.exe');
        WebDriver driver = new ChromeDriver();
        // Navigating to the link
        navigate().to('http://the-internet.herokuapp.com/dynamic_controls');
        // Click on button
        WebElement button = driver.findElement(By.xpath('//*[@id="input-example"]/button');
                button.click();
        //Check input field
        WebElement input = driver.findElement(By.xpath('//*[@id=\'input-example\']/input'));
                System.out.print('input is enabled:' +input.isEnabled());
        WebElement message = driver.findElement(by.xpath("output"));
        System.out.println("Output:" + message.isDisplayed());
        //changed
        String buttonText = button.getText();
        System.out.println ('Button text has changed from Enable to Disable')+string.equals('Is Disable');
        textbox.sendkeys('Bootcamp');
        textbox.clear();

        navigate().to('http://the-internet.herokuapp.com/drag_and_drop');
        WebElement yOfA = driver.findElement(By.id('a'));
        WebElement yOfB = driver.findElement(By.id('b'));
        Point A = yOfA.getLocation();
        Point B = yOfB.getLocation();
        System.out.println('Y coordinate of column A and column B are the same' + (A.y == B.y));

    }
}
//closed
driver.quit();