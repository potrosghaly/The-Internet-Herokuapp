package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    Select select;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    private By dropdownList = By.id("dropdown");

    public void selectByVisibleText (String visibleText)
    {
        select = new Select(driver.findElement(dropdownList));
        select.selectByVisibleText(visibleText);
    }

    public void selectByValue(String value)
    {
        select = new Select(driver.findElement(dropdownList));
        select.selectByValue(value);
    }

    public void selectByIndix(int indix)
    {
        select = new Select(driver.findElement(dropdownList));
        select.selectByIndex(indix);
    }

    public String getSelectText()
    {
        select = new Select(driver.findElement(dropdownList));
        String actual =select.getFirstSelectedOption().getText();
        return actual;
    }


}
