package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class EntryAddPage {
    WebDriver driver;
    WebDriverWait wait;
    public EntryAddPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By clickHereLink = By.id("restart-ad");

    private final By closeButton = By.xpath("//p[contains(text(),'Close')]");

    public void clickonClickHereLink()
    {
        driver.findElement(clickHereLink).click();
    }

    private void clickonCloseButton() throws InterruptedException {
        wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeButton));
        driver.findElement(closeButton).click();
    }


    public void clickUntilPopupAppears() {
        boolean isPopupVisible = false;
        int retries = 0;
        while (!isPopupVisible) {
            try {

                clickonClickHereLink();
                wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                wait.until(ExpectedConditions.visibilityOfElementLocated(closeButton));

                isPopupVisible = true;
                System.out.println("ظهر زر Close بعد " + (retries + 1) + " محاولات.");

                driver.findElement(closeButton).click();

            }
            catch (TimeoutException e) {
                retries++;
            }
        }

    }


}
