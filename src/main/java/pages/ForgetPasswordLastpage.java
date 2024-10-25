package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordLastpage {

    WebDriver driver;
    public ForgetPasswordLastpage(WebDriver driver) {
        this.driver = driver;
    }
    private By header = By.xpath("/html/body/h1");

    public String getActualText()
    {
        return driver.findElement(header).getText();
    }
}
