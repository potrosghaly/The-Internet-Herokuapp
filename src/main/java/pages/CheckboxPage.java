package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.HandelMethods;

public class CheckboxPage extends HandelMethods {

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    private final By checkbox1 = By.xpath("//*[@type='checkbox'][1]");
    private final By checkbox2 = By.xpath("//*[@type='checkbox'][2]");

    // Box1


    public Boolean box1isempty()
    {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean clickonBox1()
    {
        click(checkbox1);
        return driver.findElement(checkbox1).isSelected();
    }

    //Box2
    public Boolean box2isactive()
    {
        return driver.findElement(checkbox2).isSelected();
    }

    public boolean clickonBox2()
    {
        click(checkbox2);
        return driver.findElement(checkbox2).isSelected();
    }


}
