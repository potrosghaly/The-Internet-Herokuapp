package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
    WebDriver driver;
    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private By chooseFile = By.id("file-upload");
    private By submit_button = By.id("file-submit");

    public void sendimage(String imagepath)
    {
        driver.findElement(chooseFile).sendKeys(imagepath);
    }
    public UploadLastPage clickon_submit_button()
    {
        driver.findElement(submit_button).click();
        return new UploadLastPage(driver);
    }
}
