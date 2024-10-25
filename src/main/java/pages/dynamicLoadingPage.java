package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicLoadingPage {

    WebDriver driver;
    public dynamicLoadingPage(WebDriver driver) {
    this.driver = driver;
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
