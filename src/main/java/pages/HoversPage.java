package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.FigureCaption;

public class HoversPage {
    WebDriver driver;
    Actions actions;
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By figureBox = By.className("figure");
    private final By figureCaption = By.className("figcaption");

    public FigureCaption clickonFiger(int index)
    {
        WebElement figure = driver.findElements(figureBox).get(index-1);
        actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }

}
