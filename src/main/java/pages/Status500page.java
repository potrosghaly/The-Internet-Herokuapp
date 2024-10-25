package pages;

import org.openqa.selenium.WebDriver;

public class Status500page {
    WebDriver driver;
    public Status500page(WebDriver driver) {
        this.driver = driver;
    }

    public String getActualURL ()
    {
        return driver.getCurrentUrl();
    }
}
