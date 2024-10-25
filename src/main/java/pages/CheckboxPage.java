package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage {

    WebDriver driver;
    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
    }

    private By checkbox1 = By.xpath("//*[@type='checkbox'][1]");
    private By checkbox2 = By.xpath("//*[@type='checkbox'][2]");

    // Box1
    public Boolean box1isempty()
    {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean clickonBox1()
    {
        driver.findElement(checkbox1).click();
        return driver.findElement(checkbox1).isSelected();
    }

    //Box2
    public Boolean box2isactive()
    {
        return driver.findElement(checkbox2).isSelected();
    }

    public boolean clickonBox2()
    {
        driver.findElement(checkbox2).click();
        return driver.findElement(checkbox2).isSelected();
    }


}
