package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadLastPage {
    WebDriver driver;
    public UploadLastPage(WebDriver driver) {
    this.driver = driver;
    }
    private By actualText = By.id("uploaded-files");

    public String getActualText()
    {
        return driver.findElement(actualText).getText();
    }
}
