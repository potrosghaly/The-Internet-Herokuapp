package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

    WebDriver driver;
    public Loginpage(WebDriver driver) {
        this.driver = driver;
    }

    private By user_name_field = By.id("username");
    private By password_field = By.id("password");
    private By login_button = By.xpath("//*[@id=\"login\"]/button/i");
    private By login_message = By.xpath("//*[@id=\"flash\"]");


    public void write_username(String username)
    {
        driver.findElement(user_name_field).sendKeys(username);
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
