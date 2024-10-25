package pages;

import org.openqa.selenium.WebDriver;

public class Status200page {
    WebDriver driver;
    public Status200page(WebDriver driver) {
        this.driver = driver;
    }
    public String getActualURL ()
    {
        return driver.getCurrentUrl();
    }
}
