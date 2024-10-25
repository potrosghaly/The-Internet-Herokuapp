package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    WebDriver driver;
    public SecurePage(WebDriver driver) {
        this.driver = driver;
    }

    private By login_message = By.xpath("//*[@id=\"flash\"]");

    public String actual_message()
    {
        return driver.findElement(login_message).getText();
    }
}
