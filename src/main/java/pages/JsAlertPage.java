package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JsAlertPage {
    WebDriver driver;
    public JsAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By jsAlertButton = By.xpath("//*[contains(text(),'Click for JS Alert')]");
    private final By jsConfirmButton = By.xpath("//*[contains(text(),'Click for JS Confirm')]");
    private final By jsPromptButton = By.xpath("//*[contains(text(),'Click for JS Prompt')]");
    private final By resultMessage = By.id("result");


    public String getResultMessage()
    {
       return driver.findElement(resultMessage).getText();
    }
    public void clickonAlertButton()
    {
        driver.findElement(jsAlertButton).click();
        driver.switchTo().alert().accept();
    }

    public void clickAndAcceptConfirmButton()
    {
        driver.findElement(jsConfirmButton).click();
        driver.switchTo().alert().accept();
    }
    public void clickAndcancelConfirmButton()
    {
        driver.findElement(jsConfirmButton).click();
        driver.switchTo().alert().dismiss();
    }

    public void clickAndSendTextToPromptButton(String text)
    {
        driver.findElement(jsPromptButton).click();
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }

    public void clickAndCancelPromptButton()
    {
        driver.findElement(jsPromptButton).click();
        driver.switchTo().alert().dismiss();
    }





}
