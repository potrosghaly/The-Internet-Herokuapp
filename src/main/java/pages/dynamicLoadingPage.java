package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.HandelMethods;

public class dynamicLoadingPage extends HandelMethods {


    public dynamicLoadingPage(WebDriver driver) {
    super(driver);
    }

    private final By exampleOne = By.linkText("Example 1: Element on page that is hidden");
    private final By exampleTwo = By.partialLinkText("Example 2");

    public ExampleOnePage clickonExampleOne()
    {
        driver.findElement(exampleOne).click();
        return new ExampleOnePage(driver);
    }
    public ExampleTwoPage clickonExampleTwo()
    {
        driver.findElement(exampleTwo).click();
        return new ExampleTwoPage(driver);
    }
}
