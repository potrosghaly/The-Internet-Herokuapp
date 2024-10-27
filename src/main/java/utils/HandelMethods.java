package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandelMethods {


    protected WebDriver driver;
    protected WebDriverWait wait;
    public HandelMethods(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator)
    {
        driver.findElement(locator).click();
    }

    protected void sendKeys(By locator, String value)
    {
        driver.findElement(locator).sendKeys(value);
    }

    protected void select(By locator, String value)
    {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(value);
    }

    protected void waitUntilVisibleLocator(By locator)
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    protected String getText(By locator)
    {
        return driver.findElement(locator).getText();
    }

}
