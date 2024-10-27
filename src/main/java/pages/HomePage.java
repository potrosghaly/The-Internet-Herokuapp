package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.HandelMethods;

public class HomePage extends HandelMethods {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }

    private final By login_button = By.linkText("Form Authentication");
    private final By forgetPassowrd = By.linkText("Forgot Password");
    private final By statusCode = By.linkText("Status Codes");
    private final By chrckBox = By.linkText("Checkboxes");

    private final By upload = By.linkText("File Upload");
    private final By dropDownLink = By.linkText("Dropdown");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private final By jsAlertLink = By.xpath("//*[contains(text(),'JavaScript Alerts')]");
    private final By entryAddLink = By.linkText("Entry Ad");
    private final By hoversLink = By.linkText("Hovers");





    public Loginpage clickon_login_button()
    {
        click(login_button);
        return new Loginpage(driver);
    }

//    public Loginpage clickon_login_button()
//    {
//        click(login_button);
//        return new Loginpage(driver);
//    }





    public EntryAddPage clickEntryAddLink()
    {
        click(entryAddLink);
        return new EntryAddPage(driver);
    }



    public JsAlertPage clickJsAlertLink()
    {
        click(jsAlertLink);
        return new JsAlertPage(driver);
    }

    public dynamicLoadingPage clickonDynamicLoadingPage()
    {
        click(dynamicLoadingLink);
        return new dynamicLoadingPage(driver);
    }

    public ForgetPasswordPage clickon_forget_password()
    {
        click(forgetPassowrd);
        return new ForgetPasswordPage(driver);
    }

    public StatusCodePage clickon_statusCode_button()
    {
        click(statusCode);
        return new StatusCodePage(driver);
    }

    public CheckboxPage clickon_checkbox_button()
    {
        click(chrckBox);
        return new CheckboxPage(driver);
    }

    public UploadPage clickon_fileUpload_button()
    {
        click(upload);
        return new UploadPage(driver);
    }

    public DropdownPage clickonDropdownLink()
    {
        click(dropDownLink);
        return new DropdownPage(driver);
    }

    public HoversPage clickonHoversLink()
    {
        click(hoversLink);
        return new HoversPage(driver);
    }
}
