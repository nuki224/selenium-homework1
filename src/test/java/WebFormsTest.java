import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


@Test
public class WebFormsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]"));
        System.out.println("The checkbox is selection state is - " + checkbox.isSelected());

        WebElement parent = driver.findElement(By.xpath("/html/body/div/div[3]/div"));
        List<WebElement> children = parent.findElements(By.xpath("/html/body/div/div[3]/div"));


        for (WebElement child : children) {
            if (!child.isSelected()) {
                child.click();
            } else continue;
        }
        driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).click();
    }
}