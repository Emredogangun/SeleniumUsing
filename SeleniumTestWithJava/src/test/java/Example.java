import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Example {
    WebDriver driver = new ChromeDriver();
    @Before
    public void before()  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\testinium\\Desktop\\SeleniumTestMedium\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
    @Test
    public void test1()  {
        WebElement searchText =driver.findElement(By.name("q"));
        searchText.sendKeys("Testinium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @After
    public void after(){
        driver.close();
    }
}
