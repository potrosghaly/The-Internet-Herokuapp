package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaption {

    WebElement FigerCaption;
    public FigureCaption(WebElement FigerCaption) {
        this.FigerCaption = FigerCaption;
    }

    private final By userName = By.tagName("h5");
    private final By link = By.tagName("a");

    public String getUserName()
    {
        return FigerCaption.findElement(userName).getText();
    }

    public String getLink()
    {
        return FigerCaption.findElement(link).getText();
    }
}
