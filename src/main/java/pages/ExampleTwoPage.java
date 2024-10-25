package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleTwoPage {
    WebDriver driver;
    WebDriverWait wait;
    public ExampleTwoPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By loadingIcon = By.id("loading");
    private final By startButton = By.xpath("//*[@id ='start']/button");
    private final By actualMessage = By.xpath("//*[@id = 'finish']/h4");
    public void clickonStartButton()
    {
        driver.findElement(startButton).click();
    }

    public String getMessage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIcon)));
        return driver.findElement(actualMessage).getText();
    }
}
