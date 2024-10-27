package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.HandelMethods;

public class Loginpage extends HandelMethods {

    public Loginpage(WebDriver driver) {
        super(driver);
    }

    private final By user_name_field = By.id("username");
    private final By password_field = By.id("password");
    private final By login_button = By.xpath("//*[@id=\"login\"]/button/i");
    private final By login_message = By.xpath("//*[@id=\"flash\"]");


    public void write_username(String username)
    {
        sendKeys(user_name_field,username);
    }

    public void write_password(String password)
    {
        driver.findElement(password_field).sendKeys(password);
    }

    public SecurePage clickon_login_button()
    {
        driver.findElement(login_button).click();
        return new SecurePage(driver);
    }

    public void wrong_login()
    {driver.findElement(login_button).click();}

    public String actual_message()
    {
        return driver.findElement(login_message).getText();
    }
}
