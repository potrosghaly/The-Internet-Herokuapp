package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOnePage {

    WebDriver driver;
    WebDriverWait wait;
    public ExampleOnePage(WebDriver driver) {
        this.driver = driver;
    }
    private final By startButton = By.xpath("//*[@id ='start']/button");
    private final By actualMessage = By.xpath("//*[@id = 'finish']/h4");


    public void clickonStartButton()
    {
        driver.findElement(startButton).click();
    }

    public String getActualMessage()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(actualMessage));
        return driver.findElement(actualMessage).getText();
    }
}
