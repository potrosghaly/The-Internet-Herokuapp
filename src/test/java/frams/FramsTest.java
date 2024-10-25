package frams;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FrameFromQaCart;
import pages.HomePage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class FramsTest {

    protected WebDriver driver;
    protected FrameFromQaCart frame;


    @BeforeClass
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        frame = new FrameFromQaCart(driver);
        //   gohome();
    }
    @BeforeMethod
    public void gohome()

    {
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");
    }
    @AfterClass
    public void close()
    {
        driver.quit();
    }

    @Test
    public void testFillForm()
    {
        frame.enterIFram();
        frame.enterFirstAndLastName("Potros" , "Ghaly");
        frame.selectLevel("Senior");
        frame.selectWebOption();
        frame.clickSubmitButton();
        String actual = frame.getAlertMessage();
       // System.out.println(actual);
        frame.acceptAlert();
        frame.exitIFram();
        String expect = "Thank you fname for submitting the form, We have many courses for web automation senior level";
        assertEquals(actual,expect);
    }
}
