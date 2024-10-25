package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By forgetButton = By.id("form_submit");

    public void writeEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }

    public ForgetPasswordLastpage clickonForgetButton()
    {
        driver.findElement(forgetButton).click();
        return new ForgetPasswordLastpage(driver);
    }
}
