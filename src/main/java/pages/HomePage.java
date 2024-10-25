package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver)
    {this.driver= driver;}

    private By login_button = By.linkText("Form Authentication");
    private By forgetPassowrd = By.linkText("Forgot Password");
    private By statusCode = By.linkText("Status Codes");
    private By chrckBox = By.linkText("Checkboxes");

    private By upload = By.linkText("File Upload");
    private final By dropDownLink = By.linkText("Dropdown");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private final By jsAlertLink = By.xpath("//*[contains(text(),'JavaScript Alerts')]");
    private final By entryAddLink = By.linkText("Entry Ad");
    private final By hoversLink = By.linkText("Hovers");



    public EntryAddPage clickEntryAddLink()
    {
        clickon(entryAddLink);
        return new EntryAddPage(driver);
    }

    private void clickon(By locator)
    {
        driver.findElement(locator).click();
    }

    public JsAlertPage clickJsAlertLink()
    {
        clickon(jsAlertLink);
        return new JsAlertPage(driver);
    }

    public dynamicLoadingPage clickonDynamicLoadingPage()
    {
        clickon(dynamicLoadingLink);
        return new dynamicLoadingPage(driver);
    }
    public Loginpage clickon_login_button()
    {
        clickon(login_button);
        return new Loginpage(driver);
    }
    public ForgetPasswordPage clickon_forget_password()
    {
        clickon(forgetPassowrd);
        return new ForgetPasswordPage(driver);
    }

    public StatusCodePage clickon_statusCode_button()
    {
        clickon(statusCode);
        return new StatusCodePage(driver);
    }

    public CheckboxPage clickon_checkbox_button()
    {
        clickon(chrckBox);
        return new CheckboxPage(driver);
    }

    public UploadPage clickon_fileUpload_button()
    {
        clickon(upload);
        return new UploadPage(driver);
    }

    public DropdownPage clickonDropdownLink()
    {
        clickon(dropDownLink);
        return new DropdownPage(driver);
    }

    public HoversPage clickonHoversLink()
    {
        clickon(hoversLink);
        return new HoversPage(driver);
    }
}
