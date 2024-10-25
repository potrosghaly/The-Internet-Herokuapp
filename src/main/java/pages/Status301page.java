package pages;

import org.openqa.selenium.WebDriver;

public class Status301page {
    WebDriver driver;
    public Status301page(WebDriver driver) {
        this.driver = driver;
    }
    public String getActualURL ()
    {
        return driver.getCurrentUrl();
    }
}
