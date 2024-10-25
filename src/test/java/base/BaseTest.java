package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {
    protected WebDriver  driver;
    protected HomePage homePage;


    @BeforeClass
    public void setup()
    {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
     //   gohome();
    }
    @BeforeMethod
    public void gohome()

    {
        driver.get("https://the-internet.herokuapp.com/");
    }


    @AfterClass
    public void close()
    {
        driver.quit();
    }
}
