package pages;

import org.openqa.selenium.WebDriver;

public class Status404page {
    WebDriver driver;
    public Status404page(WebDriver driver) {
        this.driver = driver;
    }
    public String getActualURL ()
    {
        return driver.getCurrentUrl();
    }
}
