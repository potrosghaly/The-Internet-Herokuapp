package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HandelMethods;

import java.time.Duration;

public class ExampleOnePage extends HandelMethods {



    public ExampleOnePage(WebDriver driver) {
        super(driver);
    }
    private final By startButton = By.xpath("//*[@id ='start']/button");
    private final By actualMessage = By.xpath("//*[@id = 'finish']/h4");


    public void clickonStartButton()
    {
        click(startButton);
    }

    public String getActualMessage()
    {
        waitUntilVisibleLocator(actualMessage);
        return  getText(actualMessage);
    }
}
