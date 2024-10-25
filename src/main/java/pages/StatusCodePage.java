package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    WebDriver driver;
    public StatusCodePage(WebDriver driver) {
        this.driver = driver;
    }

    private By status200 = By.linkText("200");
    private By status301 = By.linkText("301");
    private By status404 = By.linkText("404");
    private By status500 = By.linkText("500");


    public Status200page clickon_status200()
    {
        driver.findElement(status200).click();
        return new Status200page(driver);
    }
    public Status301page clickon_status301()
    {
        driver.findElement(status301).click();
        return new Status301page(driver);
    }

    public Status404page clickon_status404()
    {
        driver.findElement(status404).click();
        return new Status404page(driver);
    }
    public Status500page clickon_status500()
    {
        driver.findElement(status500).click();
        return new Status500page(driver);
    }


}
