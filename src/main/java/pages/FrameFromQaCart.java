package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameFromQaCart {
    WebDriver driver;
    Select select;
    private String alertMessage;

    private final By firstNameField = By.name("firstName");
    private final By lastNameField = By.name("lastName");
    private final By leveDropdownList = By.name("level");
    private final By webOption = By.id("web");
    private final By mobileOption = By.id("mobile");
    private final By clickMeButton = By.id("actions-button");

    public FrameFromQaCart(WebDriver driver) {
        this.driver = driver;
    }

    public void enterIFram()
    {
        driver.switchTo().frame("qacart");
    }
    public void exitIFram()
    {
        driver.switchTo().parentFrame();
    }

    public void enterFirstAndLastName(String fname , String lname)
    {
        driver.findElement(firstNameField).sendKeys("fname");
        driver.findElement(lastNameField).sendKeys("lname");
    }

    public void selectWebOption ()
    {
        driver.findElement(webOption).click();
    }
    public void selectMobileOption ()
    {
        driver.findElement(mobileOption).click();
    }

    public void selectLevel(String levelName)
    {
        select = new Select(driver.findElement(leveDropdownList));
        select.selectByVisibleText(levelName);
    }

    public void clickSubmitButton()
    {
        driver.findElement(clickMeButton).click();
    }

    public String getAlertMessage()
    {
        return driver.switchTo().alert().getText();
    }
    public  void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }








}
